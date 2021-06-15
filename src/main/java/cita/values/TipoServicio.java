package cita.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TipoServicio implements ValueObject<String> {
    private final String value;

    public TipoServicio(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la Direccion no puede estar vacia");
        }

        if(this.value.length()<= 5){
            throw new IllegalArgumentException("Debes de tener minimo 5 caracteres");
        }
    }


    public String value(){
        return value;
    }
}
