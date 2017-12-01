package Action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Services.*;

@WebServlet("/ListServices")
public class ListServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public ListServices() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comments_cust_id = request.getParameter("comments_cust_id");
		String employee_emp_id = request.getParameter("employee_emp_id");
		String expense_emp_id = request.getParameter("expense_emp_id");
		String expense_truck_id = request.getParameter("expense_truck_id");
		String invoice_tran_id = request.getParameter("invoice_tran_id");
		String location_cust_id = request.getParameter("location_cust_id");
		String order_cust_id = request.getParameter("order_cust_id");
		String payment_order_id = request.getParameter("payment_order_id");
		String purpose_exp_id = request.getParameter("purpose_exp_id");
		String transaction_emp_id = request.getParameter("transaction_emp_id");
		String transaction_tran_id = request.getParameter("transaction_tran_id");
		String truck_driver_id = request.getParameter("truck_driver_id");
		String truck_make = request.getParameter("truck_make");
		String truck_vin = request.getParameter("truck_vin");
		
		HttpSession session = request.getSession(true);

		try {
			WebService_ServiceCallsLocator s1 = new WebService_ServiceCallsLocator();
			ServiceCalls p1 = s1.getServiceCallsPort();
			
			if(request.getParameter("btn1")!=null) {
				String[][] out = p1.customerList();
				session.setAttribute("customer_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn2")!=null) {
				String[][] out = p1.driverList();
				session.setAttribute("driver_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn3")!=null) {
				String[][] out = p1.employeeList();
				session.setAttribute("employee_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn4")!=null) {
				String[][] out = p1.invoiceList();
				session.setAttribute("invoice_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn5")!=null) {
				String[][] out = p1.orderList();
				session.setAttribute("order_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn6")!=null) {
				String[][] out = p1.truckList();
				session.setAttribute("truck_list", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn7")!=null) {
				String[][] e7 = p1.findCommentByCustomerId(comments_cust_id);
				session.setAttribute("comments_cust_id", e7);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn8")!=null) {
				String[][] out = p1.findEmployeeByEmployeeId(employee_emp_id);
				session.setAttribute("employee_emp_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn9")!=null) {
				String[][] out = p1.findExpenseByEmployeeId(expense_emp_id);
				session.setAttribute("expense_emp_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn10")!=null) {
				String[][] out = p1.findExpenseByTruckId(expense_truck_id);
				session.setAttribute("expense_truck_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn11")!=null) {
				String[][] out = p1.findInvoiceByTransactionId(invoice_tran_id);
				session.setAttribute("invoice_tran_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn12")!=null) {
				String[][] out = p1.findLocationFromToByCustomerId(location_cust_id);
				session.setAttribute("location_cust_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn13")!=null) {
				String[][] out = p1.findOrderByCustomerId(order_cust_id);
				session.setAttribute("order_cust_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn14")!=null) {
				String[][] out = p1.findPaymentByOrderId(payment_order_id);
				session.setAttribute("payment_order_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn15")!=null) {
				String[][] out = p1.findPurposeOfExpenseByExpenseId(purpose_exp_id);
				session.setAttribute("purpose_exp_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn16")!=null) {
				String[][] out = p1.findTransactionByEmployeeId(transaction_emp_id);
				session.setAttribute("transaction_emp_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn17")!=null) {
				String[][] out = p1.findTransactionByTransactionId(transaction_tran_id);
				session.setAttribute("transaction_tran_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn18")!=null) {
				String[][] out = p1.findTruckByDriverId(truck_driver_id);
				session.setAttribute("truck_driver_id", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn19")!=null) {
				String[][] out = p1.findTruckByMake(truck_make);
				session.setAttribute("truck_make", out);
				response.sendRedirect("ListServices.jsp");
			}
			else if(request.getParameter("btn20")!=null) {
				String[][] out = p1.findTruckByVin(truck_vin);
				session.setAttribute("truck_vin", out);
				response.sendRedirect("ListServices.jsp");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}