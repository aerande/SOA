package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Payments {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Payments.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler7 userhandler = new UserHandler7();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler7 extends DefaultHandler {

	boolean paymentID, orderID, paymentMethod, paymentAmount, paymentDate, checkNumber, creditCardType, creditCardNumber, cardholdersName, creditCardExpDate, creditCardAuthorizationNumber= false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("PaymentID")) {
		    	  paymentID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("OrderID")) {
		    	  orderID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("PaymentMethod")) {
		    	  paymentMethod = true;
		      } 
		      else if (Ord.equalsIgnoreCase("PaymentAmount")) {
		    	  paymentAmount = true;
		      }
		      else if (Ord.equalsIgnoreCase("PaymentDate")) {
		    	  paymentDate = true;
		      }
		      else if (Ord.equalsIgnoreCase("CheckNumber")) {
		    	  checkNumber = true;
		      }
		      else if (Ord.equalsIgnoreCase("CreditCardType")) {
		    	  creditCardType = true;
		      }
			   else if (Ord.equalsIgnoreCase("CreditCardNumber")) {
		    	  creditCardNumber = true;
		      }
		      else if (Ord.equalsIgnoreCase("CardholdersName")) {
		    	  cardholdersName = true;
		      }
		      else if (Ord.equalsIgnoreCase("CreditCardExpDate")) {
		    	  creditCardExpDate = true;
		      }
			  else if (Ord.equalsIgnoreCase("CreditCardAuthorizationNumber")) {
		    	  creditCardAuthorizationNumber = true;
		      }
		}

	@Override
	   public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Payment")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	   public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (paymentID) {
			         System.out.println("Payment ID: " 
			         + new String(ch, strt, len));
			         paymentID = false;
			      } 
			      else if (orderID) {
			         System.out.println("Order ID: " 
			         + new String(ch, strt, len));
			         orderID = false;
			      } 
			      else if (paymentMethod) {
			         System.out.println("Payment Method: " 
			         + new String(ch, strt, len));
			         paymentMethod = false;
			      } 
			      else if (paymentAmount) {
				         System.out.println("Payment Amount: "
				         + new String(ch, strt, len));
				         paymentAmount = false;
				      }
			      else if (paymentDate) {
				         System.out.println("Payment Date: "
				         + new String(ch, strt, len));
				         paymentDate = false;
				      }
			      else if (checkNumber) {
				         System.out.println("Check Number: "
				         + new String(ch, strt, len));
				         checkNumber = false;
				      }
			      else if (creditCardType) {
				         System.out.println("Credit Card Type: "
				         + new String(ch, strt, len));
				         creditCardType = false;
				      }
			      else if (creditCardNumber) {
				         System.out.println("Credit Card Number: "
				         + new String(ch, strt, len));
				         creditCardNumber = false;
				      }
			      else if (cardholdersName) {
				         System.out.println("Card Holders Name: "
				         + new String(ch, strt, len));
				         cardholdersName = false;
				      }
				  else if (creditCardExpDate) {
				         System.out.println("Credit Card ExpDate: "
				         + new String(ch, strt, len));
				         creditCardExpDate = false;
				      }  
					  else if (creditCardAuthorizationNumber) {
				         System.out.println("Credit Card Authorization Number: "
				         + new String(ch, strt, len));
				         creditCardAuthorizationNumber = false;
				      }
			   
	   }		         
			 
}