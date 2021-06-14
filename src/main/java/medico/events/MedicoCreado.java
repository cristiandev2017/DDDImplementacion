package medico.events;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Nombre;

//Evento de dominio
public class MedicoCreado extends DomainEvent {
    private final Nombre nombre;
    //Se le define lo que me servira para crearlo
    public MedicoCreado(Nombre nombre){
        //Se define el dominio que seria sofka luego el agregado y el nombre del evento de dominio
        super("sofka.medico.medicocreado");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
