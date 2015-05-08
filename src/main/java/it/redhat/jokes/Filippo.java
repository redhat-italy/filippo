package it.redhat.jokes;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class Filippo {

    public static void main(String[] args) {

        Filippo pippo = new Filippo();
        System.out.println(pippo.says());

    }

    public String says() {
        int index = new Random().nextInt(sentences.length);
        InputStream in;
        AudioStream audioStream = null;

        try {
            in = new FileInputStream(index + ".wav");
            audioStream = new AudioStream(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        AudioPlayer.player.start(audioStream);
        return sentences[index];
    }

    private String[] sentences = {"Osu!", "Calmi...", "Stai calmo...", "Spacco tutto!", "Ma perche'?", "Che brutte persone...", "Perche'?", "Che squallore...", "Mio fido allievo...", "Mammia mia Marinelli...", "Assumete Tarocchi!", "Mamma mia"};

}
