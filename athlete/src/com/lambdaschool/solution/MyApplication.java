package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteCreation createdAthlete;

    public MyApplication(AthleteCreation createdAthlete)
    {
        this.createdAthlete = createdAthlete;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        createdAthlete.displayAthlete();
        System.out.println("************\n");
    }
}
