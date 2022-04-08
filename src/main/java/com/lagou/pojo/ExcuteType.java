package com.lagou.pojo;

public enum ExcuteType {

	SELECT(0,"查询"),
	DELETE(1,"删除"),
	UPDATE(2,"修改"),
	INSERT(3,"新建");

	private int code;
	private String desc;

	ExcuteType(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
}
