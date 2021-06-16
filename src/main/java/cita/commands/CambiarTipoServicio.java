package cita.commands;

import cita.values.*;
import co.com.sofka.domain.generic.Command;

public class CambiarTipoServicio implements Command {
    private final CitaId citaId;
    private final ServicioId entityId;
    private final TipoServicio tipoServicio;

    public CambiarTipoServicio(CitaId citaId, ServicioId entityId, TipoServicio tipoServicio){
        this.citaId = citaId;
        this.entityId = entityId;
        this.tipoServicio = tipoServicio;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public ServicioId getEntityId() {
        return entityId;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
}
