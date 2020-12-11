package excepciones;

public class ConversionNumeroExcepcion extends Exception{
	
	private static final long serialVersionUID = 1L;
	private String mensaje;
	
	public ConversionNumeroExcepcion (String mensajeSuper, String mensaje) {
        super(mensajeSuper);
        this.mensaje = mensaje; 
    }
	
	public String getMensaje() {
		return mensaje;
	}

}
