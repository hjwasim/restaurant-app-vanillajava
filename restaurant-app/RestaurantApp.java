import entities.Restaurant;
import entities.Table;
import repositories.InMemRestaurantRepository;
import services.RestaurantService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Hjwasim
 */
public class RestaurantApp {
    public static void main(String[] args) {
        try {
            RestaurantService restaurantService = new RestaurantService(new InMemRestaurantRepository());

            Table table1 = new Table(BigInteger.ONE, "Table 1", 6);
            Table table2 = new Table(BigInteger.TWO, "Table 2", 4);
            Table table3 = new Table(BigInteger.valueOf(3), "Table 3", 2);
            List<Table> tableList = new ArrayList<>();
            tableList.add(table1);
            tableList.add(table2);
            tableList.add(table3);

            Restaurant restaurant1 = new Restaurant("Big-O Restaurant", "1", tableList);
            restaurantService.add(restaurant1);

            Restaurant restaurant2 = new Restaurant("Pizza Shops", "2", null);
            restaurantService.add(restaurant2);
            Restaurant restaurant3 = new Restaurant("La Pasta", "3", null);
            restaurantService.add(restaurant3);

            Collection<Restaurant> restaurants = restaurantService.getAll();

            System.out.println("Restaurants List:");
            restaurants.stream().forEach((restaurant) -> {
                System.out.println(String.format("Restaurant: %s", restaurant));
            });
        } catch (Exception ex) {
            System.out.println(String.format("Exception: %s", ex.getMessage()));
            // Exception Handling Code
        }
    }
}
