package cn.ljs.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.javabean.ShopCarOfUser;
import cn.ljs.services.ShopCarOfUserServices;
import cn.ljs.services.impl.ShopCarOfUserServicesImpl;

/**
 * Servlet implementation class ShopCarOfUserServlet
 */
@WebServlet("/ShopCarOfUserServlet")
public class ShopCarOfUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCarOfUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String login_name = session.getAttribute("login_name")+"";
		System.out.println("ÓÃ»§Ãû£º"+login_name);
		
		ShopCarOfUserServices services = new ShopCarOfUserServicesImpl();
		List<ShopCarOfUser> list = services.findByLoginName(login_name);
		
		for(ShopCarOfUser temp:list) {
			System.out.println(temp);
		}
		
		request.setAttribute("shopcarList", list);
		
		request.getRequestDispatcher("/JSP/shop_car.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
