package cat.xtec.ioc.domain;

import java.util.Objects;

public class Team {

    private int id;
    private String name;
    private String foundationYear;

    public Team(int id, String name, String foundationYear) {
        this.id = id;
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public Team() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(String foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Player)) {
            return false;
        }

        final Player other = (Player) o;
        return other.getId() == this.id;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    @Override
    public String toString() {
        return "Team{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", foundationYear=" + foundationYear
                + '}';
    }

}
