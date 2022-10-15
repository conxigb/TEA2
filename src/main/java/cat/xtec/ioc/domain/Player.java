package cat.xtec.ioc.domain;

import java.util.Objects;

public class Player {

    private int id;

    private String name;

    private int goals;

    private int age;

    private int teamId;

    public Player() {
    }

    
    public Player(int id, String name, int goals, int age, int teamId) {
        this.id = id;
        this.name = name;
        this.goals = goals;
        this.age = age;
        this.teamId = teamId;
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

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
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
        return "Player{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", goals=" + goals
                + ", age=" + age
                + ", teamId=" + teamId
                + '}';
    }

}
