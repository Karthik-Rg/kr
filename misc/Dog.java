package kr.misc;

public class Dog extends Animals{

    private int tail;

    public Dog(DogBuilder builder) {
        super(builder);
        this.tail = builder.tail;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Dog has " +
                "tail=" + tail + ", " +
                super.toString();
    }

    public static class DogBuilder extends Animals.AnimalBuilder {


        private int tail;

        public DogBuilder setTail(int tail) {
            this.tail = tail;
            return this;
        }

        @Override
        public Animals build() {
            return new Dog(this);
        }
    }

}
