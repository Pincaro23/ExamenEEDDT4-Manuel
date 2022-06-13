package Tema2;

import java.io.File;
import java.io.FileWriter;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		String usuario = "manuel";
		int pass = 123456;
		
		String UsuarioMayus = usuario.toUpperCase();
		String spass = Integer.toString(pass);
		
		try {
			File archivo = new File("texto.txt");
			FileWriter escribir = new FileWriter(archivo, true);
			escribir.write(UsuarioMayus);
			escribir.write(spass);
			escribir.close();
		}
		catch (Exception e) {
			System.out.println("Error al escribir");
		}
		

	}

}
