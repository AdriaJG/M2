package objetos;
import clases.*;

public abstract class Trabajador {
	protected String nombre;
	protected double sueldo;
	protected boolean bono = false;
	
	public Trabajador(String nombre, double sueldo, double[] validador) throws ExcepcionSueldo {
		super();
		this.nombre = nombre;
		this.sueldo = validarSueldo(sueldo, validador);
	}
	
	public Trabajador(double sueldo, double[] validador) throws ExcepcionSueldo{
		this.nombre = "Pepe";
		this.sueldo = validarSueldo(sueldo, validador);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public void mostrarSueldo(double sueldo) {
		System.out.println("El sueldo es de " + sueldo);
	}
	
	public double validarSueldo(double sueldo, double[] validador) throws ExcepcionSueldo {
		if ((sueldo > validador[0] || validador[0] == -1) && (sueldo < validador[1] || validador[1] == -1)) {
			return sueldo;
		} else {
			throw new ExcepcionSueldo("Sueldo invalido, introduce un sueldo ente " + validador[0] + " y " + validador[1]);
		}
	}
	
	public double getMensualBruto() {
		return this.sueldo;
	}
	
	public double getMensualNeto(int porcentaje) {
		return this.sueldo + this.sueldo * porcentaje / 100;
	}
	
	public double getAnualBruto() {
		if (this.bono) {
			return (this.sueldo + getMensualNeto(10)) * 12;
		} else {
			return this.sueldo * 12;
		}
		
	}
	
	public double getAnualNeto(int porcentaje) {
		//return getMensualNeto(porcentaje) * 12;
		return getAnualBruto() - (getAnualBruto() * porcentaje / 100);
	}
	
	public void asignarBono(boolean bono) {
		this.bono = bono;
	}
}
