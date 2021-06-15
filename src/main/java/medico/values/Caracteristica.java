package medico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Caracteristica implements ValueObject<String> {

    private final String value;

    public Caracteristica(String value) {
        //Se valida
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("La caracteristica no puede estar vacia");
        }
    }
    public String value() {
        return value;
    }

    //Se realiza la comparacion sobre los valores
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Caracteristica that = (Caracteristica) o;
        return Objects.equals(value,that.value);
    }

    @Override
    public int hashCode(){
        return Objects.hash(value);
    }

}
