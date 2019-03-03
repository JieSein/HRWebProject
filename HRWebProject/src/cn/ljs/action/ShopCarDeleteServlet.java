package cn.ljs.action;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.javabean.Ec_shopcar;
import cn.ljs.services.Ec_shopcarServices;
import cn.ljs.services.impl.Ec_shopcarServicesImpl;

/**
 * Servlet implementation class ShopCarDeleteAjaxServlet
 */
@WebServlet("/ShopCarDeleteServlet")
public class ShopCarDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCarDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();	
		
		String artId = (String) session.getAttribute("artId");
		System.out.println("######"+ artId );

		String buyNum = (String) session.getAttribute("buyNum");
		System.out.println("######"+buyNum);
		
	
		String login_name = (String) session.getAttribute("login_name");
		System.out.println("######"+login_name);
		
		Ec_shopcarServices shopcarServices = new Ec_shopcarServicesImpl();
		boolean is = true;
		
		Ec_shopcar shopcar = null;
		shopcar = shopcarServices.findByIdAndLoginName(artId, login_name);
		
		if(shopcar != null) {
			is = shopcarServices.deleteShopCarRecord(artId, login_name);
		}
		
		request.getRequestDispatcher("/ShopCarOfUserServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
