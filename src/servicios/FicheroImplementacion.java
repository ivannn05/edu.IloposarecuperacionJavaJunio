package servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import controladores.Inicio;
import dtos.PropietarioDto;
import dtos.VehiculoDto;
import utilidades.Util;

/**
 * Implementacion encargada de contener los metodos encargados de fichero
 */
public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ficheroLog(String mensaje) {
		String ruta = "C:\\Users\\csi23-iloposa\\Desktop\\log-".concat(Util.nombreFicheroLog()).concat(".txt");
		try {
			BufferedWriter escribe = new BufferedWriter(new FileWriter(ruta, true));
			escribe.write(mensaje.concat("\n"));
			escribe.close();
		} catch (IOException e) {
			System.out.println("Ocuriio un error en el fichero log");
		}

	}

	@Override
	public void cargaDeFichero() {
		String ruta = "C:\\Users\\csi23-iloposa\\Desktop\\vehiculosYpropietarios.txt";
		try {
			BufferedReader lee = new BufferedReader(new FileReader(ruta));
			String linea;
			while ((linea = lee.readLine()) != null) {
				if (linea.indexOf(":") != -1) {
					PropietarioDto propietario = new PropietarioDto();
					String[] arrayLineas = linea.split(":");
					Long idVehiculos = Util.generacionIdVehiculos();
					String matricula = arrayLineas[0];
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					LocalDate fechaMatriculacion = LocalDate.parse(arrayLineas[1], formato);
					propietario.setId(Util.generacionIdPropietarios());
					propietario.setDni(arrayLineas[2]);
					LocalDate fechaCompra = LocalDate.parse(arrayLineas[3], formato);
					propietario.setFchCompra(fechaCompra);
					propietario.setMatricula(matricula);

					int dia = fechaMatriculacion.getDayOfMonth();
					int mes = fechaMatriculacion.getMonthValue();
					int year = fechaMatriculacion.getYear() + 25;
					LocalDate fechaMatriculacionMasAnios = LocalDate.of(year, mes, dia);
					if (LocalDate.now().compareTo(fechaMatriculacionMasAnios) == 0||LocalDate.now().compareTo(fechaMatriculacionMasAnios) > 0) {
						propietario.setEsHistorico(true);

					}
					VehiculoDto vehiculo = new VehiculoDto(idVehiculos, matricula, fechaMatriculacion);
					Inicio.listaVehiculos.add(vehiculo);
					Inicio.listaPropietarios.add(propietario);
				}
			}

		} catch (Exception e) {
			ficheroLog("Ocurrio un error en la carga de fichero Error: ".concat(e.getMessage()));
			System.out.println("Ocurrio un error en la carga de fichero");
		}

	}

}
