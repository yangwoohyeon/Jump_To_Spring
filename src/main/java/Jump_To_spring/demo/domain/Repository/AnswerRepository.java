package Jump_To_spring.demo.domain.Repository;

import Jump_To_spring.demo.domain.Entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
}
