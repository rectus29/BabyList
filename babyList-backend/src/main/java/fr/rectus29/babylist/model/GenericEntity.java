package fr.rectus29.babylist.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

 @Getter
 @Setter
public class GenericEntity {
    @Id
    private ObjectId id = ObjectId.get();
    @CreatedDate
    private Instant creationInstant = Instant.now();
    @LastModifiedDate
    private Instant updateInstant;
}
