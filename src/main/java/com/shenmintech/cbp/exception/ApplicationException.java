package com.shenmintech.cbp.exception;

@SuppressWarnings("serial")
public class ApplicationException extends RuntimeException {
  public String code;
  public String msg;
  public String data;

  public ApplicationException() {

  }

  public ApplicationException(String code, String msg, String data) {
    this.code = code;
    this.msg = msg;
    this.data = data;
  }

}
