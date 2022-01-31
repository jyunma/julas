package edu.study.julas.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookVO {
	private String book_id;
	private String book_name;
	private String book_author;
	private String book_publisher;
	private String book_year;
	private String book_callnum;
	private String book_isbn;
	private int book_state;
	private int book_price;
	private String lib_id;
}
