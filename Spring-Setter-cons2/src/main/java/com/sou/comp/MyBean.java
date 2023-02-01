package com.sou.comp;

public class MyBean {
	private int msgid;
    private String msg;
    public MyBean(int i,String msg) {
    	msgid=i;
    	this.msg=msg;
    	System.out.println("Constructor gets called");
    }
	public int getMsgid() {
		return msgid;
	}
	
	public String getMsg() {
		return msg;
	}
	    

}
