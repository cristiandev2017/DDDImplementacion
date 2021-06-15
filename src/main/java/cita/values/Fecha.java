package cita.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class Fecha implements ValueObject<Date> {
    private final Date value;

    public Fecha(Date value){
        this.value = Objects.requireNonNull(value);
        if(this.value.equals("")){
            throw new IllegalArgumentException("la Direccion no puede estar vacia");
        }
    }

    public Date value(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fecha fecha = (Fecha) o;
        return Objects.equals(value, fecha.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
