package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Transactions;
import connection.ConnectToOracle;
 
public class ReadTranscations {
 
	public static void main(String argv[]) {
		ArrayList<Transactions> transactionObject = new ArrayList<Transactions>();
		Transactions c1;
 
		try {
	 
			File file = new File("src/XML/Transactions.xml");		   
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);			 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Transaction");
		 
			System.out.println("---------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					c1=new Transactions();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("TransactionID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("OrderID").item(0).getTextContent();
					String a3=eElement.getElementsByTagName("PriceID").item(0).getTextContent();
					String a4=eElement.getElementsByTagName("TransactionDate").item(0).getTextContent();
					String a5=eElement.getElementsByTagName("TransactionDescription").item(0).getTextContent();
					int a6=Integer.parseInt(eElement.getElementsByTagName("TransactionAmount").item(0).getTextContent());
					String a7=eElement.getElementsByTagName("EmployeeID").item(0).getTextContent();
					String a8=eElement.getElementsByTagName("TruckID").item(0).getTextContent();
					int a9=Integer.parseInt(eElement.getElementsByTagName("Discount").item(0).getTextContent());
					int a10=Integer.parseInt(eElement.getElementsByTagName("Quantity").item(0).getTextContent());
					int a11=Integer.parseInt(eElement.getElementsByTagName("UnitPrice").item(0).getTextContent());
					int a12=Integer.parseInt(eElement.getElementsByTagName("DriverPrice").item(0).getTextContent());
					String a13=eElement.getElementsByTagName("RunNumber").item(0).getTextContent();
					String a14=eElement.getElementsByTagName("IsSpecial").item(0).getTextContent();
					int a15=Integer.parseInt(eElement.getElementsByTagName("Rate").item(0).getTextContent());
					int a16=Integer.parseInt(eElement.getElementsByTagName("Surcharge").item(0).getTextContent());
					
					c1.setTransactionID(a1);
					c1.setOrderID(a2);
					c1.setPriceID(a3);
					c1.setTransactionDate(a4);
					c1.setTransactionDescription(a5);
					c1.setTransactionAmount(a6);

					c1.setEmployeeID(a7);
					c1.setTruckID(a8);
					c1.setDiscount(a9);
					c1.setQuantity(a10);
					c1.setUnitPrice(a11);
					c1.setDriverPrice(a12);
					c1.setRunNumber(a13);
					c1.setIsSpecial(a14);
					c1.setRate(a15);
					c1.setSurcharge(a16);

					System.out.println("Transaction ID : " + a1);
					System.out.println("Transaction Make : " + a2);
					System.out.println("Year : " + a3);
					System.out.println("Model : " + a4);
					System.out.println("LicensePlateNo : " + a5);
					System.out.println("Color : " + a6);
					System.out.println("VIN : " + a7);
					System.out.println("DriverID : " + a8);
					transactionObject.add(c1);     
				} 
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertTransactions(transactionObject);
			transactionObject.clear();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}