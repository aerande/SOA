package Services;

import java.sql.*;
//import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WebService_ServiceCalls")
public class ServiceCalls {
	
	 @WebMethod(operationName = "login")
	    public boolean login(@WebParam(name = "uname") String uname, @WebParam(name = "pass") String pass) {
		 String un = null, pa = null;
	        try {
	                Class.forName("oracle.jdbc.OracleDriver");
	                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
	                Statement st = con.createStatement();
	                String sql = "select * from login where USERNAME='"+uname+"'";
	                ResultSet rs = st.executeQuery(sql);
	                while(rs.next()) {
	                	un = rs.getString("USERNAME");
	                	pa = rs.getString("PASSWORD");
	                }
	                st.close();
	                con.close();
	        } 
	        catch (Exception e) {
				e.printStackTrace();
	        }            
	        return(uname.equals(un) && pass.equals(pa));
	    }
	
    @WebMethod(operationName = "findTruckByVin")
    public String[][] findTruckByVin(@WebParam(name = "name") String txt) {
        //ArrayList<String> truck  = new ArrayList<String>();
        String [][] truck = new String[2][4];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st = con.createStatement();
                String sql = "select * from trucks where vin= '"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("TRUCKID");
                	truck[i][j] = a1;
                	j++;
                	String a2 = rs.getString("MAKE");
                	truck[i][j] = a2;
                	j++;
                	String a3 = rs.getString("YEAR");
                	truck[i][j] = a3;
                	j++;
                	String a4 = rs.getString("MODEL");
                	truck[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }            
        return truck;
    }
    
    @WebMethod(operationName = "findLocationFromToByCustomerId")
    public String[][] findLocationFromToByCustomerId(@WebParam(name = "name") String txt) {
        //ArrayList<String> loc = new ArrayList<String>();
        String [][] loc = new String[3][3];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from pricing where customerid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("LOCATIONIDFROM");
                	loc[i][j] = a1;
                	j++;
                	String a2= rs.getString("LOCATIONIDTO");
                	loc[i][j] = a2;
                	j++;
                	String a3= rs.getString("PRICE");
                	loc[i][j] = a3;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return loc;
    }
	
	@WebMethod(operationName = "findTruckByDriverId")
    public String[][] findTruckByDriverId(@WebParam(name = "name") String txt) {
        //ArrayList<String> truck = new ArrayList<String>();
        String [][] truck = new String[4][4];
        int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from trucks where driverid= '"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("TRUCKID");
                	truck[i][j] = a1;
                	j++;
                	String a2 = rs.getString("MAKE");
                	truck[i][j] = a2;
                	j++;
                	String a3 = rs.getString("YEAR");
                	truck[i][j] = a3;
                	j++;
                	String a4 = rs.getString("MODEL");
                	truck[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return truck;
    }

    @WebMethod(operationName = "findExpenseByEmployeeId")
    public String[][] findExpenseByEmployeeId(@WebParam(name = "name") String txt) {
        //ArrayList<String> exp  = new ArrayList<String>();
        String [][] exp = new String[3][3];
        int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from expenses where employeeid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("AMOUNTSPENT");
                	exp[i][j] = a1;
                	j++;
                	String a2 = rs.getString("PURPOSEOFEXPENSE");
                	exp[i][j] = a2;
                	j++;
                	String a3 = rs.getString("DATEPURCHASED");
                	exp[i][j] = a3;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return exp;
    }
    
    @WebMethod(operationName = "findExpenseByTruckId")
    public String[][] findExpenseByTruckId(@WebParam(name = "name") String txt) {
        //ArrayList<String> exp = new ArrayList<String>();
        String [][] exp = new String[3][3];
        int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from expenses where truckid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("AMOUNTSPENT");
                	exp[i][j] = a1;
                	j++;
                	String a2 = rs.getString("PURPOSEOFEXPENSE");
                	exp[i][j] = a2;
                	j++;
                	String a3 = rs.getString("DATEPURCHASED");
                	exp[i][j] = a3;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return exp;
    }
    
    @WebMethod(operationName = "findCommentByCustomerId")
    public String[][] findCommentByCustomerId(@WebParam(name = "name") String txt) {
        //ArrayList<String> comment = new ArrayList<String>();
        String [][] comment = new String[5][3];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from comments where customerid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("COMMENTSID");
                	comment[i][j] = a1;
                	j++;
                	String a2= rs.getString("COMMENTS");
                	comment[i][j] = a2;
                	j++;
                	String a3= rs.getString("COMMENTSTYPE");
                	comment[i][j] = a3;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return comment;
    }
    
    @WebMethod(operationName = "findOrderByCustomerId")
    public String[][] findOrderByCustomerId(@WebParam(name = "name") String txt) {
        //ArrayList<String> order = new ArrayList<String>();
        String [][] order = new String[5][5];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from orders where customerid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("ORDERID");
                	order[i][j] = a1;
                	j++;
                	String a2= rs.getString("ORDERDATE");
                	order[i][j] = a2;
                	j++;
                	String a3= rs.getString("TRUCKID");
                	order[i][j] = a3;
                	j++;
                	String a4= rs.getString("PURCHASEORDERNUMBER");
                	order[i][j] = a4;
                	j++;
                	String a5= rs.getString("ORDERTOTALAMOUNT");
                	order[i][j] = a5;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return order;
    }
    
    @WebMethod(operationName = "findInvoiceByTransactionId")
    public String[][] findInvoiceByTransactionId(@WebParam(name = "name") String txt) {
        //ArrayList<String> invoice = new ArrayList<String>();
        String[][] invoice = new String[5][8];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from invoices join orders on invoices.orderid = orders.orderid join customers on customers.customerid = invoices.customerid where transactionid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("ORDERID");
                	invoice[i][j] = a1;
                	j++;
                	String a2= rs.getString("ORDERDATE");
                	invoice[i][j] = a2;
                	j++;
                	String a3= rs.getString("TRUCKID");
                	invoice[i][j] = a3;
                	j++;
                	String a4= rs.getString("PURCHASEORDERNUMBER");
                	invoice[i][j] = a4;
                	j++;
                	String a5= rs.getString("ORDERTOTALAMOUNT");
                	invoice[i][j] = a5;
                	j++;
                	String a6= rs.getString("CUSTOMERID");
                	invoice[i][j] = a6;
                	j++;
                	String a7= rs.getString("EMAILADDRESS");
                	invoice[i][j] = a7;
                	j++;
                	String a8= rs.getString("PHONENUMBER");
                	invoice[i][j] = a8;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return invoice;
    }
    
    @WebMethod(operationName = "findPurposeOfExpenseByExpenseId")
    public String[][] findPurposeOfExpenseByExpenseId(@WebParam(name = "name") String txt) {
        //ArrayList<String> purpose = new ArrayList<String>();
        String [][] purpose = new String[4][4];
        int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from expenses where expenseid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("EXPENSETYPE");
                	purpose[i][j] = a1;
                	j++;
                	String a2= rs.getString("PURPOSEOFEXPENSE");
                	purpose[i][j] = a2;
                	j++;
                	String a3= rs.getString("AMOUNTSPENT");
                	purpose[i][j] = a3;
                	j++;
                	String a4= rs.getString("DESCRIPTION");
                	purpose[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return purpose;
    }
    
    @WebMethod(operationName = "findEmployeeByEmployeeId")
    public String[][] findEmployeeByEmployeeId(@WebParam(name = "name") String txt) {
        //ArrayList<String> emp  = new ArrayList<String>();
    	String [][] emp = new String[1][13];
    	int i=0;
        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from employees where employeeid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("FIRSTNAME");
                	emp[i][j] = a1;
                	j++;
                	String a2 = rs.getString("LASTNAME");
                	emp[i][j] = a2;
                	j++;
                	String a3 = rs.getString("EMAIL");
                	emp[i][j] = a3;
                	j++;
                	String a4 = rs.getString("HOMEPHONE");
                	emp[i][j] = a4;
                	j++;
                	String a5 = rs.getString("CELLPHONE");
                	emp[i][j] = a5;
                	j++;
                	String a6 = rs.getString("ADDRESS");
                	emp[i][j] = a6;
                	j++;
                	String a7 = rs.getString("CITY");
                	emp[i][j] = a7;
                	j++;
                	String a8 = rs.getString("STATE");
                	emp[i][j] = a8;
                	j++;
                	String a9 = rs.getString("POSTALCODE");
                	emp[i][j] = a9;
                	j++;
                	String a10 = rs.getString("BIRTHDATE");
                	emp[i][j] = a10;
                	j++;
                	String a11 = rs.getString("DATEHIRED");
                	emp[i][j] = a11;
                	j++;
                	String a12 = rs.getString("SALARY");
                	emp[i][j] = a12;
                	j++;
                	String a13 = rs.getString("NOTES");
                	emp[i][j] = a13;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return emp;
    }
    
    @WebMethod(operationName = "findTruckByMake")
    public String[][] findTruckByMake(@WebParam(name = "name") String txt) {
        //ArrayList<String> truck  = new ArrayList<String>();
    	String [][] truck = new String[7][7];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from trucks where make='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("TRUCKID");
                	truck[i][j] = a1;
                	j++;
                	String a2 = rs.getString("YEAR");
                	truck[i][j] = a2;
                	j++;
                	String a3 = rs.getString("MODEL");
                	truck[i][j] = a3;
                	j++;
                	String a4 = rs.getString("LICENCEPLATENO");
                	truck[i][j] = a4;
                	j++;
                	String a5 = rs.getString("COLOR");
                	truck[i][j] = a5;
                	j++;
                	String a6 = rs.getString("VIN");
                	truck[i][j] = a6;
                	j++;
                	String a7 = rs.getString("DRIVERID");
                	truck[i][j] = a7;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return truck;
    }
    
    @WebMethod(operationName = "findTransactionByEmployeeId")
    public String[][] findTransactionByEmployeeId(@WebParam(name = "name") String txt) {
        //ArrayList<String> transaction  = new ArrayList<String>();
    	String [][] transaction = new String[6][4];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from transactions where employeeid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("TRANSACTIONID");
                	transaction[i][j] = a1;
                	j++;
                	String a2 = rs.getString("TRANSACTIONDATE");
                	transaction[i][j] = a2;
                	j++;
                	String a3 = rs.getString("TRANSACTIONDESCRIPTION");
                	transaction[i][j] = a3;
                	j++;
                	String a4 = rs.getString("TRANSACTIONAMOUNT");
                	transaction[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return transaction;
    }
    
    @WebMethod(operationName = "findTransactionByTransactionId")
    public String[][] findTransactionByTransactionId(@WebParam(name = "name") String txt) {
        //ArrayList<String> transaction  = new ArrayList<String>();
    	String [][] transaction = new String[1][4];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from transactions where transactionid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("TRANSACTIONID");
                	transaction[i][j] = a1;
                	j++;
                	String a2 = rs.getString("TRANSACTIONDATE");
                	transaction[i][j] = a2;
                	j++;
                	String a3 = rs.getString("TRANSACTIONDESCRIPTION");
                	transaction[i][j] = a3;
                	j++;
                	String a4 = rs.getString("TRANSACTIONAMOUNT");
                	transaction[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return transaction;
    }
    
    @WebMethod(operationName = "findPaymentByOrderId")
    public String[][] findPaymentByOrderId(@WebParam(name = "name") String txt) {
        //ArrayList<String> payment  = new ArrayList<String>();
    	String[][] payment = new String[4][4];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from payments where orderid='"+txt+"'";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1 = rs.getString("PAYMENTID");
                	payment[i][j] = a1;
                	j++;
                	String a2 = rs.getString("PAYMENTMETHOD");
                	payment[i][j] = a2;
                	j++;
                	String a3 = rs.getString("PAYMENTAMOUNT");
                	payment[i][j] = a3;
                	j++;
                	String a4 = rs.getString("PAYMENTDATE");
                	payment[i][j] = a4;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return payment;
    }
    
    @WebMethod(operationName = "truckList")
    public String[][] truckList() {
        //ArrayList<String> truck  = new ArrayList<String>();
        String [][] truck = new String[11][7];
        int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="SELECT * FROM trucks";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
	                String a1= rs.getString("TRUCKID");
	                truck[i][j] = a1;
	                j++;
	                String a2= rs.getString("MAKE");
	                truck[i][j] = a2;
	                j++;
	                String a3= rs.getString("YEAR");
	                truck[i][j] = a3;
	                j++;
	                String a4= rs.getString("MODEL");
	                truck[i][j] = a4;
	                j++;
	                String a5= rs.getString("LICENCEPLATENO");
	                truck[i][j] = a5;
	                j++;
	                String a6= rs.getString("COLOR");
	                truck[i][j] = a6;
	                j++;
	                String a7= rs.getString("VIN");
	                truck[i][j] = a7;
	                j=0;
	                i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return truck;
    }
	
	@WebMethod(operationName = "driverList")
    public String[][] driverList() {
        //ArrayList<String> driver  = new ArrayList<String>();
		String[][] driver = new String[12][11];
		int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql = "select * from employees";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("EMPLOYEEID");
                	driver[i][j] = a1;
                	j++;
                	String a2= rs.getString("FIRSTNAME");
                	driver[i][j] = a2;
                	j++;
                	String a3= rs.getString("LASTNAME");
                	driver[i][j] = a3;
                	j++;
                	String a4= rs.getString("EMAIL");
                	driver[i][j] = a4;
                	j++;
                	String a5= rs.getString("CELLPHONE");
                	driver[i][j] = a5;
                	j++;
                	String a6= rs.getString("DRIVERLICENCENUMBER");
                	driver[i][j] = a6;
                	j++;
                	String a7= rs.getString("ADDRESS");
                	driver[i][j] = a7;
                	j++;
                	String a8= rs.getString("CITY");
                	driver[i][j] = a8;
                	j++;
                	String a9= rs.getString("STATE");
                	driver[i][j] = a9;
                	j++;
                	String a10= rs.getString("POSTALCODE");
                	driver[i][j] = a10;
                	j++;
                	String a11= rs.getString("BIRTHDATE");
                	driver[i][j] = a11;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return driver;
    }
    
	@WebMethod(operationName = "employeeList")
    public String[][] employeeList() {
        //ArrayList<String> employee  = new ArrayList<String>();
		String [][] employee = new String[12][3];
		int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="SELECT * FROM employees";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("EMPLOYEEID");
                	employee[i][j] = a1;
                	j++;
                	String a2= rs.getString("FIRSTNAME");
                	employee[i][j] = a2;
                	j++;
                	String a3= rs.getString("LASTNAME");
                	employee[i][j] = a3;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return employee;
    }

    @WebMethod(operationName = "customerList")
    public String[][] customerlist() {
     //ArrayList<String> Customer = new ArrayList<String>();
    	String[][] customer = new String[7][10];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from customers";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("CUSTOMERID");
                	customer[i][j] = a1;
                	j++;
                	String a2= rs.getString("CUSTOMERTITLE");
                	customer[i][j] = a2;
                	j++;
                	String a3= rs.getString("PHONENUMBER");
                	customer[i][j] = a3;
                	j++;
                	String a4= rs.getString("FAXNUMBER");
                	customer[i][j] = a4;
                	j++;
                	String a5= rs.getString("EMAILADDRESS");
                	customer[i][j] = a5;
                	j++;
                	String a6= rs.getString("BILLINGADDRESS");
                	customer[i][j] = a6;
                	j++;
                	String a7= rs.getString("CITY");
                	customer[i][j] = a7;
                	j++;
                	String a8= rs.getString("STATEORPROVINCE");
                	customer[i][j] = a8;
                	j++;
                	String a9= rs.getString("POSTALCODE");
                	customer[i][j] = a9;
                	j++;
                	String a10= rs.getString("COUNTRY");
                	customer[i][j] = a10;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return customer;
    
    }
    
    @WebMethod(operationName = "orderList")
    public String[][] orderList() {
     //ArrayList<String> order  = new ArrayList<String>();
    	String[][] order = new String[5][5];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="select * from orders";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
                	String a1= rs.getString("ORDERID");
                	order[i][j] = a1;
                	j++;
                	String a2= rs.getString("ORDERDATE");
                	order[i][j] = a2;
                	j++;
                	String a3= rs.getString("CUSTOMERID");
                	order[i][j] = a3;
                	j++;
                	String a4 = rs.getString("TRUCKID");
                	order[i][j] = a4;
                	j++;
                	String a5 = rs.getString("ORDERTOTALAMOUNT");
                	order[i][j] = a5;
                	j=0;
                	i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return order;
    }
    
    @WebMethod(operationName = "invoiceList")
    public String[][] invoiceList() {
        //ArrayList<String> invoice  = new ArrayList<String>();
    	String [][] invoice = new String[5][8];
    	int i=0;

        try {
                Class.forName("oracle.jdbc.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "aniruddha123");
                Statement st=con.createStatement();
                String sql ="SELECT * FROM invoices";
                ResultSet rs = st.executeQuery(sql);
                int j=0;
                while(rs.next()){
	                String a1= rs.getString("INVOICEID");
	                invoice[i][j] = a1;
	                j++;
	                String a2= rs.getString("ORDERID");
	                invoice[i][j] = a2;
	                j++;
	                String a3= rs.getString("CUSTOMERID");
	                invoice[i][j] = a3;
	                j++;
	                String a4= rs.getString("PAYMENTID");
	                invoice[i][j] = a4;
	                j++;
	                String a5= rs.getString("PRICEID");
	                invoice[i][j] = a5;
	                j++;
	                String a6= rs.getString("TRANSACTIONID");
	                invoice[i][j] = a6;
	                j++;
	                String a7= rs.getString("TRUCKID");
	                invoice[i][j] = a7;
	                j++;
	                String a8= rs.getString("EXPENSEID");
	                invoice[i][j] = a8;
	                j=0;
	                i++;
                }
                st.close();
                con.close();
        } 
        catch (Exception e) {
			e.printStackTrace();
        }
                
        return invoice;
    }
}