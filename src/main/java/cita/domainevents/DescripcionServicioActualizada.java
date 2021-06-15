package cita.domainevents;

import cita.values.Descripcion;
import cita.values.ServicioId;
import co.com.sofka.domain.generic.DomainEvent;

public class DescripcionServicioActualizada extends DomainEvent {
    private final ServicioId entityId;

    private final Descripcion descripcion;

    public DescripcionServicioActualizada(ServicioId entityId, Descripcion descripcion){
        super("sofka.cita.descripcionservicioactualizada");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }
    public Descripcion getDescripcionServicio(){
        return descripcion;
    }

    public ServicioId getEntityId() {
        return entityId;
    }


}
