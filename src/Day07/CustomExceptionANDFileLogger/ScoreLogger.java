package Day07.CustomExceptionANDFileLogger;

import java.io.FileWriter;
import java.io.IOException;

class ScoreLogger {
	String filename;
	String FILEPATH="D:\\pro\\hibernate-programs\\PPointQ\\src\\Day07\\CustomExceptionANDFileLogger\\";

	ScoreLogger(String filename) {
		this.filename = filename;
	}

	void logScore(String name, int score) throws InvalidScoreException, IOException {
		// validate: score must be 0–100, else throw InvalidScoreException
		if (score >= 0 && score <= 100) {
			// if valid, write "name: score" to file using FileWriter (append mode)
			FileWriter file = new FileWriter(FILEPATH+this.filename, true);
			file.append(name + " : " + score+" \n");
			file.close();
		} else {
			throw new InvalidScoreException("Score "+score+" is out of range 0-100");
		}
	}
}