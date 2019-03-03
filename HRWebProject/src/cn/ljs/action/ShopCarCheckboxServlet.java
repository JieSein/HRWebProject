package cn.ljs.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.javabean.Ec_shopcar;
import cn.ljs.javabean.ShopCarOfUser;
import cn.ljs.services.Ec_shopcarServices;
import cn.ljs.services.ShopCarOfUserServices;
import cn.ljs.services.impl.Ec_shopcarServicesImpl;
import cn.ljs.services.impl.ShopCarOfUserServicesImpl;

/**
 * Servlet implementation class ShopCarCheckboxServlet
 */
@WebServlet("/ShopCarCheckboxServlet")
public class ShopCarCheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int totalNum = 0;
	private double money = 0;
	private String[] data = {};
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShopCarCheckboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		String flags = request.getParameter("flag");
		System.out.println("@@@@@"+flags);
		boolean flag = Boolean.parseBoolean(flags);
		System.out.println("####@@@@@"+flag);
		
		String arId = request.getParameter("arId");
		System.out.println("@@@@@"+arId);
		
		String buyNumb = request.getParameter("buyNumb");
		System.out.println("@@@@@"+buyNumb);
		
		String login_name = (String) session.getAttribute("login_name");
		System.out.println("@@@@@"+login_name);
		
		ShopCarOfUserServices shopCarOfUserServices = new ShopCarOfUserServicesImpl();
		ShopCarOfUser shopCarOfUser = shopCarOfUserServices.findByIdAndLoginName(arId, login_name);

		if (shopCarOfUser != null) {
			if (flag) {
				totalNum = totalNum + shopCarOfUser.getBuyNum();
				money = money + shopCarOfUser.getPrice()*shopCarOfUser.getDiscount()*shopCarOfUser.getBuyNum();
			} else {
				totalNum = totalNum - shopCarOfUser.getBuyNum();
				money = money - shopCarOfUser.getPrice()*shopCarOfUser.getDiscount()*shopCarOfUser.getBuyNum();
			}

		}
		
		String strTotalNum = Integer.toString(totalNum);
		String strMoney = Double.toString(money);

		response.getWriter().append(strTotalNum+",");
		response.getWriter().append(strMoney);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
