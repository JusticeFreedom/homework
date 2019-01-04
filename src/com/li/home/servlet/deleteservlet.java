package com.li.home.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.li.home.dao.BookDao;
import com.li.home.dao.Dao;


/**
 * Servlet implementation class deleteservlet
 */
@WebServlet("/deleteservlet")
public class deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String idStr = request.getParameter("bookid");  
	     if(idStr != null && !idStr.equals("")){
	    	 int bookid = Integer.valueOf(idStr);
	         Dao dao = new BookDao();
	         dao.dalete(bookid);
	         }
        request.getRequestDispatcher("Selectservlet").forward(request, response);
	}

}
