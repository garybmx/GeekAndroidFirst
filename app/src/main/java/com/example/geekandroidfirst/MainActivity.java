package com.example.geekandroidfirst;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    private Button sendButton;
    private EditText cityName;
    private Switch isDate;
    private CheckBox isDamp;
    private CheckBox isWindValue;
    private CheckBox isWindCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton = (Button) findViewById(R.id.send_button);
        cityName = (EditText) findViewById(R.id.city_name);
        isDate = (Switch) findViewById(R.id.isDate);
        isDamp = (CheckBox) findViewById(R.id.isDamp);
        isWindValue = (CheckBox) findViewById(R.id.isWindValue);
        isWindCourse = (CheckBox) findViewById(R.id.isWindCourse);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("CITY_NAME", cityName.getText().toString());
                if(isDate.isChecked()) intent.putExtra("IS_DATE", isDate.getText().toString());
                if(isDamp.isChecked()) intent.putExtra("IS_DAMP", isDamp.getText());
                if(isWindValue.isChecked()) intent.putExtra("IS_WIND_VALUE", isWindValue.getText());
                if(isWindCourse.isChecked()) intent.putExtra("IS_WIND_COURSE", isWindCourse.getText());

                MainActivity.this.startActivity(intent);
            }
        });
    }
}
