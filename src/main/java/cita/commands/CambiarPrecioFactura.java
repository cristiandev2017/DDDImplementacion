package cita.commands;

import cita.values.CitaId;
import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.Command;


public class CambiarPrecioFactura implements Command {
    private final CitaId citaId;
    private final FacturaId entityId;
    private final Precio precio;

    public CambiarPrecioFactura(CitaId citaId, FacturaId entityId, Precio precio){
        this.citaId = citaId;
        this.entityId = entityId;
        this.precio = precio;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public FacturaId getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
