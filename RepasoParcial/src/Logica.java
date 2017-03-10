import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import processing.core.PApplet;

public class Logica {

	private PApplet app = MainApp_RepasoParcial.app;
	private LinkedList<Informacion> informaciones;
	private LinkedList<Informacion> backup;

	private TreeSet<Informacion> peso;
	private HashSet<Informacion> color;

	public Logica() {

		informaciones = new LinkedList<Informacion>();
		backup = new LinkedList<Informacion>();
		peso = new TreeSet<Informacion>();
		color = new HashSet<Informacion>();
		cargarDatos();

	}

	public void cargarDatos() {

		String[] Info = app.loadStrings("../data/informacion");
		String[] Usuario = app.loadStrings("../data/usuarios");
		String[] Tono = app.loadStrings("../data/tonos");

		for (int i = 0; i < Info.length; i++) {
			String[] Usuarios = Usuario[i].split(":");
			String[] Infos = Info[i].split("/");
			String[] Tonos = Tono[i].split("/");

			app.println(Tonos);
			app.println(Infos);
			app.println(Usuarios);

			float[] InfoFloat = new float[Info.length];
			for (int j = 0; j < Infos.length; j++) {
				InfoFloat[j] = Float.parseFloat(Infos[j]);
			}

			float[] TonoFloat = new float[Tonos.length];
			for (int j = 0; j < Tonos.length; j++) {
				TonoFloat[j] = Float.parseFloat(Tonos[j]);
			}

			informaciones.add(new Informacion(app, Usuarios[0], Usuarios[1], InfoFloat[0], InfoFloat[1], InfoFloat[2],
					TonoFloat[0], TonoFloat[1], TonoFloat[2]));

			backup.addAll(informaciones);
			peso.addAll(informaciones);
			color.addAll(informaciones);
		}

	}

	public void Pintar() {

		Iterator<Informacion> It = informaciones.iterator();
		int i = 0;
		while (It.hasNext()) {
			Informacion In = It.next();
			In.pintar(40 + 40 * i);
			i++;
		}

	}

	public void Ordenamientos() {

		if (app.key == '1') {
			// informaciones.clear();
			// informaciones.addAll(backup);
			Collections.sort(informaciones);
		}

		if (app.key == '2') {
			// informaciones.clear();
			// informaciones.addAll(backup);
			Collections.sort(informaciones, new compPeso());

		}

		if (app.key == '3') {
			// Collections.sort(peso);
			informaciones.clear();
			informaciones.addAll(peso);
			Collections.sort(informaciones, new compPeso());
			Collections.reverse(informaciones);
		}
		if (app.key == '4') {
			informaciones.clear();
			informaciones.addAll(color);

		}
	}

}
