package com.li.home.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.li.home.dao.BookDao;
import com.li.home.dao.Dao;
import com.li.home.entity.Book;

/**
 * Servlet implementation class Selectservlet
 */
@WebServlet("/Selectservlet")
public class Selectservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Selectservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		Dao Dao = new BookDao();
//		String json = null;
		List<Book> bookList = null;
		try {
//			josn = Dao.findAllBooks();
			bookList = Dao.findAllBook();
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 request.setAttribute("bookList", bookList);
	     request.getRequestDispatcher("index1.jsp").forward(request, response);
//	    PrintWriter	out = response.getWriter();
//		out.write(json);
//		out.close();
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
