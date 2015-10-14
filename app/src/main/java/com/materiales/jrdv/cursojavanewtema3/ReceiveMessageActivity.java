package com.materiales.jrdv.cursojavanewtema3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {


    //una ivar fija mia

    public static final String EXTRAMESSAGE="message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);


        //y ahora qui recibimos el Extra del intent para poberlo ene el textview


        Intent intent=getIntent();

        String MessageTextFromIntent=intent.getStringExtra(EXTRAMESSAGE);

        //y lo ponemos en la TextView


        TextView messagVie=(TextView) findViewById(R.id.message);
        messagVie.setText(MessageTextFromIntent);



    }
}
