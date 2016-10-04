package net.soulforged.nhl1617soundboard;

import android.annotation.SuppressLint;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import java.io.IOException;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        ImageButton anaheimDucksButton = (ImageButton) findViewById(R.id.anaheimDucksIB);
        anaheimDucksButton.setOnClickListener(anaheimDucksHandler);

        ImageButton arizonaCoyotesButton = (ImageButton) findViewById(R.id.arizonaCoyotesIB);
        arizonaCoyotesButton.setOnClickListener(arizonaCoyotesHandler);

        ImageButton bostonBruinsButton = (ImageButton) findViewById(R.id.bostonBruinsIB);
        bostonBruinsButton.setOnClickListener(bostonBruinsHandler);

        ImageButton buffaloSabresButton = (ImageButton) findViewById(R.id.buffaloSabresIB);
        buffaloSabresButton.setOnClickListener(buffaloSabresHandler);

        ImageButton calgaryFlamesButton = (ImageButton) findViewById(R.id.calgaryFlamesIB);
        calgaryFlamesButton.setOnClickListener(calgaryFlamesHandler);

        ImageButton carolinaHurricanesButton = (ImageButton) findViewById(R.id.carolinaHurricanesIB);
        carolinaHurricanesButton.setOnClickListener(carolinaHurricanesHandler);

        ImageButton chicagoBlackhawksButton = (ImageButton) findViewById(R.id.chicagoBlackhawksIB);
        chicagoBlackhawksButton.setOnClickListener(chicagoBlackhawksHandler);

        ImageButton coloradoAvalancheButton = (ImageButton) findViewById(R.id.coloradoAvalancheIB);
        coloradoAvalancheButton.setOnClickListener(coloradoAvalancheHandler);

        ImageButton columbusBlueJacketsButton = (ImageButton) findViewById(R.id.columbusBlueJacketsIB);
        columbusBlueJacketsButton.setOnClickListener(columbusBlueJacketsHandler);

        ImageButton dallasStarsButton = (ImageButton) findViewById(R.id.dallasStarsIB);
        dallasStarsButton.setOnClickListener(dallasStarsHandler);

        ImageButton detroitRedWingsButton = (ImageButton) findViewById(R.id.detroitRedWingsIB);
        detroitRedWingsButton.setOnClickListener(detroitRedWingsHandler);

        ImageButton edmontonOilersButton = (ImageButton) findViewById(R.id.edmontonOilersIB);
        edmontonOilersButton.setOnClickListener(edmontonOilersHandler);
    }


    View.OnClickListener anaheimDucksHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("anaheimduckssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
     };

    View.OnClickListener arizonaCoyotesHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("arizonacoyotessong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener bostonBruinsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("bostonbruinssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener buffaloSabresHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("buffalosabressong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener calgaryFlamesHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("calgaryflamessong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener carolinaHurricanesHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("carolinahurricanessong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener chicagoBlackhawksHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("chicagoblackhawkssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };


    View.OnClickListener coloradoAvalancheHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("coloradoavalanchesong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener columbusBlueJacketsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("columbusbluejacketssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener dallasStarsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("dallasstarssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener detroitRedWingsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("detroitredwingssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener edmontonOilersHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("edmontonoilerssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };
}
