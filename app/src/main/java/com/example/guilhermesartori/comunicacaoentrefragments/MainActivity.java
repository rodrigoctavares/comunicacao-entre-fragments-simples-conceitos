package com.example.guilhermesartori.comunicacaoentrefragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

//main activity implementa a interface ReceptorDaMensagem
public class MainActivity extends AppCompatActivity implements ReceptorDaMensagem {

    public static final String MENSAGEM = "mensagem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando a fragment_mensagem dentro do layout da activity
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frag_mensagem, new MensagemFragment());
        transaction.commit();

    }

    //sobrescrição do método receber mensagem
    @Override
    public void receberMensagem(String mensagem) {

        //instancia um novo exibir_mensagem com um bundle para que a mensagem seja exibida nela
        ExibirFragment exibirFragment = new ExibirFragment();
        Bundle bundle = new Bundle();
        bundle.putString(MENSAGEM, mensagem);
        exibirFragment.setArguments(bundle);

        //coloca na activity o fragment já instanciado
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frag_exibidor, exibirFragment);
        transaction.commit();

    }
}
