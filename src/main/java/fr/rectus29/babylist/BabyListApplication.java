package fr.rectus29.babylist;

import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.repository.ListRowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "fr.rectus29")
public class BabyListApplication implements CommandLineRunner {

    @Autowired
    private ListRowRepository listRowRepository;

    public static void main(String[] args) {
        SpringApplication.run(BabyListApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        listRowRepository.deleteAll();

        // save a couple of customers
        listRowRepository.save(new ListRow().label("plop").link("https://google.fr"));
        listRowRepository.save(new ListRow().label("plip").link("https://google.fr"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (ListRow listRow : listRowRepository.findAll()) {
            System.out.println(listRow);
        }
        System.out.println();

        for (ListRow listRow : listRowRepository.findByLabel("plop")) {
            System.out.println(listRow);
        }
    }
}
