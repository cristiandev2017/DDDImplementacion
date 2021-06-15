package cita.domainevents;

import cita.values.Descripcion;
import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.DomainEvent;

public class FacturaCreada extends DomainEvent {
    private final FacturaId facturaId;
    private final Descripcion descripcion;
    private final Precio precio;

    public FacturaCreada(FacturaId facturaId, Descripcion descripcion, Precio precio){
        super("sofka.cita.facturacreada");
        this.facturaId = facturaId;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
