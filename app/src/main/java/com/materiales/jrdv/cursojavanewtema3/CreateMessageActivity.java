package com.materiales.jrdv.cursojavanewtema3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }


    //al pulsar el boton send

    public void onSendMessage (View view){

/*
        //creamos un intent para que al oulsar del tiron abra la segunda activity:
        Intent intentmio = new Intent(this,ReceiveMessageActivity.class);
        startActivity(intentmio);

 */
        //ahora vamos a pasarle un extra la intet del texto del Edittext


        EditText messageTextoEdit =(EditText)findViewById(R.id.message);
        //ese edittext lo paso a String

        String MessageTextoAPasar =messageTextoEdit.getText().toString();


//        Intent intentmio = new Intent(this,ReceiveMessageActivity.class);
//
//        intentmio.putExtra(ReceiveMessageActivity.EXTRAMESSAGE,MessageTextoAPasar);
//        startActivity(intentmio);

        // ahora vamos a hacer un IMPLICIT INTENT!!!
//
//        Intent intentImplicito =new Intent(Intent.ACTION_SEND);
//        intentImplicito.setType("text/plain");
//        intentImplicito.putExtra(Intent.EXTRA_TEXT,MessageTextoAPasar);
//
//        startActivity(intentImplicito);


        //Y ahora vamos a usar el IntentChoser

        Intent intentImplicito =new Intent(Intent.ACTION_SEND);
        intentImplicito.setType("text/plain");
        intentImplicito.putExtra(Intent.EXTRA_TEXT, MessageTextoAPasar);

        String TextoDelMesanjeParaelegir =getString(R.string.Send_title);


        //Intent ChooseIntent=Intent.createChooser(intentImplicito, "send Message");

        //idem con el text en el Resources Strings:

        Intent ChooseIntent=Intent.createChooser(intentImplicito,TextoDelMesanjeParaelegir);

        startActivity(ChooseIntent);

        //y ole yo!! y oleÇ!!!

    //jodser!!!




    }
}
