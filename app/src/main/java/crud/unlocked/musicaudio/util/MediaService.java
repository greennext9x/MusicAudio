package crud.unlocked.musicaudio.util;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

/**
 * Created by Irelia on 12/28/2016.
 */

public class MediaService extends IntentService implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener,
        MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener,
        MediaPlayer.OnInfoListener, MediaPlayer.OnBufferingUpdateListener {
    public MediaService(String name) {
        super(name);
    }

    public static void setServiceMediaPlayer(Context context, boolean isOn) {
        MediaPlayer mediaPlayer = new MediaPlayer();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }

    @Override
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {

    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {

    }

    @Override
    public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
        return false;
    }

    @Override
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i1) {
        return false;
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {

    }

    @Override
    public void onSeekComplete(MediaPlayer mediaPlayer) {

    }
    //Start service
    //Prepare media player
    //Start media player
    //Stop media player
    //Stop service
}
