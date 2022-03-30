package mock.project.thuctap.control;

import java.io.IOException;
import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mock.project.thuctap.dao.DAO;
import mock.project.thuctap.emtyti.*;

/**
 * Servlet implementation class EditControl
 */
@WebServlet("/edit")
public class EditControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditControl() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        String proID = request.getParameter("proID");
        String ProName = request.getParameter("ProName");
		String proDecription = request.getParameter("proDecription");
		String proDetail = request.getParameter("proDetail");
		String proPrice = request.getParameter("proPrice");
		String proImage = request.getParameter("proImage");
		String cateID = request.getParameter("cateID");
		HttpSession session = request.getSession();
		
		
		DAO dao = new DAO();
		dao.editProduct( ProName, proDecription, proDetail, proPrice, proImage, cateID, proID);
		response.sendRedirect("manager");
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

}
