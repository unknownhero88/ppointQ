package Day07.CustomExceptionANDFileLogger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ScoreLogger logger = new ScoreLogger("scores.txt");
        String[][] data = {
            {"Rahul","85"}, {"Priya","110"}, {"Arjun","72"},
            {"Sneha","-5"}, {"Vikram","91"}
        };
        for (String[] d : data) {
            try {
                logger.logScore(d[0], Integer.parseInt(d[1]));
                System.out.println("Logged: " + d[0]);
            } catch (InvalidScoreException e) {
                System.out.println("Invalid: " + d[0] + " — " + e.getMessage());
            } catch (IOException e) {
                System.out.println("File error: " + e.getMessage());
            }
        }
        
        try {
            FileReader file = new FileReader(logger.FILEPATH+logger.filename);
            BufferedReader bufferFile = new BufferedReader(file);

            System.out.println("--- " + logger.filename + " ---");

            String fileData;
            while ((fileData = bufferFile.readLine()) != null) {
                System.out.println(fileData);
            }

            bufferFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}