package com.Interface.A;

public class FootballPlayer extends Player {

    private long countOfRedCard = 7;
    private long countOfYellowCard = 32;
    private long countOfGoals = 78;

    public long getCountOfRedCard() {
        return countOfRedCard;
    }

    public void setCountOfRedCard(long countOfRedCard) {
        this.countOfRedCard = countOfRedCard;
    }

    public long getCountOfYellowCard() {
        return countOfYellowCard;
    }

    public void setCountOfYellowCard(long countOfYellowCard) {
        this.countOfYellowCard = countOfYellowCard;
    }

    public long getCountOfGoals() {
        return countOfGoals;
    }

    public void setCountOfGoals(long countOfGoals) {
        this.countOfGoals = countOfGoals;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Futbolchi ma'lumotlari : ");
        Player player = new FootballPlayer();
        player.getInfo();
        System.out.println("Qizil kartochkalar soni :" + countOfRedCard);
        System.out.println("Sariq kartochkalar soni : " + countOfYellowCard);
        System.out.println("Gollar soni : " + countOfGoals);
    }

}
