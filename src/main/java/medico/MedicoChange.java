package medico;

import co.com.sofka.domain.generic.EventChange;
import medico.domainevents.*;
import medico.domainevents.MedicoCreado;

import java.util.HashSet;

public class MedicoChange extends EventChange {
    public MedicoChange(Medico medico) {
        apply((MedicoCreado event) -> {
            medico.nombre = event.getNombre();
            medico.telefono = event.getTelefono();
            medico.direccion = event.getDireccion();
            medico.especialidades = new HashSet<>();
        });

        apply((CitaAsociada event) -> {
            medico.citaId = event.getCitaId();
        });

        apply((DescripcionEspecialidadActualizada event) -> {
            var especialidad = medico.getEspecialidadPorId(event.getEspecialidadId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta la especialidad del medico"));
            especialidad.actualizarDescripcion(event.getDescripcion());
        });

        apply((NombreConsultorioCambiado event) -> {
            var consultorio = medico.getConsultorioPorId(event.getConsultorioId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el consultorio del medico"));
            consultorio.actualizarNombreConsultorio(event.getNombre());
        });

        apply((UbicacionCambiada event) -> {
            var consultorio = medico.getConsultorioPorId(event.getConsultorioId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra el consultorio del medico"));
            consultorio.actualizarUbicacion(event.getUbicacion());
        });


        apply((CaracteristicaEspecialidadActualizada event) -> {
            var especialidad = medico.getEspecialidadPorId(event.getEspecialidadId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta la especialidad del medico"));
            especialidad.actualizarCaracteristica(event.getCaracteristica());
        });

        apply((ConsultorioAgregado event)->{
           medico.consultorios.add(new Consultorio(
             event.getConsultorioId(),
                   event.getNombre(),
                   event.getUbicacion()
           ));
        });

        apply((EspecialidadAgregada event) -> {
            medico.especialidades.add(new Especialidad(
                    event.getEspecialidadId(),
                    event.getCaracteristica(),
                    event.getDescripcion()
            ));
        });

        apply((NombreCambiado event) -> {
            medico.nombre = event.getNombre();
        });


    }
}
