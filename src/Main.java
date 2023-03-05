import Transport.*;

import Transport.Bus.*;
import Transport.Trucks.*;
import Transport.PassengerCars.*;

import java.util.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {

        DriverB oleg = new DriverB("Oleg Pahov", true, 20);
        DriverC ura = new DriverC("Ura Pahov", false, 10);
        DriverD dim = new DriverD("Dim Pahov", true, -1);

        Bus busMers = new Bus("Mers", "D-31", 2.1, ura, Places.SMOL, new ArrayList<>());
        busMers.addMechanic(new Mechanic("Red", "AndF"));
        busMers.addMechanic(new Mechanic("Redug", "AndFe"));

        Bus busAudi = new Bus("Audi", "f-31", 1.1, ura, Places.VERYBIG, new ArrayList<>());
        busAudi.addMechanic(new Mechanic("Red", "AndF"));
        busAudi.addMechanic(new Mechanic("Redug", "AndFe"));

        Bus busRonol = new Bus("Ronol", "A-331", 3, ura, Places.MEDIUM, new ArrayList<>());
        busRonol.addMechanic(new Mechanic("Red", "AndF"));
        busRonol.addMechanic(new Mechanic("Redug", "AndFe"));

        Bus busMex = new Bus("Mex", "dr-3671", 5.9, ura, Places.BIG, new ArrayList<>());
        busMex.addMechanic(new Mechanic("Fod", "Andi"));
        busMex.addMechanic(new Mechanic("FodI", "AndiB"));

        PassengerCars carMers = new PassengerCars("Mers", "yu-43", 1.1, oleg, BodyType.KUPE, new ArrayList<>());
        carMers.addMechanic(new Mechanic("Red", "AndF"));
        carMers.addMechanic(new Mechanic("Redug", "AndFe"));

        PassengerCars carAudi = new PassengerCars("Audi", "tt-1", 1, oleg, BodyType.HETCHBEK, new ArrayList<>());
        carAudi.addMechanic(new Mechanic("Red", "AndF"));
        carAudi.addMechanic(new Mechanic("FodI", "AndiB"));

        PassengerCars carRonol = new PassengerCars("Ronol", "rA-67", 6, oleg, BodyType.PICAP, new ArrayList<>());
        carRonol.addMechanic(new Mechanic("Redrr", "AndFee"));
        carRonol.addMechanic(new Mechanic("Rimer", "AndFee"));

        PassengerCars carMex = new PassengerCars("Mex", "dr-3", 4.4, oleg, BodyType.UNIVERSAL, new ArrayList<>());
        carMex.addMechanic(new Mechanic("Redrr", "AndFee"));
        carMex.addMechanic(new Mechanic("Rimer", "AndFee"));

        Trucks truckMers = new Trucks("Mers", "456s", 4.3, dim, LoadCapacity.N1, new ArrayList<>());
        truckMers.addMechanic(new Mechanic("Redrr", "AndFee"));
        truckMers.addMechanic(new Mechanic("Rimer", "AndFee"));

        Trucks truckAudi = new Trucks("Audi", "444l", 0.9, dim, LoadCapacity.N3, new ArrayList<>());
        truckAudi.addMechanic(new Mechanic("Red", "AndF"));
        truckAudi.addMechanic(new Mechanic("Redug", "AndFe"));

        Trucks truckRonol = new Trucks("Ronol", "787yu", 2.7, dim, LoadCapacity.N2, new ArrayList<>());
        truckRonol.addMechanic(new Mechanic("Redrr", "AndFee"));
        truckRonol.addMechanic(new Mechanic("Rimer", "AndFee"));

        Trucks truckMex = new Trucks("Mex", "33h", 3.4, dim, LoadCapacity.N3, new ArrayList<>());
        truckMex.addMechanic(new Mechanic("Red", "AndF"));
        truckMex.addMechanic(new Mechanic("Redug", "AndFe"));

        List<Transport> auto = new ArrayList<>();

        auto.add(carAudi);
        auto.add(busAudi);
        auto.add(truckAudi);
        auto.add(carMers);
        auto.add(carRonol);
        System.out.println(auto);
        System.out.println();

        System.out.println(carRonol);
        System.out.println(carMers);
        System.out.println();

        carMex.nameDriver();
        truckMex.nameDriver();
        System.out.println();

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCarToTheQueue(carAudi);
        serviceStation.addCarToTheQueue(truckMex);
        serviceStation.addCarToTheQueue(busMex);
        serviceStation.addCarToTheQueue(carMex);

        serviceStation.addCarToTheQueue(busMers);

        System.out.println();
        serviceStation.technicalInspection();
        serviceStation.technicalInspection();


        System.out.println();


    }
}