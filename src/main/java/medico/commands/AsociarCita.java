package medico.commands;

import cita.values.CitaId;
import co.com.sofka.domain.generic.Command;
import medico.values.MedicoId;

public class AsociarCita implements Command {

    private final MedicoId medicoId;
    private final CitaId citaId;

    public AsociarCita(MedicoId medicoId, CitaId citaId){
        this.citaId = citaId;
        this.medicoId = medicoId;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public CitaId getCitaId() {
        return citaId;
    }



}
