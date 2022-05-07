package co.edu.uco.crosscutting.exception;
import static  co.edu.uco.crosscutting.ultil.text.UtilText.trim;
import static  co.edu.uco.crosscutting.util.object.UtilObject.getUtilObject;

public class GeneralException extends RuntimeException{

	private static final long serialVersionUID = -2394065696069111664L;

	private String userMessage;
	private String technicalMessage;
	private Exception rootException;
	
	
	public String getUserMessage() {
		return userMessage;
	}
	public void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}
	public String getTechnicalMessage() {
		return technicalMessage;
	}
	public void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage) ;
	}
	public Exception getRootException() {
		return rootException;
	}
	public void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException, new Exception());
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
