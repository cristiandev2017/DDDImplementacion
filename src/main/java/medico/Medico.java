package medico;

import cita.values.CitaId;
import co.com.sofka.domain.generic.AggregateEvent;
import medico.events.MedicoCreado;
import medico.values.MedicoId;
import medico.values.Nombre;

import java.util.Set;

public class Medico extends AggregateEvent<MedicoId> {
    //En este se definen el valor agregado
    protected Nombre nombre;
    //Aca estamos llamando a la entidad hija
    protected Set<Especialidad> especialidads;
    //on este asociamos el agregado asociado
    protected CitaId citaId;


    public Medico(MedicoId entityId, Nombre nombre){
        super(entityId);
        appendChange(new MedicoCreado(nombre)).apply();
    }

    //

}
