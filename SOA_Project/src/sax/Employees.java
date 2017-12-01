package sax;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Employees {
	public static void main(String[] args){

		try {	
			File file = new File("src/XML/Employees.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler2 userhandler = new UserHandler2();
			saxParser.parse(file, userhandler);     
		} 
		catch (Exception e) {
			System.out.println("Error found");
			e.printStackTrace();
		}
	}   
}

class UserHandler2 extends DefaultHandler {

	boolean employeeID, firstName, lastName, email, extension, homePhone, cellPhone, jobTitle = false;
	boolean socialSecurityNumber, driverLicenseNumber, address = false; 
	boolean city, state, postalCode, birthdate, dateHired, salary, notes = false;
	 
	@Override
	public void startElement(String a, 
		      String b, String Ord, Attributes attributes)
		         throws SAXException {
		      if (Ord.equalsIgnoreCase("EmployeeID")) {
		    	  employeeID = true;
		      } 
		      else if (Ord.equalsIgnoreCase("FirstName")) {
		    	  firstName = true;
		      } 
		      else if (Ord.equalsIgnoreCase("LastName")) {
		    	  lastName = true;
		      } 
		      else if (Ord.equalsIgnoreCase("Email")) {
		    	  email = true;
		      }		
		      else if (Ord.equalsIgnoreCase("Extension")) {
		    	  extension = true;
		      }
		      else if (Ord.equalsIgnoreCase("HomePhone")) {
		    	  homePhone = true;
		      }
		      else if (Ord.equalsIgnoreCase("CellPhone")) {
		    	  cellPhone = true;
		      }
			  else if (Ord.equalsIgnoreCase("JobTitle")) {
		    	  jobTitle = true;
		      }
		      else if (Ord.equalsIgnoreCase("SocialSecurityNumber")) {
		    	  socialSecurityNumber = true;
		      }
		      else if (Ord.equalsIgnoreCase("DriverLicenseNumber")) {
		    	  driverLicenseNumber = true;
		      }
			  else if (Ord.equalsIgnoreCase("Address")) {
		    	  address = true;
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
		      else if (Ord.equalsIgnoreCase("Birthdate")) {
		    	  birthdate = true;
		      }
		      else if (Ord.equalsIgnoreCase("DateHired")) {
		    	  dateHired = true;
		      }
			  else if (Ord.equalsIgnoreCase("Salary")) {
		    	  salary = true;
		      }
		      else if (Ord.equalsIgnoreCase("Notes")) {
		    	  notes = true;
		      }
		}

	@Override
	public void endElement(String a, 
			      String b, String c) throws SAXException {
			      if (c.equalsIgnoreCase("Employee")) {
			         System.out.println("End Element has been reached :" + c);
			      }
			   }

	@Override
	public void characters(char ch[], 
			      int strt, int len) throws SAXException {
			      if (employeeID) {
			         System.out.println("Employee ID: " 
			         + new String(ch, strt, len));
			         employeeID = false;
			      } 
			      else if (firstName) {
			         System.out.println("First Name: " 
			         + new String(ch, strt, len));
			         firstName = false;
			      } 
			      else if (lastName) {
			         System.out.println("Last Name: " 
			         + new String(ch, strt, len));
			         lastName = false;
			      } 
			      else if (email) {
				         System.out.println("Email: "
				         + new String(ch, strt, len));
				         email = false;
				  }
			      else if (extension) {
				         System.out.println("Extension: "
				         + new String(ch, strt, len));
				         extension = false;
				  }
			      else if (homePhone) {
				         System.out.println("Home Phone: "
				         + new String(ch, strt, len));
				         homePhone = false;
				  }
			      else if (cellPhone) {
				         System.out.println("Cell Phone: "
				         + new String(ch, strt, len));
				         cellPhone = false;
				  }
			      else if (jobTitle) {
				         System.out.println("Job Title: "
				         + new String(ch, strt, len));
				         jobTitle = false;
				  }
			      else if (socialSecurityNumber) {
				         System.out.println("Social Security Number: "
				         + new String(ch, strt, len));
				         socialSecurityNumber = false;
				  }
				  else if (driverLicenseNumber) {
				         System.out.println("Driver License Number: "
				         + new String(ch, strt, len));
				         driverLicenseNumber = false;
				  }  
				  else if (address) {
				         System.out.println("Address: "
				         + new String(ch, strt, len));
				         address = false;
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
			      else if (birthdate) {
				         System.out.println("Birth Date:"
				         + new String(ch, strt, len));
				         birthdate = false;
				  }
			      else if (dateHired) {
				         System.out.println("Date Hired: "
				         + new String(ch, strt, len));
				         dateHired = false;
				  }
				  else if (salary) {
				         System.out.println("Salary: "
				         + new String(ch, strt, len));
				         salary = false;
				  }  
				  else if (notes) {
				         System.out.println("Notes: "
				         + new String(ch, strt, len));
				         notes = false;
				  }
			   
	   }		         
			 
}