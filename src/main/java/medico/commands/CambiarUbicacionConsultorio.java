package medico.commands;

import co.com.sofka.domain.generic.Command;
import medico.values.ConsultorioId;
import medico.values.MedicoId;
import medico.values.Ubicacion;

public class CambiarUbicacionConsultorio implements Command {
    private final MedicoId medicoId;
    private final ConsultorioId entityId;
    private final Ubicacion ubicacion;

    public CambiarUbicacionConsultorio(MedicoId medicoId, ConsultorioId entityId, Ubicacion ubicacion){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.ubicacion = ubicacion;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public ConsultorioId getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
