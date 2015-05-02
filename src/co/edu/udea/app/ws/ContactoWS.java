package co.edu.udea.app.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.app.dto.Contacto;

@Path("contacto")
public class ContactoWS {
	
	public ContactoWS() {
        super();
        this.misContactos=new ArrayList<Contacto>();
        Contacto nuevoContacto=new Contacto(1,"Jorge","Cazorla","jorge@gmail.com");
        
        Contacto contacto2= new Contacto(2, "Pedro", "Perez", "pedro@gmail.com");
        Contacto contacto3= new Contacto(3, "Carlos", "Figueroa", "carlos@gmail.com");
        
        misContactos.add(nuevoContacto);
        misContactos.add(contacto2);
        misContactos.add(contacto3);
    }
	
	private List<Contacto> misContactos = new ArrayList<Contacto>();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Path("/contactos")
	public List<Contacto> obtenerTodosLosContactos(){
		return misContactos;
	}

}
