package cat.xtec.ioc.domain.repository.impl;

import cat.xtec.ioc.domain.Team;
import cat.xtec.ioc.domain.repository.TeamRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;


@Repository
public class InMemoryTeamRepository implements TeamRepository {

    private final Map<Integer, Team> teams = new HashMap<>();

    public InMemoryTeamRepository() {
        Team first = new Team(1, "F.C. Barcelona", "1899");
        Team second = new Team(2, "Real Madrid", "1902");
        teams.put(1, first);
        teams.put(2, second);
        
    }
    
    @Override
    public List<Team> getAll() {
        return new ArrayList<>(teams.values());
    }
    
    @Override
    public Team get(int id) {
        return this.teams.get(id);
    }
    
}
