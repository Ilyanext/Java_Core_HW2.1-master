package Transport;

public abstract class Transport<T extends Driver> {
    private static String brand;
    private static String model;
    private static double engineVolume;
    private Type Type;
    private T driver;
    private Type type;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = chekParmetrs(brand);
        this.model = chekParmetrs(model);
        this.engineVolume = chekParmetrs(engineVolume);
        setDriver(driver);
        this.Type = type;

    }
    public abstract Type getType();
    public abstract void printType();

    public boolean chekPassDiagnostics() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    abstract boolean passDiagnostics() throws TransportTypeException;

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

    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

}
