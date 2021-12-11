package modulo.mundo;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner lect = new Scanner (System.in);
		// TODO Auto-generated method stub
		
		//Empleado empleado1;
		Empleado empleado1= new Empleado();
		
		String nombreEmple="";
		String apellidoEmple="";
		int genero=0;
		String imagen="";
		double salario=0;
		Fecha fechaNac;
		Fecha fechaIngreso;
		
		// OPCIONES DEL SISTEMA
		/* 1. Ingrese datos del empleado.
			3. Calcular la edad del empleado.
			4. Calcular la antigüedad del empleado en la empresa.
			5. Calcular las prestaciones del empleado.
			6. Visualizar la información del empleado.
		*/
		
		System.out.println("Escoja una de las siguientes opciones");
		System.out.println("	1. Ingrese datos del empleado.");
		System.out.println("	2. Calcular la edad del empleado");
		System.out.println("	3. Calcular la antigüedad del empleado en la empresa");
		System.out.println("	4. Calcular las prestaciones del empleado.");
		System.out.println("	5. Visualizar la información del empleado");
		int opc = lect.nextInt();
		
		switch (opc) {
			case 1: 
				System.out.println("Ingrese los datos del Empleado");
				System.out.println("Nombre: ");
				nombreEmple= lect.next();
				System.out.println("Apellido: ");
				apellidoEmple=lect.next();
				System.out.println("Género (1=Masculino, 2=Femenino: ");
				genero=lect.nextInt();
				System.out.println("Salario (Dos decimales): ");
				salario=lect.nextDouble();
				System.out.println("Ingrese anio de naciniento: ");
				/*year = scanner.nextInt();
				bornDate = new Fecha(day, month, year);
				Systen.out.printin("Iegrese dia de ingreso: ");
				day = sconner.nextInt();
				Systen.out.printin("Ingrese mes de ingreso: ");
				month = scanner.nextInt();
				System.out.println("Ingrese anio de ingreso: "):
				year = scanner.nextInt();
				fechaingreso = new Fecha(day, month, year);*/
				break;
			case 2: 
				System.out.println("Ud ha escogido la opción 2");
				empleado1.calcularEdad();
				break;
			case 3: 
				System.out.println("Ud ha escogido la opción 3");
				empleado1.calcularAntiguedad();
				break;
			case 4: 
				System.out.println("Ud ha escogido la opción 4");
				empleado1.calcularPrestaciones();
				break;
			case 5: 
				System.out.println("Ud ha escogido la opción 5");
				empleado1.mostrarInformaicón();
				break;
			default:
				System.out.println("No ha escogido una opicón correcta");
				
		}
		System.out.println("");
		System.out.println("");
		
	}

}
