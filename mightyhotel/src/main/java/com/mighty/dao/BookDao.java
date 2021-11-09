package com.mighty.dao;

import com.mighty.model.Book;

public interface BookDao {

  public int register(Book book);
  public void update(Book book);
}
