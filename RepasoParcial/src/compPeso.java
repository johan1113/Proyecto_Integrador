import java.util.Comparator;

public class compPeso implements Comparator<Informacion> {

	public int compare(Informacion i1, Informacion i2){
		return (int) (i1.getPeso()-i2.getPeso());
	}
}
