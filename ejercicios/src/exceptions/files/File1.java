package exceptions.files;

public class File1 {

	public String method() throws FirstException, SecondException, ThreeException, CustomException {
		System.out.println("Fichero 1");
		File2 file2 = new File2();
		String result = "";
		try {
			result = file2.method();
		} catch (NullPointerException e) {
			throw new FirstException("Error en file 1 " + e.getMessage());
		}

		return result;
	}
}
