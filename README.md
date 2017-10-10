<<<<<<< HEAD
Manual Do Usuário

PRIME – Sistema Comercial

V.1.0.0

***Visão Geral***
=================

*Sistema PRIME:*
----------------

O “Prime – Sistema Comercial” é composto de duas aplicações, sendo uma o
“Menu Geral” (software do gerente) que é responsável por gerenciar todo
e qualquer produto, bem como todos os cadastros, configurações e
relatórios do sistema, ele é o software responsável por realizar a troca
ou atualização de informações entre a base de dados e o terminal de
frente de caixa, que por sua vez refere-se a um sistema de frente de
caixa completo, responsável por realizar todas as vendas no ECF.

*Base de Dados:*
----------------

O “Prime – Sistema Comercial” foi desenvolvido em uma Base de Dados
MySQL, devendo o usuário instalar a base de dados anteriormente ao
programa para o seu perfeito funcionamento. A versão utilizada é a
versão [**MySQL for
Windows**](http://www.baixaki.com.br/download/mysql-for-windows.htm)
**5.1.56.**

*Acesso ao PRIME:*
------------------

O “Prime – Sistema Comercial” conta com um dispositivo de segurança para
que somente pessoas devidamente autorizadas tenham acesso ao Menu Geral
e possam efetuar qualquer tipo de alteração na base de dados do sistema,
devendo o responsável superior liberar o acesso necessário a um
funcionário fornecendo-lhe um usuário e senha do sistema com a permissão
que lhe melhor caber.

Por padrão o sistema traz os seguintes dados de acesso ao sistema:

**Login:** Supervisor

**Senha**: supervisor

***Instalação***
================

*Base de Dados:*
----------------

A base de dados utilizada é o servidor de banco de dados SQL
multi-recursos **MySQL for Windows *5.1.56***, para ter-se acesso ao
Banco de Dados deve-se ser instalado o programa de frente do banco de
dados, o utilizado na criação foi **o SQL *Front 5.1 build 1.12*** ,
após instalada a frente do BD, o seguinte Usuário deve ser Criado:

**Nome:** prime

**Servidor:** localhost

**Porta:** 3306

**Tipo de Conexão:** Direto

**Usuário:** root

**Senha:** root

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image005.jpg?raw=true?raw=true)![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image3.png?raw=true)

***Visão do Sistema***
======================

*Menu Geral:*
-------------

O “PRIME – Sistema Comercial” conta com um menu geral (menu do gerente),
que controla todo o estoque, cadastro de funcionários, fornecedores,
clientes, produtos, unidades, cartões, etc.

Abaixo conheceremos melhor cada um destes menus.

### *- Tela de Login:*

É a tela de acesso ao sistema, onde se deve informar o login e senha de
usuário para que o mesmo tenha o devido acesso ao sistema, lembrando que
somente o gerente, ou a quem lhe caber o recurso terão acesso total ao
sistema, ficando aos demais algumas áreas com acesso restrito.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image4.png?raw=true)

Caso os dados informados para login tenham sido corretos, o usuário
receberá a mensagem mostrada na imagem abaixo, caso contrário, o mesmo
terá até 3 tentativas para corrigir seus dados, passadas as tentativas o
programa se fechará automaticamente devendo ele reabri-lo para reiniciar
uma nova tentativa.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image5.png?raw=true)

Uma vez que ele realizar o login com sucesso ele será apresentado à tela
do Menu Geral.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image6.png?raw=true)

### 

### 

### *- Itens do Menu:*

O Menu Geral é dividido nos seguintes menus e sub-menus:

-   CADASTRO:

> -Clientes;
>
> -Fornecedores;
>
> -Contas Bancarias;
>
> -Unidades;
>
> -Produtos;
>
> -Departamentos;
>
> -Funcionários;
>
> -Cartões;
>
> -Plano de Contas;
>
> -Tipo de pagamento e recebimento;
>
> -Sair.

-   MOVIMENTO:

> -Contas a Pagar;
>
> -Contas a Receber;
>
> -Vendas;
>
> -Orçamentos;
>
> -Controle de Estoque:
>
> -Entrada de NF;
>
> -Atualização de Preços.
>
> -Compras:
>
> -Requisição;
>
> -Cotação;
>
> -Confirma Cotação;
>
> -Pedido.
>
> -Tesouraria e Banco:
>
> -Emissão de Cheques;
>
> -Conciliação de Cheques;
>
> -Movimento de Banco.

-   ÚTILITARIOS:

> -Calculadora;
>
> -Calendário;
>
> -Sistema de Segurança:
>
> -Trocar Senha de Acesso;
>
> -Definir Nível de Acesso.

-   AJUDA:

> -Conteúdo;
>
> -Sobre o Sistema;

*Imagens de Atalho e seus Significados:*

![C:\\Users\\Scholl\\Desktop\\imagens\\users4\_add444.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image7.png?raw=true)**= Cadastrar um Novo Cliente;**

![C:\\Users\\Scholl\\Desktop\\imagens\\produtos\_add.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image8.png?raw=true) **= Cadastrar um novo Produto;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Orcamento\_Red\_.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image9.png?raw=true) **= Realizar Orçamento;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Venda\_2.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image10.png?raw=true) **= Iniciar Frente de Caixa;**

![C:\\Users\\Scholl\\Desktop\\imagens\\fornecedor\_12\_.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image11.png?raw=true) **= Consultar / Cadastrar um
Fornecedor;**

![C:\\Users\\Scholl\\Desktop\\imagens\\calculadora\_12.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image12.png?raw=true) **= Abrir Calculadora;**

![C:\\Users\\Scholl\\Desktop\\imagens\\exit\_3.png?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image13.png?raw=true)**= Sair.**

 *MENU CADASTRO:*
-----------------

### *- Cadastro de Clientes:*

É a tabela responsável por cadastrar todo e qualquer cliente e
exibi-los, e é a tabela responsável por fazer a atualização cadastral
junto à base de dados. Ao iniciar a tabela clientes a seguinte tela é
exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image14.png?raw=true)

Na tabela superior constam todos os clientes cadastrados, bem como todos
os seus dados, na tabela inferior constam os endereços de um cliente
quando este for selecionado, um cliente pode possuir mais de um
endereço, como também pode não possuir um endereço cadastrado no
sistema, para exibir o endereço de um cliente este deve ser selecionado,
como mostrado na imagem abaixo:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image15.png?raw=true)

Para inserir um Cliente, basta clicar no botão “Inserir Cliente” abaixo
da tabela de clientes já cadastrados, que a seguinte tela será exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image16.png?raw=true)
Então somente é necessário informar os dados deste novo cliente e clicar
no botão “Confirma” que este cliente será armazenado no banco de dados.
Sendo necessário informar um ou mais endereços, é somente necessário
selecionar o cliente a que deseja informar um ou mais endereços e clicar
no botão “Inserir Endereço” abaixo da tabela de endereços e preencher os
campos necessários, devendo assim que concluir o necessário, salvar as
alterações pressionando o botão “Salvar Alterações”.

Para editar um cliente já cadastrado no banco de dados, é só selecionar
o cliente desejado e pressionar o botão “Editar Cliente” (localizado
abaixo da tabela de clientes), que será aberta uma janela com os dados
atuais do cliente preenchidos, devendo assim (vide imagem abaixo),
somente alterar o necessário e clicar em “Confirma”.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image17.png?raw=true)

Para EXCLUIR um cliente cadastrado é necessário selecionar o cliente,
apagar seus endereços cadastrados selecionando os endereços e
pressionando o botão “Excluir Endereço”, para então pressionar o botão
“Excluir Cliente”, um cliente só pode ser excluído depois que seus
endereços forem devidamente apagados.

Caso você deseje cancelar alguma alteração antes de salvar os dados no
banco, pressione o botão “Cancelar Alterações”, abaixo da tabela de
endereços.

### *- Cadastro de Fornecedores:*

É a tabela responsável por cadastrar todo e qualquer fornecedor, é
composta de duas tabelas, a primeira sendo a “Relação de Fornecedores”,
que é a tabela principal, onde somente são exibidos os fornecedores
cadastrados e suas informações, e a segunda é a tabela responsável por
fazer o cadastramento de um novo fornecedor e a atualização cadastral
dos fornecedores junto a base de dados, as tabelas são separas em duas
guias diferentes. Ao iniciar o cadastramento de fornecedores, a seguinte
tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image18.png?raw=true)

Para Inserir um novo fornecedor, somente é necessário clicar no botão
“Inserir”, que a seguinte tela será aberta:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image19.png?raw=true)

Assim que a tela for aberta, é só preencher toda a tabela com as
informações necessárias, e clicar em “Salvar” que este novo fornecedor
será salvo dentro da base de dados.

Caso ao inserir um novo fornecedor, e o mesmo não se recordar do CEP, há
também a opção de BUSCAR CEP, onde o sistema mostrara todos os CEPS
Registrados na base de dados e o usuário pode selecioná-los, fazendo uma
busca pelo nome da rua, bairro, cidade.

Janela para buscar o CEP:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image20.png?raw=true)

Buscando um CEP em uma rua chamada “São Pedro”:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image21.png?raw=true)

O sistema busca a palavra “são pedro” na base de dados e exibe ao
usuário, qualquer registro que contenha a palavra, independente de ser a
rua, o bairro, a cidade, ou qualquer outro.

Para fazer a busca só é preciso informar a palavra e telar ENTER.

Após importar um registro de CEP para um fornecedor, o mesmo já será
automaticamente preenchido, como mostra a imagem abaixo, de um CEP
importado:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image22.png?raw=true)

Para alterar um fornecedor já cadastrado, é só selecionar o fornecedor
desejado e clicar na guia (ou aba) “Incluindo/Alterando um Fornecedor”,
que os dados deles já serão trazidos sendo somente necessário alterar o
que for preciso e salvar pressionando o botão “Salvar”.

Ao selecionar um fornecedor e clicar para alterá-lo a seguinte janela
será exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image23.png?raw=true)

### *- Cadastro de Contas Bancárias:*

É a tabela responsável por cadastrar todas as contas bancárias da
empresa,assim que aberta, a seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image24.png?raw=true)

Para Inserir uma nova Conta, é só pressionar o botão “Novo” que a tela
para inserir será aberta, que é a seguinte:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image25.png?raw=true)

Após clicar em “Novo”, é só digitar os dados nos campos abaixo que
automaticamente eles serão preenchidos na base dados, exemplo:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image26.png?raw=true)

Enquanto as informações são digitadas elas são automaticamente
preenchidas no ultimo registro.

Para editar um banco já cadastrado é só selecionar o banco desejado e
alterar as informações nos campos abaixo (Nome do Banco, Agencia do
Banco, Conta do Banco, etc.)

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image27.png?raw=true)

ATENÇÃO: Para todos os procedimentos deve-se salvar antes de fechar a
janela para os dados não serem perdidos.

### *- Cadastro de Unidades:*

É a tabela responsável por cadastrar todas as unidades a serem usadas
nos produtos cadastrados no banco de dados, assim que aberta, a seguinte
tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image28.png?raw=true)

Para Inserir uma nova unidade, clique em inserir e informe a descrição
desta nova unidade no campo “Descrição Unidade”, e clique em “Salvar”.
Para excluir uma unidade selecione a unidade desejada e pressione o
botão “Excluir”, para Editar uma unidade, selecione-a e altere o que
estiver escrito no campo “Descrição Unidade” e clique em salvar.

### *- Cadastro de Produtos:*

O cadastro de produtos é responsável por gerenciar as mercadorias
comercializadas na empresa. Ao cadastrar um produto é necessário além de
especificar seus dados cadastrais básicos como código, descrição, preço,
os dados do estoque, pois é esta tabela que define o estoque de um
produto no banco de dados da empresa. É basicamente a tabela principal
do sistema de venda da empresa. Ao ser aberta a seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image29.png?raw=true)

Para BUSCAR um produto cadastrado no banco de dados é só digitar uma
palavra referente ao produto no campo “Localizar”, caso haja algo
cadastrado com a palavra informada, somente será exibo o que a pesquisa
localizar, exemplo:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image30.png?raw=true)

Para Cadastrar um Produto novo no Banco de dados, clique em “Novo” e a
seguinte tela será exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image31.png?raw=true)

Após informar todos os dados cadastrais do produto, clique em “Salvar”
para que o produto seja salvo no banco de dados, caso contrario todas as
informações digitadas poderão ser perdidas!

Para ALTERAR um produto já cadastrado, selecione o produto desejado que
suas informações aparecerão nos campos abaixo da tabela mestre ( na
tabela Detalhe), sendo necessário então somente editá-los para atualizar
este produto.

Exemplo de Produto sofrendo Alteração:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image32.png?raw=true)

Para EXCLUIR um produto, basta selecioná-lo e pressionar o botão
“Excluir”, mas vale lembrar que só será excluído o produto que não tiver
mais nenhum relacionamento com outras tabelas do banco de dados, por
exemplo, orçamentos, vendas, etc.

### *- Cadastro de Departamentos:*

O Cadastro de Departamentos é o onde são cadastrados todos os
departamentos de uma empresa, sua principal finalidade é o controle de
gastos. Ao ser aberta a seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image33.png?raw=true)

Para CRIAR um novo departamento é só clicar em “Criar” e descrever este
novo departamento no campo “Nome Departamento”, e clicar em “Salvar”
para salvar o novo departamento no banco de dados.

Para ALTERAR um departamento é selecioná-lo e alterar o que tiver
escrito no campo “Nome Departamento”, e clicar em “Salvar”.

Para Excluir um departamento, é só selecioná-lo e pressionar o botão
“Excluir”, e então pressionar o botão “Salvar” para confirmar a exclusão
no banco de dados.

### *- Cadastro de Funcionários:*

O Cadastro de Funcionários é o onde são cadastrados todos os
funcionários da empresa, é necessário informar todos os dados cadastrais
do funcionário, como nome, departamento, função, data de admissão... Ao
se cadastrar um funcionário, o mesmo deverá cadastrar uma senha e
usuário para login, para que após, um supervisor possa conceder a esse
funcionário o acesso a determinados setores da empresa, a senha do
funcionário é criptografada no banco de dados, não podendo um supervisor
ter acesso a essa senha.

Ao ser aberta a tela de cadastros de funcionários, a seguinte tela é
exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image34.png?raw=true)

Para INSERIR um novo funcionário, pressione o botão “Novo”, e a seguinte
tela será aberta:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image35.png?raw=true)
Agora, com acesso aos campos, é só informar os dados cadastrais do
funcionário, feito isso é só pressionar o botão “Salvar” que o
funcionário será salvo no banco de dados.

Para ATERAR os dados de um funcionário cadastrado, é necessário
selecioná-lo para ter acesso aos dados atuais dele nos campos de
“Informações do Funcionário” e alterar o campo necessário em, como no
exemplo abaixo onde o funcionário “Beto” esta tendo seu nome alterado
para “Beto dos Santos Brito”:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image36.png?raw=true)
Depois, já ALTERADO e salvo no banco de dados:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image37.png?raw=true)

Para EXLUIR um funcionário cadastrado, selecione o funcionário desejado
e pressione o botão “Excluir”, e após então pressione o botão “Salvar”
para confirmar a operação no banco de dados.

### *- Cadastro de Cartões:*

O Cadastro de Cartões é o onde são cadastrados todos os cartões de
créditos aceitos pela empresa. Ao ser aberta a tela de cadastros de
cartões, a seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image38.png?raw=true)

Para Inserir um novo cartão no banco de dados pressione o botão “Criar”,
um novo registro será criado e os campos “Nome Cartão” e “Taxa Cartão”
serão habilitados, devendo o funcionário que esta cadastrando um novo
cartão informar os dados corretamente e pressionar o botão “Confirmar”
para inserir o novo cartão no banco de dados.

Exemplo de cartão sendo inserido:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image39.png?raw=true)

Para EDITAR um cartão, deve-se selecionar o cartão desejado e alterar a
informação contida nos campos abaixo da tabela que contem os cartões
cadastrados e então confirmar a alteração pressionando o botão
“Confirmar”.

Para EXCLUIR um cartão cadastrado, deve-se selecionar o cartão desejado
e pressionar o botão “Excluir”, para confirmar a exclusão o botão
“Confirmar” deve ser pressionado, que o cartão será excluído do banco de
dados do sistema.

### *- Cadastro de Plano de Contas:*

O Cadastro de Plano de Contas é o onde são cadastradas todas as contas
fixas da empresa. Ao ser aberta a tela de cadastros de plano de contas,
a seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image40.png?raw=true)
Para CRIAR uma nova conta fixa, pressione o botão “Criar”, um novo
registro será criado, e então a descrição da conta deve ser informada no
campo “Descrição Plano Conta”

Para ALTERAR uma conta já cadastrada, selecione a conta desejada, e
altere o conteúdo do campo “Descrição Plano Conta”, feito isso pressione
o botão “Salvar” para confirmar a alteração no banco de dados.

Para EXCLUIR uma conta já cadastrada, selecione a conta desejada e
pressione o botão “Excluir”, para confirmar a exclusão no banco de
dados, pressione o botão “Salvar”.

### *- Cadastro de Tipos de Pagamentos / Recebimentos:*

O Cadastro de tipos de pagamentos e recebimentos é o onde são
cadastradas todas as formas de recebimentos de valores da empresa. Ao
ser aberta a tela de tipos de pagamentos e recebimentos, a seguinte tela
é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image41.png?raw=true)

Para INSERIR um novo tipo de pagamento/recebimento, pressione o botão
“Inserir”, um novo registro será criado, e então a descrição do tipo de
pagamento/recebimento deve ser informada no campo “Descrição do Tipo”

Para ALTERAR um tipo de pagamento/recebimento já cadastrado, selecione o
tipo desejado, e altere o conteúdo do campo “Descrição do Tipo”, feito
isso pressione o botão “Salvar” para confirmar a alteração no banco de
dados.

Para EXCLUIR um tipo de pagamento/recebimento já cadastrado, selecione o
tipo desejado e pressione o botão “Excluir”, para confirmar a exclusão
no banco de dados, pressione o botão “Salvar”.

*MENU MOVIMENTO:*
-----------------

### *- Contas á Pagar:*

Função a ser Implementada em futura versão.

### *- Contas á Receber:*

Função a ser Implementada em futura versão.

### *- Vendas:*

Função a ser Implementada em futura versão.

### *- Estoque - Ajuste de Preços:*

A tela de ajuste de preços tem a função de ajustar os preços de todos os
produtos do estoque, ou determinado produto, de acordo com a inflação.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image42.png?raw=true)

Para ajustar o estoque de um produto, é só selecioná-lo informar a
quantia no campo “Ajustar em”, selecionar aumento positivo ou negativo e
pressionar o botão “Ajustar” que o valor do produto será ajustado
automaticamente.

Para ajustar todo o estoque é só não selecionar um produto.

### *- Orçamentos de Venda:*

A tela de orçamentos tem a finalidade de realizar orçamentos para
clientes cadastrados no banco de dados, na tela de orçamentos, pode-se
realizar orçamentos de uma compra com vários produtos, e ainda, imprimir
um orçamento para o cliente, todos os orçamentos ficam guardados no
banco de dados para consulta posterior. Ao acessar esta opção, a
seguinte tela é exibida:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image43.png?raw=true)

Para Realizar um novo orçamento, deve se pressionar o botão “Iniciar
Orçamento”, que um novo registro será criado, liberando os campos de
cima da tela para serem editados, preencha os dados cadastrais conforme
solicitado.

Veja a imagem de exemplo a seguir com o botão “Iniciar Orçamento”
pressionado:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image44.png?raw=true)

Dados cadastrais do orçamento, informados:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image45.png?raw=true)

Para inserir um produto no orçamento, pressione o botão “Inserir Item”,
ao ser pressionado a tela de produtos será aberta:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image46.png?raw=true)

Para inserir um produto, você pode selecioná-lo ou realizar uma
pesquisar infomando uma palavra referente a este produto, após
selecionar o produto desejado, para importá-lo para o orçamento, pode-se
pressionar o botão “Importar” ou teclar a tecla ENTER do seu teclado.

Exemplo de produto importado:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image47.png?raw=true)

Ao importar um produto, ele já sai com o foco selecionado na célula
“Qtde” (quantidade) da tabela “Itens do Orçamento”, sendo necessário
somente informar a quantidade de itens deste produto você deseja
adicionar. Exemplo:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image48.png?raw=true)

Você pode inserir quantos itens forem necessários, devendo claro,
informar uma quantidade a eles, assim que todos os itens necessários
forem adicionados (importados) para o orçamento, você deve pressionar o
botão “Calcula Totais” para calcular o valor total do orçamento.

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image49.png?raw=true)

Assim que o botão “Calcula Totais” for pressionado, será automaticamente
calculado o valor sub-total de cada item, e o valor total da compra.
Lembrando que após concluir o orçamento, o botão “Confirmar” deve ser
pressionado para que o valor total seja armazenado corretamente no banco
de dados.

Depois que um orçamento for concluído, ele pode ser impresso, para que o
cliente tenha uma cópia do mesmo, para fazer isso pressione o botão
“Imprimir”.

Exemplo da impressão do orçamento criado:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image50.png?raw=true)

Para Imprimir o orçamento pressione o primeiro botão da aba superior
(imprimir ), para sair do view da impressão pressione o botão ao lado.

*MENU UTILITÁRIOS:*
-------------------

### *- Calculadora:*

Abre a Calculadora do sistema.

### *- Calendário:*

Abre um calendário para o usuário fazer uma consulta.

### *- Sistema de Segurança:*

-   ### *Trocar Senha Corrente:*

Abre uma janela para o usuário trocar a sua senha de acesso ao sistema.

-   ### *Definir Nível de Acesso:*

Abre uma janela para o usuário que tiver o acesso permitido, conceder,
ou revogar o acesso de funcionários a determinadas partes do programa.

Se um funcionário tentar acessar algum menu ou sub-menu do sistema, ao
qual ele não tem acesso, por exemplo o módulo orçamento, ele recebera a
mensagem abaixo e não terá acesso a este local:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image51.png?raw=true)

Se você for um funcionário que tem acesso total ao sistema, e deseja
conceder ou revogar uma permissão, entre no menu “Utilitários”, no
sub-menu “Sistema de Segurança”, e no sub-menu de “Sistemas de
Segurança”, “Definir Nível de Acesso”:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image52.png?raw=true)

Ao acessar o sub-menu “Definir Nível de Acesso” você será apresentado a
esta tela:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image53.png?raw=true)

Na tabela “Funcionário”, consta todos os funcionários cadastrados no
sistema, na tabela “Nível de Acesso” constam as permissões destes
funcionários. (Veja na imagem do detalhe abaixo)

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image53.png?raw=true)

Isso significa que o funcionário de código 4 (Maria) tem acesso a todos
os módulos descritos (Clientes, Contas Bancárias, Fornecedores, etc.), e
também significa que ela não tem acesso a nenhum outro modulo do sistema
(como por exemplo, realizar orçamentos, inserir, editar ou excluir um
produto, ou funcionário, etc.).

Para conceder uma permissão, devemos primeiro selecionar um funcionário
ao qual daremos a permissão:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image54.png?raw=true)

No caso, será dada alguma nova permissão a funcionária Maria, os módulos
aos quais podemos autorizar um acesso estão no campo esquerdo da janela
separado em menus e sub-menus:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image55.png?raw=true)
![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image56.png?raw=true)
![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image57.png?raw=true)

Para conceder uma Permissão deve-se então selecionar o funcionário (no
caso Maria), e deve se selecionar o item de menu ou sub-menu desejado:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image58.png?raw=true)

Após selecionarmos o funcionário, e módulo desejado, devemos confirmar
esta autorização pressionando o botão “Conceder” para conceder este
privilégio ao funcionário em questão.

Assim que o botão “Conceder” for pressionado, automaticamente aparecerá
no final da lista da tabela “Nível de Acesso”, o código do funcionário e
o módulo ao qual ele recebeu privilégio: (Não esqueça de pressionar o
botão “Salvar” para confirmar a
operação)![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image59.png?raw=true)

Sendo assim, agora a funcionaria cujo código é 4 (funcionária Maria),
possui acesso ao módulo de realizar orçamentos, ao qual ela recebeu a
mensagem de não possuir acesso anteriormente:

![](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image60.png?raw=true)

*TELA DE VENDAS ECFTEF:*
------------------------

O Módulo de Vendas é o subsistema responsável pelo fluxo das vendas. É o
principal responsável pelo fluxo de mercadorias no estoque é ele que
realiza todas as vendas dos produtos previamente cadastrados. Tela de
Vendas:

![G:\\ECFTEF\\imagem.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image61.jpeg?raw=true)

O funcionamento da “Frente de Caixa com TEF” consiste no seguinte, ao
iniciar a tela, a impressora fiscal abre um novo cupom fiscal para venda
(no exemplo é utilizado um emulador de impressora fiscal, mas a
impressão é exatamente a mesma):

![G:\\ECFTEF\\imagem2.jpg?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image62.jpeg?raw=true)

Após o cupom fiscal já estiver aberto à tela já estará funcionando,
somente aguardando que alguém entre com o código de um produto e a
quantidade para realizar uma venda.

Para entrar com o código de um produto, poderá ser usado um leitor de
códigos de barra, que quando o código é informado, ele automaticamente
já o informa e espera a quantidade ser confirmada para então realizar a
venda: ![G:\\ECFTEF\\Sem
título3.jpg?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image63.jpeg?raw=true)

Para Confirmar a quantidade deve-ser ser pressionada a tecla &lt;TAB&gt;
do teclado, assim que confirmada a quantidade, ele realiza a venda:

![G:\\ECFTEF\\imagem5.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image64.jpeg?raw=true)

Assim que ele realiza a venda, o produto já é impresso na Nota Fiscal, e
ele já volta para o inicio, aguardando que algum código seja informado,
e assim sucessivamente:

![G:\\ECFTEF\\imagem6.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image65.jpeg?raw=true)

![G:\\ECFTEF\\imagem7.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image66.jpeg?raw=true)

![G:\\ECFTEF\\imagem9.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image67.jpeg?raw=true)

![G:\\ECFTEF\\imagem10.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image68.jpeg?raw=true)

![G:\\ECFTEF\\imagem11.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image69.jpeg?raw=true)

![G:\\ECFTEF\\imagem12.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image70.jpeg?raw=true)

No Rodapé da tela de vendas possui alguns atalhos para funções de
vendas, como:

- Calculadora: Abre uma calculadora caso seja necessário;

**- Abrir Cupom:** Abre um novo cupom fiscal (na impressora também);

**- Cancela Item Genérico:** Faz o cancelamento de um item da nota
fiscal;

**- Cancela Ultimo Item:** Cancela o ultimo item d nota fiscal;

**- Cancela Cupom:** Cancela o cupom fiscal aberto ( cancela toda a
venda);

**- Concede Desconto:** Concede um valor de desconto a nota fiscal atual
(vide exemplo abaixo).

![G:\\ECFTEF\\imagem13.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image71.jpeg?raw=true)

![G:\\ECFTEF\\imagem14.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image72.jpeg?raw=true)

O Valor da compra que era de R\$47,50 com o desconto de R\$02,50 passou
a custar R\$45,00.

Para finalizar a compra deve-se teclar a tecla &lt;ESPAÇO&gt; do
teclado, que redireciona o cursor para o campo “valor Recebido”, onde
deverá ser informado o valor em dinheiro que o comprador deu para quitar
sua compra, lembrando que NUNCA poderá ser um valor abaixo do valor por
ele devido.

Assim que o valor recebido for informado, pressione a tecla &lt;TAB&gt;
do teclado, que automaticamente o cupom será fechado, e a venda será
finalizada, informando para o comprador, no campo “Troco”, o valor que
ele devera receber de troco:

![G:\\ECFTEF\\imagem16.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image73.jpeg?raw=true)

![G:\\ECFTEF\\imagem17.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image74.jpeg?raw=true)

### *- Redução Z: *

A Redução Z é um comando que deve ser executado no ECF após o
encerramento do dia. Deve-se ter muito cuidado ao acionar esse comando,
pois uma vez executado, o ECF fica bloqueado para vendas até o início do
dia seguinte. É de extrema importância que esse comando seja executa
**sempre** através da Frente de Caixa e não por outros softwares de
comunicação e testes com o ECF. Pois durante o processo de Redução Z a
Frente de Caixa captura e armazena diversas informações fiscais como
**Mapa Resumo** e dados para geração do arquivo de **Movimento por ECF**
exigido por lei.

Para emitir a Redução Z, você deve clicar com o botão DIREITO do mouse
sobre o fundo da tela de frente de caixa, navegar até o menu “Comandos
de Relatórios Fiscais”, e clicar no sub-menu “Redução Z”:

![G:\\ECFTEF\\imagem20.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image75.jpeg?raw=true)

Quando Você clicar para fazer a redução, o programa perguntará se você
realmente quer fazer a redução, caso sim, ela será realizada.

Segue na próxima pagina, a imagem de uma redução Z:

![G:\\ECFTEF\\imagem18.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image76.jpeg?raw=true)

### *- Leitura X:*

Leitura X é um relatório fiscal que apresenta todas as informações
referentes ao movimento do caixa desde a abertura (início do expediente)
até o momento. Nele são apresentados os valores totais acumulados das
vendas efetuadas, descontos e acréscimos concedidos, recebimentos e
pagamentos realizados por operações não-fiscais e também os valores
acumulados em cada alíquota de ICMS cadastrada no ECF.

Outras informações de interesse do fisco são também exibidas na Leitura
X, como os dados do contribuinte (lojista), os números seqüenciais das
operações realizadas, o número de série do equipamento e outras
informações adicionais.

A Leitura X pode ser emitida a qualquer momento (ela não tranca o caixa
como a redução Z), mesmo com o caixa fechado, desde que não exista outro
documento sendo emitido. 

Para emitir uma Leitura X, você deve clicar com o botão DIREITO do mouse
sobre o fundo da tela de frente de caixa, navegar até o menu “Comandos
de Relatórios Fiscais”, e clicar no sub-menu “Leitura X”:

![G:\\ECFTEF\\imagem20.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image75.jpeg?raw=true)

Segue abaixo a imagem de uma Leitura X:

![G:\\ECFTEF\\imagem19.JPG?raw=true](https://github.com/marcosscholl/Prime-SistemaComercial/blob/master/media/image77.jpeg?raw=true)
=======
