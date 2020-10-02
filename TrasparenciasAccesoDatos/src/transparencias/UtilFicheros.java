package transparencias;

import java.io.File;
import java.io.IOException;

public class UtilFicheros {

	public static File abrirFichero(String ruta) {
		
		File archivoUno = new File(ruta);
		if(archivoUno.exists()) {
			return archivoUno;
			
		}
		
		else return null;
	}
	
	public static File crearFichero(String ruta) {
	
		File archivoUno = new File(ruta);
		if(archivoUno.exists()) {
			return null;
		}
		
		else{
			
		try {
			archivoUno.createNewFile();
			
			return archivoUno;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;
			}
		
		} 
		
		
	} //Cierre crear fichero
	
	new
		
}
