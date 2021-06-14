package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Nombre;

public class NombreCambiado  extends DomainEvent {
    private final Nombre nombre;
    public NombreCambiado(Nombre nombre){
        super("sofka.medico.nombre");
        this.nombre = nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
