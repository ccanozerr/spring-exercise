package com.ccanozerr.football.service.domain.entity;

import com.ccanozerr.football.service.enums.Country;
import com.ccanozerr.football.service.enums.League;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.Year;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Team extends BaseEntity{
    @NotNull(message = "Name can not be null")
    private String name;
    private String nickName;
    @NotNull(message = "Year can not be null")
    private Year establishment;
    @NotNull(message = "Country can not be null")
    private Country country;
    @NotNull(message = "Team can not be null")
    private League league;
    @OneToMany
    private List<Footballer> footballer;
}
