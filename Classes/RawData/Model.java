package RawData;

public class Model {
    public String model;

    public Model(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        return String.format("%s",this.model);
    }
}
