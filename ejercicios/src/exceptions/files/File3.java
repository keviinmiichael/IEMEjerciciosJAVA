package exceptions.files;

public class File3 {

	public String method() throws ThreeException, CustomException {
		System.out.println("Fichero 3");
		File4 file4 = new File4();

		String result = "";

		try {
			result = file4.method();
		} catch (NullPointerException e) {
			throw new ThreeException("Error en file 3 " + e.getMessage());
		}
			
		return result;	
	}
}
