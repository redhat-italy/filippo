package it.redhat.jokes;

import java.util.Random;

public class Filippo {

    public static void main( String[] args ) {

        Filippo pippo = new Filippo();
        System.out.println(pippo.says());

    }

    public String says() {
         return sentences[new Random().nextInt(sentences.length)];
    }

    private String[] sentences = {"Osu!", "Calmi...", "Calmo...", "Spacco tutto!", "Ma perche'?", "Che brutte persone...", "Perche'?"};

}
