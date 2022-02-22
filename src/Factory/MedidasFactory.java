package Factory;

public class MedidasFactory {
	
	public Medidas getDefineMedidas(String device) {
		if(device == null) {
			return null;
		}
		if(device.equalsIgnoreCase("Notebook")) {
			return new Notebook();
		}
		if(device.equalsIgnoreCase("Televisão")) {
			return new Televisao();
		}
		if(device.equalsIgnoreCase("Celular")) {
			return new Celular();
		}
		if(device.equalsIgnoreCase("Tablet")) {
			return new Tablet();
		}
		return null;
		
	}
	

}
