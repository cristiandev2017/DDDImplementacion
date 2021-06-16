package cita.commands;

import cita.values.CitaId;
import cita.values.Descripcion;
import cita.values.Fecha;
import cita.values.HoraCita;
import co.com.sofka.domain.generic.Command;


public class CrearCita implements Command {
    private final CitaId entityId;
    private final Descripcion descripcion;
    private final Fecha fecha;
    private final HoraCita horaCita;

    public CrearCita(CitaId entityId, Descripcion descripcion, Fecha fecha, HoraCita horaCita){
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaCita = horaCita;
    }

    public CitaId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public HoraCita getHoraCita() {
        return horaCita;
    }
}
