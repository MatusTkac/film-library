package prax.kniznica.history;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/history")
@RequiredArgsConstructor
public class HistoryController {

    private final HistoryService historyService;

    @GetMapping("/getAll")
    public ResponseEntity<List<History>> getAllHistory() {
        return ResponseEntity.ok(historyService.findAll());
    }

    @PostMapping("/add")
    public ResponseEntity<History> addHistory(@RequestBody History history) {
        return ResponseEntity.ok(historyService.create(history));
    }
}
