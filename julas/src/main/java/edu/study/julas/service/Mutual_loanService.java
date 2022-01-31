package edu.study.julas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.study.julas.dao.Mutual_loanDAO;

@Service
public class Mutual_loanService {
	@Autowired
	Mutual_loanDAO mutual_loanDAO;
}
