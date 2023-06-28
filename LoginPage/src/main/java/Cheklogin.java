

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Cheklogin")
public class Cheklogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cheklogin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("userName");
		String pass = request.getParameter("password");
		
		
		if(uname.equals("admin") && pass.equals("1234")) 
		{
			response.sendRedirect("user.jsp");
			request.getRequestDispatcher("user.jsp");

		}
		else{
			response.sendRedirect("error.jsp");
			request.getRequestDispatcher("error.jsp");
			
		}
	}

}
