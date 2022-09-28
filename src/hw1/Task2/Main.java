package hw1.Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*Напишите программу, с помощью которой можно посчитать стоимость букета в зависимости от состава цветов в нем и узнать срок стояния букета.
        Стоимость букета рассчитывается в зависимости от состава + 10% надбавка за работу флориста. Срок стояния букета считается по наименьшему сроку.
        В консоль должна выводиться информация о составе букета, его стоимости и сроке стояния. Например, букет, в котором есть роза обыкновенная – 3 ,
        хризантема – 5, гипсофила – 1, будет стоить 220,84 рублей и простоит 3 суток.*/

        Flower flower1 = new Flower("Роза обыкновенная", " ", "Голландия", 35.59, 0);
        Flower flower2 = new Flower("Хризантема"," ", " ", 15, 5);
        Flower flower3 = new Flower("Пион"," ", "Англии", 69.9, 1);
        Flower flower4 = new Flower("Гипсофила"," ", "Турция", 19.5, 10);

        flower1.setFlowerColor("красный");
        flower1.setCountry("Roma");
        System.out.println(flower1.getFlowerColor());
        flower1.setCost(48.5459898);


        System.out.println(flower1);
        System.out.println(flower2);
        System.out.println(flower3);
        System.out.println(flower4);
    }
}
