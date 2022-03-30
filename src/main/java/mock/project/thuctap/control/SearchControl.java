package mock.project.thuctap.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mock.project.thuctap.dao.DAO;
import mock.project.thuctap.emtyti.*;


 
/**
 * Servlet implementation class SearchControl
 */
@WebServlet("/search")
public class SearchControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void procesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html;charset=UTF-8");
		   request.setCharacterEncoding("UTF-8");
	        String txtSearch = request.getParameter("txtSearch");//nhập dữ liệu
	  
	        DAO dao = new DAO();
	        List<Product> listProduct = dao.getProductSearchByName(txtSearch);
	        
	        List<Category> listCate = dao.getAllCate();

	        //b2: set data to jsp
	        request.setAttribute("listProduct", listProduct);
	        request.setAttribute("listCate", listCate);
	        request.setAttribute("txtSearch", txtSearch);

	        request.getRequestDispatcher("Home.jsp").forward(request, response);
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
