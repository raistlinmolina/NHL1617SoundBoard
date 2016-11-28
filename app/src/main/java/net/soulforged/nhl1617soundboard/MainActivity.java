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
    int activeSong = 0;
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

        ImageButton floridaPanthersButton = (ImageButton) findViewById(R.id.floridaPanthersIB);
        floridaPanthersButton.setOnClickListener(floridaPanthersHandler);

        ImageButton laKingsButton = (ImageButton) findViewById(R.id.laKingsIB);
        laKingsButton.setOnClickListener(laKingsHandler);

        ImageButton minesotaWildButton = (ImageButton) findViewById(R.id.minesotaWildIB);
        minesotaWildButton.setOnClickListener(minesotaWildHandler);

        ImageButton montrealCanadiensButton = (ImageButton) findViewById(R.id.montrealCanadiensIB);
        montrealCanadiensButton.setOnClickListener(montrealCanadiensHandler);

        ImageButton nashvillePredatorsButton = (ImageButton) findViewById(R.id.nashvillePredatorsIB);
        nashvillePredatorsButton.setOnClickListener(nashvillePredatorsHandler);

        ImageButton njDevilsButton = (ImageButton) findViewById(R.id.njDevilsIB);
        njDevilsButton.setOnClickListener(njDevilsHandler);

        ImageButton nyIslandersButton = (ImageButton) findViewById(R.id.nyIslandersIB);
        nyIslandersButton.setOnClickListener(nyIslandersHandler);

        ImageButton nyRangersButton = (ImageButton) findViewById(R.id.nyRangersIB);
        nyRangersButton.setOnClickListener(nyRangersHandler);

        ImageButton ottawaSenatorsButton = (ImageButton) findViewById(R.id.ottawaSenatorsIB);
        ottawaSenatorsButton.setOnClickListener(ottawaSenatorsHandler);

        ImageButton philadelphiaFlyersButton = (ImageButton) findViewById(R.id.philadelphiaFlyersIB);
        philadelphiaFlyersButton.setOnClickListener(philadelphiaFlyersHandler);

        ImageButton pittsburghPenguinsButton = (ImageButton) findViewById(R.id.pittsburghPenguinsIB);
        pittsburghPenguinsButton.setOnClickListener(pittsburghPenguinsHandler);

        ImageButton sanJoseShraksButton = (ImageButton) findViewById(R.id.sanJoseSharksIB);
        sanJoseShraksButton.setOnClickListener(sanJoseSharksHandler);

        ImageButton stLouisBluesButton = (ImageButton) findViewById(R.id.stLouisBluesIB);
        stLouisBluesButton.setOnClickListener(stLouisBluesHandler);

        ImageButton tampaBayLightningButton = (ImageButton) findViewById(R.id.tampaBayLightningIB);
        tampaBayLightningButton.setOnClickListener(tampaBayLightningHandler);

        ImageButton torontoMapleLeafsButton = (ImageButton) findViewById(R.id.torontoMapleLeafsIB);
        torontoMapleLeafsButton.setOnClickListener(torontoMapleLeafsHandler);

        ImageButton vancouverCanucksButton = (ImageButton) findViewById(R.id.vancouverCanucksIB);
        vancouverCanucksButton.setOnClickListener(vancouverCanucksHandler);

        ImageButton washintongCapitalsButton = (ImageButton) findViewById(R.id.washintongCapitalsIB);
        washintongCapitalsButton.setOnClickListener(washintongCapitalsHandler);

        ImageButton winnipegJetsButton = (ImageButton) findViewById(R.id.winnipegJetsIB);
        winnipegJetsButton.setOnClickListener(winnipegJetsHandler);
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

    View.OnClickListener floridaPanthersHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("floridapantherssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener laKingsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("lakingssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener minesotaWildHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("minesotawildsong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener montrealCanadiensHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("montrealcanadienssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener nashvillePredatorsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("nashvillepredatorssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener njDevilsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("njdevilssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener nyIslandersHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("nyislanderssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener nyRangersHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("nyrangerssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener ottawaSenatorsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("ottawasenatorssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener philadelphiaFlyersHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("philadelphiaflyerssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener pittsburghPenguinsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("pittsburghpenguinssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener sanJoseSharksHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("sanjosesharkssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener stLouisBluesHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("stlouisbluessong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener tampaBayLightningHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("tampabaylightningsong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener torontoMapleLeafsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("torontomapleleafssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener vancouverCanucksHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("vancouvercanuckssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener washintongCapitalsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("washintongcapitalssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };

    View.OnClickListener winnipegJetsHandler = new View.OnClickListener() {
        public void onClick(View v) {
            try {
                AssetFileDescriptor afd = getAssets().openFd("winnipegjetssong.mp3");
                mediaPlayer.reset();
                mediaPlayer.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mediaPlayer.prepare();
                mediaPlayer.start();
            } catch (IOException e1) {
            }
        }
    };
}
