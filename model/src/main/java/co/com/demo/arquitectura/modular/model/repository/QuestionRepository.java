package co.com.demo.arquitectura.modular.model.repository;

import co.com.demo.arquitectura.modular.model.models.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
