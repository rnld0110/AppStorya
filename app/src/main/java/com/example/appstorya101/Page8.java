package com.example.appstorya101;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Page8 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page8);

        pdfView=findViewById(R.id.pdfView);

        int story_position=getIntent().getIntExtra("key_position",0);

        if (story_position==0){
            pdfView.fromAsset("FEU.pdf").load();
        }
        else if (story_position==1){
            pdfView.fromAsset("White Lady.pdf").load();
        }

    }
}