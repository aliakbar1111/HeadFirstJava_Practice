package com.company;

import javax.sound.midi.*;

public class ExceptionHandling_chpr11 {

}

class MusicApp {
    public static void main(String[] args) {

        MusicApp musicApp = new MusicApp();
        musicApp.play();

    }

    void play() {

        try {
//            getting sequencer (CD player) from MidiSystem
            Sequencer player = MidiSystem.getSequencer();
//            opening sequencer
            player.open();
// creating sequence
            Sequence sq = new Sequence(Sequence.PPQ, 4);
// get a Track from sequence
            Track track = sq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a,1);
//            filling track with MidiEvents
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(a, 16);
            track.add(noteOff);

            player.setSequence(sq);
            player.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
