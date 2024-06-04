package com.example.prak3;

import java.util.ArrayList;


public class DataSource {

    public static ArrayList<Forall> foralls = generateDummyForalls();

    private static ArrayList<Forall> generateDummyForalls() {
        ArrayList<Forall> foralls = new ArrayList<>();
        foralls.add(new Forall("Manchester United", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.mu2, R.drawable.storymu, R.drawable.postmu, 999999, 12));
        foralls.add(new Forall("Manchester City", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.mc, R.drawable.storycity, R.drawable.postcity, 888888, 10));
        foralls.add(new Forall("Liverpool", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.liverpool, R.drawable.storyliv, R.drawable.postliv, 10000, 11));
        foralls.add(new Forall("Chelsea", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.chelsea, R.drawable.storychel, R.drawable.postchel, 700000, 13));
        foralls.add(new Forall("Barcelona", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.barca, R.drawable.storybarca, R.drawable.postbarca, 1400000, 14));
        foralls.add(new Forall("Real Madrid", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.rm, R.drawable.storyrm, R.drawable.postrm, 7777777, 17));
        foralls.add(new Forall("Arsenal", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.arsenall, R.drawable.storyarsenal, R.drawable.postarsenal, 120, 120));
        foralls.add(new Forall("Bayern Munchen", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.munchen, R.drawable.storymunchen, R.drawable.postmunch, 120, 120));
        foralls.add(new Forall("Bayer Leverkusen", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.leverkusen, R.drawable.stroylev, R.drawable.postlev, 120, 120));
        foralls.add(new Forall("Paris Saint German", "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book", R.drawable.psg, R.drawable.storypsg, R.drawable.postpsg, 120, 120));
        return foralls;
    }


}