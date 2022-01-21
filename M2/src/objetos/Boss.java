package objetos;

import clases.ExcepcionSueldo;

public class Boss extends Trabajador {
	
	private static final double[] VALIDADOR = new double[]{8000, -1};
	private static final int IRPF = 32;
	
	public Boss(String nombre, double sueldo) throws ExcepcionSueldo {
		super(nombre, sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Boss(double sueldo) throws ExcepcionSueldo {
		super( sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo() + super.getSueldo() * 50 / 100;
	}
	
}
