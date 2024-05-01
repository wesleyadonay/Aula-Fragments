package com.teste.aulafragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.teste.aulafragments.R;
import com.teste.aulafragments.fragments.ContatoFragment;
import com.teste.aulafragments.fragments.ConversaFragment;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversaFragment conversasfragments;
    private ContatoFragment contatosfragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        conversasfragments = new ConversaFragment();

        //configurar o objeto fragments
        FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
        transition.replace(R.id.frameConteudo, conversasfragments);
        transition.commit();

        buttonContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                contatosfragments = new ContatoFragment();

                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.frameConteudo, contatosfragments);
                transition.commit();
            }
        });

        buttonConversa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction transition =  getSupportFragmentManager().beginTransaction();
                transition.replace(R.id.frameConteudo, conversasfragments);
                transition.commit();
            }
        });
    }
}