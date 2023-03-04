package Transport;

public class Mechanic {
    private final String fullName;
    private final String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public void performMaintenance(Transport transport){
        System.out.println("Провести техобслуживание автомобиля "+ transport.getBrand());
    }
    public void fixTheCar(Transport transport){
        System.out.println("Починить машину "+transport.getBrand());
    }

    @Override
    public String toString() {
        return "Механик (" +
                "имя: " + fullName +
                ", компания: " + company+ ")";
    }
}
