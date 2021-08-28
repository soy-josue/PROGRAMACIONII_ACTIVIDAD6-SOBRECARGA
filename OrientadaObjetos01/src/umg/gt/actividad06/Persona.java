package umg.gt.actividad06;

public class Persona {
	// Atributo
	String nombre;
	int edad;
	String dpi;

	// metodos sobrecarga de constructores
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona(String dpi) {
		super();
		this.dpi = dpi;
	}

	public void correr() {
		System.out.println(
				"Soy " + nombre + " " + ", tengo" + edad + " ayos y estoy corriendo 21km de ruta de los Dioses 2021");
	}

	public void correr(int km) {
		System.out.println("He recorrido " + km + " kilometros");
	}

}
