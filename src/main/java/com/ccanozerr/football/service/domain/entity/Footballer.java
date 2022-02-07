package com.ccanozerr.football.service.domain.entity;

import com.ccanozerr.football.service.enums.Country;
import com.ccanozerr.football.service.enums.Foot;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Footballer extends BaseEntity {
    @NotNull(message = "Name can not be null.")
    private String name;
    private String surname;
    @NotNull(message = "Birthday can not be null")
    private LocalDate birthDay;
    @NotNull(message = "Height can not be null")
    private Integer height;
    @NotNull(message = "Weight can not be null")
    private Integer weight;
    @NotNull(message = "Foot can not be null")
    private Foot foot;
    @OneToOne
    private Team team;
    @NotNull(message = "First nation can not be null")
    private Country firstNation;
    private Country secondNation;
    @OneToMany
    private List<Statistic> statistic;
    private boolean isActive;
}
