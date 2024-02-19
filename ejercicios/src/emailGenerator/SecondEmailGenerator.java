package emailGenerator;

public class SecondEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getName() + user.getFirstSurname().substring(0, 2) + user.getSecondSurname().substring(0, 2) + at;
		return account.toLowerCase();
	}
}