package medico.commands;

import cita.values.Descripcion;
import co.com.sofka.domain.generic.Command;
import medico.values.EspecialidadId;
import medico.values.MedicoId;

public class ActualizarDescripcionDeEspecialidad implements Command {

    private final MedicoId medicoId;
    private final EspecialidadId entityId;
    private final Descripcion descripcion;

    public ActualizarDescripcionDeEspecialidad(MedicoId medicoId, EspecialidadId entityId, final Descripcion descripcion){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.descripcion = descripcion;
    }

    public MedicoId getMedicoId(){
        return medicoId;
    }

    public EspecialidadId getEntityId(){
        return entityId;
    }

    public Descripcion getDescripcion(){
        return descripcion;
    }
}
