package medico.commands;

import co.com.sofka.domain.generic.Command;
import medico.values.ConsultorioId;
import medico.values.MedicoId;
import medico.values.Nombre;

public class CambiarNombreConsultorio implements Command {
    private final MedicoId medicoId;
    private final ConsultorioId entityId;
    private final Nombre nombre;

    public CambiarNombreConsultorio(MedicoId medicoId, ConsultorioId entityId, Nombre nombre){
        this.medicoId = medicoId;
        this.entityId = entityId;
        this.nombre = nombre;
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
}
