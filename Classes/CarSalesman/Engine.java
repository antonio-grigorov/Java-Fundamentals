package CarSalesman;

public class Engine {

    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public String getPower() {
        return this.power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }

    @Override
    public String toString() {
        return String.format( "%s:%n"+ "Power: %s%n"+"Displacement: %s%n" +"Efficiency: %s%n",
                model,this.power,this.displacement,this.efficiency);
    }
}
