package repositories;

/**
 * @author Hjwasim
 */
public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {
    boolean ContainsName(String name);
}
