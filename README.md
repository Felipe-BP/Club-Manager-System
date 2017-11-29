![alt text](http://moodle.utfpr.edu.br/pluginfile.php/286382/mod_page/content/3/SGC-projeto.png)
Observações:

- O método criar presente em algumas classes pede ao usuário que forneça os dados do objeto a ser criado, cria o objeto e em seguida o retorna.

Exemplo: Ao chamar o método criar da classe Endereco, este irá pedir ao usuário que forneça o nome da rua, número, CEP, cidade e estado. Os dados serão passados ao método construtor e o objeto instanciado será retornado.

- O método pesquisar presente em algumas classes espera receber a id de alguma das instâncias armazenadas no vetor de dados e retorna aquela que possuir a id correspondente. O método deverá retornar o objeto encontrado ou null caso contrário.
Exemplo: Ao chamar o método pesquisarEndereco da classe Endereco fornecendo o int 1, o vetor enderecos será percorrido à procura de um Endereco que possua o id de valor 1.

- Todas as classes devem possuir um método toString.

- Todos os atributos devem possuir seus respectivos métodos set e get (exceções devem ser comentadas no código).

- A instanciação de objetos que possuem ID deve utilizar uma variável estática ou algum meio de controlar o valor da ID para que seja sequencial (e consequentemente, único) perante os objetos da mesma classe.

- Caso não seja mencionado nas instruções abaixo, em situações em que o usuário fornecer informações inválidas ao programa, deve-se abortar essas operações e mensagens de erro simples devem ser exibidas.
Exemplo: Durante a matrícula de um Sócio em alguma Modalidade, caso o usuário forneça uma ID de modalidade inexistente, deve-se abortar a matrícula e exibir "Erro! Não foi possível encontrar a modalidade de ID 9".

-É aconselhável que sejam criados métodos que listem os objetos armazenados em vetores para informar ao usuário a ID/posição de cada objeto.

[Titulo]

+ criar(enderecos: Endereco[]): Titulo
Criar um Título assim como seu titular e possíveis dependentes. Deve-se perguntar ao usuário se o Título a ser criado é Individual ou Familiar. Deve-se instanciar o Título apropriado assim como chamar o método Sócio.criar() para criar o Sócio titular e se for o caso, cada um de seus dependentes. O parâmetro endereços a ser passado é um vetor que armazena todos os endereços criados e provavelmente está instanciado no método main da sua aplicação. Esse vetor não deve ser manipulado pelo método Título.criar(), somente deve-se passá-lo ao Sócio.criar() ao criar cada Sócio.

+ calcularMensalidade(): Mensalidade
Calcular o valor total a ser pago da Mensalidade. Deve-se somar o custoBasico da classe Utilitario e multiplicar o custoDependente pela quantidade de dependentes no caso de um Título Familiar. Além disso, deve-se percorrer o vetor matriculas do titular e de cada um dos dependentes, somando o preço de cada uma das modalidades matriculadas. Ao fim, deve-se retornar o objeto Mensalidade, sendo que o atributo valor deve receber o valor total da soma e a dataEmissao deve receber a data atual do sistema em sua instanciação.

+ pagarMensalidade(mes: int): boolean
Receber um inteiro que representa o mês da mensalidade (o vetor de tamanho 12 armazenará em cada mês o valor da mensalidade correspondente. Lembre-se de subtrair 1 do índice, devido ao fato do primeiro elemento do vetor se encontrar na posição 0.
Após encontrar a mensalidade a ser paga, atribuir a data atual do sistema ao atributo dataPagamento e retornar true ao fim para confirmar o sucesso da operação. Caso contrário retorna false.


[Socio]

+ criar(enderecos: Endereco[]): Titulo
Criar um Sócio e seu respectivo Endereço, caso não exista. Deve-se perguntar ao usuário cada um dos atributos do Sócio e a ID do Endereço, caso já tenha sido cadastrado anteriormente. Com a ID do Endereço é possível chamar o método Endereço.pesquisarEndereço(), passando o vetor endereços recebido e a ID a fim de encontrar o Endereço correspondente. Caso contrário, deve-se chamar o método Endereço.criar() para que o usuário forneça cada um dos atributos do Endereço. Após executar um dos métodos da classe Endereço, atribuir o Endereço retornado ao atributo endereço do Socio sendo instanciado e armazená-lo no vetor endereços para que possa ser reutilizado nas próximas instanciações.
Esse método deverá ser chamado pelo método Título.criar().

+ matricular(modalidadeId: int, modalidades: Modalidade[]): boolean
Receber a ID da modalidade a ser matriculada e o vetor de modalidades para que seja criada uma matrícula para o Sócio. Os parâmetros recebidos devem ser passados ao método Modalidade.pesquisarModalidade() para que a Modalidade desejada seja encontrada. Ao encontrar a modalidade, instanciar uma Matrícula, atribuindo à dataInício a data atual do sistema. Após a instanciação, adicionar a Matrícula ao vetor matrículas do Sócio. Retornar true ao fim para confirmar o sucesso da operação.

+ desmatricular(matriculaId: int): boolean
Percorrer o vetor matrículas, encontrar a matrícula correspondente à ID recebida e atribuir à dataTérmino a data atual do sistema. Retornar true ao fim para confirmar o sucesso da operação.
