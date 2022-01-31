package edu.study.julas.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RsvVO {
	private int rsv_id;
	private String book_id;
	private String user_id;
	private Timestamp rsv_time;
	private Timestamp rsv_cancel;
	private String rsv_cancel_reason;
	private Timestamp rsv_due;
	private int rsv_status;
	private Timestamp rsv_timestamp;

}
