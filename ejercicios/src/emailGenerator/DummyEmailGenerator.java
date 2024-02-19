package emailGenerator;

public class DummyEmailGenerator implements EmailGeneratorInterface {

	@Override
	public String generate(User user) {
		return "dummy@example.com";
	}
}
