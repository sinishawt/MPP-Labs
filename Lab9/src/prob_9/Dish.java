package prob_9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                           new Dish("beef", false, 700, Dish.Type.MEAT),
                           new Dish("chicken", false, 400, Dish.Type.MEAT),
                           new Dish("french fries", true, 530, Dish.Type.OTHER),
                           new Dish("rice", true, 350, Dish.Type.OTHER),
                           new Dish("season fruit", true, 120, Dish.Type.OTHER),
                           new Dish("pizza", true, 550, Dish.Type.OTHER),
                           new Dish("prawns", false, 400, Dish.Type.FISH),
                           new Dish("salmon", false, 450, Dish.Type.FISH));
    
    //a. Is there any Vegetarian meal available ( return type boolean)
    private static boolean isVegetarianMenu(){
        return menu.stream().anyMatch(Dish::isVegetarian);
    }
    
    //b. Is there any healthy menu have calories less than 1000 ( return type boolean)
    
    private static boolean isHealthyMenu(){
        return menu.stream().allMatch(d -> d.getCalories() < 1000);
    }
    
    //c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean)
    private static boolean isHealthyMenu2(){
        return menu.stream().noneMatch(d -> d.getCalories() >= 1000);
    }
    
    //d. find and return the first item for the type of MEAT( return type Optional<Dish>)
    private static Optional<Dish> findNonVegetarianDish(){
    	return menu.stream().filter(d-> d.getType()==Dish.Type.MEAT).findFirst();
    }
    
    //e. calculateTotalCalories() in the menu using reduce. (return int)
    private static int calculateTotalCalories() {
        return menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
    }
    
    //f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int)
    private static int calculateTotalCaloriesMethodRef() {
        return menu.stream().mapToInt(Dish::getCalories).sum();
    }
    
    //e. Implement a main method to test.
    public static void main(String...args){
        if(isVegetarianMenu()){
            System.out.println("======Vegetarian friendly=======");
        }

        System.out.println(isHealthyMenu());
        System.out.println(isHealthyMenu2());
        
        Optional<Dish> dish = findNonVegetarianDish();
        dish.ifPresent(d -> System.out.println(d.getName()));
        
        System.out.println("Total calories in menu: " + calculateTotalCalories());
        System.out.println("Total calories in menu: " + calculateTotalCaloriesMethodRef());

        
    }
    
    
}