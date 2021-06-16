package cita;

import cita.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Servicio extends Entity<ServicioId> {
    private Descripcion descripcion;
    private TipoServicio tipoServicio;

    //Constructor
    public Servicio(ServicioId entityId, Descripcion descripcion, TipoServicio tipoServicio){
        super(entityId);
        this.descripcion = descripcion;
        this.tipoServicio = tipoServicio;
    }
    public void cambiarTipoServicio(TipoServicio tipoServicio){
        this.tipoServicio = Objects.requireNonNull(tipoServicio);
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }
}
