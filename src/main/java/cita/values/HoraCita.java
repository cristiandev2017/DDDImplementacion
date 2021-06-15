package cita.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

//import java.util.Timer;

public class HoraCita implements ValueObject<String> {
    private final String value;

    public HoraCita(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("la Hoara de cita no puede estar vacia");
        }

    }

    public String value(){return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraCita horaCita = (HoraCita) o;
        return Objects.equals(value, horaCita.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
