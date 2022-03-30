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
 * Servlet implementation class AddControl
 */
@WebServlet("/addProduct")
public class AddControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddControl() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String ProName = request.getParameter("ProName");
		String proDecription = request.getParameter("proDecription");
		String proDetail = request.getParameter("proDetail");
		String proPrice = request.getParameter("proPrice");
		String proImage = request.getParameter("proImage");
		String cateID = request.getParameter("cateID");
		HttpSession session = request.getSession();
		
		
		DAO dao = new DAO();
		dao.insertProiduct(ProName, proDecription, proDetail, proPrice, proImage, cateID);
		response.sendRedirect("manager");

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
