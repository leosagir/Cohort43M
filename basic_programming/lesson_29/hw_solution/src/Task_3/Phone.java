package Task_3;

import java.util.Objects;

public class Phone {

    private String producer;
    private String model;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone phone)) return false;
        return Objects.equals(producer, phone.producer) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }
}
