import processing.core.PApplet;

public class Informacion implements Comparable<Informacion> {

	private PApplet app;
	private String nombre, apellido;
	private float cedula, edad, peso, r, g, b;
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

	public float getCedula() {
		return cedula;
	}

	public void setCedula(float cedula) {
		this.cedula = cedula;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(float edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	public float getG() {
		return g;
	}

	public void setG(float g) {
		this.g = g;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}