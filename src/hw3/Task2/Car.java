package hw3.Task2;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    private String brand;
    private String model;
    private Integer productionYear;
    private String productionCountry;
    private String color;
    private double engineVolume;

    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private Integer numberOfSeats;
    private String summerOrWinterTires;

    public Car(String brand, String model, Integer productionYear, String productionCountry, String color,
               double engineVolume, String transmission, String bodyType, String registrationNumber,
               Integer numberOfSeats, String summerOrWinterTires) {

        this.transmission = transmission;
        if (!(transmission == null || transmission.isBlank() || transmission.isEmpty())) {
            this.transmission = transmission;
        } else {
            this.transmission = "manual";
        }

        this.bodyType = bodyType;
        if (!(bodyType == null || bodyType.isBlank() || bodyType.isEmpty())) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }

        this.registrationNumber = registrationNumber;
        if (!(registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty())) {
            Matcher m = Pattern.compile("[А-Я]\\d\\d\\d[А-Я][А-Я]\\d\\d\\d").matcher(registrationNumber);
            if (m.find()) {
                this.registrationNumber = registrationNumber;
            } else {
                this.registrationNumber = "некорректный номер";
            }
        }

        if (!(numberOfSeats <= 0)) {
            this.numberOfSeats = numberOfSeats;
        } else {
            this.numberOfSeats = 5;
        }
        this.summerOrWinterTires = summerOrWinterTires;
        if (!(summerOrWinterTires == null || summerOrWinterTires.isBlank() || summerOrWinterTires.isEmpty())) {
            this.summerOrWinterTires = summerOrWinterTires;
        } else {
            this.summerOrWinterTires = "инфомация не указана";
        }

        this.brand = brand;
        if (!(brand == null || brand.isBlank() || brand.isEmpty())) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        this.model = model;
        if (!(model == null || model.isBlank() || model.isEmpty())) {
            this.model = model;
        } else {
            this.model = "default";
        }

        this.productionCountry = productionCountry;
        if (!(productionCountry == null || productionCountry.isBlank() || productionCountry.isEmpty())) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "Россия";
        }

        if (!(engineVolume <= 0)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        this.color = color;
        if (!(color == null || color.isBlank() || color.isEmpty())) {
            this.color = model;
        } else {
            this.color = "белый";
        }

        if (!(productionYear <= 0)) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (!(color == null || color.isBlank() || color.isEmpty())) {
            this.color = model;
        } else {
            this.color = "белый";
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (!(engineVolume <= 0)) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
        if (!(transmission == null || transmission.isBlank() || transmission.isEmpty())) {
            this.transmission = transmission;
        } else {
            this.transmission = "manual";
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    public void setSummerOrWinterTires(String summerOrWinterTires) {
        this.summerOrWinterTires = summerOrWinterTires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void infoCar() {
        System.out.println("Автомобиль: " +
                "марка: " + brand +
                ";\nмодель: " + model +
                ";\nгод выпуска: " + productionYear +
                ";\nсборка: " + productionCountry +
                ";\nцвет: " + color +
                ";\nобъем двигателя: " + engineVolume + " литра." +
                ";\nтип коробки передач: " + transmission +
                ";\nвид кузова: " + bodyType +
                ";\nгос.номер: " + registrationNumber +
                ";\nкол-во седений: " + numberOfSeats +
                ";\nвид резины: " + summerOrWinterTires);
    }

    public LocalDate timeOfYear() {
        LocalDate localDate = LocalDate.now();
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);
        if (month == 0 || month == 1 || month == 11)
            System.out.println("Время года - зима, установить зимнюю резину \n");
        else if (month == 2 || month == 3 || month == 4)
            System.out.println("Время года - весна, продолжаем ездить на зимней резине \n");
        else if (month == 5 || month == 6 || month == 7)
            System.out.println("Время года - лето, установить летнюю резину \n");
        else
            System.out.println("Время года - осень, продолжаем ездить на летней резине \n");
        return localDate;
    }

    public class Key {
        private String remoteEngineStart;
        private String keyFreeAccess;

        public String getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public void setRemoteEngineStart(String remoteEngineStart) {
            this.remoteEngineStart = remoteEngineStart;
        }

        public String getKeyFreeAccess() {
            return keyFreeAccess;
        }

        public void setKeyFreeAccess(String keyFreeAccess) {
            this.keyFreeAccess = keyFreeAccess;
        }

        public Key(String remoteEngineStart, String keyFreeAccess) {
            this.remoteEngineStart = remoteEngineStart;
            if (!(remoteEngineStart == null || remoteEngineStart.isBlank() || remoteEngineStart.isEmpty())) {
                this.remoteEngineStart = remoteEngineStart;
            } else {
                this.remoteEngineStart = "no remote Engine Start";
            }

            this.keyFreeAccess = keyFreeAccess;
            if (!(keyFreeAccess == null || keyFreeAccess.isBlank() || keyFreeAccess.isEmpty())) {
                this.keyFreeAccess = keyFreeAccess;
            } else {
                this.keyFreeAccess = "no keyFreeAccess";
            }
        }
    }
    public static class Insurance {
        private Double duration;
        private double cost;
        private String number;

        public Insurance(Double duration, double cost, String number) {
            if (duration == null || duration <= 0) {
                this.duration = 0.0;
            } else {
                this.duration = duration;
            }
            this.cost = cost <= 0 ? 10000 : cost;
            if (number.matches("[A-Z]{3}\\d{6}")) {
                this.number = number;
            } else {
                this.number = "Номер указан неверно";
            }
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            if (duration == null || duration <= 0) {
                this.duration = 0.0;
            } else {
                this.duration = duration;
            }
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost <= 0 ? 10000 : cost;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            if (number.matches("[A-Z]{3}\\d{6}")) {
                this.number = number;
            } else {
                this.number = "Номер указан неверно";
            }
        }
        public void checkDuration() {
            if (duration == 0) {
                System.out.println("Вам необходимо оформить страховку!");
            }
        }

        @Override
        public String toString() {
            return "Срок действия страховки: " + duration + " год(а). Стоимость: " + cost + " рублей. Номер страховки: "
                    + number + ".";
        }
    }
}
