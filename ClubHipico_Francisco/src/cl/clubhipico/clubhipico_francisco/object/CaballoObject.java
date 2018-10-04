package cl.clubhipico.clubhipico_francisco.object;

import cl.clubhipico.clubhipico_francisco.object.enums.SexoEnum;

public class CaballoObject {

	private String nombre;
	private String rut;
	private double peso;
	private SexoEnum sexo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public SexoEnum getSexo() {
		return sexo;
	}
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	
	
}
