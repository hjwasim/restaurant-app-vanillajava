package repositories;

import entities.Entity;

import java.util.Collection;

/**
 * @author Hjwasim
 */
public interface ReadOnlyRepository<TE,T> {
    boolean contains(T id);
    Entity get(T id);
    Collection<TE> getAll();
}
