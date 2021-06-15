package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.ConsultorioId;
import medico.values.Nombre;

public class NombreConsultorioCambiado extends DomainEvent {
    private final ConsultorioId consultorioId;
    private final Nombre nombre;
    public NombreConsultorioCambiado(ConsultorioId consultorioId, Nombre nombre){
        super("sofka.consultorio.nombre");
        this.nombre = nombre;
        this.consultorioId = consultorioId;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Nombre getNombre() {
        return nombre;
    }


}
