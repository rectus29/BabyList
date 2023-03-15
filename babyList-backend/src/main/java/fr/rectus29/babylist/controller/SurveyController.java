package fr.rectus29.babylist.controller;

import fr.rectus29.babylist.enums.EnumSexe;
import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.model.SurveyAnswer;
import fr.rectus29.babylist.repository.ListRowRepository;
import fr.rectus29.babylist.service.SurveyService;
import jakarta.websocket.server.PathParam;
import lombok.Data;
import lombok.experimental.Accessors;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/surveys")
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping("/{id}")
    public SurveyCommand findOne(@PathParam("id") ObjectId objectId) {
        return surveyService.findOptionalById(objectId).map(SurveyCommand::of).orElse(null);
    }
    @PostMapping("")
    public SurveyCommand findOne(@RequestBody() SurveyCommand surveyCommand) {
        return SurveyCommand.of(surveyService.createSurvey(surveyCommand));
    }

    @Data
    @Accessors(chain = true)
    public static class SurveyCommand {
        private String userName;
        private String userEmail;
        private EnumSexe sexe;
        private Instant dateOfBirth;
        private float weightOfBirth;
        private String babyFirstName;
        public static SurveyCommand of(SurveyAnswer surveyAnswer){
            return new SurveyCommand()
                    .setSexe(surveyAnswer.getSexe())
                    .setBabyFirstName(surveyAnswer.getBabyFirstName())
                    .setUserName(surveyAnswer.getUserName())
                    .setUserEmail(surveyAnswer.getUserEmail())
                    .setBabyFirstName(surveyAnswer.getBabyFirstName())
                    .setDateOfBirth(surveyAnswer.getDateOfBirth())
                    .setWeightOfBirth(surveyAnswer.getWeightOfBirth());
        }
    }
}
