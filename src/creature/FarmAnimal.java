package creature;

public class FarmAnimal extends Animal implements Edbile{

    boolean beEaten = false;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println(this.species);


    }

    @Override
    public void feed(Double footWeight) {

    }
}
