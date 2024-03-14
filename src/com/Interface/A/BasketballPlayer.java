package com.Interface.A;

public class BasketballPlayer extends Player{

    private long numberOfGoals = 458;

    public long getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(long numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Basketbolchi ma'lumotlari : ");
        Player player = new BasketballPlayer();
        player.getInfo();
        System.out.println("Goallari soni : " + numberOfGoals);
    }
}
