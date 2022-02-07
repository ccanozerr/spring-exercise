package com.ccanozerr.football.service.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Statistic extends BaseEntity {
    @OneToOne
    private Season season;
}
