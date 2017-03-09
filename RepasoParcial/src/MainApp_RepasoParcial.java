import processing.core.PApplet;

public class MainApp_RepasoParcial extends PApplet {
	
	static PApplet app;
	Logica log;

	public static void main(String[] args) {
		PApplet.main("MainApp_RepasoParcial");

	}

	public void setup() {
		app = this;
		log = new Logica();
	}

	public void settings() {

		size(1000, 700);
	}

	public void draw() {

		background(0);
		log.Pintar();
	}
	
	public void keyPressed(){
		
		log.Ordenamientos();
	}

}
