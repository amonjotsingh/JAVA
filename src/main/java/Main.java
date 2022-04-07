import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 5, 19, 12, 14, 20);
        nums.stream().reduce(0, (a, b) -> a + b);

        List<Dish>
                dishes = Arrays.asList(
                Dish.builder().name("chicken")
                        .dishType(DishType.NON_VEG)
                        .cost(13)
                        .ingredients(Arrays.asList("chicken", "Butter"))
                        .build(),
                Dish.builder().name("Paneer")
                        .dishType(DishType.VEG)
                        .cost(11)
                        .ingredients(Arrays.asList("Fish", "flour"))
                        .build(),
                Dish.builder().name("Pizza")
                        .dishType(DishType.VEG)
                        .cost(15)
                        .ingredients(Arrays.asList("capsicum", "cheese"))
                        .build(),
                Dish.builder().name("chicken biryani")
                        .dishType(DishType.NON_VEG)
                        .cost(18)
                        .ingredients(Arrays.asList("chicken", "rice"))
                        .build()
        );


        dishes.stream().filter(d -> d.getDishType() == DishType.NON_VEG).forEach(System.out::println);

        Optional<Double> max = dishes.stream()
                .map(d -> d.getCost()).max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);

        List<String> ingredientsList = dishes.stream().flatMap(d -> d.getIngredients().stream()).distinct().collect(Collectors.toList());
        System.out.println(ingredientsList);
    }


}
