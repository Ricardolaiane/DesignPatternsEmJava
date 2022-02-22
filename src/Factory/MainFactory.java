package Factory;

public class MainFactory {

	public static void main(String[] args) {
		
		MedidasFactory medidasFactory = new MedidasFactory();
		Medidas device1 = medidasFactory.getDefineMedidas("Notebook");
		device1.defineMedidas();
		
		Medidas device2 = medidasFactory.getDefineMedidas("Televisão");
		device2.defineMedidas();
		
		Medidas device3 = medidasFactory.getDefineMedidas("Tablet");
		device3.defineMedidas();
		
		Medidas device4 = medidasFactory.getDefineMedidas("Celular");
		device4.defineMedidas();
		
	}

}
