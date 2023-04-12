/*
 * Notes:
 * substring(int start) - Goes from the start to the end of the string
 * substring(int start, int end) - Goes from the start to the end
 */

public class Username {
	/*
	 * Instance variables
	 */
	private String name, username;
	private int age;
	
	/*
	 * Static variables
	 */
	public static String[] usedUsernames;
	
	/*
	 * Constructors
	 */
	public Username(String name)	{
		this.name = name;
		this.age = -1;
		this.username = null;
	}
	
	public Username(String name, int age)	{
		this.name = name;
		this.age = age;
		this.username = null;
		}
	
	public Username(String name, int age, String username)	{
		this.name = name;
		this.age = age;
		this.username = username;
	}
	
	/*
	 * Instance methods
	 */
	public void genUsername()	{
		int method = (int)(Math.random() * 4);
		
		switch(method)	{	// switch basically same thing as if stmt w bunch of else if stmts aftr
		case 0:
			this.username = this.name;
			break;
		case 1:
			this.username = this.name + (2022-this.age);
			if (this.age != -1)	{
				break;
			}
		case 2:
			// Substring gets parts of a string
			this.username = this.name.substring(2) + 2022;	// gives first two initials + 2022
			break;
		case 3:
			this.username = this.name.substring(0,this.name.length()-2) + 22;
			break;
		default:
			break;
		}
	}
	
	public String getUsername()	{
		if (this.username == null)	{
			return "No Username found.\n";
		}
		return this.username;
	}
	
	public String toString() {
		String output = "Username: " + this.username;
		output += "\nName: " + this.name;
		return "Done";
	}
	
}
