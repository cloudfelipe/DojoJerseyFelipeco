package co.edu.udea.app.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="contact")
public class Contacto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;
	private String correo;
	private int id;
	
	public Contacto() {
		super();
	}
	
	public Contacto( int id, String nombre, String apellido, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
