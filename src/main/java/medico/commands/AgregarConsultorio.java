package medico.commands;

import co.com.sofka.domain.generic.Command;
import medico.values.*;

public class AgregarConsultorio implements Command {

    private final MedicoId medicoId;
    private final ConsultorioId entityId;
    private final Nombre nombre;
    private final Ubicacion ubicacion;

    public AgregarConsultorio(MedicoId medicoId, ConsultorioId entityId, Nombre nombre, Ubicacion ubicacion){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public ConsultorioId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
