package cita.domainevents;

import cita.values.ServicioId;
import cita.values.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoServicioCambiado extends DomainEvent {
    private final ServicioId entityId;

    private final TipoServicio tipoServicio;

    public TipoServicioCambiado(ServicioId entityId, TipoServicio tipoServicio){
        super("sofka.cita.tiposerviciocambiado");
        this.entityId = entityId;
        this.tipoServicio = tipoServicio;
    }
    public TipoServicio getTipoServicio(){
        return tipoServicio;
    }

    public ServicioId getEntityId() {
        return entityId;
    }
}
