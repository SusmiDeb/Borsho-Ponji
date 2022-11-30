package com.example.borshoponji;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    DateFormat Date = new DateFormat();

    TextView dateDisplay, jump;
    @SuppressLint("NewApi")
    LocalDate LD = LocalDate.now();

    LinearLayout layout;

    TextView[][] dayDis = new TextView[43][2];

    void referencing(){
        layout = (LinearLayout) findViewById(R.id.background);

        dayDis[1][0] = (TextView) findViewById(R.id.daya1);
        dayDis[1][1] = (TextView) findViewById(R.id.dayb1);
        dayDis[2][0] = (TextView) findViewById(R.id.daya2);
        dayDis[2][1] = (TextView) findViewById(R.id.dayb2);
        dayDis[3][0] = (TextView) findViewById(R.id.daya3);
        dayDis[3][1] = (TextView) findViewById(R.id.dayb3);
        dayDis[4][0] = (TextView) findViewById(R.id.daya4);
        dayDis[4][1] = (TextView) findViewById(R.id.dayb4);
        dayDis[5][0] = (TextView) findViewById(R.id.daya5);
        dayDis[5][1] = (TextView) findViewById(R.id.dayb5);
        dayDis[6][0] = (TextView) findViewById(R.id.daya6);
        dayDis[6][1] = (TextView) findViewById(R.id.dayb6);
        dayDis[7][0] = (TextView) findViewById(R.id.daya7);
        dayDis[7][1] = (TextView) findViewById(R.id.dayb7);
        dayDis[8][0] = (TextView) findViewById(R.id.daya8);
        dayDis[8][1] = (TextView) findViewById(R.id.dayb8);
        dayDis[9][0] = (TextView) findViewById(R.id.daya9);
        dayDis[9][1] = (TextView) findViewById(R.id.dayb9);
        dayDis[10][0] = (TextView) findViewById(R.id.daya10);
        dayDis[10][1] = (TextView) findViewById(R.id.dayb10);
        dayDis[11][0] = (TextView) findViewById(R.id.daya11);
        dayDis[11][1] = (TextView) findViewById(R.id.dayb11);
        dayDis[12][0] = (TextView) findViewById(R.id.daya12);
        dayDis[12][1] = (TextView) findViewById(R.id.dayb12);
        dayDis[13][0] = (TextView) findViewById(R.id.daya13);
        dayDis[13][1] = (TextView) findViewById(R.id.dayb13);
        dayDis[14][0] = (TextView) findViewById(R.id.daya14);
        dayDis[14][1] = (TextView) findViewById(R.id.dayb14);
        dayDis[15][0] = (TextView) findViewById(R.id.daya15);
        dayDis[15][1] = (TextView) findViewById(R.id.dayb15);
        dayDis[16][0] = (TextView) findViewById(R.id.daya16);
        dayDis[16][1] = (TextView) findViewById(R.id.dayb16);
        dayDis[17][0] = (TextView) findViewById(R.id.daya17);
        dayDis[17][1] = (TextView) findViewById(R.id.dayb17);
        dayDis[18][0] = (TextView) findViewById(R.id.daya18);
        dayDis[18][1] = (TextView) findViewById(R.id.dayb18);
        dayDis[19][0] = (TextView) findViewById(R.id.daya19);
        dayDis[19][1] = (TextView) findViewById(R.id.dayb19);
        dayDis[20][0] = (TextView) findViewById(R.id.daya20);
        dayDis[20][1] = (TextView) findViewById(R.id.dayb20);
        dayDis[21][0] = (TextView) findViewById(R.id.daya21);
        dayDis[21][1] = (TextView) findViewById(R.id.dayb21);
        dayDis[22][0] = (TextView) findViewById(R.id.daya22);
        dayDis[22][1] = (TextView) findViewById(R.id.dayb22);
        dayDis[23][0] = (TextView) findViewById(R.id.daya23);
        dayDis[23][1] = (TextView) findViewById(R.id.dayb23);
        dayDis[24][0] = (TextView) findViewById(R.id.daya24);
        dayDis[24][1] = (TextView) findViewById(R.id.dayb24);
        dayDis[25][0] = (TextView) findViewById(R.id.daya25);
        dayDis[25][1] = (TextView) findViewById(R.id.dayb25);
        dayDis[26][0] = (TextView) findViewById(R.id.daya26);
        dayDis[26][1] = (TextView) findViewById(R.id.dayb26);
        dayDis[27][0] = (TextView) findViewById(R.id.daya27);
        dayDis[27][1] = (TextView) findViewById(R.id.dayb27);
        dayDis[28][0] = (TextView) findViewById(R.id.daya28);
        dayDis[28][1] = (TextView) findViewById(R.id.dayb28);
        dayDis[29][0] = (TextView) findViewById(R.id.daya29);
        dayDis[29][1] = (TextView) findViewById(R.id.dayb29);
        dayDis[30][0] = (TextView) findViewById(R.id.daya30);
        dayDis[30][1] = (TextView) findViewById(R.id.dayb30);
        dayDis[31][0] = (TextView) findViewById(R.id.daya31);
        dayDis[31][1] = (TextView) findViewById(R.id.dayb31);
        dayDis[32][0] = (TextView) findViewById(R.id.daya32);
        dayDis[32][1] = (TextView) findViewById(R.id.dayb32);
        dayDis[33][0] = (TextView) findViewById(R.id.daya33);
        dayDis[33][1] = (TextView) findViewById(R.id.dayb33);
        dayDis[34][0] = (TextView) findViewById(R.id.daya34);
        dayDis[34][1] = (TextView) findViewById(R.id.dayb34);
        dayDis[35][0] = (TextView) findViewById(R.id.daya35);
        dayDis[35][1] = (TextView) findViewById(R.id.dayb35);
        dayDis[36][0] = (TextView) findViewById(R.id.daya36);
        dayDis[36][1] = (TextView) findViewById(R.id.dayb36);
        dayDis[37][0] = (TextView) findViewById(R.id.daya37);
        dayDis[37][1] = (TextView) findViewById(R.id.dayb37);
        dayDis[38][0] = (TextView) findViewById(R.id.daya38);
        dayDis[38][1] = (TextView) findViewById(R.id.dayb38);
        dayDis[39][0] = (TextView) findViewById(R.id.daya39);
        dayDis[39][1] = (TextView) findViewById(R.id.dayb39);
        dayDis[40][0] = (TextView) findViewById(R.id.daya40);
        dayDis[40][1] = (TextView) findViewById(R.id.dayb40);
        dayDis[41][0] = (TextView) findViewById(R.id.daya41);
        dayDis[41][1] = (TextView) findViewById(R.id.dayb41);
        dayDis[42][0] = (TextView) findViewById(R.id.daya42);
        dayDis[42][1] = (TextView) findViewById(R.id.dayb42);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencing();

        dateDisplay = (TextView) findViewById(R.id.banglaDate);
        String dateToSet = (Date.getDate(LD) + ", "+Date.getBanglaYear(LD)).toUpperCase();
        dateDisplay.setText(dateToSet);

        setUpCalander();

        Button next = (Button) findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                LD = LD.plusDays(30);
                setUpCalander();
            }
        });
        Button prev = (Button) findViewById(R.id.prev);
        prev.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                LD = LD.minusDays(Integer.parseInt(Date.getDayOfBanglaMonth(LD))); // Now LD is gone to 1 tarikh
                LD = LD.minusDays(31); // Now LD is set to ager masher 1 tarikh
                setUpCalander();
            }
        });

        jump = (TextView) findViewById(R.id.jumptodate);
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JumpActivity.class);
                startActivity(intent);
            }
        });

    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setUpCalander(){

        int dayOfMonth = Integer.parseInt(Date.getDayOfBanglaMonth(LD));
        LD = LD.minusDays(dayOfMonth - 1);
        String day = LD.getDayOfWeek().toString();

        TextView banglaMash = (TextView) findViewById(R.id.banglaMash);
        TextView englishMash = (TextView) findViewById(R.id.englishMash);

        //setting bangla month
        // Boishakh 1, 1429 = Boishakh, 1, 1429
        String m[] = Date.getDate(LD).split(" ");
        banglaMash.setText(m[0].toUpperCase()+", "+Date.getBanglaYear(LD));

        //setting background
        if(banglaMash.getText().toString().startsWith("BOI") || banglaMash.getText().toString().startsWith("JYO"))
            layout.setBackgroundResource(R.drawable.f1);
        if(banglaMash.getText().toString().startsWith("ASH") || banglaMash.getText().toString().startsWith("SRA"))
            layout.setBackgroundResource(R.drawable.f2);
        if(banglaMash.getText().toString().startsWith("BHA") || banglaMash.getText().toString().startsWith("ASH"))
            layout.setBackgroundResource(R.drawable.f3);
        if(banglaMash.getText().toString().startsWith("KAR") || banglaMash.getText().toString().startsWith("OGR"))
            layout.setBackgroundResource(R.drawable.f4);
        if(banglaMash.getText().toString().startsWith("POU") || banglaMash.getText().toString().startsWith("MAG"))
            layout.setBackgroundResource(R.drawable.f5);
        if(banglaMash.getText().toString().startsWith("FAL") || banglaMash.getText().toString().startsWith("CHO"))
            layout.setBackgroundResource(R.drawable.f6);

        //setting english month
        englishMash.setText(LD.getMonth().toString());


        int start = 0;
        if(day.startsWith("SUN")) start = 1;
        else if(day.startsWith("MON")) start = 2;
        else if(day.startsWith("TUE")) start = 3;
        else if(day.startsWith("WED")) start = 4;
        else if(day.startsWith("THU")) start = 5;
        else if(day.startsWith("FRI")) start = 6;
        else if(day.startsWith("SAT")) start = 7;

        int i = 1;
        for(i=1; i<start; i++){
            dayDis[i][0].setText(" ");
            dayDis[i][1].setText(" ");
        }
        int monthSet = 0;
        for(i=start; i<43; i++){
            if(i%7==6){
                dayDis[i][0].setTextColor(Color.parseColor("#ff0000"));
            }
            String bd = Date.getDayOfBanglaMonth(LD);
            dayDis[i][0].setText(bd+" ");
            if(bd.equals("1")) monthSet++;
            if(monthSet == 2) break;
            dayDis[i][1].setText(Date.getDayOfEnglishMonth(LD));
            LD = LD.plusDays(1);
        }

        LD = LD.minusDays(1);
        englishMash.setText(englishMash.getText() + " - "+ LD.getMonth());
        LD = LD.plusDays(1);

        for(; i<43; i++){
            dayDis[i][0].setText(" ");
            dayDis[i][1].setText(" ");
        }

    }

    private void toast(String s){
        Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
    }
}