package admin;

public class InvalidUserException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidUserException() {}
	
	public String toString() {
		return "User not found exception";
	}
}
