package practice.myapplication_checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    CheckBox c1;
    LinearLayout Layout1;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioGroup rg;
    Button b1;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        Layout1 = (LinearLayout) findViewById(R.id.Layout);
        c1 = (CheckBox) findViewById(R.id.checkBox);

        Layout1.setVisibility(View.GONE);

        c1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    Layout1.setVisibility(View.VISIBLE);

                    b1 = (Button) findViewById(R.id.button);
                    r1 = (RadioButton) findViewById(R.id.radioButton);
                    r2 = (RadioButton) findViewById(R.id.radioButton2);
                    r3 = (RadioButton) findViewById(R.id.radioButton3);
                    rg = (RadioGroup) findViewById(R.id.radioGroup);
                    image = (ImageView) findViewById(R.id.imageView);

                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if (r1.isChecked() == true) {
                                image.setImageResource(R.drawable.dog);
                            } else if (r2.isChecked() == true) {
                                image.setImageResource(R.drawable.cat);
                            } else
                                image.setImageResource(R.drawable.rabbit);
                        }
                    });
                }
                else
                    Layout1.setVisibility(View.GONE);
            }

        });



    }

}



