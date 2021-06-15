package cita.domainevents;

import cita.values.Descripcion;
import cita.values.Fecha;
import cita.values.HoraCita;
import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Direccion;
import medico.values.Nombre;
import medico.values.Telefono;

public class CitaCreada extends DomainEvent {
    private final Descripcion descripcion;
    private final Fecha fecha;
    private final HoraCita horaCita;

    public CitaCreada(Descripcion descripcion, Fecha fecha,HoraCita horaCita){
        super("sofka.cita.citacreada");
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.horaCita = horaCita;
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
