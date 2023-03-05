package Transport;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> queue;

    public ServiceStation() {
        this.queue = new LinkedList<>();
    }

    //    public void addCarToTheQueue(Transport transport) {
//        try {
//            transport.passDiagnostics();
//            queue.offer(transport);
//            System.out.println(transport + " поставлен в очередь.");
//        } catch (TransportTypeException transportTypeException) {
//            System.out.println(transport + " не может быть поставлен в очередь!");
//        }
//    }

    public void addCarToTheQueue (PassengerCars transport) {
        queue.offer(transport);
        System.out.println(transport + " поставлен в очередь.");
    }
    public void addCarToTheQueue (Trucks transport) {
        queue.offer(transport);
        System.out.println(transport + " поставлен в очередь.");
    }

    public void addCarToTheQueue (Bus transport) {
        System.out.println(transport + " не может быть поставлен в очередь.");
    }
    public void technicalInspection() {
        Transport transport;
        if (queue.size() == 0 ) {
            System.out.println("Очередь пуста!");
        } else {
            transport = queue.poll();
            System.out.println(transport + " прошла техосмотр.");
            System.out.println(queue.size() + " - число машин в очереди.");
        }
    }
}

