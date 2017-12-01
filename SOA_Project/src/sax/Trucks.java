package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Trucks {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Trucks.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler10 userhandler = new UserHandler10();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler10 extends DefaultHandler {

	boolean truckID, make, year, model, licensePlateNo, color, VIN, driverID = false;

	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("TruckID")) {
		    	  truckID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("Make")) {
		    	  make = true;
		      } 
		      else if (Ord.equalsIgnoreCase("Year")) {
		    	  year = true;
		      } 
		      else if (Ord.equalsIgnoreCase("Model")) {
		    	  model = true;
		      }
		      else if (Ord.equalsIgnoreCase("LicensePlateNo")) {
		    	  licensePlateNo = true;
		      }
		      else if (Ord.equalsIgnoreCase("Color")) {
		    	  color = true;
		      }
		      else if (Ord.equalsIgnoreCase("VIN")) {
		    	  VIN = true;
		      }
			  else if (Ord.equalsIgnoreCase("DriverID")) {
				  driverID = true;
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
			      if (truckID) {
			         System.out.println("Truck ID: " 
			         + new String(ch, strt, len));
			         truckID = false;
			      } 
			      else if (make) {
			         System.out.println("Make: " 
			         + new String(ch, strt, len));
			         make = false;
			      } 
			      else if (year) {
			         System.out.println("Year: " 
			         + new String(ch, strt, len));
			         year = false;
			      } 
			      else if (model) {
			         System.out.println("Model"
			         + new String(ch, strt, len));
			         model = false;
			      }
			      else if (licensePlateNo) {
			          System.out.println("License Plate No: " 
			          + new String(ch, strt, len));
			          licensePlateNo = false;
			       }
			      else if (color) {
			          System.out.println("Color: " 
			          + new String(ch, strt, len));
			          color = false;
			      }
			      else if (VIN) {
			          System.out.println("VIN: " 
			          + new String(ch, strt, len));
			          VIN = false;
			      }
				else if (driverID) {
			          System.out.println("Driver ID: " 
			          + new String(ch, strt, len));
			          driverID = false;	
			          System.out.println("\n");
				} 
		}
	
}