package connection;

import bean.*;

import java.sql.*;
import java.util.*;

public class ConnectToOracle {
	Connection con = null;
	Statement st = null;
	PreparedStatement ps = null;
	public void insertTrucks(ArrayList<Trucks> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getTruckID();
                String a2= t1.get(i).getMake();
                int a3= t1.get(i).getYear();
                String a4= t1.get(i).getModel();
                String a5= t1.get(i).getLicensePlateNo();
                String a6= t1.get(i).getColor();
                String a7= t1.get(i).getVIN();
                String a8= t1.get(i).getDriverID();
                ps=con.prepareStatement("insert into trucks (TruckID ,Make,Year,Model,LicencePlateNo,Color,VIN,DriverID) values ('"+a1+"','"+a2+"',"+a3+",'"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"')");
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    }   
    
    public void insertCustomers(ArrayList<Customers> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getCustomerID();
                String a2= t1.get(i).getCustomerTitle();
                String a3= t1.get(i).getBusinessName();
                String a4= t1.get(i).getBillingAddress();
                String a5= t1.get(i).getCity();
                String a6= t1.get(i).getStateOrProvince();
                int a7= t1.get(i).getPostalCode();
                String a8= t1.get(i).getCountryRegion();
                int a9= t1.get(i).getPhoneNumber();
                int a10= t1.get(i).getCellNumber();
                int a11= t1.get(i).getOtherNumber();
                int a12= t1.get(i).getFaxNumber();
                String a13= t1.get(i).getEmailAddress();
                String a14= t1.get(i).getCustomerType();
                String a15= t1.get(i).getCompanyName();
                String a16= t1.get(i).getContactName();
                String a17= t1.get(i).getAlternateContactName();
                String a18= t1.get(i).getDateEntered();
                ps=con.prepareStatement("insert into customers (CustomerID ,CustomerTitle,BusinessName,BillingAddress,City,StateOrProvince,PostalCode,Country,PhoneNumber,CellNumber,OtherNumber,FaxNumber,EmailAddress,Customer_Type,CompanyName,ContactName,AlternateContactName,DateEntered) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"',"+a7+",'"+a8+"',"+a9+","+a10+","+a11+","+a12+",'"+a13+"','"+a14+"','"+a15+"','"+a16+"','"+a17+"','"+a18+"')"); 
                ps.executeUpdate();
			}        
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void insertEmployees(ArrayList<Employees> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getEmployeeID();
                String a2= t1.get(i).getFirstName();
                String a3= t1.get(i).getLastName();
                String a4= t1.get(i).getEmail();
                String a5= t1.get(i).getExtension();
                int a6= t1.get(i).getHomePhone();
                int a7= t1.get(i).getCellPhone();
                String a8= t1.get(i).getJobTitle();
                int a9= t1.get(i).getSocialSecurityNumber();
                String a10= t1.get(i).getDriverLicenseNumber();
                String a11= t1.get(i).getAddress();
                String a12= t1.get(i).getCity();
                String a13= t1.get(i).getState();
                int a14= t1.get(i).getPostalCode();
                String a15= t1.get(i).getBirthdate();
                String a16= t1.get(i).getDateHired();
                int a17= t1.get(i).getSalary();
                String a18= t1.get(i).getNotes();
                ps=con.prepareStatement("insert into EMPLOYEES (EmployeeID , FirstName, LastName, Email, Extension, HomePhone, CellPhone, Job_Title, SSN,DriverLicenceNumber, Address, City, State, PostalCode, Birthdate, DateHired, Salary, Notes) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"',"+a6+","+a7+",'"+a8+"',"+a9+",'"+a10+"','"+a11+"','"+a12+"','"+a13+"',"+a14+",'"+a15+"','"+a16+"',"+a17+",'"+a18+"')");
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    } 
    
    public void insertPricing(ArrayList<Pricing> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getPriceID();
                String a2= t1.get(i).getLocationIDFrom();
                String a3= t1.get(i).getLocationIDTo();
                int a4= t1.get(i).getPrice();
                String a5= t1.get(i).getLocationCodeFrom();
                String a6= t1.get(i).getLocationCodeTo();
                String a7= t1.get(i).getLocationNameFrom();
                String a8= t1.get(i).getLocationNameTO();
                String a9= t1.get(i).getCustomerID();
                ps=con.prepareStatement("insert into pricing (PriceID,LocationIDFrom,LocationIDTO,Price,LocationCodeFrom,LocationCodeTo,LocationNameFrom,LocationNameTo,CustomerID) values ('"+a1+"','"+a2+"','"+a3+"',"+a4+",'"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"')"); 
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    }
     
    public void insertLocations(ArrayList<Locations> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getLocationID();
                String a2= t1.get(i).getLocName();
                String a3= t1.get(i).getLocationCode();
                String a4= t1.get(i).getIsAuction();
                String a5= t1.get(i).getCustomerID();
                String a6= t1.get(i).getAddress_Street1();
                String a7= t1.get(i).getAddress_street2();
                String a8= t1.get(i).getCity();
                String a9= t1.get(i).getState();
                int a10= t1.get(i).getPostalCode();
                String a11= t1.get(i).getRegion();
                String a12= t1.get(i).getLocation_contact_name();
                int a13= t1.get(i).getLocPhone();
                int a14= t1.get(i).getLocFaxNumber();
                String a15= t1.get(i).getLocEmail();

                ps=con.prepareStatement("insert into Locations (LocationID, LocName, LocationCode, IsAuction, CustomerID, Address_street1, Address_street2, City, State, PostalCode, Region, Location_contact_name, LocPhone, LocFaxNumber, LocEmail) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"','"+a9+"',"+a10+",'"+a11+"','"+a12+"',"+a13+","+a14+",'"+a15+"')"); 
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    } 
     
    public void insertComments(ArrayList<Comments> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getCommentID();
                String a2= t1.get(i).getCommentText();
                String a3= t1.get(i).getCommentType();
                String a4= t1.get(i).getCustomerID();
                ps=con.prepareStatement("insert into Comments (CommentsID,Comments,CommentsType,CustomerID) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"')"); 
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public void insertOrders(ArrayList<Orders> t1){
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
			st = con.createStatement();
			for (int i=0;i<t1.size();i++) {
				String a1= t1.get(i).getOrderID();
                String a2= t1.get(i).getOrderDate();
                String a3= t1.get(i).getCustomerID();
                String a4= t1.get(i).getEmployeeID();
                String a5= t1.get(i).getTruckID();
                int a6= t1.get(i).getPurchaseOrderNumber();
                int a7= t1.get(i).getOrderTotalAmount();
                String a8 = t1.get(i).getIsSpecial();
                ps=con.prepareStatement("insert into Orders (OrderID,OrderDate,CustomerID,EmployeeID,TruckID,PurchaseOrderNumber,OrderTotalAmount,IsSpecial) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"')"); 
                ps.executeUpdate();
			}
			con.close();
			st.close();
			ps.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
    }
       
    public void insertPayments(ArrayList<Payments> t1){
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                st = con.createStatement();
    			for (int i=0;i<t1.size();i++) {
    				String a1= t1.get(i).getPaymentID();
                    String a2= t1.get(i).getOrderID();
                    String a3= t1.get(i).getPaymentMethod();
                    int a4= t1.get(i).getPaymentAmount();
                    String a5= t1.get(i).getPaymentDate();
                    String a6= t1.get(i).getCheckNumber();
                    String a7= t1.get(i).getCreditCardType();
                    long a8= t1.get(i).getCreditCardNumber();
                    String a9= t1.get(i).getCardholdersName();
                    String a10= t1.get(i).getCreditCardExpDate();
                    int a11= t1.get(i).getCreditCardAuthorizationNumber();

                    ps=con.prepareStatement("insert into Payments (PaymentID, OrderID, PaymentMethod, PaymentAmount, PaymentDate, CheckNumber, CreditCardType, CreditCardNumber, CardholdersName, CreditCardExpDate, CreditCardAuthorizationNumber) values ('"+a1+"','"+a2+"','"+a3+"',"+a4+",'"+a5+"','"+a6+"','"+a7+"',"+a8+",'"+a9+"','"+a10+"',"+a11+")"); 
                    ps.executeUpdate();
    			}
    			con.close();
    			st.close();
    			ps.close();
        } 
        catch (Exception e) {
        	e.printStackTrace();
        }
    }
       
    public void insertTransactions(ArrayList<Transactions> t1){
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                st = con.createStatement();
    			for (int i=0;i<t1.size();i++) {
    				String a1= t1.get(i).getTransactionID();
                    String a2= t1.get(i).getOrderID();
                    String a3= t1.get(i).getPriceID();
                    String a4= t1.get(i).getTransactionDate();
                    String a5= t1.get(i).getTransactionDescription();
                    int a6= t1.get(i).getTransactionAmount();
                    String a7= t1.get(i).getEmployeeID();
                    String a8= t1.get(i).getTruckID();
                    int a9= t1.get(i).getDiscount();
                    int a10= t1.get(i).getQuantity();
                    int a11= t1.get(i).getUnitPrice();
                    int a12= t1.get(i).getDriverPrice();
                    String a13= t1.get(i).getRunNumber();
                    String a14= t1.get(i).getIsSpecial();
                    int a15= t1.get(i).getRate();
                    int a16= t1.get(i).getSurcharge();
                    ps=con.prepareStatement("insert into Transactions (TransactionID, OrderID, PriceID, TransactionDate, TransactionDescription, TransactionAmount, EmployeeID, TruckID, Discount, Quantity, UnitPrice, DriverPrice, RunNumber, IsSpecial, Rate, Surcharge) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"',"+a6+",'"+a7+"','"+a8+"',"+a9+","+a10+","+a11+","+a12+",'"+a13+"','"+a14+"',"+a15+","+a16+")"); 
                    ps.executeUpdate();
    			}
    			con.close();
    			st.close();
    			ps.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
    }
       
    public void insertExpenses(ArrayList<Expenses> t1){
    	   try {
                Class.forName("oracle.jdbc.OracleDriver");
                con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                st = con.createStatement();
    			for (int i=0;i<t1.size();i++) {
    				String a1= t1.get(i).getExpenseID();
                    String a2= t1.get(i).getEmployeeID();
                    String a3= t1.get(i).getTruckID();
                    String a4= t1.get(i).getExpenseType();
                    String a5= t1.get(i).getPurposeofExpense();
                    int a6= t1.get(i).getAmountSpent();
                    String a7= t1.get(i).getDescription();
                    String a8= t1.get(i).getDatePurchased();
                    String a9= t1.get(i).getDateSubmitted();
                    int a10= t1.get(i).getAdvanceAmount();
                    String a11= t1.get(i).getPaymentMethod();
                  
                    	PreparedStatement ps=con.prepareStatement("insert into Expenses (ExpenseID, EmployeeID, TruckID, ExpenseType, PurposeofExpense, AmountSpent, Description, DatePurchased, DateSubmitted, AdvanceAmount, PaymentMethod) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"',"+a6+",'"+a7+"','"+a8+"','"+a9+"',"+a10+",'"+a11+"')"); 
                    	ps.executeUpdate();
                    
                    
    			}
    			con.close();
    			st.close();
    			ps.close();
    	   } 
    	   catch (Exception e) {
    		   e.printStackTrace();
    	   }
    }
        
    public void insertInvoices (ArrayList<Invoices> b1) {
        	try {
        		Class.forName("oracle.jdbc.OracleDriver");
        		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
        		st = con.createStatement();
     			for (int i=0;i<b1.size();i++) {
     				String a1= b1.get(i).getInvoiceID();
                    String a2= b1.get(i).getOrderID();
                    String a3= b1.get(i).getCustomerID();
                    String a4= b1.get(i).getPaymentID();
                    String a5= b1.get(i).getPriceID();
                    String a6= b1.get(i).getTransactionID();
                    String a7= b1.get(i).getTruckID();
                    String a8= b1.get(i).getExpenseID();
                    ps=con.prepareStatement("insert into Invoices (InvoiceID, OrderID, CustomerID, PaymentID, PriceID, TransactionID, TruckID, ExpenseID) values ('"+a1+"','"+a2+"','"+a3+"','"+a4+"','"+a5+"','"+a6+"','"+a7+"','"+a8+"')");
                    ps.executeUpdate();
     			}
    			con.close();
    			st.close();
    			ps.close();
        	}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
    }
}
