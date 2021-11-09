package com.mighty.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mighty.model.Book;
import com.mighty.service.BookService;

@Controller
public class BookController {
	@Autowired
	public BookService bookService;

	@RequestMapping(value = "/book", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("book");
		mav.addObject("book", new Book());

		return mav;
	}

	@RequestMapping(value = "/bookProcess", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("book") Book book) {

		bookService.register(book);
		bookService.update(book);

		return new ModelAndView("welcome");

	}
}
