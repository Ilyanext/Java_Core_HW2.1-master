import Transport.*;

import Transport.Bus.*;
import Transport.Trucks.*;
import Transport.PassengerCars.*;

public class Main {
    public static void main(String[] args) throws TransportTypeException {

        DriverB oleg = new DriverB("Oleg Pahov", true, 20);
        DriverC ura = new DriverC("Ura Pahov", false, 10);
        DriverD dim = new DriverD("Dim Pahov", true, -1);

        Bus busMers = new Bus("Mers", "D-31", 2.1, ura, Places.SMOL);
        Bus busAudi = new Bus("Audi", "f-31", 1.1, ura, Places.VERYBIG);
        Bus busRonol = new Bus("Ronol", "A-331", 3, ura, Places.MEDIUM);
        Bus busMex = new Bus("Mex", "dr-3671", 5.9, ura, Places.BIG);

        PassengerCars carMers = new PassengerCars("Mers", "yu-43", 1.1, oleg, BodyType.KUPE);
        PassengerCars carAudi = new PassengerCars("Audi", "tt-1", 1, oleg, BodyType.HETCHBEK);
        PassengerCars carRonol = new PassengerCars("Ronol", "rA-67", 6, oleg, BodyType.PICAP);
        PassengerCars carMex = new PassengerCars("Mex", "dr-3", 4.4, oleg, BodyType.UNIVERSAL);

        Trucks truckMers = new Trucks("Mers", "456s", 4.3, dim, LoadCapacity.N1);
        Trucks truckAudi = new Trucks("Audi", "444l", 0.9, dim, LoadCapacity.N3);
        Trucks truckRonol = new Trucks("Ronol", "787yu", 2.7, dim, LoadCapacity.N2);
        Trucks truckMex = new Trucks("Mex", "33h", 3.4, dim, LoadCapacity.N3);

        System.out.println(BodyType.CROSSOVER);
        System.out.println(Trucks.LoadCapacity.N1);
        System.out.println(Bus.Places.BIG);
        System.out.println();

        carAudi.printType();
        truckAudi.printType();
        System.out.println();
        carMers.passDiagnostics();
        truckMex.passDiagnostics();
        busMex.passDiagnostics();

    }
}