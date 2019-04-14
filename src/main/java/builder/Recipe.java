package builder;

public class Recipe {
    private String illness;
    private String medicine;
    private String  courseDuration;

    public static class Builder{
        private String illness;
        private String medicine;
        private String courseDuration;

        public Builder setIllness(String illness) {
            this.illness = illness;
            return this;
        }

        public Builder setMedicine(String medicine) {
            this.medicine = medicine;
            return this;
        }

        public Builder setCourseDuration(String courseDuration) {
            this.courseDuration = courseDuration;
            return this;
        }

        public Recipe build(){
            return new Recipe(this);
        }
    }

    private Recipe(Builder builder) {
        this.illness = builder.illness;
        this.medicine = builder.medicine;
        this.courseDuration = builder.courseDuration;
    }

    public String getIllness() {
        return illness;
    }

    public String getMedicine() {
        return medicine;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "illness='" + illness + '\'' +
                ", medicine='" + medicine + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                '}';
    }
}
