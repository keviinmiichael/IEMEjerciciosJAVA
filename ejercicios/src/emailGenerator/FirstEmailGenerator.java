package emailGenerator;

public class FirstEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getName() + user.getFirstSurname() + user.getSecondSurname() + at;
		return account.toLowerCase();
	}
}