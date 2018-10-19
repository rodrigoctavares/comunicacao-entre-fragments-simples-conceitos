# comunicação entre fragments

Fazer um app que aborde os conceitos básicos da comunicação entre fragments

------------------

#intenção do app:
O app precisa ter um fragment que enviará uma mensagem e um fragment que exibirá essa mensagem para o usuário. Todos os fragments estarão na mesma activity.


-----------------

#passo-a-passo

passo1:

Primeiro de tudo, após criarmos nosso app, precisamos criar 2 fragments:
  - MensagemFragment
    o fragment_mensagem.xml vai conter um EditText para receber a mensagem e um botão para enviar a mensagem
    mais para frente terminamos de configurar a classe MensagemFragment
  - ExibirFragment
    o fragment_exibir.xml vai ter um TextView para exibir mais para frente a mensagem digitada pelo usuário
    
----------------

passo2:

Criar a interface que fará a comunicação entre o MensagemFragment e a MainActivity:
  - Criar uma interface chamada ReceptorDaMensagem com o método obrigatório receberMensagem(String mensagem)
  - A classe MainAcitivity, por ser uma receptora da mensagem, irá implementar essa interface
  - A classe MensagemFragment, por ser um enviador da mensagem, necessáriamente precisa ter um receptorDaMensagem
  - O receptorDaMensagem da MensagemFragment será o contexto em que ela está inserida. Recebemos esse contexto através do método onAttach(Context context)  
  
---------------

passo3:

A classe MensagemFragment precisa que, ao ser clicado no botão, a mensagem seja capturada em formato String e seja enviado para a activity. Faremos isso chamando o método receptorDaMensagem.receberMensagem(mensagemDigitadaPeloUsuario)
  - onde mensagemDigitadaPeloUsuario sejá a mensagem que o usuário digitou no formato String.
  
-----------------
  
passoFinal:

a partir de agora, temos a nossa fragment comunicando com a nossa activity. Agora para finalizar é simplesmente mandar através de bundle para a ExibirFragment. 
