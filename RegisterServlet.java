package pack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	 List<UserDatabase> RegisteredList= new ArrayList<>() ;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneno= request.getParameter("phoneno");
		String password = request.getParameter("password");
		UserDatabase db = new UserDatabase(name,email,phoneno,password);
		System.out.println("reg"+RegisteredList.isEmpty());
	    boolean userexists=false;
	   
     	for(UserDatabase u : RegisteredList)
		{
			if((u.getName()).equals(name))
			{
			  
			  userexists=true;
			}
			
		}
		if(userexists)
		{
			response.getWriter().println("User Already Exists!!!");
		}
		else
		{
			RegisteredList.add(db);
			 HttpSession session=request.getSession();
	         session.setAttribute("RegisteredList", RegisteredList);
			//response.getWriter().println("Succesfully Registered with UserName"+" " +name);
			//getServletConfig().getServletContext().getRequestDispatcher("/Welcome.jsp").forward(request,response);
	         System.out.println("**********Reg Data*********");
	         for(UserDatabase u: RegisteredList)
	 		{
	 			System.out.println(u.getName()+u.getPassword());
	 		}
	         System.out.println("**********Reg Data*********");
	         Redirect b = new Redirect();
	         b.doPost(request, response);
		}
		
		
	}

}
