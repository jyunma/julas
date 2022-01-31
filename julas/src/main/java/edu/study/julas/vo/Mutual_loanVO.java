package edu.study.julas.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mutual_loanVO {
	private int mutual_id;
	private String mutual_request;
	private String mutual_getting;
	private Timestamp mutual_request_time;
	private Timestamp mutual_sending_time;
	private Timestamp mutual_getting_time;
	private int mutual_state;
	private String user_id;
	private String book_id;
	
}
