package pro.sky.telegram_bot_pets_shelter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegram_bot_pets_shelter.entity.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor,Long> {
}
