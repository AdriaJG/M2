package Objetos;

public class Employee extends Trabajador {

	public Employee(String nombre, double sueldo) {
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public Employee(double sueldo) {
		super( sueldo);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo() - super.getSueldo() * 10 / 100;
	}

}
