package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 *This application shows temperature for the next 30 days in three places: the South Pole, Warsaw and Paris.
 * Data are taken from https://www.gismeteo.pl/.
 * @autor  Oksana Zarowska
 * @version 1.0
 */

public class MainActivity extends AppCompatActivity  {
    Button button1;
    Button button2;
    Button button3;
    TextView textView;


    String HTMLWeather = "<!DOCTYPE html>"
            + "<html>"
            + "<head>"
            + "</head>"
            + "<body>"
            + "<table><tr><td><h1>Weather</h1></tr></table>"
            + "</body>"
            + "</html>";


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        textView.setText(Html.fromHtml(String.valueOf(HTMLWeather), Html.FROM_HTML_MODE_COMPACT));

        button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              switch (view.getId()){
                  case R.id.button1:
                      //Intent intent = new Intent(this, ActivityTwo.class);
                      Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
                      intent.putExtra("localization", button1.getText());
                      startActivity(intent);
                        break;
                  default:
                      break;
                    }
                }
            }
        );

        button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            switch (view.getId()){
                case R.id.button2:
                    //Intent intent = new Intent(this, ActivityTwo.class);
                    Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
                    intent.putExtra("localization", button2.getText());
                    startActivity(intent);
                    break;
                    default:
                        break;
                   }
                }
           }
        );

        button3.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                          // textView.setText("button3");
                                           switch (view.getId()){
                                               case R.id.button3:
                                                   //Intent intent = new Intent(this, ActivityTwo.class);
                                                   Intent intent=new Intent(MainActivity.this,ActivityTwo.class);
                                                   intent.putExtra("localization", button3.getText());
                                                   startActivity(intent);
                                                   break;
                                               default:
                                                   break;
                                           }
                                         }
                                   }
        );
    }
}