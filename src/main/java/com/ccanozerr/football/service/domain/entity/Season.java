package com.ccanozerr.football.service.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import java.time.Year;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Season extends BaseEntity {
    private Year startYear;
    private Year endYear;
    private Integer game;
    private Integer goal;
    private Integer assist;
    private Integer redCard;
    private Integer yellowCard;
}
