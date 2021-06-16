package cita;

import cita.domainevents.*;
import cita.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cita extends AggregateEvent<CitaId>{
    protected Fecha fecha;
    protected HoraCita horaCita;
    //Entidades Hijas
    protected Descripcion descripcion;
    protected Set<Servicio> servicios;
    protected Set<Factura> facturas;

    /*
    public Cita(CitaId entityId){
        super(entityId);
    }
     */

    //Agregar o crear cita
    public Cita(CitaId entityId, Descripcion descripcion, Fecha fecha, HoraCita horaCita){
        super(entityId);
        appendChange(new CitaCreada(descripcion,fecha,horaCita)).apply();
    }

    //Factoria
    public static Cita from(CitaId citaId, List<DomainEvent> events){
        var cita = new Cita(citaId);
        events.forEach(cita::applyEvent);
        return cita;
    }

    //CambiarDescripcion
    public void cambiarDescripcion(Descripcion descripcion){
        appendChange(new DescripcionCambiada(descripcion)).apply();
    }

    //Ahora se afectaran los estados se crea un constructor privado
    private Cita(CitaId entityId){
        super(entityId);
        //Se realiza una suscripcion de los eventos
        subscribe(new CitaChange(this));
    }

    //Crear factura
    public void crearFactura(FacturaId entityId,Descripcion descripcion,Precio precio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(precio);
        appendChange(new FacturaCreada(entityId,descripcion,precio)).apply();
    }

    //Actualizar Precio
    public void carmbiarPrecioFactura(FacturaId entityId,Precio precio){
        appendChange(new PrecioFacturaCambiado(entityId,precio)).apply();
    }

    //Servicio Creado
    public void crearServicio(ServicioId entityId,Descripcion descripcion,TipoServicio tipoServicio){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(descripcion);
        Objects.requireNonNull(tipoServicio);
        appendChange(new ServicioCreado(entityId,descripcion,tipoServicio)).apply();
    }

    //Tipo de Servicio
    public void carmbiarTipoServicio(ServicioId entityId,TipoServicio tipoServicio){
        appendChange(new TipoServicioCambiado(entityId,tipoServicio)).apply();
    }

    //Consultar por id factura
     protected Optional<Factura> getFacturaPorId(FacturaId entityId){
        return facturas()
                .stream()
                .filter(factura -> factura.identity().equals(entityId))
                .findFirst();
    }

    //Consultar por id Servicio
    protected Optional<Servicio> getServicioPorId(ServicioId entityId){
        return servicios()
                .stream()
                .filter(servicio -> servicio.identity().equals(entityId))
                .findFirst();
    }

    //Getters
    public Fecha getFecha() {
        return fecha;
    }

    public HoraCita getHoraCita() {
        return horaCita;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Set<Servicio> servicios() {
        return servicios;
    }

    public Set<Factura> facturas() {
        return facturas;
    }


}
