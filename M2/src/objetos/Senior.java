package objetos;

import clases.ExcepcionSueldo;

public class Senior extends Employee{
	private static final double[] VALIDADOR = new double[]{2700, 5000};


	public Senior(double sueldo) throws ExcepcionSueldo {
		super(sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Senior(String nombre, double sueldo) throws ExcepcionSueldo {
		super(nombre,sueldo, VALIDADOR);
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() - super.getSueldo() * 5 / 100;
	}
}
