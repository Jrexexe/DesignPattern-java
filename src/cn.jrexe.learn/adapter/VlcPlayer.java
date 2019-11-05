package cn.jrexe.learn.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
        System.out.println("VlcPlayer  Cover To mp3: play " + filename);
    }

    @Override
    public void playMP4(String filename) {

    }
}
