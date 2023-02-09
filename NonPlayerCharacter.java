import java.security.SecureRandom;
import java.util.*;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author Tyler Lericos
 * @version 1.3
 * Lab1
 * CS131ON
 */
public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active; //private bool telling us whether npc is active or not
	private String intellegenceType; //private string holdiung intellegence type value
	
	/**
	 * initializes bool active, and string intellegence type 
	 */
	public NonPlayerCharacter() {
		active = false;
		intellegenceType = "AVERAGE";
	}
	
	/**
	 * 
	 * @param id name from GameCharacter
	 * @param personality string from GameCharacter initialized
	 * @param active bool from this class set and passed through
	 * @param intellegenceType passes string intellegnece type
	 */
	public NonPlayerCharacter(String id, String personality, boolean active, String intellegenceType) {
		super.uniqueID = id;
		super.personality = personality;
		this.active = active;
		this.intellegenceType = intellegenceType;
	}
	/**
	 * 
	 * @return boolean active
	 */
	public boolean getActive() {
		return active;
	}
	/**
	 * 
	 * @param active sets the boolean active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * 
	 * @return string intellegence type
	 */
	public String getintellegenceType() {
		return intellegenceType;
	}
	/**
	 * 
	 * @param intellegenceType sets the intellegence type 
	 */
	public void setintellegenceType(String intellegenceType) {
		this.intellegenceType = intellegenceType;
	}
	
	/**
	 * returns the reportStruture method from this class AND from the super class(GameCharacter)
	 */
	public String reportStructure() {
		StringBuilder sb1 = new StringBuilder("");
		sb1.append(("Acrtive: "+getActive()+"\n"));
		sb1.append("Intelligence: " + getintellegenceType()+"\n");
		sb1.append("==================================\n");
		return super.reportStructure() + sb1.toString();
		
	}
	/**
	 * 
	 * @return a string alongside a variable from superclass
	 */
	public String introduce() {
		return "Hello, I am " + super.getUniqueID();
	}
	/**
	 * 
	 * @return a string that will determine a random value
	 */
	public String exclaim() {
		Random r = new Random(); //makes a random number generator
		r.setSeed(1000); //sets seed for generator
		
		int value = r.nextInt(1, 5); //keeps the values of generator between two values
		String exclaim =""; // String exclaims vairable initialized
		
		
		/**
		 * set of if statements that will determine the exclaim string
		 */
		if (value == 1) {
			exclaim = "Dag Gummit";
		}
		if (value == 2) {
			exclaim = "Doggone it";
		}
		if (value == 3) {
			exclaim = "Holy cow";
		}
		if (value == 4) {
			exclaim = "Jeez";
		}
		if (value == 5) {
			exclaim = "Well cheese and crackers";
		}
		return exclaim;
	}
	
}//end class
