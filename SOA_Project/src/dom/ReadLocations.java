package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Locations;
import connection.ConnectToOracle;
 
public class ReadLocations {
 
	public static void main(String argv[]) {
		ArrayList<Locations> LocationObject = new ArrayList<Locations>();
		Locations l1;
 
		try {
			File file = new File("src/XML/Locations.xml");	 
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Location");
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					l1=new Locations();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("LocationID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("LocName").item(0).getTextContent();
					String a3=eElement.getElementsByTagName("LocationCode").item(0).getTextContent();
					String a4=eElement.getElementsByTagName("IsAuction").item(0).getTextContent();
					String a5=eElement.getElementsByTagName("CustomerID").item(0).getTextContent();
					String a6=eElement.getElementsByTagName("Address_Street1").item(0).getTextContent();                        
					String a7=eElement.getElementsByTagName("Address_street2").item(0).getTextContent();
					String a8=eElement.getElementsByTagName("City").item(0).getTextContent();
					String a9=eElement.getElementsByTagName("State").item(0).getTextContent();
					int a10=Integer.parseInt(eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
					String a11=eElement.getElementsByTagName("Region").item(0).getTextContent();
					String a12=eElement.getElementsByTagName("Location_contact_name").item(0).getTextContent();
					int a13=Integer.parseInt(eElement.getElementsByTagName("LocPhone").item(0).getTextContent());
					int a14=Integer.parseInt(eElement.getElementsByTagName("LocFaxNumber").item(0).getTextContent());
					String a15=eElement.getElementsByTagName("LocEmail").item(0).getTextContent();
					
					l1.setLocationID(a1);
					l1.setLocName(a2);
					l1.setLocationCode(a3);
					l1.setIsAuction(a4);
					l1.setCustomerID(a5);
					l1.setAddress_Street1(a6);
					l1.setAddress_street2(a7);
					l1.setCity(a8);
					l1.setState(a9);
					l1.setPostalCode(a10);
					l1.setRegion(a11);
					l1.setLocation_contact_name(a12);
					l1.setLocPhone(a13);
					l1.setLocFaxNumber(a14);
					l1.setLocEmail(a15);

					System.out.println("Location ID : " + a1);
					System.out.println("Location Make : " + a2);
					System.out.println("Year : " + a3);
					System.out.println("Model : " + a4);
					System.out.println("LicensePlateNo : " + a5);
					System.out.println("Color : " + a6);
					System.out.println("VIN : " + a7);
					System.out.println("DriverID : " + a8);
					LocationObject.add(l1);     
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertLocations(LocationObject);
			LocationObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}