package cl.clubhipico.clubhipico_francisco.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class DocumentoCSV {
	
	public static List<HashMap<String,Object>> readFile(String pathFile, String[] nombreColumnas) throws FileNotFoundException{
		String csvFile = pathFile;
		String line = "";
		String cvsSplitBy = ";";
		List<HashMap<String,Object>> listaArhivo = new ArrayList<HashMap<String,Object>> ();

		try {
				
			BufferedReader br = new BufferedReader(new FileReader(csvFile)); 
			while ((line = br.readLine()) != null) {
				// use comma como separador
				String[] values = line.split(cvsSplitBy);

				//se debe obtener registro para dejarlo en lista de hashMap
				HashMap<String,Object> hm = new HashMap<String,Object>();

				for (int j=0; j< nombreColumnas.length && j<values.length; j++){

					@SuppressWarnings("unused")
					Object valor = values[j];
					
					if (ValidateType.isNumber(values[j])){
						values[j] = values[j].replaceAll("\"", "");
						valor = values[j];
						hm.put(nombreColumnas[j], Integer.valueOf(values[j]));
					}else{
						values[j] = values[j].replaceAll("\"", "");
						valor = values[j];
						hm.put(nombreColumnas[j], String.valueOf(values[j]));
					}
						
				}
				listaArhivo.add(hm);				
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return listaArhivo;
	}
	
}