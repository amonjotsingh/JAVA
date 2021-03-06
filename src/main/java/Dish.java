import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@Builder
public class Dish {
    private String name;
    private DishType dishType;
    private double cost;
    private List<String> ingredients = new ArrayList<>();

    public int compareTo(Dish a){
        return (this.name.compareTo(a.name));
    }
}
