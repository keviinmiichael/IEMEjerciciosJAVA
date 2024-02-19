package emailGenerator;

public class SevenEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getSecondSurname() + user.getFirstSurname() + user.getName() + at;
		return account.toLowerCase();
	}
}