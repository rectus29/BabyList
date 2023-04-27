package fr.rectus29.babylist.service;

import fr.rectus29.babylist.controller.SurveyController;
import fr.rectus29.babylist.model.SurveyAnswer;
import fr.rectus29.babylist.repository.SurveyRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    private final SurveyRepository surveyRepository;

    public SurveyService(SurveyRepository surveyRepository) {
        this.surveyRepository = surveyRepository;
    }

    public Optional<SurveyAnswer> findOptionalById(ObjectId objectId) {
        return this.surveyRepository.findById(objectId);
    }

    public SurveyAnswer createSurvey(SurveyController.SurveyCommand surveyCommand) {
        SurveyAnswer sa = new SurveyAnswer()
                .setUserEmail(surveyCommand.getUserEmail())
                .setUserName(surveyCommand.getUserName())
                .setBabyFirstName(surveyCommand.getBabyFirstName())
                .setDateOfBirth(surveyCommand.getDateOfBirth())
                .setSexe(surveyCommand.getSexe())
                .setWeightOfBirth(surveyCommand.getWeightOfBirth());
        sa = this.surveyRepository.save(sa);
        return sa;
    }

    public List<SurveyAnswer> findAll() {
        return this.surveyRepository.findAll();
    }
}
