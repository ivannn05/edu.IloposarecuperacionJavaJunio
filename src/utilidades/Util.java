package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;

/*
 * Clase encargada de contener la informacion de los metodos usados en algunos funcionalidades de la app
 */
public class Util {
	/**
	 * Metodo encargado de crear el nombre del fichero Log
	 * 
	 * @return
	 */
	public static String nombreFicheroLog() {
		String nombre;
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("ddMMyyyy");
		nombre = fecha.format(formato);
		return nombre;
	}

	/**
	 * Metodo que genera la id de los vehiculos
	 * 
	 * @return
	 */
	public static Long generacionIdVehiculos() {
		long id;
		if (Inicio.listaVehiculos.size() == 0) {
			id = 100;
		} else {
			int tamanio = Inicio.listaVehiculos.size() - 1;
			id = 100 - tamanio;

		}

		return id;
	}

	/**
	 * Metodo que genera la id de los propietarios
	 * 
	 * @return
	 */
	public static Long generacionIdPropietarios() {
		long id;
		if (Inicio.listaPropietarios.size() == 0) {
			id = 100;
		} else {
			int tamanio = Inicio.listaPropietarios.size() - 1;
			id = 100 - tamanio;

		}

		return id;
	}

}
