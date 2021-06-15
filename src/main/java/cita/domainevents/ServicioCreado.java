package cita.domainevents;

import cita.values.Descripcion;
import cita.values.ServicioId;
import cita.values.TipoServicio;
import co.com.sofka.domain.generic.DomainEvent;

public class ServicioCreado extends DomainEvent {
    private final ServicioId servicioId;
    private final Descripcion descripcion;
    private final TipoServicio tipoServicio;

    public ServicioCreado(ServicioId servicioId, Descripcion descripcion, TipoServicio tipoServicio){
        super("sofka.cita.serviciocreado");
        this.servicioId = servicioId;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }

    public ServicioId getServicioId() {
        return servicioId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
}
