package cn.ljs.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ljs.javabean.Ec_user;
import cn.ljs.services.Ec_UserServices;
import cn.ljs.services.impl.Ec_UserServicesImpl;

/**
 * Servlet implementation class RegAjaxServlet
 */
@WebServlet("/RegAjaxServlet")
public class RegAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		System.out.println("ajaxµÄÃû×Ö£º"+uname);
		
		Ec_user user = new Ec_user();
		user.setLogin_name(uname);
		
		Ec_UserServices userServices = new Ec_UserServicesImpl();
		Ec_user u = userServices.findByUserName(user);
		
		if (u != null) {
			response.getWriter().append("true");
		} else {
			response.getWriter().append("false");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
