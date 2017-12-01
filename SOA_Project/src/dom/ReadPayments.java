package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Payments;
import connection.ConnectToOracle;
 
public class ReadPayments {
 
	public static void main(String argv[]) {
		ArrayList<Payments> paymentObject = new ArrayList<Payments>();
		Payments p1;
 
		try {
	 
			File file = new File("src/XML/Payments.xml");
		   

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Payment");
		 
			System.out.println("---------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					p1=new Payments();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("PaymentID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("OrderID").item(0).getTextContent();
					String a3=eElement.getElementsByTagName("PaymentMethod").item(0).getTextContent();
					int a4=Integer.parseInt(eElement.getElementsByTagName("PaymentAmount").item(0).getTextContent());
					String a5=eElement.getElementsByTagName("PaymentDate").item(0).getTextContent(); 
					String a6=eElement.getElementsByTagName("CheckNumber").item(0).getTextContent();
					String a7=eElement.getElementsByTagName("CreditCardType").item(0).getTextContent();                        
					//int a8=Integer.parseInt(eElement.getElementsByTagName("CreditCardNumber").item(0).getTextContent());
					long a8=Long.parseLong(eElement.getElementsByTagName("CreditCardNumber").item(0).getTextContent());
					String a9=eElement.getElementsByTagName("CardholdersName").item(0).getTextContent();
					String a10=eElement.getElementsByTagName("CreditCardExpDate").item(0).getTextContent();
					int a11=Integer.parseInt(eElement.getElementsByTagName("CreditCardAuthorizationNumber").item(0).getTextContent());
					
					p1.setPaymentID(a1);
					p1.setOrderID(a2);
					p1.setPaymentMethod(a3);
					p1.setPaymentAmount(a4);
					p1.setPaymentDate(a5);
					p1.setCheckNumber(a6);
					p1.setCreditCardType(a7);
					p1.setCreditCardNumber(a8);
					p1.setCardholdersName(a9);
					p1.setCreditCardExpDate(a10);
					p1.setCreditCardAuthorizationNumber(a11);

					System.out.println("Payment ID : " + a1);
					System.out.println("Payment Make : " + a2);
					System.out.println("Year : " + a3);
					System.out.println("Model : " + a4);
					System.out.println("LicensePlateNo : " + a5);
					System.out.println("Color : " + a6);
					System.out.println("VIN : " + a7);
					System.out.println("DriverID : " + a8);
					paymentObject.add(p1);     
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertPayments(paymentObject);
			paymentObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}