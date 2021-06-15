package medico;

import co.com.sofka.domain.generic.Entity;
import medico.values.ConsultorioId;
import medico.values.Nombre;
import medico.values.Ubicacion;

import java.util.Objects;


public class Consultorio extends Entity<ConsultorioId>{

    private Nombre nombre;
    private Ubicacion ubicacion;


    public Consultorio(ConsultorioId entityId, Nombre nombre, Ubicacion ubicacion){
        super(entityId);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void actualizarNombreConsultorio(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarUbicacion(Ubicacion ubicacion){
        this.ubicacion = Objects.requireNonNull(ubicacion);
    }

    public Nombre Nombre() {
        return nombre;
    }

    public Ubicacion Ubicacion() {
        return ubicacion;
    }
}
