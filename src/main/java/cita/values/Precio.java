package cita.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Currency;
import java.util.Objects;

public class Precio implements ValueObject<Currency> {
    private final Currency value;

    public Precio(Currency value){
        this.value = Objects.requireNonNull(value);
        if(this.value.equals(0) ||this.value.equals("") )  {
            throw new IllegalArgumentException("el precio no puede estar vacia");
        }


    }
    public Currency value(){return value; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Precio precio = (Precio) o;
        return Objects.equals(value, precio.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
