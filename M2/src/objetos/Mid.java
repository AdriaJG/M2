package objetos;

import clases.ExcepcionSueldo;

public class Mid extends Employee{
	private static final double[] VALIDADOR = new double[]{1800, 2500};
	private static final int IRPF = 15;
	
	public Mid(double sueldo) throws ExcepcionSueldo {
		super(sueldo, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Mid(String nombre, double sueldo) throws ExcepcionSueldo {
		super(nombre,sueldo, VALIDADOR);
	}
	
	public double getMensualNeto() {
		// TODO Auto-generated method stub
		return super.getMensualNeto(IRPF);
	}

	public double getAnualNeto() {
		// TODO Auto-generated method stub
		return super.getAnualNeto(IRPF);
	}

}
