package com.tzit.servet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WsShUrl
 * 防伪使用p
 * 稽查使用q
 */
public class WsShUrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WsShUrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p=request.getParameter("p");
		String q=request.getParameter("q");
		if(p!=null){
			response.sendRedirect("http://www.tzscm.com/weishi/antifake/scan?qrcode="+p);
		}
		if(q!=null){
			response.sendRedirect("http://www.tzscm.com/weishi/logicstics/scan?qrcode="+q);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p=request.getParameter("p");
		String q=request.getParameter("q");
		if(p!=null){
			response.sendRedirect("http://www.tzscm.com/weishi/antifake/scan?qrcode="+p);
		}
		if(q!=null){
			response.sendRedirect("http://www.tzscm.com/weishi/logicstics/scan?qrcode="+q);
		}

	}

}
