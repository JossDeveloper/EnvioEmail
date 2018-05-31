package pe.bf.mail.ejb;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import pe.bf.bean.Email;
import pe.bf.bean.Respuesta;
import pe.bf.bean.Simulacion;
import java.util.*;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.naming.*;
import javax.servlet.http.HttpServletRequest;

@Stateless
public class EmailEJB {

	private static Logger logger = Logger.getLogger(EmailEJB.class);
	
	@Resource(name = "mail/autonomia")
	private Session mailSessionAutonomia;
	
	@Resource(name = "mail/bloqueodefinitivo")
	private Session mailSessionBloqueoDefinitivo;
	
	@Resource(name = "mail/notificacion")
	private Session mailSessionNotificacion;
	
	public Respuesta enviarMailAutonomia(Email email) {
		Respuesta respuesta = new Respuesta();
		respuesta = enviarMail(email, mailSessionAutonomia) ;
		return respuesta;
	}
		
	public Respuesta enviarMailBloqueoDefinitivo(Email email) {
		Respuesta respuesta = new Respuesta();
		respuesta = enviarMail(email, mailSessionBloqueoDefinitivo) ;
		return respuesta;
	}
	
	public Respuesta enviarMailNotificacion(Email email) {
		Respuesta respuesta = new Respuesta();
		respuesta = enviarMail(email, mailSessionNotificacion) ;
		return respuesta;
	}
	
	/**
	 * @param email
	 * @return respuesta de envio de Email
	 */
	public Respuesta enviarMail(Email email, Session mailSession) {
		logger.info("Enviando email");
		Respuesta respuesta = new Respuesta();

		Message msg = new MimeMessage(mailSession);
		try {
			msg.setSubject(email.getAsunto());
			//To
			if(email.getTo() != null){
				InternetAddress[] addressTo = new InternetAddress[email.getTo().length];
				for (int i = 0; i < addressTo.length; i++) {
					addressTo[i] = new InternetAddress(email.getTo()[i]);
				}
				msg.setRecipients(RecipientType.TO, addressTo);
			}
			//Cc
			if(email.getCc() != null){
				InternetAddress[] addressCc = new InternetAddress[email.getCc().length];
				for (int i = 0; i < addressCc.length; i++) {
					addressCc[i] = new InternetAddress(email.getCc()[i]);
				}
				msg.setRecipients(RecipientType.CC, addressCc);
			}
			
			//Bcc
			if(email.getBcc() != null){
				InternetAddress[] addressBcc = new InternetAddress[email.getBcc().length];
				for (int i = 0; i < addressBcc.length; i++) {
					addressBcc[i] = new InternetAddress(email.getBcc()[i]);
				}
				msg.setRecipients(RecipientType.BCC, addressBcc);
			}
			Multipart mp = new MimeMultipart();
	        MimeBodyPart htmlPart = new MimeBodyPart();
	        htmlPart.setContent(email.getMensaje(), "text/html");
	        mp.addBodyPart(htmlPart);
	        //Attachment
	        if(email.getNombreArchivo() != null && email.getArchivo() != null){
	        	MimeBodyPart attachment = new MimeBodyPart();
		        attachment.setFileName(email.getNombreArchivo());
		        attachment.setContent(email.getArchivo(), "application/pdf");
		        mp.addBodyPart(attachment);
	        }
	        msg.setContent(mp);
			//msg.setText(email.getMensaje());
			Transport.send(msg);
			respuesta.setRespuesta("1");
			respuesta.setDescripcion("Email enviado correctamente.");
			logger.info("Mensaje enviado");
		} catch (MessagingException me) {
			respuesta.setRespuesta("0");
			respuesta.setDescripcion(me.getMessage());
			logger.error(me.getMessage(),me.fillInStackTrace());
		} catch (Exception e) {
			respuesta.setRespuesta("0");
			respuesta.setDescripcion(e.getMessage());
			logger.error(e.getMessage(),e.fillInStackTrace());
		}
		return respuesta;
	}

	public Respuesta enviaSimulacionPV(Simulacion simulacion) {
		
		String[] to = new String[1];
		to[0] = simulacion.getEmail();
		
		String[] bcc = new String[1];
		bcc[0] = "myemail@company.com.pe";
		
		StringBuilder cadena = new StringBuilder("");
		cadena.append("Nombre: ").
		append(simulacion.getNombre()).
		append("DNI: ").
		append(simulacion.getDni()).
		append("Telefono: ").
		append(simulacion.getTelefono()).
		append("Simulacion: ").
		append(simulacion.getSimulacion());
		
		Email email = new Email();
		email.setTo(to);
		email.setBcc(bcc);
		email.setAsunto("ASUNTO PREDEFINIDO");
		email.setMensaje(cadena.toString());
		
		return enviarMailCreditoEfectivo(email);
	}
	
}
