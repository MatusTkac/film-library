package prax.kniznica.history;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class HistoryService {

    private final List<History> historyEntries = new ArrayList<>();

    public List<History> findAll() {
        return List.copyOf(historyEntries);
    }

    public History create(History history) {
        if (history.getTimestamp() == null) {
            history.setTimestamp(Instant.now());
        }
        historyEntries.add(history);
        return history;
    }
}
