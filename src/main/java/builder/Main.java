package builder;

public class Main {
    public static void main(String[] args) {
        Recipe recipe = new Recipe.Builder()
                .setIllness("Cancer")
                .setMedicine("Chemical therapy")
                .setCourseDuration("5 months").build();
        System.out.println(recipe.toString());
    }
}
