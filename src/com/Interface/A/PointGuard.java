package com.Interface.A;

public class PointGuard extends BasketballPlayer{

    private long countOfGuard = 320;

    public long getCountOfGuard() {
        return countOfGuard;
    }

    public void setCountOfGuard(long countOfGuard) {
        this.countOfGuard = countOfGuard;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Basketbolchi zashitnik ma'lumotlari : ");
        BasketballPlayer basketballPlayer = new PointGuard();
        basketballPlayer.getInfo();
        System.out.println("Qarshiliklar soni : " + countOfGuard);
    }
}
