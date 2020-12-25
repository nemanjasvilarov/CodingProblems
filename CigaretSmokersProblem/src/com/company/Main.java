package com.company;

public class Main {

    public static void main(String[] args) {

        SmokingAgent agent = new SmokingAgent();
        Smoker tabaccoSmoker = new Smoker(agent, "Tabacco");
        Smoker paperSmoker = new Smoker(agent, "Paper");
        Smoker matchesSmoker = new Smoker(agent, "Matches");
        agent.start();
        tabaccoSmoker.start();
        paperSmoker.start();
        matchesSmoker.start();
    }
}
