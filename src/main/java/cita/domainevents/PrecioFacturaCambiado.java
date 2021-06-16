package cita.domainevents;

import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class PrecioFacturaCambiado extends DomainEvent {
    private FacturaId facturaId;
    private Precio precio;

    public PrecioFacturaCambiado(FacturaId facturaId, Precio precio){
        super("sofka.cita.preciofacturacambiado");
        this.facturaId = facturaId;
        this.precio = precio;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
