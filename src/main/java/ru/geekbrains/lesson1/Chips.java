package ru.geekbrains.lesson1;

public class Chips extends Product{
    String taste;


    public void setTaste(String taste) {
        this.taste = taste;
    }
    public String getTaste(){
        return  taste;
    }
    public Chips(String brand, String name, double price, String taste){
        super(brand, name, price);
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("[Чипсы] %s - %s - 2f - вкус: %.2f", brand, name, price, taste);
    }

}
