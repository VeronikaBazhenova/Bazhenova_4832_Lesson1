package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {


    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }


    public BottleOfMilk getBottleofMilk(double volume, int fat){
        for (Product product : products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getVolume() == volume && bottleOfMilk.getFat() == fat){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    //------------------//
    public Chocolate getChocolate(double calories, String name){
        for (Product product: products){
            if (product instanceof  Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.getCalories() == calories && chocolate.getName().equals(name)){
                    return  chocolate;
                }
             }
        }
        return null;
    }
    public Chips getChips(String taste, String name){
        for (Product product: products){
            if (product instanceof  Chips){
                Chips chips = (Chips) product;
                if (chips.getTaste().equals(taste) && chips.getName().equals(name)){
                    return  chips;
                }
            }
        }
        return null;
    }

}
