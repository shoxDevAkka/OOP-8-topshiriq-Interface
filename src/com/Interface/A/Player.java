package com.Interface.A;

public class Player implements Information {

    private static String nameOfPlayer = "Lebron James";
    private static String sportType = "basketbol";
    private static long numberPosition = 7;
    private static String teamName = "Lakers";


    @Override
    public void getInfo() {
        System.out.println("Ism : " + nameOfPlayer);
        System.out.println("Sport turi : " + sportType);
        System.out.println("O'yinchi raqami : " + numberPosition);
        System.out.println("O'yinchi jamoasi : " + teamName);
    }

    @Override
    public void getTeamName() {
        System.out.println("O'yinchi jamoasi : " + teamName);
    }

    public static String getNameOfPlayer() {
        return nameOfPlayer;
    }

    public static void setNameOfPlayer(String nameOfPlayer) {
        Player.nameOfPlayer = nameOfPlayer;
    }

    public static String getSportType() {
        return sportType;
    }

    public static void setSportType(String sportType) {
        Player.sportType = sportType;
    }

    public static long getNumberPosition() {
        return numberPosition;
    }

    public static void setNumberPosition(long numberPosition) {
        Player.numberPosition = numberPosition;
    }

    public static void setTeamName(String teamName) {
        Player.teamName = teamName;
    }
}
