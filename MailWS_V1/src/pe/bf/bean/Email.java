package pe.bf.bean;

import java.io.Serializable;
import java.util.Arrays;

public class Email implements Serializable{

	private String to[];
	private String cc[];
	private String bcc[];
	private String asunto;
	private String mensaje;
	private byte[] archivo;
	private String nombreArchivo;

	@Override
	public String toString() {
		return "Email [to=" + Arrays.toString(to) + ", cc="
				+ Arrays.toString(cc) + ", bcc=" + Arrays.toString(bcc)
				+ ", asunto=" + asunto + ", mensaje=" + mensaje + ", archivo="
				+ Arrays.toString(archivo) + ", nombreArchivo=" + nombreArchivo
				+ "]";
	}

	public String[] getTo() {
		return to;
	}

	public void setTo(String[] to) {
		this.to = to;
	}

	public String[] getCc() {
		return cc;
	}

	public void setCc(String[] cc) {
		this.cc = cc;
	}

	public String[] getBcc() {
		return bcc;
	}

	public void setBcc(String[] bcc) {
		this.bcc = bcc;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getNombreArchivo() {
		return nombreArchivo;
	}

	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}

}
