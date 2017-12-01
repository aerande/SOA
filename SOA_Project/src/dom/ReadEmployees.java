package dom;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

import bean.Employees;
import connection.ConnectToOracle;
 
public class ReadEmployees {
 
	public static void main(String argv[]) {
		ArrayList<Employees> EmployeeObject = new ArrayList<Employees>();
		Employees t1;
 
		try {
	 
			File file = new File("src/XML/Employees.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();
		 
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		 
			NodeList nList = doc.getElementsByTagName("Employee");
		 
			System.out.println("---------------------------------");
		 
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					 
					t1=new Employees();
					Element eElement = (Element) nNode;
					String a1= eElement.getElementsByTagName("EmployeeID").item(0).getTextContent();
					String a2= eElement.getElementsByTagName("FirstName").item(0).getTextContent();
					String a3= eElement.getElementsByTagName("LastName").item(0).getTextContent();
					String a4= eElement.getElementsByTagName("Email").item(0).getTextContent();
					String a5= eElement.getElementsByTagName("Extension").item(0).getTextContent();
					int a6=Integer.parseInt(eElement.getElementsByTagName("HomePhone").item(0).getTextContent());
					int a7=Integer.parseInt(eElement.getElementsByTagName("CellPhone").item(0).getTextContent());
					int a9=Integer.parseInt(eElement.getElementsByTagName("SocialSecurityNumber").item(0).getTextContent());
					int a14=Integer.parseInt(eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
					int a17=Integer.parseInt(eElement.getElementsByTagName("Salary").item(0).getTextContent());
					String a8= eElement.getElementsByTagName("JobTitle").item(0).getTextContent();
					String a10= eElement.getElementsByTagName("DriverLicenseNumber").item(0).getTextContent();
					String a11= eElement.getElementsByTagName("Address").item(0).getTextContent();
					String a12= eElement.getElementsByTagName("City").item(0).getTextContent();
					String a13= eElement.getElementsByTagName("State").item(0).getTextContent();
					String a15= eElement.getElementsByTagName("Birthdate").item(0).getTextContent();
					String a16= eElement.getElementsByTagName("DateHired").item(0).getTextContent();
					String a18= eElement.getElementsByTagName("Notes").item(0).getTextContent();
	   
					t1.setEmployeeID(a1);
					t1.setFirstName(a2);
					t1.setLastName(a3);
					t1.setEmail(a4);
					t1.setExtension(a5);
					t1.setHomePhone(a6);
					t1.setCellPhone(a7);
					t1.setSocialSecurityNumber(a9);
					t1.setPostalCode(a14);
					t1.setSalary(a17);
					t1.setJobTitle(a8);
					t1.setDriverLicenseNumber(a10);
					t1.setAddress(a11);
					t1.setCity(a12);
					t1.setState(a13);
					t1.setBirthdate(a15);
					t1.setDateHired(a16);
					t1.setNotes(a18);

					System.out.println("Truck ID : " + a1);
					System.out.println("Truck Make : " + a2);
					System.out.println("Year : " + a3);
					EmployeeObject.add(t1);     
					System.out.print(t1.getEmployeeID() + "---------------------------");
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertEmployees(EmployeeObject);
			EmployeeObject.clear();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}