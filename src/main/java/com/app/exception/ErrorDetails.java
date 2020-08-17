package com.app.exception;

import java.util.Date;

public class ErrorDetails {
private Date timestamp;
private String messge;
private String details;
public ErrorDetails(Date timestamp, String messge, String details) {
	super();
	this.timestamp = timestamp;
	this.messge = messge;
	this.details = details;
}
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getMessge() {
	return messge;
}
public void setMessge(String messge) {
	this.messge = messge;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}


}
