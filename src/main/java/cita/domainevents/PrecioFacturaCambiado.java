package cita.domainevents;

import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioFacturaCambiado extends DomainEvent {
    private FacturaId entityId;
    private Precio precio;

    public PrecioFacturaCambiado(FacturaId entityId, Precio precio){
        super("sofka.cita.preciofacturacambiado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public FacturaId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
