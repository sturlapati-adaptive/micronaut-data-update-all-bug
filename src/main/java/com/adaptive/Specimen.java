package com.adaptive;

import io.micronaut.data.annotation.*;

import java.time.Instant;
import java.util.UUID;

@MappedEntity
public class Specimen {
    @Id
    private UUID id;
    private String name;
    @Version
    private Long version;
    @DateCreated
    private Instant created;
    @DateUpdated
    private Instant updated;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getUpdated() {
        return updated;
    }

    public void setUpdated(Instant updated) {
        this.updated = updated;
    }
}
