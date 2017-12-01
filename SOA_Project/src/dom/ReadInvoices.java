package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Invoices;
import connection.ConnectToOracle;
 
public class ReadInvoices {
 
	public static void main(String argv[]) {
		ArrayList<Invoices> invoiceObject = new ArrayList<Invoices>();
		Invoices i1;
 
		try {
	 
			File file = new File("src/XML/Invoices.xml");		   
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);			 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Invoice");
		 
			System.out.println("------------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					i1=new Invoices();
					Element eElement = (Element) nNode;
					
					String a1=eElement.getElementsByTagName("InvoiceID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("OrderID").item(0).getTextContent();
					String a3=eElement.getElementsByTagName("CustomerID").item(0).getTextContent();
					String a4=eElement.getElementsByTagName("PaymentID").item(0).getTextContent();
					String a5=eElement.getElementsByTagName("PriceID").item(0).getTextContent();
					String a6=eElement.getElementsByTagName("TransactionID").item(0).getTextContent();                        
					String a7=eElement.getElementsByTagName("TruckID").item(0).getTextContent();
					String a8=eElement.getElementsByTagName("ExpenseID").item(0).getTextContent();
					
					i1.setInvoiceID(a1);
					i1.setOrderID(a2);
					i1.setCustomerID(a3);
					i1.setPaymentID(a4);
					i1.setPriceID(a5);
					i1.setTransactionID(a6);
					i1.setTruckID(a7);
					i1.setExpenseID(a8);

					System.out.println("Invoice ID : " + a1);
					System.out.println("Order ID : " + a2);
					System.out.println("Customer ID : " + a3);
					System.out.println("Payment ID : " + a4);
					System.out.println("Price ID : " + a5);
					System.out.println("Transaction ID : " + a6);
					System.out.println("Truck ID : " + a7);
					System.out.println("Expense ID : " + a8);
					invoiceObject.add(i1);
				} 
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertInvoices(invoiceObject);
			invoiceObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}