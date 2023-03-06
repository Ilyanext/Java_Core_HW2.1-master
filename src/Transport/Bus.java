package Transport;

import java.util.List;
import java.util.Objects;

public class Bus extends Transport<DriverC> implements Competing {

    private Places places;

    public Bus(String brand, String model, double engineVolume, DriverC driver, Places places, List<Mechanic> mechanica) {
        super(brand, model, engineVolume, driver, mechanica);
        this.places = places;
    }

    @Override
    public String toString() {
        return "Автобус: " + getBrand() +
                ", " + driver +
                ", " + mechanics;
    }

    public Places getPlaces() {
        return places;
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void printType() {
        if (getPlaces() == null) {
            System.out.println("Недостаточно данных по машине");
        } else
            System.out.println(getPlaces());
    }

    @Override
    public boolean passDiagnostics() throws TransportTypeException {
        System.out.println("Автобусы не могут проходить диагностику");
        throw new TransportTypeException("Автобусы не должны проходить диагностику!");
    }

    @Override
    public boolean addCar() {
        return false;
    }

    public enum Places {
        VERYSMOL(null, 10),
        SMOL(null, 25),
        MEDIUM(25, 50),
        BIG(50, 80),
        VERYBIG(80, 120);

        private Integer miniPlaces;
        private Integer maxPlaces;

        Places(Integer miniPlaces, Integer maxPlaces) {
            this.miniPlaces = miniPlaces;
            this.maxPlaces = maxPlaces;
        }

        public Integer getMiniPlaces() {
            return miniPlaces;
        }

        public void setMiniPlaces(Integer miniPlaces) {
            this.miniPlaces = miniPlaces;
        }

        public Integer getMaxPlaces() {
            return maxPlaces;
        }

        public void setMaxPlaces(Integer maxPlaces) {
            this.maxPlaces = maxPlaces;
        }

        @Override
        public String toString() {
            return "Вместимость: " + (miniPlaces == null ? "" : "от " + miniPlaces) +
                    ", " + (maxPlaces == null ? "" : " до " + maxPlaces);
        }
    }

    @Override
    public void pitStopabl() {
        System.out.println(" За 6 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 72 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 234 км/ч ");
    }


    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return places == bus.places;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), places);
    }
}
