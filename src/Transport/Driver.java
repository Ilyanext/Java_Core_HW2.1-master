package Transport;

public  abstract class Driver {
    private String fullName;
    private boolean driveList;

    private int experience;

    public Driver(String fullName, boolean driveList, int experience) {
        this.fullName = chekDrive(fullName);
        this.driveList = chekDrive(driveList);
        this.experience = chekDrive(experience);


    }

    public void print() {
        System.out.println("ФИО: " + getFullName() + ", наличие водительских прав: " +
                (isDriveList() ? "есть водительские права " : "нет водительских прав ") +
                ", стаж: " + getExperience());
    }

    public String chekDrive(String anonim) {
        if (anonim.isEmpty() || anonim == null) {
            System.out.println(" Anonim");
        }
        return anonim;
    }

    public int chekDrive(int exp) {
        if (exp < 0) {
            exp = 0;
        }
        return exp;
    }

    public boolean chekDrive(boolean driver) {
        if (driver == false) {
            setExperience(0);
        }
        return driver;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriveList() {
        return driveList;
    }

    public void setDriveList(boolean driveList) {
        this.driveList = driveList;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
