package emailGenerator;

public class ThristEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getName().substring(0, 2) + user.getFirstSurname() + user.getSecondSurname() + at;
		return account.toLowerCase();
	}
}