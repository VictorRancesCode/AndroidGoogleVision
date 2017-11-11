package com.codigopanda.androidgooglevision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class clsPrincipal extends AppCompatActivity {
    Button boton;
    Button ocr;
    Button cloudvision;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fprincipal);
        boton=(Button) findViewById(R.id.botonsaltarfacedetection);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clsPrincipal.this,FaceDetection.class));
            }
        });
        ocr=(Button) findViewById(R.id.botonsaltarocr);
        ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clsPrincipal.this,TextRecognition.class));
            }
        });


        cloudvision=(Button) findViewById(R.id.cloudvision);
        cloudvision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(clsPrincipal.this,CloudVisionAPI.class));
            }
        });

    }
}
