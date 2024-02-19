package emailGenerator;

public class UserEmailGenerator {
	private EmailGeneratorInterface emailGenerator;
	
	public UserEmailGenerator(EmailGeneratorInterface emailGenerator) {
		this.emailGenerator = emailGenerator;
	}
	
	public String generateUserEmail(User user) {
		return this.emailGenerator.generate(user);
	}
}
