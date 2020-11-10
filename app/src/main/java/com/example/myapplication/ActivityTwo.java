package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import static android.icu.lang.UCharacter.toUpperCase;

public class ActivityTwo extends AppCompatActivity {

Button button4;
TextView textView2,  textView2_day1, textView2_day2, textView2_day3, textView2_day4, textView2_day5,  textView2_day6, textView2_day7, textView2_day8, textView2_day9, textView2_day10, textView2_day11, textView2_day12, textView2_day13, textView2_day14, textView2_day15, textView2_day16, textView2_day17, textView2_day18, textView2_day19, textView2_day20, textView2_day21, textView2_day22, textView2_day23, textView2_day24, textView2_day25, textView2_day26, textView2_day27, textView2_day28, textView2_day29, textView2_day30, textView2_day31 ;
String finalNapis = " ";
Document day_1, day_2 , day_3, day_4 , day_5 , day_6 , day_7 , day_8 , day_9 , day_10, day_11, day_12, day_13, day_14, day_15, day_16, day_17, day_18, day_19, day_20, day_21, day_22, day_23, day_24, day_25, day_26, day_27, day_28, day_29, day_30, day_31;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView2_day1 = (TextView) findViewById(R.id.textView2_day1);
        textView2_day2 = (TextView) findViewById(R.id.textView2_day2);
        textView2_day3 = (TextView) findViewById(R.id.textView2_day3);
        textView2_day4 = (TextView) findViewById(R.id.textView2_day4);
        textView2_day5 = (TextView) findViewById(R.id.textView2_day5);
        textView2_day6 = (TextView) findViewById(R.id.textView2_day6);
        textView2_day7 = (TextView) findViewById(R.id.textView2_day7);
        textView2_day8 = (TextView) findViewById(R.id.textView2_day8);
        textView2_day9 = (TextView) findViewById(R.id.textView2_day9);
        textView2_day10 = (TextView) findViewById(R.id.textView2_day10);
        textView2_day11 = (TextView) findViewById(R.id.textView2_day11);
        textView2_day12 = (TextView) findViewById(R.id.textView2_day12);
        textView2_day13 = (TextView) findViewById(R.id.textView2_day13);
        textView2_day14 = (TextView) findViewById(R.id.textView2_day14);
        textView2_day15 = (TextView) findViewById(R.id.textView2_day15);
        textView2_day16 = (TextView) findViewById(R.id.textView2_day16);
        textView2_day17 = (TextView) findViewById(R.id.textView2_day17);
        textView2_day18 = (TextView) findViewById(R.id.textView2_day18);
        textView2_day19 = (TextView) findViewById(R.id.textView2_day19);
        textView2_day20 = (TextView) findViewById(R.id.textView2_day20);
        textView2_day21 = (TextView) findViewById(R.id.textView2_day21);
        textView2_day22 = (TextView) findViewById(R.id.textView2_day22);
        textView2_day23 = (TextView) findViewById(R.id.textView2_day23);
        textView2_day24 = (TextView) findViewById(R.id.textView2_day24);
        textView2_day25 = (TextView) findViewById(R.id.textView2_day25);
        textView2_day26 = (TextView) findViewById(R.id.textView2_day26);
        textView2_day27 = (TextView) findViewById(R.id.textView2_day27);
        textView2_day28 = (TextView) findViewById(R.id.textView2_day28);
        textView2_day29 = (TextView) findViewById(R.id.textView2_day29);
        textView2_day30 = (TextView) findViewById(R.id.textView2_day30);
        textView2_day31 = (TextView) findViewById(R.id.textView2_day31);
        button4 = (Button) findViewById(R.id.button4);

        String napis= " ";
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null){
        String name = arguments.get("localization").toString();
            napis = name;
        }
        this.finalNapis = napis;
        textView2.setText("Weather in " + toUpperCase(finalNapis));

        button4.setOnClickListener(new View.OnClickListener() {
       //  @RequiresApi(api = Build.VERSION_CODES.N)
          @Override
          public void onClick(View view) {
             textView2.setText(Html.fromHtml(String.valueOf("Weather in " + toUpperCase(finalNapis)), Html.FROM_HTML_MODE_COMPACT));
             textView2_day1.setText(Html.fromHtml(String.valueOf(day_1), Html.FROM_HTML_MODE_COMPACT));
             textView2_day2.setText(Html.fromHtml(String.valueOf(day_2), Html.FROM_HTML_MODE_COMPACT));
             textView2_day3.setText(Html.fromHtml(String.valueOf(day_3), Html.FROM_HTML_MODE_COMPACT));
             textView2_day4.setText(Html.fromHtml(String.valueOf(day_4), Html.FROM_HTML_MODE_COMPACT));
             textView2_day5.setText(Html.fromHtml(String.valueOf(day_5), Html.FROM_HTML_MODE_COMPACT));
             textView2_day6.setText(Html.fromHtml(String.valueOf(day_6), Html.FROM_HTML_MODE_COMPACT));
             textView2_day7.setText(Html.fromHtml(String.valueOf(day_7), Html.FROM_HTML_MODE_COMPACT));
             textView2_day8.setText(Html.fromHtml(String.valueOf(day_8), Html.FROM_HTML_MODE_COMPACT));
             textView2_day9.setText(Html.fromHtml(String.valueOf(day_9), Html.FROM_HTML_MODE_COMPACT));
             textView2_day10.setText(Html.fromHtml(String.valueOf(day_10), Html.FROM_HTML_MODE_COMPACT));
             textView2_day11.setText(Html.fromHtml(String.valueOf(day_11), Html.FROM_HTML_MODE_COMPACT));
             textView2_day12.setText(Html.fromHtml(String.valueOf(day_12), Html.FROM_HTML_MODE_COMPACT));
             textView2_day13.setText(Html.fromHtml(String.valueOf(day_13), Html.FROM_HTML_MODE_COMPACT));
             textView2_day14.setText(Html.fromHtml(String.valueOf(day_14), Html.FROM_HTML_MODE_COMPACT));
             textView2_day15.setText(Html.fromHtml(String.valueOf(day_15), Html.FROM_HTML_MODE_COMPACT));
             textView2_day16.setText(Html.fromHtml(String.valueOf(day_16), Html.FROM_HTML_MODE_COMPACT));
             textView2_day17.setText(Html.fromHtml(String.valueOf(day_17), Html.FROM_HTML_MODE_COMPACT));
             textView2_day18.setText(Html.fromHtml(String.valueOf(day_18), Html.FROM_HTML_MODE_COMPACT));
             textView2_day19.setText(Html.fromHtml(String.valueOf(day_19), Html.FROM_HTML_MODE_COMPACT));
             textView2_day20.setText(Html.fromHtml(String.valueOf(day_20), Html.FROM_HTML_MODE_COMPACT));
             textView2_day21.setText(Html.fromHtml(String.valueOf(day_21), Html.FROM_HTML_MODE_COMPACT));
             textView2_day22.setText(Html.fromHtml(String.valueOf(day_22), Html.FROM_HTML_MODE_COMPACT));
             textView2_day23.setText(Html.fromHtml(String.valueOf(day_23), Html.FROM_HTML_MODE_COMPACT));
             textView2_day24.setText(Html.fromHtml(String.valueOf(day_24), Html.FROM_HTML_MODE_COMPACT));
             textView2_day25.setText(Html.fromHtml(String.valueOf(day_25), Html.FROM_HTML_MODE_COMPACT));
             textView2_day26.setText(Html.fromHtml(String.valueOf(day_26), Html.FROM_HTML_MODE_COMPACT));
             textView2_day27.setText(Html.fromHtml(String.valueOf(day_27), Html.FROM_HTML_MODE_COMPACT));
             textView2_day28.setText(Html.fromHtml(String.valueOf(day_28), Html.FROM_HTML_MODE_COMPACT));
             textView2_day29.setText(Html.fromHtml(String.valueOf(day_29), Html.FROM_HTML_MODE_COMPACT));
             textView2_day30.setText(Html.fromHtml(String.valueOf(day_30), Html.FROM_HTML_MODE_COMPACT));
             textView2_day31.setText(Html.fromHtml(String.valueOf(day_31), Html.FROM_HTML_MODE_COMPACT));
         }
        }
        );
        init();
    }

    private Document doc;
    private Thread secThread;
    private Runnable runnable;

    /**
     * The method call run method getWeb() in new thread
     */
    private void init()
    {
        runnable = new Runnable() {
            @Override
            public void run() {
                getWeb();
            }
        };
        secThread = new Thread(runnable);
        secThread.start();
    }
    /**
     * The method connects to the https://www.gismeteo.pl/ and enters data to Documents (days)
     */
    private void getWeb() {

        try {
            switch (finalNapis) {
                case  ("Warsaw"):
                    doc = Jsoup.connect("https://www.gismeteo.pl/weather-warsaw-3196/month/").get();
                    break;
                case ("paris"):
                    doc =  Jsoup.connect("https://www.gismeteo.pl/weather-paris-1623/month/").get();
                    break;
                default:
                   doc = Jsoup.connect("https://www.gismeteo.pl/weather-south-pole-14743/month/").get();
                    break;
            }
            //         Log.d("MyLog", "Title :" + doc.title());
            Elements tables = doc.getElementsByTag("body");
//          Log.d("MyLog", "size:" + tables.size());
            Element our_table = tables.get(0);

            Elements children_1 = our_table.children();
//          Log.d("MyLog", "size children_1:" + children_1.size());
//          Log.d("MyLog", "children_1 get(3):" +children_1.get(3).text());

            Element children_1_3 = children_1.get(3);
            Elements children_1_3_ch = children_1_3.children();
//          Log.d("MyLog", "size children_1_3_ch:" + children_1_3_ch.size());
//          Log.d("MyLog", "children_1_3_ch get(2):" +children_1_3_ch.get(2).text());

            Element children_1_3_2 = children_1_3_ch.get(2);
            Elements children_1_3_2_ch = children_1_3_2.children();
//          Log.d("MyLog", "size children_1_3_2_ch:" + children_1_3_2_ch.size());
//          Log.d("MyLog", "children_1_3_2_ch get(0):" +children_1_3_2_ch.get(0).text());

            Element children_1_3_2_0 = children_1_3_2_ch.get(0);
            Elements children_1_3_2_0_ch = children_1_3_2_0.children();
//          Log.d("MyLog", "size children_1_3_2_0_ch:" + children_1_3_2_0_ch.size());
//          Log.d("MyLog", "children_1_3_2_0_ch get(0):" +children_1_3_2_0_ch.get(0).text());

            Element children_1_3_2_0_0 = children_1_3_2_0_ch.get(0);
            Elements children_1_3_2_0_0_ch = children_1_3_2_0_0.children();
//          Log.d("MyLog", "size children_1_3_2_0_0_ch:" + children_1_3_2_0_0_ch.size());
//          Log.d("MyLog", "children_1_3_2_0_0_ch get(0):" +children_1_3_2_0_0_ch.get(0).text());

            Element children_1_3_2_0_0_0 = children_1_3_2_0_0_ch.get(0);
            Elements children_1_3_2_0_0_0_ch = children_1_3_2_0_0_0.children();
//          Log.d("MyLog", "size children_1_3_2_0_0_0_ch:" + children_1_3_2_0_0_0_ch.size());
//          Log.d("MyLog", "children_1_3_2_0_0_0_ch get(1):" +children_1_3_2_0_0_0_ch.get(1).text());

            Element children_1_3_2_0_0_0_1 = children_1_3_2_0_0_0_ch.get(1);
            Elements children_1_3_2_0_0_0_1_ch = children_1_3_2_0_0_0_1.children();
//          Log.d("MyLog", "size children_1_3_2_0_0_0_1_ch:" + children_1_3_2_0_0_0_1_ch.size());
//          Log.d("MyLog", "children_1_3_2_0_0_0_1_ch get(0):" +children_1_3_2_0_0_0_1_ch.get(0).text());

            Element children_1_3_2_0_0_0_1_0 = children_1_3_2_0_0_0_1_ch.get(0);
            Elements children_1_3_2_0_0_0_1_0_ch = children_1_3_2_0_0_0_1_0.children();
//          Log.d("MyLog", "size children_1_3_2_0_0_0_1_0_ch:" + children_1_3_2_0_0_0_1_0_ch.size());
//          Log.d("MyLog", "children_1_3_2_0_0_0_1_0_ch get(0):" +children_1_3_2_0_0_0_1_0_ch.get(0).text());

            Element children_1_3_2_0_0_0_1_0_0 = children_1_3_2_0_0_0_1_0_ch.get(0);
            Elements children_1_3_2_0_0_0_1_0_0_ch = children_1_3_2_0_0_0_1_0_0.children();
//          Log.d("MyLog", "size children_1_3_2_0_0_0_1_0_0_ch:" + children_1_3_2_0_0_0_1_0_0_ch.size());
//          Log.d("MyLog", "Pn Wt Śr Cz Pt Sb Nd    children_1_3_2_0_0_0_1_0_0_ch get(0):" +children_1_3_2_0_0_0_1_0_0_ch.get(0).text()); // Pn Wt Śr Cz Pt Sb Nd

            Element children_1_3_2_0_0_0_1_0_0_1 = children_1_3_2_0_0_0_1_0_0_ch.get(1);
            Elements children_1_3_2_0_0_0_1_0_0_1_ch = children_1_3_2_0_0_0_1_0_0_1.children();
//           Log.d("MyLog", "size children_1_3_2_0_0_0_1_0_0_0_ch:" + children_1_3_2_0_0_0_1_0_0_1_ch.size());

            this.day_1 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(0).outerHtml());
            this.day_2 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(1).outerHtml());
            this.day_3 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(2).outerHtml());
            this.day_4 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(3).outerHtml());
            this.day_5 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(4).outerHtml());
            this.day_6 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(5).outerHtml());
            this.day_7 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(6).outerHtml());
            this.day_8 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(7).outerHtml());
            this.day_9 =Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(8).outerHtml());
            this.day_10=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(9).outerHtml());
//            Log.d("MyLog", "day_10 1" +  this.day_10);
            this.day_11=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(10).outerHtml());
            this.day_12=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(11).outerHtml());
            this.day_13=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(12).outerHtml());
            this.day_14=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(13).outerHtml());
            this.day_15=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(14).outerHtml());
            this.day_16=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(15).outerHtml());
            this.day_17=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(16).outerHtml());
            this.day_18=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(17).outerHtml());
            this.day_19=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(18).outerHtml());
            this.day_20=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(19).outerHtml());
            this.day_21=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(20).outerHtml());
            this.day_22=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(21).outerHtml());
            this.day_23=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(22).outerHtml());
            this.day_24=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(23).outerHtml());
            this.day_25=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(24).outerHtml());
            this.day_26=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(25).outerHtml());
            this.day_27=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(26).outerHtml());
            this.day_28=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(27).outerHtml());
            this.day_29=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(28).outerHtml());
            this.day_30=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(29).outerHtml());
            this.day_31=Jsoup.parse(children_1_3_2_0_0_0_1_0_0_1_ch.get(30).outerHtml());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}