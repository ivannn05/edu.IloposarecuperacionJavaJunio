package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/**
 * Clase principal de la app
 */
public class Inicio {

	public static List<PropietarioDto> listaPropietarios = new ArrayList<PropietarioDto>();
	public static List<VehiculoDto> listaVehiculos = new ArrayList<VehiculoDto>();

	/**
	 * Metodo principal de la app , por el cual se lanzara la app
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FicheroInterfaz fi = new FicheroImplementacion();
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz op = new OperativaImplementacion();

		fi.cargaDeFichero();

		int opc;
		boolean cerraMenu = false;
		while (!cerraMenu) {
			opc = mi.mostrarMenuInicial();

			try {
				switch (opc) {
				case 0:
					System.out.println("Se cerrara el menu");
					fi.ficheroLog("Se cerrara el menu");
					cerraMenu = true;
					break;
				case 1:
					System.out.println("Selecciono venta de vehículo");
					fi.ficheroLog("Selecciono venta de vehículo");
					System.out.println("Lista de datos:");
					for (int i = 0; i < listaPropietarios.size(); i++) {
						System.out.println( listaVehiculos.get(i).toString().concat(listaPropietarios.get(i).toString()).concat("\n"));
					}
					System.out.println("########################################");
					break;

				default:
					System.out.println("Esta opcion no existe");
					fi.ficheroLog("Esta opcion no existe");
					break;
				}
			} catch (Exception e) {
				System.out.println("Ocurrio un error en la aplicacion");
				fi.ficheroLog("Ocurrio un error en la aplicacion");
			}
		}

	}

}
