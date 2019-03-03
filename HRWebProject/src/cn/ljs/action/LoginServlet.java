package cn.ljs.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.javabean.Ec_user;
import cn.ljs.services.Ec_UserServices;
import cn.ljs.services.impl.Ec_UserServicesImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Ec_user user = new Ec_user();
		
		String logName = request.getParameter("logname");
		user.setLogin_name(logName);
		System.out.println(logName);
		
		String logPwd = request.getParameter("logpwd");
		user.setPassword(logPwd);
		System.out.println(logPwd);
		
		Ec_UserServices userServices = new Ec_UserServicesImpl();
		Ec_user ec_user = userServices.findByUserName(user);
		if (ec_user == null) {
			response.getWriter().append("<script type='text/javascript'>alert('用户不存在！');window.location.href='/HRWebProject/JSP/login.jsp'</script>");
		}else {
			if (!ec_user.getPassword().equals(logPwd)) {
				response.getWriter().append("<script type='text/javascript'>alert('密码错误！');window.location.href='/HRWebProject/JSP/login.jsp'</script>");
			}else {
				HttpSession session = request.getSession();
				session.setAttribute("login_name", ec_user.getLogin_name());
				response.sendRedirect("/HRWebProject/index.do");
			}
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
