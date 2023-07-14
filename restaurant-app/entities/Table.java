package entities;

import java.math.BigInteger;

/**
 * @author Hjwasim
 */
public class Table extends BaseEntity<BigInteger> {

    private int capacity;

    public Table(BigInteger id, String name,int capacity) {
        super(id, name);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Table{" +
                "capacity=" + capacity +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
