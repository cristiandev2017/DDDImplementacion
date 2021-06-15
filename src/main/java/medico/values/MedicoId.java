package medico.values;

import co.com.sofka.domain.generic.Identity;

public class MedicoId extends Identity {

    public MedicoId(){

    }

    private MedicoId(String id){
        super(id);
    }

    public static MedicoId of(String id){
        return new MedicoId(id);
    }
}
