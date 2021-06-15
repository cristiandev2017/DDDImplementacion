package cita;

import cita.domainevents.CitaCreada;
import cita.values.CitaId;
import cita.values.Descripcion;
import cita.values.Fecha;
import cita.values.HoraCita;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import medico.Medico;
import medico.MedicoChange;
import medico.values.MedicoId;


import java.util.List;
import java.util.Set;

public class Cita extends AggregateEvent<CitaId>{
    protected Fecha fecha;
    protected HoraCita horaCita;
    //Entidades Hijas
    protected Descripcion descripcion;
    protected Set<Servicio> servicios;
    protected Set<Factura> facturas;
    //Con este asociamos el agregado asociado
    protected CitaId citaId;

    public Cita(CitaId entityId){
        super(entityId);
    }

    //Agregar o crear cita
    public Cita(CitaId entityId, Descripcion descripcion, Fecha fecha, HoraCita horaCita){
        super(entityId);
        appendChange(new CitaCreada(descripcion,fecha,horaCita)).apply();
    }

    /*
    //Factoria
    public static Cita from(CitaId citaId, List<DomainEvent> events){
        var cita = new Cita(citaId);
        events.forEach(cita::applyEvent);
        return cita;
    }

    //Constructor privado para los estados
    private Cita(CitaId entityId){
        super(entityId);
        //Se realiza una suscripcion de los eventos
        subscribe(new CitaChange(this));
    }

     */

}
