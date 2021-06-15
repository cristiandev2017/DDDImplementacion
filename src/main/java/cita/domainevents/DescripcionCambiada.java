package cita.domainevents;

import cita.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionCambiada extends DomainEvent {
    private final Descripcion descripcion;
    public DescripcionCambiada(Descripcion descripcion){
        super("sofka.cita.descripcion");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion(){
        return descripcion;
    }
}
