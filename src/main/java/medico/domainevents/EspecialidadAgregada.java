package medico.domainevents;

import cita.values.Descripcion;
import co.com.sofka.domain.generic.DomainEvent;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;

public class EspecialidadAgregada  extends DomainEvent {
    private final EspecialidadId especialidadId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;

    public EspecialidadAgregada(EspecialidadId especialidadId,Caracteristica caracteristica, Descripcion descripcion){
        super("sofka.medico.especialidadagregada");
        this.especialidadId = especialidadId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public Caracteristica getCaracteristica(){
        return caracteristica;
    }

    public Descripcion getDescripcion(){
        return descripcion;
    }

    public EspecialidadId getEspecialidadId(){
        return especialidadId;
    }

}
