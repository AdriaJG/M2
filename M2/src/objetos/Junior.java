package objetos;

import clases.ExcepcionSueldo;

public class Junior extends Employee{
	private static final double[] VALIDADOR = new double[]{900, 1600};
	private static final int IRPF = 2;
	
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
	
	public double getMensualNeto() {
		// TODO Auto-generated method stub
		return super.getMensualNeto(IRPF);
	}

	public double getAnualNeto() {
		// TODO Auto-generated method stub
		return super.getAnualNeto(IRPF);
	}
}
