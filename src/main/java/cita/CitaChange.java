package cita;

import cita.domainevents.*;
import co.com.sofka.domain.generic.EventChange;



import java.util.HashSet;

public class CitaChange extends EventChange {
    public CitaChange(Cita cita){
        //Cracion de cita
        apply((CitaCreada event) -> {
            cita.descripcion = event.getDescripcion();
            cita.fecha = event.getFecha();
            cita.horaCita = event.getHoraCita();
            cita.servicios = new HashSet<>();
            cita.facturas = new HashSet<>();
        });

        //Cambio de descripcion
        apply((DescripcionCambiada event)->{
            cita.descripcion = event.getDescripcion();
        });

        //Factura creada
        apply((FacturaCreada event) -> {
            cita.facturas.add(new Factura(
                    event.getFacturaId(),
                    event.getDescripcion(),
                    event.getPrecio()
            ));
        });

        //Cambio de Precio
        apply((PrecioFacturaCambiado event) -> {
            var factura = cita.getFacturaPorId(event.getFacturaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta la especialidad del medico"));
            factura.cambiarPrecioFactura(event.getPrecio());
        });

        //Servicio creado
        apply((ServicioCreado event) -> {
            cita.servicios.add(new Servicio(
                    event.getServicioId(),
                    event.getDescripcion(),
                    event.getTipoServicio()
            ));
        });

        //TipoServicio Cambiado
        apply((TipoServicioCambiado event) -> {
            var servicio = cita.getServicioPorId(event.getServicioId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta el servicio de la cita"));
            servicio.cambiarTipoServicio(event.getTipoServicio());
        });



    }


}
