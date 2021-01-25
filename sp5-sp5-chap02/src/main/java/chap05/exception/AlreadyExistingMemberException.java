package chap05.exception;

public class AlreadyExistingMemberException extends RuntimeException {

	public AlreadyExistingMemberException(String e) {
		super(e);
	}
}
