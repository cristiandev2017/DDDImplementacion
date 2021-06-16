package cita.commands;

import cita.values.*;
import co.com.sofka.domain.generic.Command;

public class CrearServicio implements Command {
    private final CitaId citaId;
    private final ServicioId entityId;
    private final Descripcion descripcion;
    private final TipoServicio tipoServicio;

    public CrearServicio(CitaId citaId, ServicioId entityId, Descripcion descripcion,TipoServicio tipoServicio){
        this.citaId = citaId;
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public ServicioId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
}
