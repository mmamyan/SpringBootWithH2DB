package api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface HistoryRepository extends JpaRepository<HistoryData, Long> {
}
