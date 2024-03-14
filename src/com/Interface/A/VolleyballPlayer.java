package com.Interface.A;

public class VolleyballPlayer extends Player{

    private long numberOfPoints = 785;

    public long getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(long numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Vallebolchi ma'lumotlari : ");
        Player player = new VolleyballPlayer();
        player.getInfo();
        System.out.println("Toplagan ochkolari : " + numberOfPoints);
    }
}
