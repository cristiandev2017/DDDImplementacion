package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.*;

public class ConsultorioAgregado extends DomainEvent {
    private ConsultorioId consultorioId;
    private final Nombre nombre;
    private final Ubicacion ubicacion;

    public ConsultorioAgregado(ConsultorioId consultorioId, Nombre nombre, Ubicacion ubicacion){
        super("sofka.consultorio.consultorioagregado");
        this.consultorioId = consultorioId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
