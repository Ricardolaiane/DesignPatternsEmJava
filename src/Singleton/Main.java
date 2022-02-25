package Singleton;

public class Main {
	
	public static void main(String[] args) {
		//construtor ilegal
		//erro de compilação: O construtor SingleObject() não é visível
		//SingleObject object = new SingleObject();
		
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}

}
