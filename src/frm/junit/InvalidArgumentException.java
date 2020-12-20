package frm.junit;

/**
 * This is a custom exception class 
 * created to throw invalid data related 
 * exceptions.
 * @author admin
 * @since April 26, 2015.
 */
public class InvalidArgumentException extends Exception{

	private String errCode = "ERROR_001";
	private String errMsg = "Some internal error has been " +
			"occured. Please contact your System Administrator.";
	
	public InvalidArgumentException(String error_code, 
			String error_messasge){
		this.errCode = error_code;
		this.errMsg = error_messasge;
	}
	
	/**
	 * Returns the error code.
	 */
	public String getErrorCode(){
		return errCode;
	}
	
	/**
	 * Returns the error message.
	 */
	@Override
	public String getMessage() {
		return errMsg;
	}
	
}
