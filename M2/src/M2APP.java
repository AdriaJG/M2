import clases.ExcepcionSueldo;
import objetos.*;
public class M2APP {

	public static void main(String[] args) throws ExcepcionSueldo {
		// TODO Auto-generated method stub
		double sueldo = 100;
		Manager m = new Manager(4000);
		Boss b = new Boss(16000);
		Employee e = new Employee(4000);
		Volunteer v = new Volunteer();
		
		m.mostrarSueldo(m.getSueldo());
		b.mostrarSueldo(b.getSueldo());
		e.mostrarSueldo(e.getSueldo());
		v.mostrarSueldo(v.getSueldo());
		
		System.out.println(m.getAnualNeto());
		System.out.println(v.getPrestacion());
	}

}
