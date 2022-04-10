package exception;

import java.util.Date;

public class ErrorDetail {
	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	private String errorMsg;
	public ErrorDetail(String errorMsg, String errorCode, Date timestamp) {
		super();
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
		this.timestamp = timestamp;
	}
	private String errorCode;
	private Date timestamp;

}
