package edu.study.julas.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordVO {
	private int record_id;
	private String book_id;
	private String user_id;
	private Timestamp record_borrow;
	private Timestamp record_due;
	private Timestamp record_return;
	private String record_borrow_by;
	private String record_return_by;
	private Timestamp record_timestamp;
}
