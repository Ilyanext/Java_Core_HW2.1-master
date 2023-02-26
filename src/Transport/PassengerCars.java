package Transport;

public class PassengerCars extends Transport<DriverB> implements Competing {


    private BodyType bodyType;

    public PassengerCars(String brand, String model, double engineVolume, DriverB driver, BodyType bodytype) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodytype;
    }

    @Override
    public Type getType() {
        return Type.PASSENGERCARS;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Недостаточно данных по машине");
        } else
            System.out.println(getBodyType());
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Машина может пройти диагностику");
        return false;
    }

    public enum BodyType {
        SEDAN("Седан"),
        HETCHBEK("Хетчбэк"),
        KUPE("Купе"),
        UNIVERSAL("Универсал"),
        VNEDOROZNIC("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICAP("Пикап"),
        FURGON("Фургон"),
        MINIVEN("Минивэн");

        private String bodyType;

        BodyType(String bodyName) {
            this.bodyType = bodyName;
        }

        public String getBodyType() {
            return bodyType;
        }

        public void setBodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + getBodyType();
        }
    }

    @Override
    public void pitStopabl() {
        System.out.println(" За 3 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 56 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 303 км/ч ");
    }

    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));
    }

}

