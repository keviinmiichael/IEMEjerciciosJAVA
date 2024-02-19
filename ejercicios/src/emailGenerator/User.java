package emailGenerator;

public class User {
	private String name;
	private String firstSurname;
	private String secondSurname;
	private String email;
	
	public User(String name, String firstSurname, String secondSurname) {
		this.name = name;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the firstSurname
	 */
	public String getFirstSurname() {
		return firstSurname;
	}

	/**
	 * @return the secondSurname
	 */
	public String getSecondSurname() {
		return secondSurname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}	
}
