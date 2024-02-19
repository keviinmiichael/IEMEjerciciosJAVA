package exceptions.files;

public class File4 {

	public String method() throws CustomException {

		System.out.println("Fichero 4");
		File5 file5 = new File5();

		String result = "";

		try {
			result = file5.method();
		} catch (NullPointerException e) {
			throw new CustomException("Error en file 4 " + e.getMessage());
		}
		
		return result;			
	}
}
