package creature;

import com.inin3_pr1_2.kordalski.Human;
import com.inin3_pr1_2.kordalski.Saleable;

abstract public class Animal implements Saleable, Feedable {
    private static final double DEFAULT_FOOD_WEIGHT = 1.0;
    public String species;
    private boolean canFly;
    private int legs;
    boolean isAlive;
    public double weight;

    public Animal(String species) {
        this.species = species;
        this.canFly = canFly;
        this.legs = legs;
        this.isAlive = isAlive;
        this.weight = weight;
    }
    

    public void Feed() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz nakarmic martwego zwierzaka, halo policja!!");
            return;
        }
        this.weight += 1.0;
        System.out.println(this.species + " nakarmiony, teraz wazy " + this.weight + "kg");
    }

    public void feed(){
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(double foodWeight){
        if (this.isAlive){
            this.weight += foodWeight;
            System.out.println("thx for food bro");
        } else {
            System.out.println("too late, sorry");
        }
    }

    public void GoForWalk() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz wyprowadzic martwego zwierzaka, halo policja!!");
            return;
        }

        this.weight -= 1.0;
        if(this.weight <= 0.0) {
            this.isAlive = false;
            System.out.println(this.species + " umarl");
        }
    }
    @Override
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.pet != this){
            System.out.println("Sorry, ale nie masz zwierzaka");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Udało się sprzedać zwierzaka za " + price + " pln");
        }
    }

}
