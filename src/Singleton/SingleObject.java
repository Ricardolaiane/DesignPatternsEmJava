package Singleton;

public class SingleObject {
	
	private static SingleObject instancia = new SingleObject();
	
	private SingleObject() {}
	
	public static SingleObject getInstance() {
		return instancia;
	}

	public void showMessage() {
		System.out.println("Olá, sou um objeto único!");
	}
}
