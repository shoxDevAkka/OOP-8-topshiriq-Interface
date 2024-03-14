package com.Interface.A;

public class GoalKeeper extends FootballPlayer{

    private long countOfSaves = 32;

    public long getCountOfSaves() {
        return countOfSaves;
    }

    public void setCountOfSaves(long countOfSaves) {
        this.countOfSaves = countOfSaves;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Futbolchi varatar ma'lumotlari : ");
        FootballPlayer footballPlayer = new GoalKeeper();
        footballPlayer.getInfo();
        System.out.println("Savlari soni : " + countOfSaves);
    }
}
