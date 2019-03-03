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

		
		//�õ���֤�룬��֤��Ϣ
		String velidate = request.getParameter("velidate");
		HttpSession session = request.getSession();
		String sessCode = (String) session.getAttribute("sesscode");
		
		//�ж�������֤���Ƿ���ȣ������ִ�Сд��
		if(velidate != null ) {
			if (!velidate.equalsIgnoreCase(sessCode)) {
				response.sendRedirect("/HRWebProject/JSP/register.jsp");
			}else {
				Ec_user user = new Ec_user();
				
				String uname = request.getParameter("uname");
				user.setLogin_name(uname);
				System.out.println("�û�����"+uname);
				
				String pwd = request.getParameter("pwd");
				user.setPassword(pwd);
				System.out.println("���룺"+pwd);
	
				String realname = request.getParameter("realname");
				user.setName(realname);
				System.out.println("��ʵ������"+realname);
	
				String[] sex = request.getParameterValues("sex");
				user.setSex(Integer.parseInt(sex[0]));
				System.out.println("�Ա�"+sex[0]);
	
				String address = request.getParameter("address");
				user.setAddress(address);
				System.out.println("��ַ��"+address);
	
				String telephone = request.getParameter("telephone");
				user.setPhone(telephone);
				System.out.println("�绰��"+telephone);
				
				//����ʱ��
				SimpleDateFormat aDateFormat = new SimpleDateFormat("YYYY-MM-dd HH-mm-ss");
				String create_time = aDateFormat.format(new Date());
				user.setCreate_date(create_time);
				
				user.setEmail(uname);
				user.setRole(0);
				user.setDisabled("0");
				
				//����û�ע�Ṧ��
				Ec_UserServices rUser = new Ec_UserServicesImpl();
				boolean is = rUser.registerUser(user);
				if (is) {
					//�ض��򵽵�¼����
					response.sendRedirect("/HRWebProject/JSP/login.jsp");
				}else {
					response.getWriter().append("<script type='text/javascript'>alert('ע��ʧ�ܣ�');window.location.href='/HRWebProject/JSP/register.jsp'</script>");
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
