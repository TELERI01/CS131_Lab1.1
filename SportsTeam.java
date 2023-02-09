/**
*@author Tyler Lericos
*@version 1.0
*Programming Lab 0.1
*Spring Semester/Freshman
*/
public abstract class SportsTeam {
	protected String teamName;
	protected String teamMascot;
	protected String headCoach;
	protected int wins;
	protected int losses;
	/**
	 * Constructor for Team
	 */
	public void Team() {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}
	/**
	 * Preferred constructor for team
	 * @param teamName
	 * @param teamMascot
	 * @param headCoach
	 */
	public void Team(String teamName, String teamMascot, String headCoach) {
		teamName = "";
		teamMascot = "";
		headCoach = "";
		wins = 0;
		losses = 0;
	}
	/**
	 * Public double to get win percentage
	 * @return
	 */
	public double getWinPercentage() {
		return wins/(wins+losses);
	}
	/**
	 * Public abstract method for getStats
	 * @return
	 */
	public abstract double[] getStats();
	

	
}
