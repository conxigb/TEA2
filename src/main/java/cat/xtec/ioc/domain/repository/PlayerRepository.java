package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Player;
import java.util.List;

public interface PlayerRepository {
    List<Player> getByTeam(int teamId); 
    void add(Player player);
    void update(Player player);
    void delete(int teamId, int id);
    Player get(int teamId, int id);    
}
