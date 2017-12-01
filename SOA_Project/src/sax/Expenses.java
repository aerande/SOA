package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Expenses {
	public static void main(String[] args){

		try {	
			
			File file = new File("src/XML/Expenses.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler3 userhandler = new UserHandler3();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler3 extends DefaultHandler {

	boolean expenseID, employeeID, expenseType, purposeofExpense, amountSpent, description, datePurchased, dateSubmitted, advanceAmount, paymentMethod = false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("ExpenseID")) {
		    	  expenseID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("EmployeeID")) {
		    	  employeeID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("ExpenseType")) {
		    	  expenseType = true;
		      } 
		      else if (Ord.equalsIgnoreCase("PurposeofExpense")) {
		    	  purposeofExpense = true;
		      }		
		      else if (Ord.equalsIgnoreCase("AmountSpent")) {
		    	  amountSpent = true;
		      }
		      else if (Ord.equalsIgnoreCase("Description")) {
		    	  description = true;
		      }
		      else if (Ord.equalsIgnoreCase("DatePurchased")) {
		    	  datePurchased = true;
		      }
			   else if (Ord.equalsIgnoreCase("DateSubmitted")) {
		    	  dateSubmitted = true;
		      }
		      else if (Ord.equalsIgnoreCase("AdvanceAmount")) {
		    	  advanceAmount = true;
		      }
		      else if (Ord.equalsIgnoreCase("PaymentMethod")) {
		    	  paymentMethod = true;
		      }
		   }

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Expense")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (expenseID) {
			         System.out.println("Expense ID: " 
			         + new String(ch, strt, len));
			         expenseID = false;
			      } 
			      else if (employeeID) {
			         System.out.println("Employee ID: " 
			         + new String(ch, strt, len));
			         employeeID = false;
			      } 
			      else if (expenseType) {
			         System.out.println("Expense Type: " 
			         + new String(ch, strt, len));
			         expenseType = false;
			      } 
			      else if (purposeofExpense) {
				         System.out.println("Purpose of Expense: "
				         + new String(ch, strt, len));
				         purposeofExpense = false;
				      }
			      else if (amountSpent) {
				         System.out.println("Amount Spent: "
				         + new String(ch, strt, len));
				         amountSpent = false;
				      }
			      else if (description) {
				         System.out.println("Description: "
				         + new String(ch, strt, len));
				         description = false;
				      }
			      else if (datePurchased) {
				         System.out.println("Date Purchased: "
				         + new String(ch, strt, len));
				         datePurchased = false;
				      }
			      else if (dateSubmitted) {
				         System.out.println("Date Submitted: "
				         + new String(ch, strt, len));
				         dateSubmitted = false;
				      }
			      else if (advanceAmount) {
				         System.out.println("Advance Amount: "
				         + new String(ch, strt, len));
				         advanceAmount = false;
				      }
				  else if (paymentMethod) {
				         System.out.println("Payment Method: "
				         + new String(ch, strt, len));
				         paymentMethod = false;
				      }
			   
	   }		         
			 
}