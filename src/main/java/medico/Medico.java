package medico;

import cita.values.CitaId;
import cita.values.Descripcion;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import medico.domainevents.*;
import medico.domainevents.MedicoCreado;
import medico.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Medico extends AggregateEvent<MedicoId> {
    //En este se definen el valor agregado
    protected Nombre nombre;
    protected Telefono telefono;
    protected Direccion direccion;
    //Aca estamos llamando a la entidad hija
    protected Set<Especialidad> especialidades;
    //on este asociamos el agregado asociado
    protected CitaId citaId;


    public Medico(MedicoId entityId, Nombre nombre, Direccion direccion, Telefono telefono){
        super(entityId);
        appendChange(new MedicoCreado(nombre,telefono,direccion)).apply();
    }

    //Esta es la factoria lo que me permite generar al agregado sin volver a mandarle todos los parametros
    //Se debe conservar la lista
    public static Medico from(MedicoId medicoId, List<DomainEvent> events){
        var medico = new Medico(medicoId);
        events.forEach(medico::applyEvent);
        return medico;
    }

    //Ahora se afectaran los estados se crea un constructor privado
    private Medico(MedicoId entityId){
        super(entityId);
        //Se realiza una suscripcion de los eventos
        subscribe(new MedicoChange(this));
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

    protected Optional<Especialidad> getEspecialidadPorId(EspecialidadId entityId){
        return especialidades()
                .stream()
                .filter(especialidad -> especialidad.identity().equals(entityId))
                .findFirst();
    }

    public Nombre nombre(){
        return nombre;
    }

    public Telefono telefono(){
        return telefono;
    }

    public Direccion direccion(){
        return direccion;
    }

    public CitaId citaId(){
        return citaId;
    }

    public Set<Especialidad> especialidades(){
        return especialidades;
    }
}
