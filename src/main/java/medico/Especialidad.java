package medico;

import cita.values.Descripcion;
import co.com.sofka.domain.generic.Entity;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;

import java.util.Objects;

public class Especialidad extends Entity<EspecialidadId> {

    private final Caracteristica caracteristica;
    private final Descripcion descripcion;


    public Especialidad(EspecialidadId entityId, Caracteristica caracteristica, Descripcion descripcion){
        super(entityId);
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public Caracteristica caracteristica(){
        return caracteristica;
    }

    public Descripcion descripcion(){
        return descripcion;
    }

}
