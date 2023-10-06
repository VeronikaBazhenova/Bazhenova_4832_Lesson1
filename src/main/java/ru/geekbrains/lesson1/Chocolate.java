package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    private double calories;
    public double getVolume() {
        return calories;
    }

    public void setVolume(double calories) {
        this.calories = calories;
    }
    public double getCalories(){
        return  calories;
    }
    public Chocolate(String brand, String name, double price, double calories){
        super(brand, name, price);
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколад] %s - %s - %.2f - калории: %.2f", brand, name, price, calories);
    }
}
