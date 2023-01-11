package fr.rectus29.babylist.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true, fluent = true)
public class GenericEntity {

    @Id
    private UUID id = UUID.randomUUID();
}
