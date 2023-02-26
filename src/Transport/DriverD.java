package Transport;

public class DriverD extends Driver implements Moving {
    public DriverD(String fullName, boolean driveList, int experience) {
        super(fullName, driveList, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Driver" + getFullName() + "start moving");
    }

    @Override
    public void stopMoving() {
        System.out.println("Driver" + getFullName() + "stop moving");
    }

    public void refuel() {
        System.out.println("Driver" + getFullName() + "refuel the car");
    }

}
