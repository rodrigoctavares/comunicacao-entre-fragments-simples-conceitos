package com.example.guilhermesartori.comunicacaoentrefragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MensagemFragment extends Fragment {
    private ReceptorDaMensagem receptorDaMensagem;
    private EditText mensagemEdit;
    //a fragmente que envia dados para a activity tem um ReceptorDaMensagem

    public MensagemFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        receptorDaMensagem = (ReceptorDaMensagem) context;
        //aqui falamos que o contexto que a fragment está inserido é o receptorDaMensagem
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_mensagem, container, false);

        mensagemEdit = view.findViewById(R.id.mensagem_id);

        //recebendo valores e passando-os através do método obrigatório da interface que o contexto implementa
        view.findViewById(R.id.bt_enviar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mensagem = mensagemEdit.getText().toString();
                receptorDaMensagem.receberMensagem(mensagem);
            }
        });

        return view;


    }

}
