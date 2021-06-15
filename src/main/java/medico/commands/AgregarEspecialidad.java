package medico.commands;

import cita.values.Descripcion;
import co.com.sofka.domain.generic.Command;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;
import medico.values.MedicoId;

public class AgregarEspecialidad implements Command {
    private final MedicoId medicoId;
    private final EspecialidadId entityId;
    private final Caracteristica caracteristica;
    private final Descripcion descripcion;

    public AgregarEspecialidad(MedicoId medicoId, EspecialidadId entityId, Caracteristica caracteristica, Descripcion descripcion){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.caracteristica = caracteristica;
        this.descripcion = descripcion;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public EspecialidadId getEntityId() {
        return entityId;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }


}
