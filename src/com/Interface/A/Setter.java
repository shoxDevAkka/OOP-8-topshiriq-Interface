package com.Interface.A;

public class Setter extends VolleyballPlayer{

    private long countOfSets = 45;

    public long getCountOfSets() {
        return countOfSets;
    }

    public void setCountOfSets(long countOfSets) {
        this.countOfSets = countOfSets;
    }

    @Override
    public void getInfo(){
        System.out.println();
        System.out.println("Vallebolchi ma'lumotlari : ");
        VolleyballPlayer volleyballPlayer = new Setter();
        volleyballPlayer.getInfo();
        System.out.println("Ishlagan setlari : " + countOfSets);
    }
}
