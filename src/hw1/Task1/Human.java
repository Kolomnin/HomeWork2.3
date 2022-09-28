package hw1.Task1;

import java.time.LocalDate;

public class Human {
    LocalDate date = LocalDate.now();
    private String name;
    private String town;
    private int yearOfBirth;
    private String job;


    public Human(String name, String town, int yearOfBirth, String job) {

        this.name = name;
        if (name == null || name.isBlank() || name.isEmpty()) {
            this.name = "информация не указана";
        }

        this.town = town;
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "информация не указана";
        }

        this.job = job;
        if (job == null || job.isBlank() || job.isEmpty()) {
            this.job = "информация не указана";
        }

        this.yearOfBirth = date.getYear() - yearOfBirth;
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setTown(String town) {
        if (!(town == null || town.isBlank() || town.isEmpty())) {
            this.town = town;
        } else {
            this.town = "информация не указана";
        }
    }
    public String getTown() {
        return town;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (!(yearOfBirth <= 0)) {
            this.yearOfBirth = date.getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name +
                ", я из города " + town +
                ", я родил[ся/ась] в " + yearOfBirth +
                " году. Я работаю на должности " + job + ". Будем знакомы!";
    }
}