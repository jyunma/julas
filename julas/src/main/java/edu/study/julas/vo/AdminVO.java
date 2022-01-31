package edu.study.julas.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminVO {
	private String admin_id;
	private String admin_pw;
	private String admin_name;
	private int admin_role;
	private String lib_id;
}
