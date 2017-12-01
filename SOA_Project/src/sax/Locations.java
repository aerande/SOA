package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Locations {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Locations.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler5 userhandler = new UserHandler5();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler5 extends DefaultHandler {

	boolean locationID, locName, locationCode, isAuction, customerID, addressStreet1, addressStreet2, city, state, postalCode = false;
	boolean region, location_contact_name, locPhone, locFaxNumber, locEmail = false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("LocationID")) {
		    	  locationID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("LocName")) {
		    	  locName = true;
		      } 
		      else if (Ord.equalsIgnoreCase("LocationCode")) {
		    	  locationCode = true;
		      } 
		      else if (Ord.equalsIgnoreCase("IsAuction")) {
		    	  isAuction = true;
		      }	      		
		      else if (Ord.equalsIgnoreCase("CustomerID")) {
		    	  customerID = true;
		      }
		      else if (Ord.equalsIgnoreCase("Address_Street1")) {
		    	  addressStreet1 = true;
		      }
		      else if (Ord.equalsIgnoreCase("Address_Street2")) {
		    	  addressStreet2 = true;
		      }
			   else if (Ord.equalsIgnoreCase("City")) {
				   city = true;
		      }
		      else if (Ord.equalsIgnoreCase("State")) {
		    	  state = true;
		      }
		      else if (Ord.equalsIgnoreCase("PostalCode")) {
		    	  postalCode = true;
		      }
		      else if (Ord.equalsIgnoreCase("Region")) {
		    	  region = true;
		      }
		      else if (Ord.equalsIgnoreCase("Location_contact_name")) {
		    	  location_contact_name = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocPhone")) {
		    	  locPhone = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocFaxNumber")) {
		    	  locFaxNumber = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocEmail")) {
		    	  locEmail = true;
		      }
		   }

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Location")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (locationID) {
			         System.out.println("Location ID: " 
			         + new String(ch, strt, len));
			         locationID = false;
			      } 
			      else if (locName) {
			         System.out.println("Location Name: " 
			         + new String(ch, strt, len));
			         locName = false;
			      } 
			      else if (locationCode) {
			         System.out.println("Location Code: " 
			         + new String(ch, strt, len));
			         locationCode = false;
			      } 
			      else if (isAuction) {
				         System.out.println("Is Auction: "
				         + new String(ch, strt, len));
				         isAuction = false;
				      }
			      else if (customerID) {
				         System.out.println("Customer ID: "
				         + new String(ch, strt, len));
				         customerID = false;
				      }
			      else if (addressStreet1) {
				         System.out.println("Address Street 1: "
				         + new String(ch, strt, len));
				         addressStreet1 = false;
				      }
			      else if (addressStreet2) {
				         System.out.println("Address Street 2: "
				         + new String(ch, strt, len));
				         addressStreet2 = false;
				      }
			      else if (city) {
				         System.out.println("City: "
				         + new String(ch, strt, len));
				         city = false;
				      }
			      else if (state) {
				         System.out.println("State: "
				         + new String(ch, strt, len));
				         state = false;
				      }
				  else if (postalCode) {
				         System.out.println("Postal Code: "
				         + new String(ch, strt, len));
				         postalCode = false;
				      }
				  else if (region) {
				         System.out.println("Region: "
				         + new String(ch, strt, len));
				         region = false;
				      }
				  else if (location_contact_name) {
				         System.out.println("Location Contact Name: "
				         + new String(ch, strt, len));
				         location_contact_name = false;
				      }
				  else if (locPhone) {
				         System.out.println("Loc Phone"
				         + new String(ch, strt, len));
				         locPhone = false;
				      }
				  else if (locFaxNumber) {
				         System.out.println("Loc Fax Number"
				         + new String(ch, strt, len));
				         locFaxNumber = false;
				      }
				  else if (locEmail) {
				         System.out.println("Loc Email"
				         + new String(ch, strt, len));
				         locEmail = false;
				      }
			   
	   }		         
			 
}