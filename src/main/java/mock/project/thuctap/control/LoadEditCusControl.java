package mock.project.thuctap.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mock.project.thuctap.dao.DAO;
import mock.project.thuctap.emtyti.Category;
import mock.project.thuctap.emtyti.Customer;
import mock.project.thuctap.emtyti.Product;

/**
 * Servlet implementation class LoadEditCusControl
 */
@WebServlet("/loadcustomer")
public class LoadEditCusControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadEditCusControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void procesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html;charset=UTF-8");
	        String cusID = request.getParameter("cusID");

	        //b1: get data from dao
	        DAO dao = new DAO();
	        Customer getByCusId = dao.getCusByID(cusID);
	        List<Customer> listCus = dao.getAllCustumer();


	        //b2: set data to jsp
	        request.setAttribute("detail", getByCusId);
	        request.getRequestDispatcher("EditCus.jsp").forward(request, response);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		procesRequest(request, response);
		doGet(request, response);
	}

}
