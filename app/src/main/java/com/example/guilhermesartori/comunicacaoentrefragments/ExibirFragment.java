package com.example.guilhermesartori.comunicacaoentrefragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExibirFragment extends Fragment {


    public ExibirFragment() {
        // Required empty public constructor
    }


    //quando a fragment é instanciada, ele recebe o bundle e coloca as informações recebidas na tela
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_exibir, container, false);

        TextView textMensagem = view.findViewById(R.id.receber_mensagem);

        textMensagem.setText(getArguments().getString(MainActivity.MENSAGEM));

        return view;
    }

}
