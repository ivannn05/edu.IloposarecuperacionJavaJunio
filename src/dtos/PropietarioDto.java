package dtos;

import java.time.LocalDate;

/**
 * Dto encargado de conterner los datos de los propietarios
 */
public class PropietarioDto {
	// Atributos
	long id;
	LocalDate fchCompra = LocalDate.of(9999, 12, 31);
	String dni = "aaaa";
	String matricula = "aaaa";
	boolean esHistorico = false;

	// Constructores
	public PropietarioDto() {
		super();
	}

	public PropietarioDto(long id, LocalDate fchCompra, String dni, String matricula, boolean esHistorico) {
		super();
		this.id = id;
		this.fchCompra = fchCompra;
		this.dni = dni;
		this.matricula = matricula;
		this.esHistorico = esHistorico;
	}

	// Getters Y Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getFchCompra() {
		return fchCompra;
	}

	public void setFchCompra(LocalDate fchCompra) {
		this.fchCompra = fchCompra;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isEsHistorico() {
		return esHistorico;
	}

	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	@Override
	public String toString() {
		String datos="[PRO] ".concat(dni);
		return datos;
	}
}
