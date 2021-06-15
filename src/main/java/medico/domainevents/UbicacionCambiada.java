package medico.domainevents;

import co.com.sofka.domain.generic.DomainEvent;
import medico.values.ConsultorioId;
import medico.values.Ubicacion;

public class UbicacionCambiada extends DomainEvent {
    private final ConsultorioId consultorioId;
    private final Ubicacion ubicacion;
    public UbicacionCambiada(ConsultorioId consultorioId, Ubicacion ubicacion){
        super("sofka.consultorio.ubicacion");
        this.ubicacion = ubicacion;
        this.consultorioId = consultorioId;
    }

    public ConsultorioId getConsultorioId() {
        return consultorioId;
    }
    public Ubicacion getUbicacion(){
        return ubicacion;
    }
}
