package medico.domainevents;

import medico.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;
import medico.values.EspecialidadId;

public class DescripcionEspecialidadActualizada extends DomainEvent {
    private final EspecialidadId entityId;
    private final Descripcion descripcion;

    public DescripcionEspecialidadActualizada(EspecialidadId entityId, Descripcion descripcion){
        super("sofka.medico.caracteristicaespecialidadactualizada");
        this.entityId = entityId;
        this.descripcion = descripcion;
    }
    public Descripcion getDescripcion(){
        return descripcion;
    }

    public EspecialidadId getEspecialidadId(){
        return entityId;
    }
}
