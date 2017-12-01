package dom;

import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import bean.Customers;
import connection.ConnectToOracle;

public class ReadCustomers {
	public static void main (String[] Args) throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Customers> customerObject = new ArrayList<Customers>();
		Customers c1;
		try{
			File file = new File("src/XML/Customers.xml");
			DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbfactory.newDocumentBuilder();

			Document doc = dBuilder.parse(file);
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("Customer");
			System.out.println("--------------------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);

				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					c1=new Customers();
					Element eElement = (Element) nNode;
					
					String a1=eElement.getElementsByTagName("CustomerID").item(0).getTextContent();
					String a2=eElement.getElementsByTagName("CustomerTitle").item(0).getTextContent();
					String a3=eElement.getElementsByTagName("BusinessName").item(0).getTextContent();
					String a4=eElement.getElementsByTagName("BillingAddress").item(0).getTextContent();
					String a5=eElement.getElementsByTagName("City").item(0).getTextContent();
					String a6=eElement.getElementsByTagName("StateOrProvince").item(0).getTextContent();                        
					int a7=Integer.parseInt(eElement.getElementsByTagName("PostalCode").item(0).getTextContent());
					String a8=eElement.getElementsByTagName("CountryRegion").item(0).getTextContent();
					int a9=Integer.parseInt(eElement.getElementsByTagName("PhoneNumber").item(0).getTextContent());
					int a10=Integer.parseInt(eElement.getElementsByTagName("CellNumber").item(0).getTextContent());
					int a11=Integer.parseInt(eElement.getElementsByTagName("OtherNumber").item(0).getTextContent());
					int a12=Integer.parseInt(eElement.getElementsByTagName("FaxNumber").item(0).getTextContent());
					String a13=eElement.getElementsByTagName("EmailAddress").item(0).getTextContent();
					String a14=eElement.getElementsByTagName("CustomerType").item(0).getTextContent();
					String a15=eElement.getElementsByTagName("CompanyName").item(0).getTextContent();
					String a16=eElement.getElementsByTagName("ContactName").item(0).getTextContent();
					String a17=eElement.getElementsByTagName("AlternateContactName").item(0).getTextContent();
					String a18=eElement.getElementsByTagName("DateEntered").item(0).getTextContent();
					
					c1.setCustomerID(a1);
					c1.setCustomerTitle(a2);
					c1.setBusinessName(a3);
					c1.setBillingAddress(a4);
					c1.setCity(a5);
					c1.setStateOrProvince(a6);
					c1.setPostalCode(a7);
					c1.setCountryRegion(a8);
	                c1.setPhoneNumber(a9);
	                c1.setCellNumber(a10);
	                c1.setOtherNumber(a11);
	                c1.setFaxNumber(a12);
					c1.setEmailAddress(a13);
					c1.setCustomerType(a14);
					c1.setCompanyName(a15);
					c1.setContactName(a16);
					c1.setAlternateContactName(a17);
					c1.setDateEntered(a18);
					
					System.out.println("Customers ID : " + a1);
					System.out.println("Customer Title : " + a2);
					System.out.println("Billing Address : " + a4);
					System.out.println("City : " + a5);
					System.out.println("State or Province : " + a6);
					System.out.println("Postal Code : " + a7);
					System.out.println("Country : " + a8);
					System.out.println("Phone Number : " + a9);
					System.out.println("Cell Number : " + a10);
					System.out.println("Fax Number : " + a12);
					System.out.println("Email: " + a13);
					customerObject.add(c1);
				}
			}
			ConnectToOracle co = new ConnectToOracle();
			co.insertCustomers(customerObject);
			customerObject.clear();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}