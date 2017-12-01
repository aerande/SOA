package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Pricing;
import connection.ConnectToOracle;
 
public class ReadPricing {
 
	public static void main(String argv[]) {
		ArrayList<Pricing> PriceObject = new ArrayList<Pricing>();
		Pricing t1;
 
		try {
	 
			File file = new File("src/XML/Pricing.xml");      
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);        
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Pricing");
		 
			System.out.println("----------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					t1=new Pricing();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("PriceID").item(0).getTextContent();
					String a2= eElement.getElementsByTagName("LocationIDFrom").item(0).getTextContent();
					String a3= eElement.getElementsByTagName("LocationIDTo").item(0).getTextContent();
					int a4 =Integer.parseInt(eElement.getElementsByTagName("Price").item(0).getTextContent());
					String a5= eElement.getElementsByTagName("LocationCodeFrom").item(0).getTextContent();
					String a6= eElement.getElementsByTagName("LocationCodeTo").item(0).getTextContent();
					String a7= eElement.getElementsByTagName("LocationNameFrom").item(0).getTextContent();
					String a8= eElement.getElementsByTagName("LocationNameTo").item(0).getTextContent();
					String a9= eElement.getElementsByTagName("CustomerID").item(0).getTextContent();

					t1.setPriceID(a1);
					t1.setLocationIDFrom(a2);
					t1.setLocationIDTo(a3);
					t1.setPrice(a4);
					t1.setLocationCodeFrom(a5);
					t1.setLocationCodeTo(a6);
					t1.setLocationNameFrom(a7);
					t1.setLocationNameTO(a8);
					t1.setCustomerID(a9);

					System.out.println("Truck ID : " + a1);
					System.out.println("Truck Make : " + a2);
					System.out.println("Year : " + a3);
					PriceObject.add(t1);     
				}   
			}
			
			ConnectToOracle co = new ConnectToOracle();
			co.insertPricing(PriceObject);
			PriceObject.clear();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}