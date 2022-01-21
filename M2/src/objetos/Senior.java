package objetos;

import clases.ExcepcionSueldo;

public class Senior extends Employee{
	private static final double[] VALIDADOR = new double[]{2700, 5000};
	private static final int IRPF = 24;

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
	
	public double getMensualNeto() {
		// TODO Auto-generated method stub
		return super.getMensualNeto(IRPF);
	}

	public double getAnualNeto() {
		// TODO Auto-generated method stub
		return super.getAnualNeto(IRPF);
	}
}
