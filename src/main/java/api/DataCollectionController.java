package api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/data")
@RestController
public class DataCollectionController {

    private final HistoryRepository repository;

    DataCollectionController(HistoryRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void storeDataInDB(@RequestBody HistoryData historyData) {
        List<HistoryData> allData = repository.findAll();
        if (allData.stream().noneMatch(data -> data.hashCode() == historyData.hashCode())) {
            repository.save(historyData);

        }
    }

    @GetMapping
    public List<HistoryData> all() {
        return repository.findAll();
    }
}
