package pack;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
  
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		try {
		String name=" ";
		String password=" ";
		 name = request.getParameter("regname");
		password= request.getParameter("regpassword");
		HttpSession session=request.getSession();
		
	@SuppressWarnings("unchecked")
   List<UserDatabase> RegisteredList=(List<UserDatabase> )session.getAttribute("RegisteredList");
	System.out.println("log"+RegisteredList.isEmpty());
    System.out.println("**********Login Data*********");
	for(UserDatabase u: RegisteredList)
	{
		System.out.println(u.getName()+u.getPassword());
	}
	
	 System.out.println("**********Login Data*********");
	boolean user= false;
 for(UserDatabase u: RegisteredList)
 {
	 if(((u.getName()).equals(name) )&&( (u.getPassword()).equals(password)))
	 {
		user=true;
	 }
 }
 if(user)
 {    session.setAttribute("name",name);
	 response.sendRedirect("BusBooking.jsp");
 }
	 else
	 { 
		 response.getWriter().println("Please Check Username and Password"); 
	 }
 
	
	}
		catch(NullPointerException e)
		{
			 response.getWriter().println("Please Enter Correct Credentials!!!!");
		}
	}
	

}
