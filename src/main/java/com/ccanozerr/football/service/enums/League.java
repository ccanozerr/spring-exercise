package com.ccanozerr.football.service.enums;

public enum League {
    PREMIER_LEAGUE("Premier League"),
    SERIE_A("Serie A"),
    BUNDESLIGA("Bundesliga"),
    LA_LIGA("La Liga"),
    SUPER_LIG("Süper Lig"),
    EREDIVISIE("Eredevisie"),
    LIGA_NOS("Liga Nos");

    private String league;

    League(String league) {
        this.league = league;
    }

    public String getLeague() {
        return league;
    }
}
