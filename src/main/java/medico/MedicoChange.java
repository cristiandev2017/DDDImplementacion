package medico;

import co.com.sofka.domain.generic.EventChange;
import medico.domainevents.*;
import medico.events.MedicoCreado;

import java.util.HashSet;

public class MedicoChange extends EventChange {
    public MedicoChange(Medico medico){
        apply((MedicoCreado event)->{
            medico.nombre = event.getNombre();
            medico.especialidades = new HashSet<>();
        });

        apply((CitaAsociada event)->{
            medico.citaId = event.getCitaId();
        });

        apply((DescripcionEspecialidadActualizada event)->{
            var especialidad =medico.getEspecialidadPorId(event.getEspecialidadId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta la especialidad del medico"));
            especialidad.actualizarDescripcion(event.getDescripcion());
        });

        apply((CaracteristicaEspecialidadActualizada event)->{
            var especialidad =medico.getEspecialidadPorId(event.getEspecialidadId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuenta la especialidad del medico"));
            especialidad.actualizarCaracteristica(event.getCaracteristica());
        });

        apply((NombreCambiado event)->{
            medico.nombre = event.getNombre();
        });
    }
}
