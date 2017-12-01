package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Trucks;
import connection.ConnectToOracle;
 
public class ReadTrucks {
 
	public static void main(String argv[]) {
		ArrayList<Trucks> truckObject = new ArrayList<Trucks>();
		Trucks t1;
 
		try {
	 
			File file = new File("src/XML/Trucks.xml");		   
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);			 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Truck");
		 
			System.out.println("------------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					t1=new Trucks();
					Element eElement = (Element) nNode;
					String a1= eElement.getElementsByTagName("TruckID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("Make").item(0).getTextContent();
					int a3=Integer.parseInt(eElement.getElementsByTagName("Year").item(0).getTextContent().substring(0,4));
					String a4=eElement.getElementsByTagName("Model").item(0).getTextContent();
					String a5=eElement.getElementsByTagName("LicensePlateNo").item(0).getTextContent();
					String a6=eElement.getElementsByTagName("Color").item(0).getTextContent();                        
					String a7=eElement.getElementsByTagName("VIN").item(0).getTextContent();
					String a8=eElement.getElementsByTagName("DriverID").item(0).getTextContent();
					
					t1.setTruckID(a1);
					t1.setMake(a2);
					t1.setYear(a3);
					t1.setModel(a4);
					t1.setLicensePlateNo(a5);
					t1.setColor(a6);
					t1.setVIN(a7);
					t1.setDriverID(a8);

					System.out.println("Truck ID : " + a1);
					System.out.println("Truck Make : " + a2);
					System.out.println("Year : " + a3);
					System.out.println("Model : " + a4);
					System.out.println("LicensePlateNo : " + a5);
					System.out.println("Color : " + a6);
					System.out.println("VIN : " + a7);
					System.out.println("DriverID : " + a8);
					truckObject.add(t1);     
				} 
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertTrucks(truckObject);
			truckObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}