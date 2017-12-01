package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Invoices {
	public static void main(String[] args){

		try {	
			
			File file = new File("src/XML/Invoices.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler4 userhandler = new UserHandler4();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler4 extends DefaultHandler {

	boolean invoiceID, orderID, customerID, paymentID, priceID, transactionID, truckID, expenseID = false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("InvoiceID")) {
		    	  invoiceID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("OrderID")) {
		    	  orderID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("CustomerID")) {
		    	  customerID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("PaymentID")) {
		    	  paymentID = true;
		      }		
		      else if (Ord.equalsIgnoreCase("PriceID")) {
		    	  priceID = true;
		      }
		      else if (Ord.equalsIgnoreCase("TransactionID")) {
		    	  transactionID = true;
		      }
		      else if (Ord.equalsIgnoreCase("TruckID")) {
		    	  truckID = true;
		      }
			   else if (Ord.equalsIgnoreCase("ExpenseID")) {
				   expenseID = true;
			   }
		   }

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Invoice")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (invoiceID) {
			         System.out.println("Invoice ID: " 
			         + new String(ch, strt, len));
			         invoiceID = false;
			      } 
			      else if (orderID) {
			         System.out.println("Order ID: " 
			         + new String(ch, strt, len));
			         orderID = false;
			      } 
			      else if (customerID) {
			         System.out.println("Customer ID: " 
			         + new String(ch, strt, len));
			         customerID = false;
			      } 
			      else if (paymentID) {
				         System.out.println("Payment ID: "
				         + new String(ch, strt, len));
				         paymentID = false;
				      }
			      else if (priceID) {
				         System.out.println("Price ID: "
				         + new String(ch, strt, len));
				         priceID = false;
				      }
			      else if (transactionID) {
				         System.out.println("Transaction ID: "
				         + new String(ch, strt, len));
				         transactionID = false;
				      }
			      else if (truckID) {
				         System.out.println("Truck ID: "
				         + new String(ch, strt, len));
				         truckID = false;
				      }
			      else if (expenseID) {
				         System.out.println("Expense ID: "
				         + new String(ch, strt, len));
				         expenseID = false;
				      }
			   
	   }		         
			 
}