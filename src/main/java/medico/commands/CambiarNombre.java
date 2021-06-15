package medico.commands;

import co.com.sofka.domain.generic.Command;
import medico.values.MedicoId;
import medico.values.Nombre;

public class CambiarNombre implements Command {

    private final MedicoId medicoId;
    private final Nombre nombre;

    public CambiarNombre(MedicoId medicoId, Nombre nombre){
        this.medicoId = medicoId;
        this.nombre = nombre;
    }

    public MedicoId getMedicoId() {
        return medicoId;
    }

    public Nombre getNombre() {
        return nombre;
    }




}
