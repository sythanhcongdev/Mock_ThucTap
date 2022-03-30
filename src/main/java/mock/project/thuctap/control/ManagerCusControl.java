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
import mock.project.thuctap.emtyti.Orders;
import mock.project.thuctap.emtyti.Product;

/**
 * Servlet implementation class ManagerCusControl
 */
@WebServlet("/managercus")
public class ManagerCusControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerCusControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		DAO dao = new DAO();
        List<Product> listProduct = dao.getAllProduct();
        List<Category> listCate = dao.getAllCate();
        List<Customer> listCus = dao.getAllCustumer();
        
        request.setAttribute("listCate", listCate);
        request.setAttribute("listCus", listCus);
        request.setAttribute("listProduct", listProduct);
		request.getRequestDispatcher("ManagerCustumer.jsp").forward(request, response);

	}
 // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
