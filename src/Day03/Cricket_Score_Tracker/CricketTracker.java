package Day03.Cricket_Score_Tracker;

import java.util.*; 

public class CricketTracker 
	{ 	

		public static void total_runs(ArrayList<Player> team)
			{
				int total=0;
				for(Player p:team)
					{
						total+=p.runs;
					}
				System.out.println("Total runs: "+total);	
			}

		public static void highest_score(ArrayList<Player> team)
			{
				Player high=new Player("",0);
				for(Player p:team)
					{
						if(p.runs>high.runs)
							high=p;
					}
				System.out.println("Highest scorer: "+high.name+" - "+high.runs+" runs");	
			}

		public static List<Player> print_all_GT50(ArrayList<Player> team)
			{
				List<Player> players = new ArrayList<Player>();
				for(Player p:team)
					{
						if(p.runs>50)
							players.add(p);					}
				return players;	
			}

		public static void Avg_runs(ArrayList<Player> team)
			{
				int total=0;
				for(Player p:team)
					{
						total+=p.runs;
					}
				int size = team.size();
				System.out.println("Team average: "+total/size);	
			}

				

		public static void main(String[] args) 
			{ 
				ArrayList<Player> team = new ArrayList<>();
				team.add(new Player("Rohit", 83));
				team.add(new Player("Virat", 45)); 
				team.add(new Player("Dhoni", 67)); 
				team.add(new Player("Hardik", 32)); 
				team.add(new Player("Shubman", 91)); 
				// Write your code here 
				total_runs(team);
				highest_score(team);
				List<Player> player=print_all_GT50(team);
				System.out.print("50+ scorers: ");
				for(Player p:player)
					{
						System.out.print(p.name+"("+p.runs+"),");
					}
				Avg_runs(team);
				
				
			} 
	}