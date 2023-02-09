/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/
public class BasketballTeam extends SportsTeam {
	int fieldGoals;
	int fieldGoalsAttempted;
	int freeThrows;
	int freeThrowsAttempted;
	
	/**
	 * Sets all the integers for Basketball team
	 */
	public BasketballTeam() {
		fieldGoals = 0;
		fieldGoalsAttempted =0;
		freeThrows =0;
		freeThrowsAttempted = 0;	
	}
	/**
	 * 
	 * @param teamName sets variable string
	 * @param teamMascot sets variable string
	 * @param headCoach sets variable string
	 */
	public BasketballTeam(String teamName, String teamMascot, String headCoach){
		teamName = "";
		teamMascot = "";
		headCoach = "";
	}
	/**
	 * 
	 * @return a program that gets field goal percentage
	 */
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
	}
	/**
	 * 
	 * @return a program getting percentage of free throws
	 */
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted;
	}
	/**
	 * A setter that 
	 * @param wins
	 * @param losses
	 * @param fieldGoals
	 * @param FieldGoalsAttempted
	 * @param freeThrows
	 * @param freeThrowsAttempted
	 */
	public void setStats(int wins, int losses, int fieldGoals, int FieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		 super.wins = wins; //Set from super class
		
		 super.losses = losses; //Set from super class
		 
		 this.fieldGoals = fieldGoals; //Set here
		 
		 this.fieldGoalsAttempted = FieldGoalsAttempted;
		
		 this.freeThrows = freeThrows;
		 
		 this.freeThrowsAttempted = freeThrowsAttempted;
		
		 System.out.println("Stats Set!");
	}
	@Override //From 
	public double[] getStats() {
		double Stats[] = {super.getWinPercentage(),this.freeThrowPercentage(), this.fieldGoalPercentage()};
		for(int i =0; i<3; i++) {
			System.out.println(Stats[i]);
		}
		return Stats;
	}
	
	
}
