package cl.clubhipico.clubhipico_francisco;

import cl.clubhipico.clubhipico_francisco.object.CaballoObject;
import cl.clubhipico.clubhipico_francisco.object.JineteObject;
import cl.clubhipico.clubhipico_francisco.object.PersonaObject;
import cl.clubhipico.clubhipico_francisco.object.enums.SexoEnum;
import cl.clubhipico.clubhipico_francisco.util.ClubHipicoUtil;
import cl.clubhipico.clubhipico_francisco.util.ClubHipicoUtilNoStatic;

public class ClubHipicoArregloMain {

	public static void main(String[] args) {
		
		JineteObject jinete = new JineteObject();
		jinete.setNombre("Francisco");
		
		CaballoObject caballo = new CaballoObject();
		caballo.setNombre("Juanito");
		
		PersonaObject persona = new PersonaObject();
		persona.setNombre("Andres");
		
		ClubHipicoUtil.montar(jinete, caballo);
		ClubHipicoUtil.montar(persona, caballo);
		
		//Arreglo Jinetes 
		//1 - Declarar el arreglo con un tipo y tamano
		JineteObject[] jinetesArray = new JineteObject[3];
		//2 - Instancias cada una de las posiciones
		jinetesArray[0]=new JineteObject();
		jinetesArray[1]=new JineteObject();
		jinetesArray[2]=new JineteObject();
		
		//3 - Manipulas - llenas con informacion o usas funciones / metodos
		jinetesArray[0].setNombre("Pepito");
		jinetesArray[1].setNombre("Juanito");
		jinetesArray[2].setNombre("Pedrito");
		
		jinetesArray[0].setSexo(SexoEnum.FEMININO);
		
		//Otra forma de instanciar el arreglo
		CaballoObject[] caballosArray = {caballo, caballo, caballo};
		
		ClubHipicoUtil.montar(jinetesArray, caballosArray);
		
		ClubHipicoUtilNoStatic util = new ClubHipicoUtilNoStatic();
		util.montar(jinetesArray, caballosArray);
		
	}
}
