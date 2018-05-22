package pe.bf.bean;

import java.io.Serializable;

public class Simulacion implements Serializable{

	private String nombre;
	private String email;
	private String simulacion;
	private int dni;
	private String telefono;

	@Override
	public String toString() {
		return "Simulacion [nombre=" + nombre + ", email=" + email
				+ ", simulacion=" + simulacion + ", dni=" + dni + ", telefono="
				+ telefono + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSimulacion() {
		return simulacion;
	}

	public void setSimulacion(String simulacion) {
		this.simulacion = simulacion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
