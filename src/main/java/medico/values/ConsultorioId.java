package medico.values;

import co.com.sofka.domain.generic.Identity;

public class ConsultorioId extends Identity {
    public ConsultorioId(){

    }

    private ConsultorioId(String id){
        super(id);
    }

    public static ConsultorioId of(String id){
        return new ConsultorioId(id);
    }
}
