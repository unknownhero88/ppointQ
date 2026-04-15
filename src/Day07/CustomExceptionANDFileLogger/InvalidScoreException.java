package Day07.CustomExceptionANDFileLogger;

class InvalidScoreException extends Exception {
	InvalidScoreException(String msg) {
		super(msg);
	}
}
