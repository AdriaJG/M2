package objetos;

import clases.ExcepcionSueldo;

public class Mid extends Employee{
	private static final double[] VALIDADOR = new double[]{1800, 2500};

	
	public Mid(double sueldo) throws ExcepcionSueldo {
		super(sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Mid(String nombre, double sueldo) throws ExcepcionSueldo {
		super(nombre,sueldo, VALIDADOR);
	}

}
