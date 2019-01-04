package com.li.home.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.li.home.dao.BookDao;
import com.li.home.dao.Dao;
import com.li.home.entity.Book;

/**
 * Servlet implementation class updateservlet
 */
@WebServlet("/updateservlet")
public class updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 	String idStr = request.getParameter("bookid");
	        if(idStr != null && !idStr.equals("")){
	            int bookid = Integer.valueOf(idStr);
	            Dao dao = new BookDao();
	            Book book = dao.findid(bookid);
	            request.setAttribute("book", book);
	        }
        request.getRequestDispatcher("index3.jsp").forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		String idstr = request.getParameter("bookid");
		int bookid = Integer.valueOf(idstr);
		String bookname = request.getParameter("bookname");
	    String bookauthor = request.getParameter("bookauthor");
	    String bookdate = request.getParameter("bookdate");
	    Book book = new Book();
	    book.setBookid(bookid);
        book.setBookname(bookname);
	    book.setBookauthor(bookauthor);
	    book.setBookdate(bookdate);
        Dao dao = new BookDao();
        dao.update(book);
        request.getRequestDispatcher("Selectservlet").forward(request, response);
	}

}
