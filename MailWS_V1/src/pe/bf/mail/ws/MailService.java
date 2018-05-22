package pe.bf.mail.ws;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.apache.log4j.Logger;
import pe.bf.bean.Email;
import pe.bf.bean.Respuesta;
import pe.bf.bean.Simulacion;
import pe.bf.mail.ejb.EmailEJB;


/**
 * @author 
 * Web Service para envios de emails
 */
@WebService(name = "Mail", serviceName = "MailService", portName = "MailServicePort")
public class MailService {
	
	private static Logger logger = Logger.getLogger(MailService.class);
	
	@EJB
	private EmailEJB emailEJB;

	/**
	 * @param to
	 * @param cc
	 * @param asunto
	 * @param mensaje
	 * @return una respuesta de exito o fracaso.
	 */
	@WebMethod(operationName = "enviarMailAutonomia")
	public @WebResult(name="respuesta")Respuesta enviarMailAutonomia(@WebParam(name = "to") String[] to,
			@WebParam(name = "cc") String[] cc,
			@WebParam(name = "bcc") String[] bcc,
			@WebParam(name = "asunto") String asunto,
			@WebParam(name = "mensaje") String mensaje,
			@WebParam(name = "archivo") byte[] archivo,
			@WebParam(name = "nombreArchivo") String nombreArchivo) {

		logger.info("Invocando al WS enviarMail");
		
		Email email = new Email();
		email.setTo(to);
		email.setCc(cc);
		email.setCc(bcc);
		email.setAsunto(asunto);
		email.setMensaje(mensaje);
		email.setArchivo(archivo);
		email.setNombreArchivo(nombreArchivo);
		logger.info(email.toString());
		
		return emailEJB.enviarMailAutonomia(email);
	}
	
	/**
	 * @param to
	 * @param cc
	 * @param asunto
	 * @param mensaje
	 * @return una respuesta de exito o fracaso.
	 */
	@WebMethod(operationName = "enviarMail")
	public @WebResult(name="respuesta")Respuesta enviarMail(@WebParam(name = "to") String[] to,
			@WebParam(name = "cc") String[] cc,
			@WebParam(name = "bcc") String[] bcc,
			@WebParam(name = "asunto") String asunto,
			@WebParam(name = "mensaje") String mensaje,
			@WebParam(name = "archivo") byte[] archivo,
			@WebParam(name = "nombreArchivo") String nombreArchivo) {

		logger.info("Invocando al WS enviarMail");
		
		Email email = new Email();
		email.setTo(to);
		email.setCc(cc);
		email.setCc(bcc);
		email.setAsunto(asunto);
		email.setMensaje(mensaje);
		email.setArchivo(archivo);
		email.setNombreArchivo(nombreArchivo);

		logger.info(email.toString());
		
		return emailEJB.enviarMailCreditoEfectivo(email);
	}
	
	/**
	 * @param to
	 * @param cc
	 * @param asunto
	 * @param mensaje
	 * @return una respuesta de exito o fracaso.
	 */
	@WebMethod(operationName = "enviarMailMonitoreoReclamos")
	public @WebResult(name="respuesta")Respuesta enviarMailMonitoreoReclamos(@WebParam(name = "to") String[] to,
			@WebParam(name = "cc") String[] cc,
			@WebParam(name = "bcc") String[] bcc,
			@WebParam(name = "asunto") String asunto,
			@WebParam(name = "mensaje") String mensaje,
			@WebParam(name = "archivo") byte[] archivo,
			@WebParam(name = "nombreArchivo") String nombreArchivo) {

		logger.info("Invocando al WS enviarMail");
		
		Email email = new Email();
		email.setTo(to);
		email.setCc(cc);
		email.setCc(bcc);
		email.setAsunto(asunto);
		email.setMensaje(mensaje);
		email.setArchivo(archivo);
		email.setNombreArchivo(nombreArchivo);

		logger.info(email.toString());
		
		return emailEJB.enviarMailMonitoreoReclamos(email);
	}
	
	@WebMethod(operationName = "enviarMailBloqueoDefinitivo")
	public @WebResult(name="respuesta")Respuesta enviarMailBloqueoDefinitivo(@WebParam(name = "to") String[] to,
			@WebParam(name = "cc") String[] cc,
			@WebParam(name = "bcc") String[] bcc,
			@WebParam(name = "asunto") String asunto,
			@WebParam(name = "mensaje") String mensaje,
			@WebParam(name = "archivo") byte[] archivo,
			@WebParam(name = "nombreArchivo") String nombreArchivo) {

		logger.info("Invocando al WS enviarMail");
		
		Email email = new Email();
		email.setTo(to);
		email.setCc(cc);
		email.setCc(bcc);
		email.setAsunto(asunto);
		email.setMensaje(mensaje);
		email.setArchivo(archivo);
		email.setNombreArchivo(nombreArchivo);

		logger.info(email.toString());
		
		return emailEJB.enviarMailBloqueoDefinitivo(email);
	}
	
	/**
	 * @param to
	 * @param cc
	 * @param asunto
	 * @param mensaje
	 * @return una respuesta de exito o fracaso.
	 */
	@WebMethod(operationName = "enviarMailNotificacion")
	public @WebResult(name="respuesta")Respuesta enviarMailNotificacion(
			@WebParam(name = "to") String[] to,
			@WebParam(name = "cc") String[] cc,
			@WebParam(name = "bcc") String[] bcc,
			@WebParam(name = "asunto") String asunto,
			@WebParam(name = "mensaje") String mensaje,
			@WebParam(name = "archivo") byte[] archivo,
			@WebParam(name = "nombreArchivo") String nombreArchivo) {

		logger.info("Invocando al WS enviarMail");
		
		Email email = new Email();
		email.setTo(to);
		email.setCc(cc);
		email.setCc(bcc);
		email.setAsunto(asunto);
		email.setMensaje(mensaje);
		email.setArchivo(archivo);
		email.setNombreArchivo(nombreArchivo);

		logger.info(email.toString());
		
		return emailEJB.enviarMailNotificacion(email);
	}
	
	@WebMethod(operationName = "enviaSimulacionPV")
	public @WebResult(name="respuesta")Respuesta enviaSimulacionPV(@WebParam(name = "email") String email, 
			@WebParam(name = "nombre") String nombre, 
			@WebParam(name = "dni")int dni, 
			@WebParam(name = "telefono")String telefono, 
			@WebParam(name = "mensaje")String mensaje){
		
		logger.info("Invocando al WS enviaSimulacionPV");
		
		Simulacion simulacion = new Simulacion();
		simulacion.setEmail(email);
		simulacion.setSimulacion(mensaje);
		simulacion.setNombre(nombre);
		simulacion.setDni(dni);
		simulacion.setTelefono(telefono);
		
		logger.info(simulacion.toString());
		
		return emailEJB.enviaSimulacionPV(simulacion);
	}
		
}
