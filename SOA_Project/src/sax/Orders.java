package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Orders {
   public static void main(String[] args){

      try {	
         File file = new File("src/XML/Orders.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         UserHandler6 userhandler = new UserHandler6();
         saxParser.parse(file, userhandler);     
      } 
      catch (Exception e) {
    	  System.out.println("Error found");
         e.printStackTrace();
      }
   }   
}

class UserHandler6 extends DefaultHandler {

   boolean orderID, orderDate, customerID, employeeID, truckID, isSPecial, purchaseOrderNumber, orderTotalAmount = false;
 
   @Override
   public void startElement(String a, 
      String b, String Ord, Attributes attributes)
         throws SAXException {
      if (Ord.equalsIgnoreCase("OrderID")) {
    	  orderID = true;
      } 
      else if (Ord.equalsIgnoreCase("OrderDate")) {
    	  orderDate = true;
      } 
      else if (Ord.equalsIgnoreCase("CustomerID")) {
    	  orderDate = true;
      } 
      else if (Ord.equalsIgnoreCase("EmployeeID")) {
    	  employeeID = true;
      }
      else if (Ord.equalsIgnoreCase("TruckID")) {
    	  truckID = true;
      }
      else if (Ord.equalsIgnoreCase("IsSPecial")) {
    	  isSPecial = true;
      }
      else if (Ord.equalsIgnoreCase("PurchaseOrderNumber")) {
    	  purchaseOrderNumber = true;
      }
      else if (Ord.equalsIgnoreCase("OrderTotalAmount")) {
    	  orderTotalAmount = true;
      }
   }

   @Override
   public void endElement(String a, 
      String b, String c) throws SAXException {
      if (c.equalsIgnoreCase("Ord")) {
         System.out.println("End Element has been reached :" + c);
      }
   }

   @Override
   public void characters(char ch[], 
      int strt, int len) throws SAXException {
	   if (orderID) {
	         System.out.println("Order ID: " 
	         + new String(ch, strt, len));
	         orderID = false;
	      }
	   else if (orderDate) {
         System.out.println("Order Date: " 
         + new String(ch, strt, len));
         orderDate = false;
      } 
      else if (customerID) {
         System.out.println("Customer ID: " 
         + new String(ch, strt, len));
         customerID = false;
      } 
      else if (employeeID) {
         System.out.println("Employee ID: " 
         + new String(ch, strt, len));
         employeeID = false;
      } 
      else if (truckID) {
         System.out.println("Truck ID: " 
         + new String(ch, strt, len));
         truckID = false;
      }
      else if (isSPecial) {
          System.out.println("Is Special: " 
          + new String(ch, strt, len));
          isSPecial = false;
       }
      else if (purchaseOrderNumber) {
          System.out.println("Purchase Order Number: " 
          + new String(ch, strt, len));
          purchaseOrderNumber = false;
       }
      else if (orderTotalAmount) {
          System.out.println("Order Total Amount: " 
          + new String(ch, strt, len));
          orderTotalAmount = false;
       }
   }
}