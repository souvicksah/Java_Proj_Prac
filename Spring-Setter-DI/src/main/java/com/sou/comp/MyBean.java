package com.sou.comp;

public class MyBean {
	private int msgid;
    private String msg;
	public int getMsgid() {
		return msgid;
	}
	public void setMsgid(int msgid) {
		System.out.println("Set msg ID is called");
		this.msgid = msgid;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		System.out.println("Set msg is called");
		this.msg = msg;
	}
    

}
