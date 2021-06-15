package cita;

import cita.domainevents.CitaCreada;
import cita.domainevents.DescripcionCambiada;
import cita.domainevents.FacturaCreada;
import co.com.sofka.domain.generic.EventChange;
import medico.Especialidad;
import medico.domainevents.EspecialidadAgregada;
import medico.domainevents.MedicoCreado;

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
        /*
        apply((FacturaCreada event) -> {
            cita.facturas.add(new Factura(
                    event.getEspecialidadId(),
                    event.getCaracteristica(),
                    event.getDescripcion()
            ));
        });
        */





    }


}
