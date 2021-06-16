package cita.commands;

import cita.values.CitaId;
import cita.values.Descripcion;
import co.com.sofka.domain.generic.Command;

public class CambiarDescripcion implements Command {
    private final CitaId citaId;
    private final Descripcion descripcion;

    public CambiarDescripcion(CitaId citaId, Descripcion descripcion){
        this.citaId = citaId;
        this.descripcion = descripcion;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
