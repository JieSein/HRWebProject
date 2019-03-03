package com.ljs.utils;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.ljs.action.LoginServlet;

public class CheckLoginCodingFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		
		String path = servletRequest.getRequestURI();
		
		String[] noCheckPages = {"index.jsp", "login.jsp", "register.jsp"};
		String login_name = (String) session.getAttribute("login_name");

		for(int i=0; i<noCheckPages.length;i++) {
			if (path.indexOf(noCheckPages[i]) > -1) {
				chain.doFilter(servletRequest, servletResponse);
				return;
			}
		}
		
		if(login_name != null) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			servletResponse.sendRedirect("/HRWebProject/JSP/login.jsp");
			return;
		}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
