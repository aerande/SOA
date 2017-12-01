package Action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Services.*;

@WebServlet("/LoginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginAction() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String password = request.getParameter("password");
		boolean ans = false;
		HttpSession session = request.getSession(true);
		
		try {
			WebService_ServiceCallsLocator s1 = new WebService_ServiceCallsLocator();
			ServiceCalls p1 = s1.getServiceCallsPort();
			
			ans = p1.login(uname, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(ans) {
			session.invalidate();
			response.sendRedirect("Index.jsp");
		}
		else if(!ans) {
			String state = "Username/Password does not match!";
			session.setAttribute("error_login", state);
			response.sendRedirect("Login.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
