package cita.commands;

import cita.values.CitaId;
import cita.values.Descripcion;
import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.Command;


public class CrearFactura implements Command {
    private final CitaId citaId;
    private final FacturaId entityId;
    private final Descripcion descripcion;
    private final Precio precio;

    public CrearFactura(CitaId citaId, FacturaId entityId, Descripcion descripcion,Precio precio){
        this.citaId = citaId;
        this.entityId = entityId;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public CitaId getCitaId() {
        return citaId;
    }

    public FacturaId getEntityId() {
        return entityId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Precio getPrecio() {
        return precio;
    }
}
