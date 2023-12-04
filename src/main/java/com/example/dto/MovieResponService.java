package com.example.dto;

import org.springframework.stereotype.Component;

@Component
public class MovieResponService {

	private String codeRespon = "";

	private String message = "";

	private Object answer = null;

	public MovieResponService() {
	}

	public MovieResponService(String message, String codeRespon, Object answer) {
		super();
		this.codeRespon = codeRespon;
		this.answer = answer;
		this.message = message;
	}

	public String getCodeRespon() {
		return codeRespon;
	}

	public void setCodeRespon(String codeRespon) {
		this.codeRespon = codeRespon;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getAnswer() {
		return answer;
	}

	public void setAnswer(Object answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "RespuestaServicio [codeRespon=" + codeRespon + ", message=" + message + ", answer=" + answer + "]";
	}

}
