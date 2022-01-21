package objetos;

import clases.ExcepcionSueldo;

public class Volunteer extends Trabajador {
	private static final double NOSUELDO = 0;
	private static final double[] VALIDADOR = new double[]{-1, -1};
	public Volunteer(String nombre) throws ExcepcionSueldo {
		super(nombre, NOSUELDO, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Volunteer() throws ExcepcionSueldo {
		super(NOSUELDO, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return super.getSueldo();
	}

}
