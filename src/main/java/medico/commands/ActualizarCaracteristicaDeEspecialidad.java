package medico.commands;


import cita.values.Descripcion;
import co.com.sofka.domain.generic.Command;
import medico.values.Caracteristica;
import medico.values.EspecialidadId;
import medico.values.MedicoId;

public class ActualizarCaracteristicaDeEspecialidad implements Command {
    private final MedicoId medicoId;
    private final EspecialidadId entityId;
    private final Caracteristica caracteristica;

    public ActualizarCaracteristicaDeEspecialidad(MedicoId medicoId, EspecialidadId entityId, final Caracteristica caracteristica){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.caracteristica = caracteristica;
    }

    public MedicoId getMedicoId(){
        return medicoId;
    }

    public EspecialidadId getEntityId(){
        return entityId;
    }

    public Caracteristica getCaracteristica(){
        return caracteristica;
    }

}
