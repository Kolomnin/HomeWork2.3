package hw3.Task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Grande", 2015, " ", "Yellow",
                1.7, "manual", "sedan", "Е777КХ777", 5, "летняя резина");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Germany", "Black",
                3.0, "automatic", "hardtop coupe", "О111ОО190", 4, "летняя резина");
        Car car3 = new Car("BMW", "Z8", 2021, "Germany", "Black",
                3.0, "automatic", "sedan", "А555МР777", 5, "летняя резина");
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2018, "South Korea", "Red",
                2.4, "manual", "Hatchback", "А090КК777", 5,"летняя резина");
        Car car5 = new Car("Hyundai", "Avante", 2016, "South Korea", "Orange",
                1.6, "manual", "wagon", "Т654ТТ799", 5, "летняя резина");

        car1.infoCar();
        car1.timeOfYear();
        car2.infoCar();
        car2.timeOfYear();
        car3.infoCar();
        car3.timeOfYear();
        car4.infoCar();
        car4.timeOfYear();
        car5.infoCar();
        car5.timeOfYear();







    }
}