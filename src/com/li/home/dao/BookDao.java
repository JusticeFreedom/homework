package com.li.home.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.google.gson.Gson;
import com.li.home.entity.*;

public class BookDao extends BaseDao implements Dao {
//	public Gson gson = new Gson();

	@Override
	public void insert(Book book) {
		try {
			Connection conn = BaseDao.getConnection();
			String sql = "INSERT INTO book (bookname,bookauthor,bookdate) values(?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
//			stmt.setInt(1, book.getBookid());
			stmt.setString(1, book.getBookname());
			stmt.setString(2, book.getBookauthor());
			stmt.setString(3, book.getBookdate());
			stmt.executeUpdate();
			BaseDao.closeAll(conn, stmt, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		try {
			Connection conn = BaseDao.getConnection();
			String sql = "update book set bookname = ? ,bookauthor = ? ,bookdate = ? where bookid = ? ";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, book.getBookname());
			stmt.setString(2, book.getBookauthor());
			stmt.setString(3, book.getBookdate());
			stmt.setInt(4, book.getBookid());
			stmt.executeUpdate();
			BaseDao.closeAll(conn, stmt, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void dalete(int bookid) {
		// TODO Auto-generated method stub
		try {
			Connection conn = BaseDao.getConnection();
			String sql = "delete from book where bookid = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, bookid);
			stmt.executeUpdate();
			BaseDao.closeAll(conn, stmt, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	@Override
//	public String findAllBooks() throws Exception {
//		Connection conn = BaseDao.getConnection();
//		String sql = "select * from book";
//		PreparedStatement stmt = conn.prepareStatement(sql);
//		ResultSet rs = stmt.executeQuery();
//		List<Book> bookList = new ArrayList<Book>();
//		while (rs.next()) {
//			Book book = new Book();
//			book.setBookid(rs.getInt("bookid"));
//			book.setBookname(rs.getString("bookname"));
//			book.setBookauthor(rs.getString("bookauthor"));
//			book.setBookdate(rs.getString("bookdate"));
//			bookList.add(book);
//		}
//		BookBean booksBean = new BookBean();
//		booksBean.setRows(bookList);
//		BaseDao.closeAll(conn, stmt, rs);
//		return gson.toJson(booksBean);
//	}
	
	public List<Book> findAllBook() throws Exception {
		Connection conn = BaseDao.getConnection();
		String sql = "select * from book";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		List<Book> bookList = new ArrayList<Book>();
		while (rs.next()) {
			Book book = new Book();
			book.setBookid(rs.getInt("bookid"));
			book.setBookname(rs.getString("bookname"));
			book.setBookauthor(rs.getString("bookauthor"));
			book.setBookdate(rs.getString("bookdate"));
			bookList.add(book);
		}
//		BookBean booksBean = new BookBean();
//		booksBean.setRows(bookList);
		BaseDao.closeAll(conn, stmt, rs);
		return bookList;
	}
	
	public Book findid(int bookid){
		Book book = null;	
		try {
			Connection conn = BaseDao.getConnection();
			String sql = "select * from book where bookid= ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, bookid);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setBookid(rs.getInt("bookid"));
				book.setBookname(rs.getString("bookname"));
				book.setBookauthor(rs.getString("bookauthor"));
				book.setBookdate(rs.getString("bookdate"));
			}
			BaseDao.closeAll(conn, stmt, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
}
