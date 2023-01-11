package fr.rectus29.babylist.model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
@Document("list_row")
public class ListRow extends GenericEntity{


    private String label;
    private String link;

}
