package medico.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject<String> {
    private final String value;

    public Direccion(String value){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Direccion direccion = (Direccion) o;
        return Objects.equals(value, direccion.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
