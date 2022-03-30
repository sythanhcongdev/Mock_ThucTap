package mock.project.thuctap.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mock.project.thuctap.dao.DAO;

/**
 * Servlet implementation class AddCusControl
 */
@WebServlet("/addCus")
public class AddCusControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCusControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String cusCode = request.getParameter("cusCode");
		String cusName = request.getParameter("cusName");
		String cusAddress = request.getParameter("cusAddress");
		String cusPhone = request.getParameter("cusPhone");
		
		HttpSession session = request.getSession();
		
		
		DAO dao = new DAO();
		dao.insertCustomer(cusCode, cusName, cusAddress, cusPhone);
		response.sendRedirect("managercus");

		// request.getRequestDispatcher("Home.jsp").forward(request, response);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}


}
