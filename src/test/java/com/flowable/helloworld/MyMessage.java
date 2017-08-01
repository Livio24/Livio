package com.flowable.helloworld;

import java.io.Serializable;

public class MyMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private String message;

    public String getMessage() {
    	return this.message;
    }

    public void setMessage(String message) {
    	this.message = message;
    }
}
