package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Customers {
	
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Customers.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler1 userhandler = new UserHandler1();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler1 extends DefaultHandler {

	boolean customerID, customerTitle, businessName, billingAddress, city,stateOrProvince, postalCode, countryRegion = false;
	boolean phoneNumber, cellNumber, otherNumber, faxNumber, emailAddress, customerType, companyName, contactName, alternateContactName, dateEntered = false;
	
	
	@Override
	public void startElement(String a, 
			String b, String Ord, Attributes attributes)
					throws SAXException {
		if (Ord.equalsIgnoreCase("CustomerID")) {
			customerID = true;
		} 
		else if (Ord.equalsIgnoreCase("CustomerTitle")) {
			customerTitle = true;
		} 
		else if (Ord.equalsIgnoreCase("BusinessName")) {
			businessName = true;
		} 
		else if (Ord.equalsIgnoreCase("BillingAddress")) {
			billingAddress = true;
		} 
		else if (Ord.equalsIgnoreCase("City")) {
			city = true;
		} 
		else if (Ord.equalsIgnoreCase("StateOrProvince")) {
			stateOrProvince = true;
		} 
		else if (Ord.equalsIgnoreCase("PostalCode")) {
			postalCode = true;
		} 
		else if (Ord.equalsIgnoreCase("CountryRegion")) {
			countryRegion = true;
		}
		else if (Ord.equalsIgnoreCase("PhoneNumber")) {
			phoneNumber = true;
		}
		else if (Ord.equalsIgnoreCase("CellNumber")) {
			cellNumber = true;
		}
		else if (Ord.equalsIgnoreCase("OtherNumber")) {
			otherNumber = true;
		}
		else if (Ord.equalsIgnoreCase("FaxNumber")) {
			faxNumber = true;
		}
		else if (Ord.equalsIgnoreCase("EmailAddress")) {
			emailAddress = true;
		}
		else if (Ord.equalsIgnoreCase("CustomerType")) {
			customerType = true;
		} 
		else if (Ord.equalsIgnoreCase("CompanyName")) {
			companyName = true;
		}
		else if (Ord.equalsIgnoreCase("ContactName")) {
			contactName = true;
		}
		else if (Ord.equalsIgnoreCase("AlternateContactName")) {
			alternateContactName = true;
		}
		else if (Ord.equalsIgnoreCase("DateEntered")) {
			dateEntered = true;
		}
	}

	@Override
	public void endElement(String a, 
			String b, String c) throws SAXException {
		if (c.equalsIgnoreCase("Customer")) {
			System.out.println("End Element has been reached :" + c);
		}
	}

	@Override
	public void characters(char ch[], 
			int strt, int len) throws SAXException {
		if (customerID) {
			System.out.println("Customer ID : " 
					+ new String(ch, strt, len));
			customerID = false;
		} 
		else if (customerTitle) {
			System.out.println("Customer Title : " 
					+ new String(ch, strt, len));
			customerTitle = false;
		} 
		else if (businessName) {
			System.out.println("Business Name: " 
					+ new String(ch, strt, len));
			businessName = false;
		} 
		else if (billingAddress) {
			System.out.println("Billing Address: " 
					+ new String(ch, strt, len));
			billingAddress = false;
		} 
		else if (city) {
			System.out.println("City: " 
					+ new String(ch, strt, len));
			city = false;
		} 
		else if (stateOrProvince) {
			System.out.println("State Or Province: " 
					+ new String(ch, strt, len));
			stateOrProvince = false;
		} 
		else if (postalCode) {
			System.out.println("Postal Code: " 
					+ new String(ch, strt, len));
			postalCode = false;
		} 
		else if (countryRegion) {
			System.out.println("Country: " 
					+ new String(ch, strt, len));
			countryRegion = false;
		} 
		else if (phoneNumber) {
			System.out.println("Phone Number: " 
					+ new String(ch, strt, len));
			phoneNumber = false;
		} 
		else if (cellNumber) {
			System.out.println("Cell Number: " 
					+ new String(ch, strt, len));
			cellNumber = false;
		}
		else if (otherNumber) {
			System.out.println("Other Number: " 
					+ new String(ch, strt, len));
			otherNumber = false;
		}
		else if (faxNumber) {
			System.out.println("Fax Number: " 
					+ new String(ch, strt, len));
			faxNumber = false;
		}
		else if (emailAddress) {
			System.out.println("Email Address: " 
					+ new String(ch, strt, len));
			emailAddress = false;
		} 
		else if (customerType) {
			System.out.println("Customer: " 
					+ new String(ch, strt, len));
			customerType = false;
		} 
		else if (companyName) {
			System.out.println("Company Name: " 
					+ new String(ch, strt, len));
			companyName = false;
		}
		else if (contactName) {
			System.out.println("Contact Name: " 
					+ new String(ch, strt, len));
			contactName = false;
		}
		else if (alternateContactName) {
			System.out.println("Alternate Contact Name: " 
					+ new String(ch, strt, len));
			alternateContactName = false;
		} 
		else if (dateEntered) {
			System.out.println("Date Entered: " 
					+ new String(ch, strt, len));
			dateEntered = false;
		} 
	}
}