package medico.domainevents;

import cita.values.CitaId;
import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Caracteristica;

public class CitaAsociada extends DomainEvent {
    private final CitaId citaId;
    public CitaAsociada(CitaId citaId){
        super("sofka.medico.citaasociada");
        this.citaId = citaId;
    }

    public CitaId getCitaId(){
        return citaId;
    }
}
