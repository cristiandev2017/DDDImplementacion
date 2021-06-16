package cita;

import cita.values.Descripcion;
import cita.values.FacturaId;
import cita.values.Precio;
import co.com.sofka.domain.generic.Entity;
import medico.values.Caracteristica;

import java.util.Objects;

public class Factura extends Entity<FacturaId> {
    private Precio precio;
    private Descripcion descripcion;

    //Constructor
    public Factura(FacturaId entityId, Descripcion descripcion, Precio precio){
        super(entityId);
        this.descripcion = descripcion;
        this.precio = precio;
    }

   public void cambiarPrecioFactura(Precio precio){
        this.precio = Objects.requireNonNull(precio);
    }
    //Getter
    public Precio getPrecio() {
        return precio;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
