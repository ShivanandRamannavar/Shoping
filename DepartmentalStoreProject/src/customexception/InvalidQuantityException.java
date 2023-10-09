package customexception;

public class InvalidQuantityException extends RuntimeException{
	String message;
	
	public InvalidQuantityException(String message){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}

}
