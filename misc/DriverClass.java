package kr.misc;

public class DriverClass {

    /**
     * Driver program
     * @param args
     */
    public static void main(String[] args) {

        Dog dog = (Dog) new Dog.DogBuilder().setTail(1).setLegs(4).setEars(2).setEyes(2).build();
        Cat cat = (Cat) new Cat.CatBuilder().setTail(1).setLegs(4).setEars(2).setEyes(2).build();

        System.out.println(dog);
        System.out.println(cat);


    }

}
