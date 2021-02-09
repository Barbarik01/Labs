package com.company;

import com.company.models.Droid;
import com.company.models.ScientistDroid;
import services.Service;

public class Main {

    public static void main(String[] args) {
        Droid scientist1 = new ScientistDroid("Vаsya", 10, 1, 10, "junior");
        Droid scientist2 = new ScientistDroid("Vаsya", 9, 1, 10, "junior");
        Droid scientist3 = new ScientistDroid("Vаsya", 10, 2, 10, "junior");
        Droid scientist4 = new ScientistDroid("Vаsya", 8, 1, 10, "junior");
        Droid team1[] = {scientist1, scientist2};
        Droid team2[] = {scientist3, scientist4};
        Service winner = new Service();
        winner.gameteam(team1,team2);
    }
}
