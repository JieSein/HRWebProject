package cn.ljs.action;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//得到验证码，验证信息
		String velidate = request.getParameter("velidate");
		HttpSession session = request.getSession();
		String sessCode = (String) session.getAttribute("sesscode");
		
		//判断两个验证码是否相等（不区分大小写）
		if(velidate != null ) {
			if (!velidate.equalsIgnoreCase(sessCode)) {
				response.sendRedirect("/HRWebProject/JSP/register.jsp");
			}else {
				Ec_user user = new Ec_user();
				
				String uname = request.getParameter("uname");
				user.setLogin_name(uname);
				System.out.println("用户名："+uname);
				
				String pwd = request.getParameter("pwd");
				user.setPassword(pwd);
				System.out.println("密码："+pwd);
	
				String realname = request.getParameter("realname");
				user.setName(realname);
				System.out.println("真实姓名："+realname);
	
				String[] sex = request.getParameterValues("sex");
				user.setSex(Integer.parseInt(sex[0]));
				System.out.println("性别："+sex[0]);
	
				String address = request.getParameter("address");
				user.setAddress(address);
				System.out.println("地址："+address);
	
				String telephone = request.getParameter("telephone");
				user.setPhone(telephone);
				System.out.println("电话："+telephone);
				
				//创建时间
				SimpleDateFormat aDateFormat = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
				String create_time = aDateFormat.format(new Date());
				user.setCreate_date(create_time);
				
				user.setEmail(uname);
				user.setRole(0);
				user.setDisabled("0");
				
				//完成用户注册功能
				Ec_UserServices rUser = new Ec_UserServicesImpl();
				boolean is = rUser.registerUser(user);
				if (is) {
					//重定向到登录界面
					response.sendRedirect("/HRWebProject/JSP/login.jsp");
				}else {
					response.getWriter().append("<script type='text/javascript'>alert('注册失败！');window.location.href='/HRWebProject/JSP/register.jsp'</script>");
				}
				
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
