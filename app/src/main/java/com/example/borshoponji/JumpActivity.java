package com.example.borshoponji;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.time.LocalDate;

public class JumpActivity extends AppCompatActivity {

    EditText y, m, d;
    Button jump;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jump);

        y = (EditText) findViewById(R.id.year);
        m = (EditText) findViewById(R.id.month);
        d = (EditText) findViewById(R.id.day);
        display = (TextView) findViewById(R.id.display);

        jump = (Button) findViewById(R.id.jump);
        jump.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                DateFormat Date = new DateFormat();
                LocalDate LD = LocalDate.now();
                int yr = Integer.parseInt(y.getText().toString());
                int mn = Integer.parseInt(m.getText().toString());
                int dy = Integer.parseInt(d.getText().toString());

                if(yr < 1 || mn < 1 || mn > 12 || dy < 1 || dy > 31){
                    Toast.makeText(JumpActivity.this, "Invalid Date Input!", Toast.LENGTH_LONG).show();
                    return;
                }

                while(LD.getYear() > yr) LD = LD.minusYears(1);
                while(LD.getYear() < yr) LD = LD.plusYears(1);

                while(LD.getMonthValue() > mn) LD = LD.minusMonths(1);
                while(LD.getMonthValue() < mn) LD = LD.plusMonths(1);

                while(LD.getDayOfMonth() > dy) LD = LD.minusDays(1);
                while(LD.getDayOfMonth() < dy) LD = LD.plusDays(1);

                display.setText((Date.getDate(LD) + ", "+Date.getBanglaYear(LD)).toUpperCase());

            }
        });
    }
}