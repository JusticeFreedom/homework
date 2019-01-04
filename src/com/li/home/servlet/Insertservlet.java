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
 * Servlet implementation class Insertservlet
 */
@WebServlet("/Insertservlet")
public class Insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insertservlet() {
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
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");		
//		String idstr = request.getParameter("bookid");
//		int bookid = Integer.valueOf(idstr);
		String bookname = request.getParameter("bookname");
	    String bookauthor = request.getParameter("bookauthor");
	    String bookdate = request.getParameter("bookdate");
	    Book book = new Book();
//	    book.setBookid(bookid);
	    book.setBookname(bookname);
	    book.setBookauthor(bookauthor);
	    book.setBookdate(bookdate);
	    Dao dao = new BookDao();
	    dao.insert(book);
	    request.getRequestDispatcher("Selectservlet").forward(request, response);
	}

}
