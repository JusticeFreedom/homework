package com.li.home.dao;

import java.util.List;

import com.li.home.entity.Book;

public interface Dao {
	public void insert(Book book);
	public void update(Book book);
	public void dalete(int bookid);
//	public String findAllBooks() throws Exception;	
	List<Book> findAllBook() throws Exception;
	public Book findid(int bookid);
}
