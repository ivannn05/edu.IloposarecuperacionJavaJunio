
package dtos;

import java.time.LocalDate;

/**
 * Dto encargado de conterner los datos de los vehiculos
 */
public class VehiculoDto {
	// Atributos
	
	long id;
	String matriculaString = "aaaa";
	LocalDate fchMatriculacion = LocalDate.of(9999, 12, 31);

	//Constructores
	public VehiculoDto() {
		super();
	}

	public VehiculoDto(long id, String matriculaString, LocalDate fchMatriculacion) {
		super();
		this.id = id;
		this.matriculaString = matriculaString;
		this.fchMatriculacion = fchMatriculacion;
	}

//Getters Y Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMatriculaString() {
		return matriculaString;
	}

	public void setMatriculaString(String matriculaString) {
		this.matriculaString = matriculaString;
	}

	public LocalDate getFchMatriculacion() {
		return fchMatriculacion;
	}

	public void setFchMatriculacion(LocalDate fchMatriculacion) {
		this.fchMatriculacion = fchMatriculacion;
	}
	
	@Override
	public String toString() {
		String datos="[VEH] ".concat(matriculaString).concat(" ");
		return datos;
	}
}
