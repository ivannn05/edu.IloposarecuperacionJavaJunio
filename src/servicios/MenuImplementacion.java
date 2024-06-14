package servicios;

import java.util.Scanner;

/**
 * Clase enargada de xontener los datos de los metodos de los menus
 */
public class MenuImplementacion implements MenuInterfaz {

	Scanner sc= new Scanner(System.in);

	@Override
	public int mostrarMenuInicial() {
		int opc;
		System.out.println("Seleccione una aopcion");
		System.out.println("0.Cerrar Menu");
		System.out.println("1.Venta de vehículo");
		opc=sc.nextInt();
		return opc;
	}

}
