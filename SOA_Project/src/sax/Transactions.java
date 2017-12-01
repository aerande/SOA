package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Transactions {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Transactions.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler9 userhandler = new UserHandler9();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler9 extends DefaultHandler {

	 boolean transactionID, orderID, priceID, transactionDate, transactionDescription, transactionAmount = false;
	 boolean make, model, year, employeeID, truckID, discount, quantity = false;
	 boolean unitPrice, driverPrice, VIN, runNumber, isSpecial, rate, surcharge = false;
	  
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("TransactionID")) {
		    	  transactionID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("OrderID")) {
		    	  orderID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("PriceID")) {
		    	  priceID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("TransactionDate")) {
		    	  transactionDate = true;
		      }
		      else if (Ord.equalsIgnoreCase("TransactionDescription")) {
		    	  transactionDescription = true;
		      }
		      else if (Ord.equalsIgnoreCase("TransactionAmount")) {
		    	  transactionAmount = true;
		      }
		      else if (Ord.equalsIgnoreCase("Make")) {
		    	  make = true;
		      }
		      else if (Ord.equalsIgnoreCase("Model")) {
		    	  model = true;
		      }
			  else if (Ord.equalsIgnoreCase("Year")) {
		    	  year = true;
			  }
			  else if (Ord.equalsIgnoreCase("EmployeeID")) {
		    	  employeeID = true;
			  }
		      else if (Ord.equalsIgnoreCase("TruckID")) {
		    	  truckID = true;
		      }
			  else if (Ord.equalsIgnoreCase("Discount")) {
		    	  discount = true;
			  }	
			  else if (Ord.equalsIgnoreCase("Quantity")) {
		    	  quantity = true;
			  }
		      else if (Ord.equalsIgnoreCase("UnitPrice")) {
		    	  unitPrice = true;
		      }
			  else if (Ord.equalsIgnoreCase("DriverPrice")) {
		     	  driverPrice = true;
			  }
		      else if (Ord.equalsIgnoreCase("VIN")) {
		    	  VIN = true;
		      }
		      else if (Ord.equalsIgnoreCase("RunNumber")) {
		    	  runNumber = true;
		      }
			  else if (Ord.equalsIgnoreCase("IsSpecial")) {
		    	  isSpecial = true;
			  }
		      else if (Ord.equalsIgnoreCase("Rate")) {
		    	  rate = true;
		      }
		      else if (Ord.equalsIgnoreCase("Surcharge")) {
		    	  surcharge = true;
		      }
	 	}

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Transaction")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (transactionID) {
			         System.out.println("Transaction ID: " 
			         + new String(ch, strt, len));
			         transactionID = false;
			      } 
			      else if (orderID) {
			         System.out.println("Order ID: " 
			         + new String(ch, strt, len));
			         orderID = false;
			      } 
			      else if (priceID) {
			         System.out.println("Price ID: " 
			         + new String(ch, strt, len));
			         priceID = false;
			      } 
			      else if (transactionDate) {
			         System.out.println("Transaction Date: " 
			         + new String(ch, strt, len));
			         transactionDate = false;
			      }
			      else if (transactionDescription) {
			          System.out.println("Transaction Description: " 
			          + new String(ch, strt, len));
			          transactionDescription = false;
			       }
			      else if (transactionAmount) {
			          System.out.println("Transaction Amount: " 
			          + new String(ch, strt, len));
			          transactionAmount= false;
			       }
			      else if (make) {
			          System.out.println("Make: " 
			          + new String(ch, strt, len));
			          make= false;
			      }
			     else if (model) {
			          System.out.println("Model: " 
			          + new String(ch, strt, len));
			          model= false;
			     }
			     else if (year) {
			         System.out.println("Year: " 
			         + new String(ch, strt, len));
			         year= false;
			      }
			      else if (employeeID) {
			          System.out.println("Employee ID: " 
			          + new String(ch, strt, len));
			          employeeID = false;
			       }
			      else if (truckID) {
			          System.out.println("Truck ID: " 
			          + new String(ch, strt, len));
			          truckID= false;
			       }
			      else if (discount) {
			          System.out.println("Discount: " 
			          + new String(ch, strt, len));
			          discount= false;
			      }
			     else if (quantity) {
			          System.out.println("Quantity: " 
			          + new String(ch, strt, len));
			          quantity= false;
			     }
			    else if (unitPrice) {
			         System.out.println("Unit Price: " 
			         + new String(ch, strt, len));
			         unitPrice= false;
			      }
			      else if (driverPrice) {
			          System.out.println("Driver Price: " 
			          + new String(ch, strt, len));
			          driverPrice = false;
			       }
			      else if (VIN) {
			          System.out.println("VIN: " 
			          + new String(ch, strt, len));
			          VIN= false;
			       }
			      else if (runNumber) {
			          System.out.println("Run Number: " 
			          + new String(ch, strt, len));
			          runNumber= false;
			}
			     else if (isSpecial) {
			          System.out.println("Is Special: " 
			          + new String(ch, strt, len));
			          isSpecial= false;
			}

			     else if (rate) {
			          System.out.println("Rate: " 
			          + new String(ch, strt, len));
			          rate= false;
			}
			     else if (surcharge) {
			          System.out.println("Surcharge: " 
			          + new String(ch, strt, len));
			          surcharge= false;
				      }
			   
	   }		         
			 
}