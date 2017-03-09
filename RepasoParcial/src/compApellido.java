import java.util.Comparator;

public class compApellido implements Comparator<Informacion> {

	public int compare(Informacion i1, Informacion i2) {
		// se hace compare to por ser variables de tipo string
		return i1.getApellido().compareTo(i2.getApellido());
	}
}
