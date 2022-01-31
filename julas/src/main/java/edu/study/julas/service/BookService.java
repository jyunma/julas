package edu.study.julas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.study.julas.dao.BookDAO;

@Service
public class BookService {
	@Autowired
	BookDAO bookDAO;
}
