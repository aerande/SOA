package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Orders;
import connection.ConnectToOracle;
 
public class ReadOrders {
 
	public static void main(String argv[]) {
		ArrayList<Orders> OrderObject = new ArrayList<Orders>();
		Orders t1;
 
		try {
	 
			File file = new File("src/XML/Orders.xml");		   
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);			 
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Order");
		 
			System.out.println("--------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					t1=new Orders();
					Element eElement = (Element) nNode;
					
					String a1= eElement.getElementsByTagName("OrderID").item(0).getTextContent();
					String a2= eElement.getElementsByTagName("OrderDate").item(0).getTextContent();
					String a3= eElement.getElementsByTagName("CustomerID").item(0).getTextContent();
					String a4= eElement.getElementsByTagName("EmployeeID").item(0).getTextContent();
					String a5= eElement.getElementsByTagName("TruckID").item(0).getTextContent();
					String a6= eElement.getElementsByTagName("IsSpecial").item(0).getTextContent();
					int a7=Integer.parseInt(eElement.getElementsByTagName("PurchaseOrderNumber").item(0).getTextContent());
					int a8=Integer.parseInt(eElement.getElementsByTagName("OrderTotalAmount").item(0).getTextContent());
	 
					t1.setOrderID(a1);
					t1.setOrderDate(a2);
					t1.setCustomerID(a3);
					t1.setEmployeeID(a4);
					t1.setTruckID(a5);
					t1.setIsSpecial(a6);
					t1.setPurchaseOrderNumber(a7);
					t1.setOrderTotalAmount(a8);             

					System.out.println("Truck ID : " + a1);
					System.out.println("Truck Make : " + a2);
					System.out.println("Year : " + a3);
					OrderObject.add(t1);     
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertOrders(OrderObject);
			OrderObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}