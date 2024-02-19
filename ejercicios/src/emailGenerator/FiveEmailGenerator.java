package emailGenerator;

public class FiveEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getName() + "." + user.getFirstSurname() + "." + user.getSecondSurname() + at;
		return account.toLowerCase();
	}
}