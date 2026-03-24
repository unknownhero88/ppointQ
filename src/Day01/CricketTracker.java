package Day01;

import java.util.*;

public class CricketTracker {
	
	public static void total_runs(String[][] scores) {
		int totalRuns = 0;
		for (String[] player : scores) {
			totalRuns += Integer.parseInt(player[1]);
		}
		System.out.println("Total Runs: " + totalRuns);
	}
	
	public static void highest_scorer(String[][] scores) {
		String highestScorer = "";
		int highestRuns = 0;
		for (String[] player : scores) {
			int runs = Integer.parseInt(player[1]);
			if (runs > highestRuns) {
				highestRuns = runs;
				highestScorer = player[0];
			}
		}
		System.out.println("Highest Scorer: " + highestScorer + " (" + highestRuns + " runs)");
	}
	
	public static void players_who_scored_above_50(String[][] scores) {
		System.out.print("50+ scorers:");
		for (String[] player : scores) {
			if (Integer.parseInt(player[1]) > 50) {
				System.out.print(player[0] + " (" + player[1] +"),");
			}
		}
		System.out.println();
	}
	
	public static void team_average(String[][] scores) {
		int totalRuns = 0;
		for (String[] player : scores) {
			totalRuns += Integer.parseInt(player[1]);
		}
		double average = (double) totalRuns / scores.length;
		System.out.println("Team Average: " + average);
	}
	
	
    public static void main(String[] args) {

        String[][] scores = {
            {"Rohit",   "83"},
            {"Virat",   "45"},
            {"Dhoni",   "67"},
            {"Hardik",  "32"},
            {"Bumrah",  "12"},
            {"Shubman", "91"},
        };
        // scores[0][0] = "Rohit",  scores[0][1] = "83"

        // Write your code below
        
        total_runs(scores);
        highest_scorer(scores);
        players_who_scored_above_50(scores);
        team_average(scores);
        
    }
}