package objetos;

import clases.ExcepcionSueldo;

public class Junior extends Employee{
	private static final double[] VALIDADOR = new double[]{900, 1600};

	public Junior(double sueldo) throws ExcepcionSueldo {
		super(sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Junior(String nombre, double sueldo) throws ExcepcionSueldo {
		super(nombre,sueldo, VALIDADOR);
	}
	
	@Override
	public double getSueldo() {
		return super.getSueldo() - super.getSueldo() * 15 / 100;
	}
}
