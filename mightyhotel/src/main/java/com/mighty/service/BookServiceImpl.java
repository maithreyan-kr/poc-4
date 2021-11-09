package com.mighty.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mighty.dao.BookDao;
import com.mighty.model.Book;

public class BookServiceImpl implements BookService {

  @Autowired
  public BookDao bookDao;

  public int register(Book book) {
    return bookDao.register(book);
  }
  public void update(Book book) {
	  bookDao.update(book);
  }
  


}
