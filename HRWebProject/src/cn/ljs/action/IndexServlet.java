package cn.ljs.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.ljs.javabean.Ec_article;
import cn.ljs.services.Ec_articleServices;
import cn.ljs.services.Ec_article_typeServices;
import cn.ljs.services.impl.Ec_articleServicesImpl;
import cn.ljs.services.impl.Ec_article_typeServicesImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/index.do")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String keyWord = request.getParameter("keyWord");
		System.out.println("关键字："+keyWord);
		
		String typeCode = request.getParameter("typeCode");
		System.out.println("商品类型："+typeCode);
		
		Ec_articleServices articleServices = new Ec_articleServicesImpl();
		List<Ec_article> list = articleServices.findByArticle(keyWord, typeCode);
		
		//将list存入request域中
		request.setAttribute("artList", list);

		Ec_article_typeServices typeSrevices = new Ec_article_typeServicesImpl();
		String typeName = typeSrevices.findByTypeCode(typeCode);
		
		request.setAttribute("typeName", typeName);
		
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
