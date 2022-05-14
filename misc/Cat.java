package kr.misc;

public class Cat extends Animals{

    private int tail;

    public Cat(CatBuilder builder) {
        super(builder);
        this.tail = builder.tail;
    }

    public int getTail() {
        return tail;
    }

    @Override
    public String toString() {
        return "Cat has " +
                "tail=" + tail + ", " +
                super.toString();
    }

    public static class CatBuilder extends Animals.AnimalBuilder {

        private int tail;

        public CatBuilder setTail(int tail) {
            this.tail = tail;
            return this;
        }

        @Override
        public Animals build() {
            return new Cat(this);
        }
    }


}
