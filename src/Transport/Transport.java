package Transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> {
    private String brand;
    private String model;
    protected double engineVolume;
    protected Type Type;
    protected T driver;
    protected Type type;
    protected List<Mechanic> mechanics;

    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanic> mechanics) {
        this.brand = chekParmetrs(brand);
        this.model = chekParmetrs(model);
        this.engineVolume = chekParmetrs(engineVolume);
        setDriver(driver);
        this.Type = type;
        this.mechanics = mechanics;

    }

    public abstract Type getType();

    public abstract void printType();

    public void addMechanic(String fullName, String company) {
        addMechanic(new Mechanic(fullName, company));
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    abstract boolean passDiagnostics() throws TransportTypeException;

    public void nameDriver() {
        System.out.println(driver);
    }

    public void startMoving() {
        System.out.println("Start moving");
    }

    public void stopMoving() {
        System.out.println("Stop moving");
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String chekParmetrs(String parametr) {
        if (parametr == null || parametr.isEmpty()) {
            parametr = "default";
        }
        return parametr;
    }

    public double chekParmetrs(double parametr) {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return parametr;
    }

    public T getDriver() {
        return driver;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && Type == transport.Type && driver.equals(transport.driver) && type == transport.type && mechanics.equals(transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, Type, driver, type, mechanics);
    }
}
