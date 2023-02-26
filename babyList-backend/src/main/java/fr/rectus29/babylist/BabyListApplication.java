package fr.rectus29.babylist;

import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.model.User;
import fr.rectus29.babylist.repository.ListRowRepository;
import fr.rectus29.babylist.repository.UsersRepository;
import fr.rectus29.babylist.service.BabySurveyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@Slf4j
@SpringBootApplication
@EnableMongoRepositories(basePackages = "fr.rectus29")
public class BabyListApplication  {

    @Autowired
    private ListRowRepository listRowRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private BabySurveyService babySurveyService;

    public static void main(String[] args) {
        SpringApplication.run(BabyListApplication.class, args);
    }

}
