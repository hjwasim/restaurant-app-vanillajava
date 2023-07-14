package entities;

/**
 * @author Hjwasim
 */
public abstract class BaseEntity<T> extends Entity<T>{
    private final boolean isModified;

    protected BaseEntity(T t, String name) {
        super.id = t;
        super.name = name;
        this.isModified = false;
    }

}
