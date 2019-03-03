package cn.ljs.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.javabean.Ec_article;
import cn.ljs.services.Ec_articleServices;
import cn.ljs.services.impl.Ec_articleServicesImpl;

/**
 * Servlet implementation class GoodInfoServlet
 */
@WebServlet("/GoodInfoServlet")
public class GoodInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String articleId = request.getParameter("articleId");
		System.out.println("…Ã∆∑±‡∫≈£∫"+articleId);
		
		Ec_articleServices articleServices = new Ec_articleServicesImpl();
		
		Ec_article article = articleServices.findById(articleId);
		
		HttpSession session = request.getSession();
		session.setAttribute("articleId", articleId);
		
		request.setAttribute("art", article);
		System.out.println(article);
		request.getRequestDispatcher("/JSP/good_info.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
