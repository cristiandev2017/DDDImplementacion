package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;

public class CaracteristicaEspecialidadActualizada extends DomainEvent {
    private final EspecialidadId entityId;
    private final Caracteristica caracteristica;

    public CaracteristicaEspecialidadActualizada(EspecialidadId entityId, Caracteristica caracteristica){
        super("sofka.medico.caracteristicaespecialidadactualizada");
        this.entityId = entityId;
        this.caracteristica = caracteristica;
    }
    public Caracteristica getCaracteristica(){
        return caracteristica;
    }

    public EspecialidadId getEspecialidadId(){
        return entityId;
    }
}
