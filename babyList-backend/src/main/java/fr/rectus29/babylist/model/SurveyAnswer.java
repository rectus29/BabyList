package fr.rectus29.babylist.model;

import fr.rectus29.babylist.enums.EnumSexe;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Accessors(chain = true)
@Document("survey_answer")
public class SurveyAnswer extends GenericEntity {

    private String userName;
    private String userEmail;
    private EnumSexe sexe;
    private Instant dateOfBirth;
    private float weightOfBirth;
    private String babyFirstName;


}
