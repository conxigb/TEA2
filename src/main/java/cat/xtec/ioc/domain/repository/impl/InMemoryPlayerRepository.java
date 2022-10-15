package cat.xtec.ioc.domain.repository.impl;

import cat.xtec.ioc.domain.Player;
import cat.xtec.ioc.domain.repository.PlayerRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryPlayerRepository implements PlayerRepository {

    private final Map<Integer, Map<Integer, Player>> players = new HashMap<>();

    public InMemoryPlayerRepository() {
        Player first = new Player(1, "Lionel Messi", 472, 29, 1);
        Player second = new Player(2, "Luis Suarez", 100, 29, 1);
        Player third = new Player(3, "Cristiano Ronaldo", 376, 29, 2);
        Player fourth = new Player(4, "Gareth Bale", 70, 27, 2);
        Map<Integer, Player> fcb = new HashMap<>();
        fcb.put(1, first);
        fcb.put(2, second);
        players.put(1, fcb);
        Map<Integer, Player> rm = new HashMap<>();
        rm.put(1, third);
        rm.put(2, fourth);
        players.put(2, rm);
    }

    @Override
    public List<Player> getByTeam(int teamId) {
        return new ArrayList<>(this.players.get(teamId).values());
    }

    @Override
    public void add(Player player) {
        Map<Integer, Player> team = this.players.get(player.getTeamId());
        team.put(player.getId(), player);
    }

    @Override
    public void update(Player player) {
        Map<Integer, Player> team = this.players.get(player.getTeamId());
        if(team.containsKey(player.getId())) {
            Player toUpdate = team.get(player.getId());
            toUpdate.setGoals(player.getGoals());
            toUpdate.setAge(player.getAge());
        }
    }

    @Override
    public void delete(int teamId, int id) {
        Map<Integer, Player> team = this.players.get(teamId);
        if(team.containsKey(id)) {
            team.remove(id);
        }
    }

    @Override
    public Player get(int teamId, int id) {
        Map<Integer, Player> team = this.players.get(teamId);
        return team.get(id);
    }

}
