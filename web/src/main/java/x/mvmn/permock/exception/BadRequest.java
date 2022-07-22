package x.mvmn.permock.exception;

public class BadRequest extends RuntimeException {
	private static final long serialVersionUID = -5980347014343072639L;

	public BadRequest() {
		super();
	}

	public BadRequest(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BadRequest(String message, Throwable cause) {
		super(message, cause);
	}

	public BadRequest(String message) {
		super(message);
	}

	public BadRequest(Throwable cause) {
		super(cause);
	}
}
