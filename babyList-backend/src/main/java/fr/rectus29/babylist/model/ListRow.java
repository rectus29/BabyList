package fr.rectus29.babylist.model;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Accessors(chain = true)
@Document("list_row")
public class ListRow extends GenericEntity{

    private String label;
    private List<String> linkList = new ArrayList<>();
    @DBRef
    private User user;

    public ListRow addLink(String linkString){
        this.linkList.add(linkString);
        return this;
    }

}
