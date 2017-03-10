import processing.core.PApplet;

public class Informacion implements Comparable<Informacion> {

	private PApplet app;
	private String nombre, apellido;
	private float cedula, edad, peso, r, g, b, suma;
	private int y;

	public Informacion(PApplet app, String nombre, String apellido, float cedula, float edad, float peso, float r,
			float g, float b) {

		this.app = app;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.edad = edad;
		this.peso = peso;
		this.r = r;
		this.g = g;
		this.b = b;
		suma = r + g + b;
	}

	public void pintar(int y) {
		this.y = y;
		app.fill(r, g, b);
		app.textSize(20);
		app.text(nombre + "     " + apellido + "     " + cedula + "     " + edad + "     " + peso, 100, y);
		app.noFill();
	}

	public int compareTo(Informacion f) {

		return getNombre().compareTo(f.getNombre());
	}

	public int hashCode() {

		return (int) suma;
	}

	public boolean equals(Object obj) {

		Informacion i = (Informacion) obj;
		return suma == i.getSuma();
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
