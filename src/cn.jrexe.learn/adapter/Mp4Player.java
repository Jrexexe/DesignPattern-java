package cn.jrexe.learn.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {

    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Mp4Player Covers To mp3 : play " + filename);
    }
}
