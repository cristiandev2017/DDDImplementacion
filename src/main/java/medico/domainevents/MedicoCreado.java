package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Direccion;
import medico.values.Nombre;
import medico.values.Telefono;

//Evento de dominio
public class MedicoCreado extends DomainEvent {
    private final Nombre nombre;
    protected Telefono telefono;
    protected Direccion direccion;
    //Se le define lo que me servira para crearlo
    public MedicoCreado(Nombre nombre, Telefono telefono,Direccion direccion){
        //Se define el dominio que seria sofka luego el agregado y el nombre del evento de dominio
        super("sofka.medico.medicocreado");
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public Telefono getTelefono(){return telefono;}

    public Direccion getDireccion(){return direccion;}
}
