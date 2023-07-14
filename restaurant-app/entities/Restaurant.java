package entities;

import java.util.List;

/**
 * @author Hjwasim
 */
public class Restaurant extends BaseEntity<String> {

    private List<Table> tables;

    public Restaurant(String name, String id,List<Table> tables) {
        super(id, name);
        this.tables = tables;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "tables=" + tables +
                '}';
    }
}
