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
import mock.project.thuctap.emtyti.Product;

/**
 * Servlet implementation class CartControl
 */
@WebServlet("/cartlist")
public class CartControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void procesRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		   response.setContentType("text/html;charset=UTF-8");
	        String productId = request.getParameter("productId");

	        //b1: get data from dao
	        DAO dao = new DAO();
	        Product getById = dao.getProductByID(productId);
	        List<Product> listProduct = dao.getAllProduct();
	        List<Category> listCate = dao.getAllCate();

	        //b2: set data to jsp
	        request.setAttribute("detail", getById);
	        request.setAttribute("listCate", listCate);

	        request.getRequestDispatcher("Detail.jsp").forward(request, response);
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
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//    //requestmapping("/{id}")
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		Order.findOne(id);
//		Product.findById()
//		request.setAttribute("order", order);
//		request.getRequestDispatcher("/resouces/views/cart.jsp");
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}
    

}
