
package pe.bf.ws.mail;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.bf.ws.mail package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnviaSimulacionPV_QNAME = new QName("http://ws.mail.bf.pe/", "enviaSimulacionPV");
    private final static QName _EnviaSimulacionPVResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviaSimulacionPVResponse");
    private final static QName _EnviarMailAutonomia_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailAutonomia");
    private final static QName _EnviarMailResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailResponse");
    private final static QName _EnviarMailNotificacionResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailNotificacionResponse");
    private final static QName _EnviarMailMonitoreoReclamosResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailMonitoreoReclamosResponse");
    private final static QName _EnviarMail_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMail");
    private final static QName _EnviarMailAutonomiaResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailAutonomiaResponse");
    private final static QName _EnviarMailMonitoreoReclamos_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailMonitoreoReclamos");
    private final static QName _EnviarMailBloqueoDefinitivoResponse_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailBloqueoDefinitivoResponse");
    private final static QName _EnviarMailNotificacion_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailNotificacion");
    private final static QName _EnviarMailBloqueoDefinitivo_QNAME = new QName("http://ws.mail.bf.pe/", "enviarMailBloqueoDefinitivo");
    private final static QName _EnviarMailArchivo_QNAME = new QName("", "archivo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.bf.ws.mail
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnviarMailMonitoreoReclamos }
     * 
     */
    public EnviarMailMonitoreoReclamos createEnviarMailMonitoreoReclamos() {
        return new EnviarMailMonitoreoReclamos();
    }

    /**
     * Create an instance of {@link EnviarMailAutonomiaResponse }
     * 
     */
    public EnviarMailAutonomiaResponse createEnviarMailAutonomiaResponse() {
        return new EnviarMailAutonomiaResponse();
    }

    /**
     * Create an instance of {@link EnviarMailNotificacion }
     * 
     */
    public EnviarMailNotificacion createEnviarMailNotificacion() {
        return new EnviarMailNotificacion();
    }

    /**
     * Create an instance of {@link EnviarMailBloqueoDefinitivoResponse }
     * 
     */
    public EnviarMailBloqueoDefinitivoResponse createEnviarMailBloqueoDefinitivoResponse() {
        return new EnviarMailBloqueoDefinitivoResponse();
    }

    /**
     * Create an instance of {@link EnviarMailBloqueoDefinitivo }
     * 
     */
    public EnviarMailBloqueoDefinitivo createEnviarMailBloqueoDefinitivo() {
        return new EnviarMailBloqueoDefinitivo();
    }

    /**
     * Create an instance of {@link EnviaSimulacionPVResponse }
     * 
     */
    public EnviaSimulacionPVResponse createEnviaSimulacionPVResponse() {
        return new EnviaSimulacionPVResponse();
    }

    /**
     * Create an instance of {@link EnviarMailAutonomia }
     * 
     */
    public EnviarMailAutonomia createEnviarMailAutonomia() {
        return new EnviarMailAutonomia();
    }

    /**
     * Create an instance of {@link EnviaSimulacionPV }
     * 
     */
    public EnviaSimulacionPV createEnviaSimulacionPV() {
        return new EnviaSimulacionPV();
    }

    /**
     * Create an instance of {@link EnviarMailNotificacionResponse }
     * 
     */
    public EnviarMailNotificacionResponse createEnviarMailNotificacionResponse() {
        return new EnviarMailNotificacionResponse();
    }

    /**
     * Create an instance of {@link EnviarMailResponse }
     * 
     */
    public EnviarMailResponse createEnviarMailResponse() {
        return new EnviarMailResponse();
    }

    /**
     * Create an instance of {@link EnviarMailMonitoreoReclamosResponse }
     * 
     */
    public EnviarMailMonitoreoReclamosResponse createEnviarMailMonitoreoReclamosResponse() {
        return new EnviarMailMonitoreoReclamosResponse();
    }

    /**
     * Create an instance of {@link EnviarMail }
     * 
     */
    public EnviarMail createEnviarMail() {
        return new EnviarMail();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviaSimulacionPV }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviaSimulacionPV")
    public JAXBElement<EnviaSimulacionPV> createEnviaSimulacionPV(EnviaSimulacionPV value) {
        return new JAXBElement<EnviaSimulacionPV>(_EnviaSimulacionPV_QNAME, EnviaSimulacionPV.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviaSimulacionPVResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviaSimulacionPVResponse")
    public JAXBElement<EnviaSimulacionPVResponse> createEnviaSimulacionPVResponse(EnviaSimulacionPVResponse value) {
        return new JAXBElement<EnviaSimulacionPVResponse>(_EnviaSimulacionPVResponse_QNAME, EnviaSimulacionPVResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailAutonomia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailAutonomia")
    public JAXBElement<EnviarMailAutonomia> createEnviarMailAutonomia(EnviarMailAutonomia value) {
        return new JAXBElement<EnviarMailAutonomia>(_EnviarMailAutonomia_QNAME, EnviarMailAutonomia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailResponse")
    public JAXBElement<EnviarMailResponse> createEnviarMailResponse(EnviarMailResponse value) {
        return new JAXBElement<EnviarMailResponse>(_EnviarMailResponse_QNAME, EnviarMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailNotificacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailNotificacionResponse")
    public JAXBElement<EnviarMailNotificacionResponse> createEnviarMailNotificacionResponse(EnviarMailNotificacionResponse value) {
        return new JAXBElement<EnviarMailNotificacionResponse>(_EnviarMailNotificacionResponse_QNAME, EnviarMailNotificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailMonitoreoReclamosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailMonitoreoReclamosResponse")
    public JAXBElement<EnviarMailMonitoreoReclamosResponse> createEnviarMailMonitoreoReclamosResponse(EnviarMailMonitoreoReclamosResponse value) {
        return new JAXBElement<EnviarMailMonitoreoReclamosResponse>(_EnviarMailMonitoreoReclamosResponse_QNAME, EnviarMailMonitoreoReclamosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMail")
    public JAXBElement<EnviarMail> createEnviarMail(EnviarMail value) {
        return new JAXBElement<EnviarMail>(_EnviarMail_QNAME, EnviarMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailAutonomiaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailAutonomiaResponse")
    public JAXBElement<EnviarMailAutonomiaResponse> createEnviarMailAutonomiaResponse(EnviarMailAutonomiaResponse value) {
        return new JAXBElement<EnviarMailAutonomiaResponse>(_EnviarMailAutonomiaResponse_QNAME, EnviarMailAutonomiaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailMonitoreoReclamos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailMonitoreoReclamos")
    public JAXBElement<EnviarMailMonitoreoReclamos> createEnviarMailMonitoreoReclamos(EnviarMailMonitoreoReclamos value) {
        return new JAXBElement<EnviarMailMonitoreoReclamos>(_EnviarMailMonitoreoReclamos_QNAME, EnviarMailMonitoreoReclamos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailBloqueoDefinitivoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailBloqueoDefinitivoResponse")
    public JAXBElement<EnviarMailBloqueoDefinitivoResponse> createEnviarMailBloqueoDefinitivoResponse(EnviarMailBloqueoDefinitivoResponse value) {
        return new JAXBElement<EnviarMailBloqueoDefinitivoResponse>(_EnviarMailBloqueoDefinitivoResponse_QNAME, EnviarMailBloqueoDefinitivoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailNotificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailNotificacion")
    public JAXBElement<EnviarMailNotificacion> createEnviarMailNotificacion(EnviarMailNotificacion value) {
        return new JAXBElement<EnviarMailNotificacion>(_EnviarMailNotificacion_QNAME, EnviarMailNotificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarMailBloqueoDefinitivo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.mail.bf.pe/", name = "enviarMailBloqueoDefinitivo")
    public JAXBElement<EnviarMailBloqueoDefinitivo> createEnviarMailBloqueoDefinitivo(EnviarMailBloqueoDefinitivo value) {
        return new JAXBElement<EnviarMailBloqueoDefinitivo>(_EnviarMailBloqueoDefinitivo_QNAME, EnviarMailBloqueoDefinitivo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "archivo", scope = EnviarMail.class)
    public JAXBElement<byte[]> createEnviarMailArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarMailArchivo_QNAME, byte[].class, EnviarMail.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "archivo", scope = EnviarMailAutonomia.class)
    public JAXBElement<byte[]> createEnviarMailAutonomiaArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarMailArchivo_QNAME, byte[].class, EnviarMailAutonomia.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "archivo", scope = EnviarMailMonitoreoReclamos.class)
    public JAXBElement<byte[]> createEnviarMailMonitoreoReclamosArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarMailArchivo_QNAME, byte[].class, EnviarMailMonitoreoReclamos.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "archivo", scope = EnviarMailNotificacion.class)
    public JAXBElement<byte[]> createEnviarMailNotificacionArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarMailArchivo_QNAME, byte[].class, EnviarMailNotificacion.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "archivo", scope = EnviarMailBloqueoDefinitivo.class)
    public JAXBElement<byte[]> createEnviarMailBloqueoDefinitivoArchivo(byte[] value) {
        return new JAXBElement<byte[]>(_EnviarMailArchivo_QNAME, byte[].class, EnviarMailBloqueoDefinitivo.class, ((byte[]) value));
    }

}
