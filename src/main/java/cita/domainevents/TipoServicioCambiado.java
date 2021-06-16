package cita.domainevents;

import cita.values.ServicioId;
import cita.values.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class TipoServicioCambiado extends DomainEvent {
    private final ServicioId servicioId;
    private final TipoServicio tipoServicio;

    public TipoServicioCambiado(ServicioId servicioId, TipoServicio tipoServicio){
        super("sofka.cita.tiposerviciocambiado");
        this.servicioId = servicioId;
        this.tipoServicio = tipoServicio;
    }
    public TipoServicio getTipoServicio(){
        return tipoServicio;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }
}
