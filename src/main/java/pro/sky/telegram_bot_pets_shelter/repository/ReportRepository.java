package pro.sky.telegram_bot_pets_shelter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegram_bot_pets_shelter.entity.Report;

public interface ReportRepository extends JpaRepository<Report,Long> {
}