package com.company.hello.dto;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class UserDto {

	private int userId;

	private String userName;

	private String eMail;

	private String passWord;

	private Timestamp createTime;

}
