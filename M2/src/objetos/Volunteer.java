package objetos;

import clases.ExcepcionSueldo;

public class Volunteer extends Trabajador {
	private static final double NOSUELDO = 0;
	private static final double[] VALIDADOR = new double[]{-1, -1};
	private static double prestacio = 0;
	public Volunteer(String nombre) throws ExcepcionSueldo {
		super(nombre, NOSUELDO, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public Volunteer(String nombre, double prestacio) throws ExcepcionSueldo {
		super(nombre, NOSUELDO, VALIDADOR);
		this.prestacio = validarPrestacio(prestacio);
		// TODO Auto-generated constructor stub
	}
	
	public double validarPrestacio(double prestacio2) {
		// TODO Auto-generated method stub
		if (prestacio < 300) {
			return prestacio;
		} else {
			return 0;
		}
	}

	public Volunteer() throws ExcepcionSueldo {
		super(NOSUELDO, VALIDADOR);
		// TODO Auto-generated constructor stub
	}
	
	public double getSueldo() {
		return this.prestacio;
	}
	
	public double getPrestacion() {
		return this.prestacio;
	}

	
	private void setSueldo() {
		// TODO Auto-generated method stub
		
	}

	private void mostrarSueldo() {
		// TODO Auto-generated method stub
	}

	private void validarSueldo() {
		// TODO Auto-generated method stub
	}

	private void getMensualBruto() {
		// TODO Auto-generated method stub
	}

	private void getMensualNeto() {
		// TODO Auto-generated method stub
	}
	
	private void getAnualBruto() {
		// TODO Auto-generated method stub
	}
	

	public void getAnualNeto() {
		// TODO Auto-generated method stub
	}

	private void asignarBono() {
		// TODO Auto-generated method stub
	}
	
	

}
