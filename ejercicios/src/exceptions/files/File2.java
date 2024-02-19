package exceptions.files;

public class File2 {

	public String method() throws SecondException, ThreeException, CustomException {
		System.out.println("Fichero 2");
		File3 file3 = new File3();

		String result = "";
		try {
            result = file3.method();
        } catch (NullPointerException e) {
			throw new SecondException("Error en file 2 " + e.getMessage());
        }
		
		return result;
	}
}
