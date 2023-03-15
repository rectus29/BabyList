package fr.rectus29.babylist.repository;

import fr.rectus29.babylist.model.SurveyAnswer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SurveyRepository extends MongoRepository<SurveyAnswer, ObjectId> {

    @Override
    Optional<SurveyAnswer> findById(ObjectId objectId);
}
