package pe.bf.bean;

import java.io.Serializable;

public class Respuesta implements Serializable{

	private String respuesta;
	private String descripcion;

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
