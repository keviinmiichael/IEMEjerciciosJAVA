package emailGenerator;

public class SixEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getFirstSurname() + user.getSecondSurname() + user.getName() + at;
		return account.toLowerCase();
	}
}