package services;

import entities.Restaurant;
import repositories.RestaurantRepository;

import java.math.BigInteger;
import java.util.Collection;

/**
 * @author Hjwasim
 */
public class RestaurantService extends BaseService<Restaurant, BigInteger> {
    private final RestaurantRepository<Restaurant, String> restaurantRepository;
    public RestaurantService(RestaurantRepository repository) {
        super(repository);
        restaurantRepository = repository;
    }
    public void add(Restaurant restaurant) throws Exception {
        if (restaurantRepository.ContainsName(restaurant.getName())) {
            throw new Exception(String.format("There is already a product with the name - %s", restaurant.getName()));
        }
        if (restaurant.getName() == null || "".equals(restaurant.getName())) {
            throw new Exception("Restaurant name cannot be null or empty string.");
        }
        super.add(restaurant);
    }
    @Override
    public Collection<Restaurant> getAll() {
        return super.getAll();
    }
}