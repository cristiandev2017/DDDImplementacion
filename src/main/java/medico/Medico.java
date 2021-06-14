package medico;

import cita.values.CitaId;
import cita.values.Descripcion;
import co.com.sofka.domain.generic.AggregateEvent;
import medico.domainevents.*;
import medico.events.MedicoCreado;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;
import medico.values.MedicoId;
import medico.values.Nombre;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Medico extends AggregateEvent<MedicoId> {
    //En este se definen el valor agregado
    protected Nombre nombre;
    //Aca estamos llamando a la entidad hija
    protected Set<Especialidad> especialidades;
    //on este asociamos el agregado asociado
    protected CitaId citaId;


    public Medico(MedicoId entityId, Nombre nombre){
        super(entityId);
        appendChange(new MedicoCreado(nombre)).apply();
    }

    public void agregarEspecialidad(EspecialidadId entityId, Caracteristica caracteristica, Descripcion descripcion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(caracteristica);
        Objects.requireNonNull(descripcion);
        appendChange(new EspecialidadAgregada(entityId,caracteristica,descripcion)).apply();
    }

    public void asociarCita(CitaId citaId){
        appendChange(new CitaAsociada(citaId)).apply();
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void actualizarCaracteristicaDeEspecialidad(EspecialidadId entityId,Caracteristica caracteristica){
        appendChange(new CaracteristicaEspecialidadActualizada(entityId,caracteristica));
    }

    public void actualizarDescripcionDeEspecialidad(EspecialidadId entityId,Descripcion descripcion){
        appendChange(new DescripcionEspecialidadActualizada(entityId,descripcion));
    }

    public Optional<Especialidad> getEspecialidadPorId(EspecialidadId entityId){
        return especialidades()
                .stream()
                .filter(especialidad -> especialidad.identity().equals(entityId))
                .findFirst();
    }

    public Nombre nombre(){
        return nombre;
    }

    public CitaId citaId(){
        return citaId;
    }

    public Set<Especialidad> especialidades(){
        return especialidades;
    }
}
