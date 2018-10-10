package cl.clubhipico.clubhipico_francisco.util;

import cl.clubhipico.clubhipico_francisco.object.CaballoObject;
import cl.clubhipico.clubhipico_francisco.object.JineteObject;
import cl.clubhipico.clubhipico_francisco.object.PersonaObject;
import cl.clubhipico.clubhipico_francisco.object.enums.SexoEnum;

/*Clase utilitario con metodos static*/
public class ClubHipicoUtil {

	public static void montar(JineteObject jinete, CaballoObject caballo) {
		jinete.setCaballo(caballo);
		System.out.println("Jinete "+jinete.getNombre()+ " se monta en caballo "+ caballo.getNombre());
	}
	
	/*Existe una sobrecarga de metodo con respecto al montar Jinete*/
	public static void montar(PersonaObject persona, CaballoObject caballo) {
		System.out.println("Persona "+persona.getNombre()+ " NO se puede montar en caballo "+ caballo.getNombre());
	}
	
	/*Existe una sobrecarga del metodo montar, recibiendo arreglos de jinetes y caballos*/
	public static void montar(JineteObject[] jinetes, CaballoObject[] caballos) {

		//Validacion
		//Condicional if
		if (jinetes.length==caballos.length) {
			System.out.println("Se han recibido "+jinetes.length+ " jinetes y "+caballos.length+ " caballos");
		
			//Se evalua el arreglo, no un jinete.
			if (jinetes.length==0) {
				System.out.println("Por lo menos se requiere un jinete y un caballo...");
			}
			
			//Accedemos al primer jinete y evaluamos que no sea sexo Masculino, por regla de negocio
			if (jinetes[0].getSexo()!=SexoEnum.MASCULINO) {
				System.out.println("El primer jinete tiene que ser de sexo Masculino...");
			}
			
			
			
		}else {
			System.out.println("La cantidad de jinetes y caballos no coincide...");
		}
		
		
		
		
		
	}
	
}
