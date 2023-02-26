package Transport;

import java.time.LocalDate;

public class Car {
//    private final String bodeType;
//    private boolean rubber;
//
////    private final int numbersOfSeats;
//    private String transmission;
//    private int registrationNumber;
//    private double engineVolume;
//
//    private Key key;
//
////    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission, int registrationNumber, String bodeType, int numbersOfSeats, boolean rubber, Key key, int speed) {
////        super(brand, model, color, year, country, speed);
////        setEngineVolume(engineVolume);
////        setTransmission(transmission);
////        setRegistrationNumber(registrationNumber);
////        this.bodeType = chekParmetrs(bodeType);
////        this.numbersOfSeats = chekParmetrsSitDown(numbersOfSeats);
////        this.rubber = rubber;
////        setKey(key);
////
////    }
//
//    public Key getKey() {
//        return key;
//    }
//
//    public void setKey(Key key) {
//        if (key == null) {
//            key = new Key(false, false);
//        }
//        this.key = key;
//    }
//
//    public static class Key {
//        private final boolean remoteEngineStart;
//        private final boolean keylessAccess;
//
//        public Key(boolean remoteEngineStart, boolean keylessAccess) {
//            this.remoteEngineStart = remoteEngineStart;
//            this.keylessAccess = keylessAccess;
//        }
//
//        public boolean isRemoteEngineStart() {
//            return remoteEngineStart;
//        }
//
//        public boolean isKeylessAccess() {
//            return keylessAccess;
//        }
//
//    }
//
//    public int chekParmetrsSitDown(int parametr) {
//        if (parametr <= 0) {
//            parametr = 5;
//        }
//        return parametr;
//    }
//    public void chekRubber() {
//        int month = LocalDate.now().getMonthValue();
//        System.out.println(" Now month " + month);
//        switch (month) {
//            case 1:
//            case 2:
//            case 12:
//                if (getRubber() == !true) {
//                    System.out.println(" Смени шины на сезонные! ");
//                }
//                break;
//            case 6:
//            case 7:
//            case 8:
//                if (getRubber() == !false) {
//                    System.out.println(" Смени шины на сезонные! ");
//                }
//                break;
//            default:
//                break;
//        }
//    }
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//    public String getTransmission() {
//        return transmission;
//    }
//    public int getRegistrationNumber() {
//        return registrationNumber;
//    }
//    public boolean getRubber() {
//        return rubber;
//    }
//    public void setEngineVolume(double engineVolume) {
//        if (engineVolume <= 0) {
//            engineVolume = 1.5;
//        }
//        this.engineVolume = engineVolume;
//    }
//    public void setTransmission(String transmission) {
//        if (transmission == null || transmission.isEmpty()) {
//            transmission = "default";
//        }
//        this.transmission = transmission;
//    }
//    public void setRegistrationNumber(int registrationNumber) {
//        if (registrationNumber <= 0 || registrationNumber > 999) {
//            registrationNumber = 999;
//        }
//        this.registrationNumber = registrationNumber;
//    }
//    public void setRubber(boolean rubber) {
//        this.rubber = rubber;
//    }
//    public String getBodeType() {
//        return bodeType;
//    }
//    public int getNumbersOfSeats() {
//        return numbersOfSeats;
//    }
//    public void print() {
//        System.out.println("Марка автомобиля:  " + getBrand() + ", модель: " + getModel() +
//                ", объем двигателя: " + getEngineVolume() + " л, цвет кузова: " + getColor() +
//                ", год выпуска: " + getYear() + ", произведен в стране:  " + getCountry()+ "\n" +
//                "коробка передач: " + getTransmission() + ", тип кузова: " + getBodeType() +
//                ", регистрационный номер: " + getRegistrationNumber() +
//                ", количество мест: " + getNumbersOfSeats() +
//                ", шины:" + (rubber ? " зимняя" : " летняя") + " резина, " + (key.remoteEngineStart ? " удаленный запуск двигателя" : " не удаленный запуск двигателя") +
//                ", " + (key.keylessAccess ? " бесключевой доступ " : " клуючевой доступ ")+ ", speed:  " + getSpeed());
//        System.out.println();
    }



