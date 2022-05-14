package kr.misc;

public abstract class Animals {

    private int legs;
    private int eyes;
    private int ears;

    public int getLegs() {
        return legs;
    }

    public int getEyes() {
        return eyes;
    }

    public int getEars() {
        return ears;
    }

    public Animals(AnimalBuilder builder) {
        this.legs = builder.legs;
        this.eyes = builder.eyes;
        this.ears = builder.ears;
    }

    public abstract static class AnimalBuilder {

        private int legs;
        private int eyes;
        private int ears;

        public AnimalBuilder setLegs(int legs) {
            this.legs = legs;
            return this;
        }

        public AnimalBuilder setEyes(int eyes) {
            this.eyes = eyes;
            return this;
        }

        public AnimalBuilder setEars(int ears) {
            this.ears = ears;
            return this;
        }

        public abstract Animals build();

    }

    @Override
    public String toString() {
        return  "legs=" + legs +
                ", eyes=" + eyes +
                ", ears=" + ears ;
    }
}
