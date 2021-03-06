package medico;

import medico.values.Descripcion;
import co.com.sofka.domain.generic.Entity;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;

import java.util.Objects;

public class Especialidad extends Entity<EspecialidadId> {

    private Caracteristica caracteristica;
    private Descripcion descripcion;


    public Especialidad(EspecialidadId entityId, Caracteristica caracteristica, Descripcion descripcion){
        super(entityId);
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public void actualizarCaracteristica(Caracteristica caracteristica){
        this.caracteristica = Objects.requireNonNull(caracteristica);
    }

    public void actualizarDescripcion(Descripcion descripcion){
        this.descripcion = Objects.requireNonNull(descripcion);
    }

    public Caracteristica caracteristica(){
        return caracteristica;
    }

    public Descripcion descripcion(){
        return descripcion;
    }

}
