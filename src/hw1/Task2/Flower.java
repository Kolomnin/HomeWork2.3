package hw1.Task2;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    private Integer lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, Integer lifeSpan) {

        if (!(flowerName == null || flowerName.isBlank() || flowerName.isEmpty())) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "Информация не указана";
        }

        if (!(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty())) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }

        this.country = country;
        if (!(country == null || country.isBlank() || country.isEmpty())) {
            this.country = country;
        } else {
            this.country = "Россия";
        }

        if (!(cost <= 0)) {
            cost = Math.round(cost * 100.0) / 100.0;
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }

        if (!(lifeSpan == null || lifeSpan <= 0)) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public void setFlowerColor(String flowerColor) {
        if (!(flowerColor == null || flowerColor.isBlank() || flowerColor.isEmpty())) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setCountry(String country) {
        if (!(country == null || country.isBlank() || country.isEmpty())) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (!(cost <= 0.0)) {
            cost = Math.round(cost * 100.0) / 100.0;
            this.cost = cost;
        } else {
            this.cost = 1.0;
        }
    }



    @Override
    public String toString() {
        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                "flowerColor='" + flowerColor + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + cost +
                ", lifeSpan=" + lifeSpan +
                '}';
    }

    public class Bouquet{
        private final Flower[] flowers;

        public Bouquet(Flower[] flowers){
            this.flowers = flowers;
        }

        public Integer findMinExpiryDays() {
            int minExpiryDays = flowers[0].lifeSpan;
            for (int i = 1; i < flowers.length; i++) {
                if(minExpiryDays > flowers[i].lifeSpan) {
                    minExpiryDays = flowers[i].lifeSpan;
                }
            }
                    return minExpiryDays;
        }

        public double getCost(int floristPercent) {
            double index = ((double) floristPercent/100)+1;
            double sum = 0;
            for (Flower flower: flowers) {
                sum += flower.getCost();
            }
            double result = sum * index;
            return result;
        }

    }
}
