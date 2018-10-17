package cl.clubhipico.clubhipico_francisco.util;

public class ValidateType {

	public  static boolean isNumber(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}