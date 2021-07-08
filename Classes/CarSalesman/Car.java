package CarSalesman;



public class Car {
    private String model;

    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public  Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return this.model;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    //    FordFocus:
//    V4-33:
//    Power: 140
//    Displacement: 28
//    Efficiency: B
//    Weight: 1300
//    Color: Silver

    @Override
    public String toString() {
        Engine engine = this.getEngine();
        return String.format("%s:%n"     +"%s" +    "Weight: %s%n" + "Color: %s"
                , this.model    ,engine.toString(),this.weight,this.color);
    }


}