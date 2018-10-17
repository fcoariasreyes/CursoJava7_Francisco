package cl.clubhipico.clubhipico_francisco;

import java.util.List;
import java.io.IOException;
import java.util.HashMap;

import cl.clubhipico.clubhipico_francisco.util.DocumentoCSV;

public class ClubhipicoFileMain {
	
	public static void main(String[] args) {
		
		String path = "/tmp/caballos.csv";
		String[] columnas = {"RUT", "DV", "NOMBRE", "SEXO", "PESO"};
		
		List<HashMap<String, Object>> caballoList;
		
		try {
			
			caballoList = DocumentoCSV.readFile(path, columnas,true);
			
			
			System.out.println("Contenido archivo");
			System.out.println(caballoList);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
