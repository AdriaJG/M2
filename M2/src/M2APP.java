import clases.ExcepcionSueldo;
import objetos.*;
public class M2APP {

	public static void main(String[] args) throws ExcepcionSueldo {
		// TODO Auto-generated method stub
		double sueldo = 100;
		Manager m = new Manager(sueldo);
		Boss b = new Boss(sueldo);
		Employee e = new Employee(sueldo);
		Volunteer v = new Volunteer();
		
		m.mostrarSueldo(m.getSueldo());
		b.mostrarSueldo(b.getSueldo());
		e.mostrarSueldo(e.getSueldo());
		v.mostrarSueldo(v.getSueldo());
	}

}
