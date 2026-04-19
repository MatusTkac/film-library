package prax.kniznica.history;

import java.util.List;

public interface HistoryService {
    List<History> findAll();
    History create(History history);
}
