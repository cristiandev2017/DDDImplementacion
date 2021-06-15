package medico.commands;

import co.com.sofka.domain.generic.Command;
import medico.values.Direccion;
import medico.values.MedicoId;
import medico.values.Nombre;
import medico.values.Telefono;

public class CrearMedico implements Command {
    private final MedicoId entityId;
    private final Nombre nombre;
    private final Telefono telefono;
    private final Direccion direccion;

    public CrearMedico(MedicoId entityId, Nombre nombre, Telefono telefono, Direccion direccion){
        this.entityId = entityId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public Telefono getTelefono(){
        return telefono;
    }

    public Direccion getDireccion(){return direccion;}

    public MedicoId getEntityId(){
        return entityId;
    }
}
