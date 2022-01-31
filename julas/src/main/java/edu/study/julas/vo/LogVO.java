package edu.study.julas.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogVO {
	private int log_id;
	private String log_action;
	private Timestamp log_timestamp;
	private String admin_id;
	private String user_id;
	private String book_id;
}
