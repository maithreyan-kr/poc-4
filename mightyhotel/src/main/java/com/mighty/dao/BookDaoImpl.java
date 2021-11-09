package com.mighty.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mighty.model.Book;

public class BookDaoImpl implements BookDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int register(Book book) {
		String sql2 = "insert into book values(?,?,?,?,?)";

		return jdbcTemplate.update(sql2, new Object[] { book.getroomnumber(), book.getroomtype(), book.getpersons(),
				book.getcheckin(), book.getcheckout() });
	}

	public void update(Book book){
		String a="Booked";
	      String SQL = "update room set availability = ? where room_number = ?";
	      jdbcTemplate.update(SQL, a, book.getroomnumber());
	      System.out.println("Updated Record for roomnumber = " + book.getroomnumber() );
	     
	   }
	
class BookMapper implements RowMapper<Book> {

	public Book mapRow(ResultSet rs, int arg1) throws SQLException {
		Book book = new Book();

		book.setroomnumber(rs.getString("roomnumber"));
		book.setroomtype(rs.getString("roomtype"));
		book.setpersons(rs.getString("persons"));
		book.setcheckin(rs.getString("checkin"));
		book.setcheckout(rs.getString("checkout"));
		return book;
	}
}
}