package emailGenerator;

public class FourEmailGenerator implements EmailGeneratorInterface {
    @Override
	public String generate(User user) {
        String at = "@iembs.com";
        String account = user.getName().substring(0, 1) + "." + user.getFirstSurname() + user.getSecondSurname() + at;
		return account.toLowerCase();
	}
}