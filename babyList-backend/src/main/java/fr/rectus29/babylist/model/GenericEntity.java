package fr.rectus29.babylist.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class GenericEntity {
    @Id
    private UUID id = UUID.randomUUID();
    @CreatedDate
    private Instant creationInstant = Instant.now();
    @LastModifiedDate
    private Instant updateInstant;
}
