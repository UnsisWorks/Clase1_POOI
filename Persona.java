// Autor: Galicia Cordova Elietzer Jared
public class Persona {

	// Properties
	String name;
	String curp;
	int age;

	static int numPeople = 0;

	public void Persona(String name, String curp, int age) {
		this.name = name;
		this.curp = curp;
		this.age = age;
	}

	// Metodos setter for name 
	public void setName(String name) {
		this.name = name;
	}

	// Metodos getter for name 
	public String getName() {
		return name;
	}

}
