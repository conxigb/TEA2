package cat.xtec.ioc.domain.repository;

import cat.xtec.ioc.domain.Team;
import java.util.List;

public interface TeamRepository {
    List<Team> getAll();     
    Team get(int id);    
}
