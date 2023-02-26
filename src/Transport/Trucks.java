package Transport;

public class Trucks extends Transport<DriverD> implements Competing {

private LoadCapacity loadCapacity;
    public Trucks(String brand, String model, double engineVolume, DriverD driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity=loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public Type getType() {
        return Type.TRUCKS;
    }

    @Override
    public void printType() {
    if(getLoadCapacity()==null){
        System.out.println("Недостаточно данных по машине");
    } else
        System.out.println(getLoadCapacity());
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Машина может пройти диагностику");
        return false;
    }

    public enum LoadCapacity {
        N1(0, 3.5F),
        N2(3.5F, 12),
        N3(12, 0);

        private float mincapacity;
        private float maxcapacity;

        LoadCapacity(float mincapacity, float maxcapacity) {
            this.mincapacity = mincapacity;
            this.maxcapacity = maxcapacity;
        }

        public float getMincapacity() {
            return mincapacity;
        }

        public float getMaxcapacity() {
            return maxcapacity;
        }

        public void setMincapacity(float mincapacity) {
            this.mincapacity = mincapacity;
        }

        public void setMaxcapacity(float maxcapacity) {
            this.maxcapacity = maxcapacity;
        }

        @Override
        public String toString() {
            return "Грузоподъемность: " + (mincapacity == 0 ? "" : "от " + mincapacity) +
                    (maxcapacity == 0 ? "" : " до " + maxcapacity);
        }
    }

    @Override
    public void pitStopabl() {
        System.out.println(" За 11 сек пит - стоп.");
    }

    @Override
    public void bestTimebl() {
        System.out.println(" Лучшее время 104 с.");
    }

    @Override
    public void maxSpeedaml() {
        System.out.println(" Максимальная скорость: 180 км/ч ");
    }

    @Override
    public void print() {
        System.out.println(("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume()));

    }

}
