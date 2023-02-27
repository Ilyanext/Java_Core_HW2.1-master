package Transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private final LinkedList<Transport> Queue;

    public ServiceStation() {
        this.Queue = new LinkedList<>();
    }

    public void addCarToTheQueue(Transport transport) {
        Queue<Transport> queue = new LinkedList<>();
        queue.offer(transport);
        System.out.println(queue.peek());
        String town;
        while ((town = queue.poll().toString()) != null) {
            // Выводим элементы на экран
            System.out.println(town);
        }
    }
}
