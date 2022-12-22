package fr.rectus29.babylist.repository;

import fr.rectus29.babylist.model.ListRow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ListRowRepository extends MongoRepository<ListRow, UUID> {


    List<ListRow> findByLabel(String label);

    @Query("{name:'?0'}")
    ListRow findItemByName(String name);

}
