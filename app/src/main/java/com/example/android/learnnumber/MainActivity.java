package com.example.android.learnnumber;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button next;
    Button previous;
    Button play;
    ImageView image;
    TextView textView;
    MediaPlayer mediaPlayer;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("count", "sound: "+count);
                switch (count)
                {
                    case 0:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.one);
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.two);
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.three);
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.four);
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.five);
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.six);
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.seven);
                        mediaPlayer.start();
                        break;
                    case 7:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.eight);
                        mediaPlayer.start();
                        break;
                    case 8:
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.nine);
                        mediaPlayer.start();
                        break;

                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count<8) {
                    switch (count) {
                        case 0:
                            textView.setText("Two");
                            image.setImageResource(R.drawable.two);
                            count++;
                            Log.e("count", "next: "+count);
                            break;
                        case 1:
                            textView.setText("Three");
                            image.setImageResource(R.drawable.three);
                            count++;
                            break;
                        case 2:
                            textView.setText("Four");
                            image.setImageResource(R.drawable.four);
                            count++;

                            break;
                        case 3:
                            textView.setText("Five");
                            image.setImageResource(R.drawable.five);
                            count++;

                            break;
                        case 4:
                            textView.setText("Six");
                            image.setImageResource(R.drawable.six);
                            count++;

                            break;
                        case 5:
                            textView.setText("Seven");
                            image.setImageResource(R.drawable.seven);
                            count++;

                            break;
                        case 6:
                            textView.setText("Eight");
                            image.setImageResource(R.drawable.eight);
                            count++;

                            break;
                        case 7:
                            textView.setText("Nine");
                            image.setImageResource(R.drawable.nine);
                            count++;

                            break;

                        default:
                            Log.e("error", "onClick: ");
                    }
                }
            }

        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (count>=0)
               {
                   count--;
                   Log.e("count", "prev: "+count);
               }
                switch (count)
                {
                    case 0:
                        textView.setText("One");
                        image.setImageResource(R.drawable.a);
                        mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.one);
                        break;
                    case 1:
                        textView.setText("Two");
                        image.setImageResource(R.drawable.two);
                        break;
                    case 2:
                        textView.setText("Three");
                        image.setImageResource(R.drawable.three);
                        break;
                    case 3:
                        textView.setText("Four");
                        image.setImageResource(R.drawable.four);
                        break;
                    case 4:
                        textView.setText("Five");
                        image.setImageResource(R.drawable.five);
                        break;
                    case 5:
                        textView.setText("Six");
                        image.setImageResource(R.drawable.six);
                        break;
                    case 6:
                        textView.setText("Seven");
                        image.setImageResource(R.drawable.seven);
                        break;
                    case 7:
                        textView.setText("Eight");
                        image.setImageResource(R.drawable.eight);
                        break;
                    case 8:
                        textView.setText("Nine");
                        image.setImageResource(R.drawable.nine);
                        break;
                }
            }
        });
    }

    private void initialize() {
        textView = findViewById(R.id.show);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.prev);
        image = findViewById(R.id.image);
        play = findViewById(R.id.sound_button);
        count =0;
    }



}
