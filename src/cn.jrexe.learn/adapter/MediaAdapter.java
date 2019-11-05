package cn.jrexe.learn.adapter;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter() {
    }

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String type, String filePath) {
        if (type.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVLC(filePath);
        } else if (type.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMP4(filePath);
        }
    }
}
