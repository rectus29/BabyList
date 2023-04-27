package fr.rectus29.babylist;

import fr.rectus29.babylist.enums.EnumSexe;
import fr.rectus29.babylist.model.SurveyAnswer;
import fr.rectus29.babylist.repository.SurveyRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = WavefrontProperties.Application.class)
@AutoConfigureMockMvc
@DataJpaTest
class BabyListApplicationTest {


    @Autowired
    private MockMvc mvc;

    @Autowired
    private SurveyRepository surveyRepository;

    @Test
    public void initTest(){

        SurveyAnswer surveyAnswer = new SurveyAnswer()
                .setSexe(EnumSexe.BOTH)
                .setUserName("userName")
                .setUserEmail("userName@gmail.com")
                .setBabyFirstName("Pierre")
                .setWeightOfBirth(12)
                .setDateOfBirth(new Date().toInstant());

        surveyRepository.save(surveyAnswer);

//        createTestEmployee("bob");
//
//        mvc.perform(get("/api/employees")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(content()
//                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$[0].name", is("bob")));

    }

}