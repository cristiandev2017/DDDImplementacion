package cita;

import cita.values.CitaId;
import cita.values.Fecha;
import cita.values.HoraCita;
import co.com.sofka.domain.generic.AggregateEvent;

public class Cita extends AggregateEvent<CitaId>{
    protected Fecha fecha;
    protected HoraCita horaCita;

    public Cita(CitaId entityId){
        super(entityId);
    }

}
