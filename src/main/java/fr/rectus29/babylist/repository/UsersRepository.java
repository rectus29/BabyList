package fr.rectus29.babylist.repository;

import fr.rectus29.babylist.model.ListRow;
import fr.rectus29.babylist.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.UUID;

public interface UsersRepository extends MongoRepository<User, UUID> {


    List<User> findByEmail(String email);

    @Query("{name:'?0'}")
    ListRow findItemByName(String name);

}
