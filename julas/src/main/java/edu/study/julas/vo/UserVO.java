package edu.study.julas.vo;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVO {
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_address;
	private String user_phone;
	private Date user_birth;
	private int user_gender;
	private String user_email;
	private int user_state;
	private Timestamp user_bandate;
	private String user_memo;

}
