package fr.rectus29.babylist.model;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
@Document("users")
public class User extends GenericEntity {

    private String name;
    private String firstName;
    private String email;

}
