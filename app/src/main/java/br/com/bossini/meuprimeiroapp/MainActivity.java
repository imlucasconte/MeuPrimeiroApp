package br.com.bossini.meuprimeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import br.usjt.meuprimeiroapp.R;

public class MainActivity extends AppCompatActivity {

    //constante static para identificar a mensagem
    public final static String EXTRA_MESSAGE = "br.usjt.meuprimeiroapp.MESSAGE";
    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent;
        intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}

