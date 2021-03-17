package com.example.appstorya101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {
    //private Button legend;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Button legend= findViewById(R.id.Legend);
        Button horror= findViewById(R.id.horror);
        Button funny= findViewById(R.id.funny);
        Button drama= findViewById(R.id.drama);

       legend.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openPage3();
           }
       });
        horror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage4();
            }
        });
        funny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage5();
            }
        });
        drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPage6();
            }
        });
        //legend= (Button) findViewById(R.id.Legend);
        //legend.setOnClickListener(new View.OnClickListener() {
         //   @Override
           // public void onClick(View v) {

            //    openPage3();
         //   }
      //  });
   }
   public void openPage3(){
      Intent intent= new Intent(this, Page3.class);

    startActivity(intent);
    }
    public void openPage4(){
        Intent intent= new Intent(this, Page4.class);

        startActivity(intent);
    }
    public void openPage5(){
        Intent intent= new Intent(this, Page5.class);

        startActivity(intent);
    }
    public void openPage6(){
        Intent intent= new Intent(this, Page6.class);

        startActivity(intent);
    }
}

