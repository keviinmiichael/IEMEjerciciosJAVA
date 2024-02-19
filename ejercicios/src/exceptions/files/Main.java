package exceptions.files;

public class Main {

	public static void main(String[] args) {
		File1 file1 = new File1();
		
		try {
			String result = file1.method();
			System.out.println(result);
		} catch (NullPointerException e) {
			System.out.println("error en main " + e.getMessage());
		} catch (FirstException e) {
			System.out.println("error en main " + e.getMessage());
        } catch (SecondException e) {
			System.out.println("error en main " + e.getMessage());
		} catch (ThreeException e) {
			System.out.println("error en main " + e.getMessage());
        } catch (CustomException e){
			System.out.println("error en main " + e.getMessage());
		}
		
	}

}
