package com.example.dto;

import org.springframework.stereotype.Component;

@Component
public class ResponServiceDto {

	private String message = "";

	private String code = "";
	
	private Resoult resoult = null;

	public ResponServiceDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public ResponServiceDto(String message, String code, Resoult resoult) {
		super();
		this.message = message;
		this.code = code;
		this.resoult = resoult;
	}



	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Resoult getResoult() {
		return resoult;
	}

	public void setResoult(Resoult resoult) {
		this.resoult = resoult;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
