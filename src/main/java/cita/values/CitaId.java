package cita.values;

import co.com.sofka.domain.generic.Identity;

public class CitaId extends Identity {

    public CitaId(){

    }

    private CitaId(String id){
        super(id);
    }

    public static CitaId of(String id){
        return new CitaId(id);
    }
}
