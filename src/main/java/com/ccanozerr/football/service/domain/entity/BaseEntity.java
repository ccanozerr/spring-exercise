package com.ccanozerr.football.service.domain.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.OffsetDateTime;

@Getter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Version
    private Integer version;

    @Column(name = "created_date", updatable = false)
    private OffsetDateTime createdDate;

    @Column(name = "updated_date", insertable = false)
    private OffsetDateTime updatedDate;
}
