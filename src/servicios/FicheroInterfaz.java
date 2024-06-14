package servicios;

/**
 * Interfaz enargada de los metodos de fichero
 */
public interface FicheroInterfaz {
	/**
	 * Metodo encargado del fichero log
	 * @param mensaje
	 */
	public void ficheroLog(String mensaje);
	/**
	 * Metodo encargado de la carga de fichero
	 */
	public void cargaDeFichero();

}
