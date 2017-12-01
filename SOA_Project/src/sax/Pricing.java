package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Pricing{
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Pricing.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler8 userhandler = new UserHandler8();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler8 extends DefaultHandler {

	boolean priceID, locationIDFrom, locationIDTo, price, locationCodeFrom, locationCodeTo, locationNameFrom, locationNameTo, customerID = false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("PriceID")) {
		    	  priceID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("LocationIDFrom")) {
		    	  locationIDFrom = true;
		      } 
		      else if (Ord.equalsIgnoreCase("LocationIDTo")) {
		    	  locationIDTo = true;
		      } 
		      else if (Ord.equalsIgnoreCase("Price")) {
		    	  price = true;
		      }	      		
		      else if (Ord.equalsIgnoreCase("LocationCodeFrom")) {
		    	  locationCodeFrom = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocationCodeTo")) {
		    	  locationCodeTo = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocationNameFrom")) {
		    	  locationNameFrom = true;
		      }
		      else if (Ord.equalsIgnoreCase("LocationNameTo")) {
		    	  locationNameTo = true;
		      }
		      else if (Ord.equalsIgnoreCase("CustomerID")) {
		    	  customerID = true;
		      }
		   }

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Pricing")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (priceID) {
			         System.out.println("Price ID: " 
			         + new String(ch, strt, len));
			         priceID = false;
			      } 
			      else if (locationIDFrom) {
			         System.out.println("Location ID From: " 
			         + new String(ch, strt, len));
			         locationIDFrom = false;
			      } 
			      else if (locationIDTo) {
			         System.out.println("Location ID To: " 
			         + new String(ch, strt, len));
			         locationIDTo = false;
			      } 
			      else if (price) {
				         System.out.println("Price: "
				         + new String(ch, strt, len));
				         price = false;
				      }
			      else if (locationCodeFrom) {
				         System.out.println("Location Code From: "
				         + new String(ch, strt, len));
				         locationCodeFrom = false;
				      }
			      else if (locationCodeTo) {
				         System.out.println("Location Code To: "
				         + new String(ch, strt, len));
				         locationCodeTo = false;
				      }
			      else if (locationNameFrom) {
				         System.out.println("Location Name From: "
				         + new String(ch, strt, len));
				         locationNameFrom = false;
				      }
			      else if (locationNameTo) {
				         System.out.println("Location Name To: "
				         + new String(ch, strt, len));
				         locationNameTo = false;
				      }
			      else if (customerID) {
				         System.out.println("Customer ID: "
				         + new String(ch, strt, len));
				         customerID = false;
				      }
			   
	   }		         
			 
}