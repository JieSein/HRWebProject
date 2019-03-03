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
 * Servlet implementation class ShopCarAjaxServlet
 */
@WebServlet("/ShopCarUpdateAjaxServlet")
public class ShopCarUpdateAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCarUpdateAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String artId = request.getParameter("artId");
		System.out.println("******"+ artId );

		String buyNum = request.getParameter("buyNum");
		System.out.println("******"+buyNum);
		
		HttpSession session = request.getSession();		
		String login_name = (String) session.getAttribute("login_name");
		System.out.println("******"+login_name);
		
		session.setAttribute("artId", artId);
		session.setAttribute("buyNum", buyNum);
		
		Ec_shopcarServices shopcarServices = new Ec_shopcarServicesImpl();
		boolean is = true;
		
		Ec_shopcar shopcar = null;
		shopcar = shopcarServices.findByIdAndLoginName(artId, login_name);
		
		if (shopcar == null){
			shopcar = new Ec_shopcar();
			shopcar.setArticleId(Integer.parseInt(artId));
			shopcar.setBuyNum(Integer.parseInt(buyNum));
			shopcar.setLogin_name(login_name);
			
			is = shopcarServices.insertShopCarRecord(shopcar);

		}else {
			is = shopcarServices.updateShopCarRecord2(buyNum, artId, login_name);
			
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
