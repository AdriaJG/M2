package objetos;

import clases.ExcepcionSueldo;

public class Manager extends Trabajador {
	private static final double[] VALIDADOR = new double[]{3000, 5000};


	public Manager(String nombre, double sueldo) throws ExcepcionSueldo {
		
		super(nombre, sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Manager(double sueldo) throws ExcepcionSueldo {
		super( sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo() + super.getSueldo() * 10 / 100;
	}

}
