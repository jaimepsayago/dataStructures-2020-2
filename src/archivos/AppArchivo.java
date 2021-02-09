package archivos;

public class AppArchivo {
	public static void main(String[] args) {

		Archivo archivo = new Archivo();
		archivo.abrirArchivo();
		archivo.agregarArchivo();
		archivo.cerrarArchivo();
	}

}
