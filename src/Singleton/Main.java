package Singleton;

public class Main {
	
	public static void main(String[] args) {
		//construtor ilegal
		//erro de compila��o: O construtor SingleObject() n�o � vis�vel
		//SingleObject object = new SingleObject();
		
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
