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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image2.png){width="2.6875in"
height="2.968284120734908in"}![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image3.png){width="2.6831364829396325in"
height="2.963464566929134in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image4.png){width="5.572916666666667in"
height="2.596804461942257in"}

Caso os dados informados para login tenham sido corretos, o usuário
receberá a mensagem mostrada na imagem abaixo, caso contrário, o mesmo
terá até 3 tentativas para corrigir seus dados, passadas as tentativas o
programa se fechará automaticamente devendo ele reabri-lo para reiniciar
uma nova tentativa.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image5.png){width="2.7916666666666665in"
height="1.2916666666666667in"}

Uma vez que ele realizar o login com sucesso ele será apresentado à tela
do Menu Geral.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image6.png){width="6.236909448818897in"
height="4.996189851268592in"}

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

![C:\\Users\\Scholl\\Desktop\\imagens\\users4\_add444.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image7.png){width="0.625in"
height="0.625in"} **= Cadastrar um Novo Cliente;**

![C:\\Users\\Scholl\\Desktop\\imagens\\produtos\_add.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image8.png){width="0.625in"
height="0.625in"} **= Cadastrar um novo Produto;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Orcamento\_Red\_.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image9.png){width="0.8333333333333334in"
height="0.8333333333333334in"} **= Realizar Orçamento;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Venda\_2.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image10.png){width="0.875in"
height="0.8333333333333334in"} **= Iniciar Frente de Caixa;**

![C:\\Users\\Scholl\\Desktop\\imagens\\fornecedor\_12\_.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image11.png){width="1.15625in"
height="0.8333333333333334in"} **= Consultar / Cadastrar um
Fornecedor;**

![C:\\Users\\Scholl\\Desktop\\imagens\\calculadora\_12.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image12.png){width="1.0520833333333333in"
height="0.8333333333333334in"} **= Abrir Calculadora;**

![C:\\Users\\Scholl\\Desktop\\imagens\\exit\_3.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image13.png){width="0.8333333333333334in"
height="0.8333333333333334in"} **= Sair.**

 *MENU CADASTRO:*
-----------------

### *- Cadastro de Clientes:*

É a tabela responsável por cadastrar todo e qualquer cliente e
exibi-los, e é a tabela responsável por fazer a atualização cadastral
junto à base de dados. Ao iniciar a tabela clientes a seguinte tela é
exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image14.png){width="5.791666666666667in"
height="3.1132075678040243in"}

Na tabela superior constam todos os clientes cadastrados, bem como todos
os seus dados, na tabela inferior constam os endereços de um cliente
quando este for selecionado, um cliente pode possuir mais de um
endereço, como também pode não possuir um endereço cadastrado no
sistema, para exibir o endereço de um cliente este deve ser selecionado,
como mostrado na imagem abaixo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image15.png){width="5.812963692038495in"
height="3.0729166666666665in"}

Para inserir um Cliente, basta clicar no botão “Inserir Cliente” abaixo
da tabela de clientes já cadastrados, que a seguinte tela será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image16.png){width="4.208333333333333in"
height="5.2288079615048115in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image17.png){width="4.124783464566929in" height="5.125in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image18.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Para Inserir um novo fornecedor, somente é necessário clicar no botão
“Inserir”, que a seguinte tela será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image19.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Assim que a tela for aberta, é só preencher toda a tabela com as
informações necessárias, e clicar em “Salvar” que este novo fornecedor
será salvo dentro da base de dados.

Caso ao inserir um novo fornecedor, e o mesmo não se recordar do CEP, há
também a opção de BUSCAR CEP, onde o sistema mostrara todos os CEPS
Registrados na base de dados e o usuário pode selecioná-los, fazendo uma
busca pelo nome da rua, bairro, cidade.

Janela para buscar o CEP:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image20.png){width="5.905555555555556in"
height="2.9833759842519685in"}

Buscando um CEP em uma rua chamada “São Pedro”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image21.png){width="5.905555555555556in"
height="2.9833759842519685in"}

O sistema busca a palavra “são pedro” na base de dados e exibe ao
usuário, qualquer registro que contenha a palavra, independente de ser a
rua, o bairro, a cidade, ou qualquer outro.

Para fazer a busca só é preciso informar a palavra e telar ENTER.

Após importar um registro de CEP para um fornecedor, o mesmo já será
automaticamente preenchido, como mostra a imagem abaixo, de um CEP
importado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image22.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Para alterar um fornecedor já cadastrado, é só selecionar o fornecedor
desejado e clicar na guia (ou aba) “Incluindo/Alterando um Fornecedor”,
que os dados deles já serão trazidos sendo somente necessário alterar o
que for preciso e salvar pressionando o botão “Salvar”.

Ao selecionar um fornecedor e clicar para alterá-lo a seguinte janela
será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image23.png){width="5.905555555555556in"
height="3.0030686789151355in"}

### *- Cadastro de Contas Bancárias:*

É a tabela responsável por cadastrar todas as contas bancárias da
empresa,assim que aberta, a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image24.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Para Inserir uma nova Conta, é só pressionar o botão “Novo” que a tela
para inserir será aberta, que é a seguinte:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image25.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Após clicar em “Novo”, é só digitar os dados nos campos abaixo que
automaticamente eles serão preenchidos na base dados, exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image26.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Enquanto as informações são digitadas elas são automaticamente
preenchidas no ultimo registro.

Para editar um banco já cadastrado é só selecionar o banco desejado e
alterar as informações nos campos abaixo (Nome do Banco, Agencia do
Banco, Conta do Banco, etc.)

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image27.png){width="5.905555555555556in"
height="2.9771806649168853in"}

ATENÇÃO: Para todos os procedimentos deve-se salvar antes de fechar a
janela para os dados não serem perdidos.

### *- Cadastro de Unidades:*

É a tabela responsável por cadastrar todas as unidades a serem usadas
nos produtos cadastrados no banco de dados, assim que aberta, a seguinte
tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image28.png){width="4.96875in" height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image29.png){width="5.905555555555556in"
height="5.038367235345582in"}

Para BUSCAR um produto cadastrado no banco de dados é só digitar uma
palavra referente ao produto no campo “Localizar”, caso haja algo
cadastrado com a palavra informada, somente será exibo o que a pesquisa
localizar, exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image30.png){width="4.839232283464567in"
height="4.128626421697287in"}

Para Cadastrar um Produto novo no Banco de dados, clique em “Novo” e a
seguinte tela será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image31.png){width="4.979166666666667in"
height="4.2480118110236225in"}

Após informar todos os dados cadastrais do produto, clique em “Salvar”
para que o produto seja salvo no banco de dados, caso contrario todas as
informações digitadas poderão ser perdidas!

Para ALTERAR um produto já cadastrado, selecione o produto desejado que
suas informações aparecerão nos campos abaixo da tabela mestre ( na
tabela Detalhe), sendo necessário então somente editá-los para atualizar
este produto.

Exemplo de Produto sofrendo Alteração:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image32.png){width="5.905555555555556in"
height="5.038367235345582in"}

Para EXCLUIR um produto, basta selecioná-lo e pressionar o botão
“Excluir”, mas vale lembrar que só será excluído o produto que não tiver
mais nenhum relacionamento com outras tabelas do banco de dados, por
exemplo, orçamentos, vendas, etc.

### *- Cadastro de Departamentos:*

O Cadastro de Departamentos é o onde são cadastrados todos os
departamentos de uma empresa, sua principal finalidade é o controle de
gastos. Ao ser aberta a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image33.png){width="5.072916666666667in"
height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image34.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Para INSERIR um novo funcionário, pressione o botão “Novo”, e a seguinte
tela será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image35.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Agora, com acesso aos campos, é só informar os dados cadastrais do
funcionário, feito isso é só pressionar o botão “Salvar” que o
funcionário será salvo no banco de dados.

Para ATERAR os dados de um funcionário cadastrado, é necessário
selecioná-lo para ter acesso aos dados atuais dele nos campos de
“Informações do Funcionário” e alterar o campo necessário em, como no
exemplo abaixo onde o funcionário “Beto” esta tendo seu nome alterado
para “Beto dos Santos Brito”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image36.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Depois, já ALTERADO e salvo no banco de dados:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image37.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Para EXLUIR um funcionário cadastrado, selecione o funcionário desejado
e pressione o botão “Excluir”, e após então pressione o botão “Salvar”
para confirmar a operação no banco de dados.

### *- Cadastro de Cartões:*

O Cadastro de Cartões é o onde são cadastrados todos os cartões de
créditos aceitos pela empresa. Ao ser aberta a tela de cadastros de
cartões, a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image38.png){width="4.281702755905512in"
height="2.66159886264217in"}

Para Inserir um novo cartão no banco de dados pressione o botão “Criar”,
um novo registro será criado e os campos “Nome Cartão” e “Taxa Cartão”
serão habilitados, devendo o funcionário que esta cadastrando um novo
cartão informar os dados corretamente e pressionar o botão “Confirmar”
para inserir o novo cartão no banco de dados.

Exemplo de cartão sendo inserido:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image39.png){width="4.390398075240595in"
height="2.7291666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image40.png){width="5.197916666666667in"
height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image41.png){width="3.8958333333333335in"
height="2.7395833333333335in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image42.png){width="5.905555555555556in"
height="3.7326837270341207in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image43.png){width="5.905555555555556in"
height="4.116433727034121in"}

Para Realizar um novo orçamento, deve se pressionar o botão “Iniciar
Orçamento”, que um novo registro será criado, liberando os campos de
cima da tela para serem editados, preencha os dados cadastrais conforme
solicitado.

Veja a imagem de exemplo a seguir com o botão “Iniciar Orçamento”
pressionado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image44.png){width="5.905555555555556in"
height="4.116433727034121in"}

Dados cadastrais do orçamento, informados:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image45.png){width="5.905555555555556in"
height="4.116433727034121in"}

Para inserir um produto no orçamento, pressione o botão “Inserir Item”,
ao ser pressionado a tela de produtos será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image46.png){width="5.708333333333333in"
height="2.988837489063867in"}

Para inserir um produto, você pode selecioná-lo ou realizar uma
pesquisar infomando uma palavra referente a este produto, após
selecionar o produto desejado, para importá-lo para o orçamento, pode-se
pressionar o botão “Importar” ou teclar a tecla ENTER do seu teclado.

Exemplo de produto importado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image47.png){width="5.854166666666667in"
height="4.0806135170603675in"}

Ao importar um produto, ele já sai com o foco selecionado na célula
“Qtde” (quantidade) da tabela “Itens do Orçamento”, sendo necessário
somente informar a quantidade de itens deste produto você deseja
adicionar. Exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image48.png){width="5.177083333333333in"
height="3.608657042869641in"}

Você pode inserir quantos itens forem necessários, devendo claro,
informar uma quantidade a eles, assim que todos os itens necessários
forem adicionados (importados) para o orçamento, você deve pressionar o
botão “Calcula Totais” para calcular o valor total do orçamento.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image49.png){width="5.25in" height="3.659482720909886in"}

Assim que o botão “Calcula Totais” for pressionado, será automaticamente
calculado o valor sub-total de cada item, e o valor total da compra.
Lembrando que após concluir o orçamento, o botão “Confirmar” deve ser
pressionado para que o valor total seja armazenado corretamente no banco
de dados.

Depois que um orçamento for concluído, ele pode ser impresso, para que o
cliente tenha uma cópia do mesmo, para fazer isso pressione o botão
“Imprimir”.

Exemplo da impressão do orçamento criado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image50.png){width="5.905555555555556in"
height="4.015777559055118in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image51.png){width="2.9895833333333335in"
height="1.3333333333333333in"}

Se você for um funcionário que tem acesso total ao sistema, e deseja
conceder ou revogar uma permissão, entre no menu “Utilitários”, no
sub-menu “Sistema de Segurança”, e no sub-menu de “Sistemas de
Segurança”, “Definir Nível de Acesso”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image52.png){width="5.90625in" height="1.03125in"}

Ao acessar o sub-menu “Definir Nível de Acesso” você será apresentado a
esta tela:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image53.png){width="5.905555555555556in"
height="4.063086176727909in"}

Na tabela “Funcionário”, consta todos os funcionários cadastrados no
sistema, na tabela “Nível de Acesso” constam as permissões destes
funcionários. (Veja na imagem do detalhe abaixo)

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image53.png){width="3.2362292213473314in" height="2.4375in"}

Isso significa que o funcionário de código 4 (Maria) tem acesso a todos
os módulos descritos (Clientes, Contas Bancárias, Fornecedores, etc.), e
também significa que ela não tem acesso a nenhum outro modulo do sistema
(como por exemplo, realizar orçamentos, inserir, editar ou excluir um
produto, ou funcionário, etc.).

Para conceder uma permissão, devemos primeiro selecionar um funcionário
ao qual daremos a permissão:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image54.png){width="4.601394356955381in"
height="1.8229166666666667in"}

No caso, será dada alguma nova permissão a funcionária Maria, os módulos
aos quais podemos autorizar um acesso estão no campo esquerdo da janela
separado em menus e sub-menus:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image55.png){width="2.15625in" height="3.3854166666666665in"}
![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image56.png){width="2.158333333333333in"
height="3.3854166666666665in"}
![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image57.png){width="2.1666666666666665in" height="3.34375in"}

Para conceder uma Permissão deve-se então selecionar o funcionário (no
caso Maria), e deve se selecionar o item de menu ou sub-menu desejado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image58.png){width="5.625in" height="3.8700612423447067in"}

Após selecionarmos o funcionário, e módulo desejado, devemos confirmar
esta autorização pressionando o botão “Conceder” para conceder este
privilégio ao funcionário em questão.

Assim que o botão “Conceder” for pressionado, automaticamente aparecerá
no final da lista da tabela “Nível de Acesso”, o código do funcionário e
o módulo ao qual ele recebeu privilégio: (Não esqueça de pressionar o
botão “Salvar” para confirmar a
operação)![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image59.png){width="5.625in"
height="3.8700612423447067in"}

Sendo assim, agora a funcionaria cujo código é 4 (funcionária Maria),
possui acesso ao módulo de realizar orçamentos, ao qual ela recebeu a
mensagem de não possuir acesso anteriormente:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image60.png){width="5.905555555555556in"
height="4.116433727034121in"}

*TELA DE VENDAS ECFTEF:*
------------------------

O Módulo de Vendas é o subsistema responsável pelo fluxo das vendas. É o
principal responsável pelo fluxo de mercadorias no estoque é ele que
realiza todas as vendas dos produtos previamente cadastrados. Tela de
Vendas:

![G:\\ECFTEF\\imagem.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image61.jpeg){width="5.0625in"
height="3.75in"}

O funcionamento da “Frente de Caixa com TEF” consiste no seguinte, ao
iniciar a tela, a impressora fiscal abre um novo cupom fiscal para venda
(no exemplo é utilizado um emulador de impressora fiscal, mas a
impressão é exatamente a mesma):

![G:\\ECFTEF\\imagem2.jpg](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image62.jpeg){width="3.4270833333333335in"
height="4.112498906386701in"}

Após o cupom fiscal já estiver aberto à tela já estará funcionando,
somente aguardando que alguém entre com o código de um produto e a
quantidade para realizar uma venda.

Para entrar com o código de um produto, poderá ser usado um leitor de
códigos de barra, que quando o código é informado, ele automaticamente
já o informa e espera a quantidade ser confirmada para então realizar a
venda: ![G:\\ECFTEF\\Sem
título3.jpg](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image63.jpeg){width="5.34375in"
height="3.9490693350831148in"}

Para Confirmar a quantidade deve-ser ser pressionada a tecla &lt;TAB&gt;
do teclado, assim que confirmada a quantidade, ele realiza a venda:

![G:\\ECFTEF\\imagem5.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image64.jpeg){width="5.343747812773404in"
height="3.9583333333333335in"}

Assim que ele realiza a venda, o produto já é impresso na Nota Fiscal, e
ele já volta para o inicio, aguardando que algum código seja informado,
e assim sucessivamente:

![G:\\ECFTEF\\imagem6.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image65.jpeg){width="3.750001093613298in"
height="4.5in"}

![G:\\ECFTEF\\imagem7.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image66.jpeg){width="5.552083333333333in"
height="4.1126552930883635in"}

![G:\\ECFTEF\\imagem9.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image67.jpeg){width="4.270833333333333in"
height="5.124998906386701in"}

![G:\\ECFTEF\\imagem10.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image68.jpeg){width="5.375in"
height="3.9814818460192476in"}

![G:\\ECFTEF\\imagem11.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image69.jpeg){width="5.791666666666667in"
height="4.290123578302712in"}

![G:\\ECFTEF\\imagem12.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image70.jpeg){width="4.270833333333333in"
height="5.124998906386701in"}

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

![G:\\ECFTEF\\imagem13.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image71.jpeg){width="3.1458333333333335in"
height="1.1216338582677166in"}

![G:\\ECFTEF\\imagem14.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image72.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

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

![G:\\ECFTEF\\imagem16.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image73.jpeg){width="5.385416666666667in"
height="3.9891983814523186in"}

![G:\\ECFTEF\\imagem17.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image74.jpeg){width="4.03125in"
height="4.8375in"}

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

![G:\\ECFTEF\\imagem20.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image75.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

Quando Você clicar para fazer a redução, o programa perguntará se você
realmente quer fazer a redução, caso sim, ela será realizada.

Segue na próxima pagina, a imagem de uma redução Z:

![G:\\ECFTEF\\imagem18.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image76.jpeg){width="4.5625in"
height="5.475in"}

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

![G:\\ECFTEF\\imagem20.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image75.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

Segue abaixo a imagem de uma Leitura X:

![G:\\ECFTEF\\imagem19.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image77.jpeg){width="4.104166666666667in"
height="4.925in"}
=======
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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image2.png){width="2.6875in"
height="2.968284120734908in"}![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image3.png){width="2.6831364829396325in"
height="2.963464566929134in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image4.png){width="5.572916666666667in"
height="2.596804461942257in"}

Caso os dados informados para login tenham sido corretos, o usuário
receberá a mensagem mostrada na imagem abaixo, caso contrário, o mesmo
terá até 3 tentativas para corrigir seus dados, passadas as tentativas o
programa se fechará automaticamente devendo ele reabri-lo para reiniciar
uma nova tentativa.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image5.png){width="2.7916666666666665in"
height="1.2916666666666667in"}

Uma vez que ele realizar o login com sucesso ele será apresentado à tela
do Menu Geral.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image6.png){width="6.236909448818897in"
height="4.996189851268592in"}

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

![C:\\Users\\Scholl\\Desktop\\imagens\\users4\_add444.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image7.png){width="0.625in"
height="0.625in"} **= Cadastrar um Novo Cliente;**

![C:\\Users\\Scholl\\Desktop\\imagens\\produtos\_add.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image8.png){width="0.625in"
height="0.625in"} **= Cadastrar um novo Produto;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Orcamento\_Red\_.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image9.png){width="0.8333333333333334in"
height="0.8333333333333334in"} **= Realizar Orçamento;**

![C:\\Users\\Scholl\\Desktop\\imagens\\Venda\_2.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image10.png){width="0.875in"
height="0.8333333333333334in"} **= Iniciar Frente de Caixa;**

![C:\\Users\\Scholl\\Desktop\\imagens\\fornecedor\_12\_.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image11.png){width="1.15625in"
height="0.8333333333333334in"} **= Consultar / Cadastrar um
Fornecedor;**

![C:\\Users\\Scholl\\Desktop\\imagens\\calculadora\_12.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image12.png){width="1.0520833333333333in"
height="0.8333333333333334in"} **= Abrir Calculadora;**

![C:\\Users\\Scholl\\Desktop\\imagens\\exit\_3.png](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image13.png){width="0.8333333333333334in"
height="0.8333333333333334in"} **= Sair.**

 *MENU CADASTRO:*
-----------------

### *- Cadastro de Clientes:*

É a tabela responsável por cadastrar todo e qualquer cliente e
exibi-los, e é a tabela responsável por fazer a atualização cadastral
junto à base de dados. Ao iniciar a tabela clientes a seguinte tela é
exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image14.png){width="5.791666666666667in"
height="3.1132075678040243in"}

Na tabela superior constam todos os clientes cadastrados, bem como todos
os seus dados, na tabela inferior constam os endereços de um cliente
quando este for selecionado, um cliente pode possuir mais de um
endereço, como também pode não possuir um endereço cadastrado no
sistema, para exibir o endereço de um cliente este deve ser selecionado,
como mostrado na imagem abaixo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image15.png){width="5.812963692038495in"
height="3.0729166666666665in"}

Para inserir um Cliente, basta clicar no botão “Inserir Cliente” abaixo
da tabela de clientes já cadastrados, que a seguinte tela será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image16.png){width="4.208333333333333in"
height="5.2288079615048115in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image17.png){width="4.124783464566929in" height="5.125in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image18.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Para Inserir um novo fornecedor, somente é necessário clicar no botão
“Inserir”, que a seguinte tela será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image19.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Assim que a tela for aberta, é só preencher toda a tabela com as
informações necessárias, e clicar em “Salvar” que este novo fornecedor
será salvo dentro da base de dados.

Caso ao inserir um novo fornecedor, e o mesmo não se recordar do CEP, há
também a opção de BUSCAR CEP, onde o sistema mostrara todos os CEPS
Registrados na base de dados e o usuário pode selecioná-los, fazendo uma
busca pelo nome da rua, bairro, cidade.

Janela para buscar o CEP:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image20.png){width="5.905555555555556in"
height="2.9833759842519685in"}

Buscando um CEP em uma rua chamada “São Pedro”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image21.png){width="5.905555555555556in"
height="2.9833759842519685in"}

O sistema busca a palavra “são pedro” na base de dados e exibe ao
usuário, qualquer registro que contenha a palavra, independente de ser a
rua, o bairro, a cidade, ou qualquer outro.

Para fazer a busca só é preciso informar a palavra e telar ENTER.

Após importar um registro de CEP para um fornecedor, o mesmo já será
automaticamente preenchido, como mostra a imagem abaixo, de um CEP
importado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image22.png){width="5.905555555555556in"
height="3.0030686789151355in"}

Para alterar um fornecedor já cadastrado, é só selecionar o fornecedor
desejado e clicar na guia (ou aba) “Incluindo/Alterando um Fornecedor”,
que os dados deles já serão trazidos sendo somente necessário alterar o
que for preciso e salvar pressionando o botão “Salvar”.

Ao selecionar um fornecedor e clicar para alterá-lo a seguinte janela
será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image23.png){width="5.905555555555556in"
height="3.0030686789151355in"}

### *- Cadastro de Contas Bancárias:*

É a tabela responsável por cadastrar todas as contas bancárias da
empresa,assim que aberta, a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image24.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Para Inserir uma nova Conta, é só pressionar o botão “Novo” que a tela
para inserir será aberta, que é a seguinte:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image25.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Após clicar em “Novo”, é só digitar os dados nos campos abaixo que
automaticamente eles serão preenchidos na base dados, exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image26.png){width="5.905555555555556in"
height="2.9771806649168853in"}

Enquanto as informações são digitadas elas são automaticamente
preenchidas no ultimo registro.

Para editar um banco já cadastrado é só selecionar o banco desejado e
alterar as informações nos campos abaixo (Nome do Banco, Agencia do
Banco, Conta do Banco, etc.)

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image27.png){width="5.905555555555556in"
height="2.9771806649168853in"}

ATENÇÃO: Para todos os procedimentos deve-se salvar antes de fechar a
janela para os dados não serem perdidos.

### *- Cadastro de Unidades:*

É a tabela responsável por cadastrar todas as unidades a serem usadas
nos produtos cadastrados no banco de dados, assim que aberta, a seguinte
tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image28.png){width="4.96875in" height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image29.png){width="5.905555555555556in"
height="5.038367235345582in"}

Para BUSCAR um produto cadastrado no banco de dados é só digitar uma
palavra referente ao produto no campo “Localizar”, caso haja algo
cadastrado com a palavra informada, somente será exibo o que a pesquisa
localizar, exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image30.png){width="4.839232283464567in"
height="4.128626421697287in"}

Para Cadastrar um Produto novo no Banco de dados, clique em “Novo” e a
seguinte tela será exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image31.png){width="4.979166666666667in"
height="4.2480118110236225in"}

Após informar todos os dados cadastrais do produto, clique em “Salvar”
para que o produto seja salvo no banco de dados, caso contrario todas as
informações digitadas poderão ser perdidas!

Para ALTERAR um produto já cadastrado, selecione o produto desejado que
suas informações aparecerão nos campos abaixo da tabela mestre ( na
tabela Detalhe), sendo necessário então somente editá-los para atualizar
este produto.

Exemplo de Produto sofrendo Alteração:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image32.png){width="5.905555555555556in"
height="5.038367235345582in"}

Para EXCLUIR um produto, basta selecioná-lo e pressionar o botão
“Excluir”, mas vale lembrar que só será excluído o produto que não tiver
mais nenhum relacionamento com outras tabelas do banco de dados, por
exemplo, orçamentos, vendas, etc.

### *- Cadastro de Departamentos:*

O Cadastro de Departamentos é o onde são cadastrados todos os
departamentos de uma empresa, sua principal finalidade é o controle de
gastos. Ao ser aberta a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image33.png){width="5.072916666666667in"
height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image34.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Para INSERIR um novo funcionário, pressione o botão “Novo”, e a seguinte
tela será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image35.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Agora, com acesso aos campos, é só informar os dados cadastrais do
funcionário, feito isso é só pressionar o botão “Salvar” que o
funcionário será salvo no banco de dados.

Para ATERAR os dados de um funcionário cadastrado, é necessário
selecioná-lo para ter acesso aos dados atuais dele nos campos de
“Informações do Funcionário” e alterar o campo necessário em, como no
exemplo abaixo onde o funcionário “Beto” esta tendo seu nome alterado
para “Beto dos Santos Brito”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image36.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Depois, já ALTERADO e salvo no banco de dados:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image37.png){width="5.905555555555556in"
height="3.1194969378827646in"}

Para EXLUIR um funcionário cadastrado, selecione o funcionário desejado
e pressione o botão “Excluir”, e após então pressione o botão “Salvar”
para confirmar a operação no banco de dados.

### *- Cadastro de Cartões:*

O Cadastro de Cartões é o onde são cadastrados todos os cartões de
créditos aceitos pela empresa. Ao ser aberta a tela de cadastros de
cartões, a seguinte tela é exibida:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image38.png){width="4.281702755905512in"
height="2.66159886264217in"}

Para Inserir um novo cartão no banco de dados pressione o botão “Criar”,
um novo registro será criado e os campos “Nome Cartão” e “Taxa Cartão”
serão habilitados, devendo o funcionário que esta cadastrando um novo
cartão informar os dados corretamente e pressionar o botão “Confirmar”
para inserir o novo cartão no banco de dados.

Exemplo de cartão sendo inserido:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image39.png){width="4.390398075240595in"
height="2.7291666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image40.png){width="5.197916666666667in"
height="2.6041666666666665in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image41.png){width="3.8958333333333335in"
height="2.7395833333333335in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image42.png){width="5.905555555555556in"
height="3.7326837270341207in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image43.png){width="5.905555555555556in"
height="4.116433727034121in"}

Para Realizar um novo orçamento, deve se pressionar o botão “Iniciar
Orçamento”, que um novo registro será criado, liberando os campos de
cima da tela para serem editados, preencha os dados cadastrais conforme
solicitado.

Veja a imagem de exemplo a seguir com o botão “Iniciar Orçamento”
pressionado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image44.png){width="5.905555555555556in"
height="4.116433727034121in"}

Dados cadastrais do orçamento, informados:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image45.png){width="5.905555555555556in"
height="4.116433727034121in"}

Para inserir um produto no orçamento, pressione o botão “Inserir Item”,
ao ser pressionado a tela de produtos será aberta:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image46.png){width="5.708333333333333in"
height="2.988837489063867in"}

Para inserir um produto, você pode selecioná-lo ou realizar uma
pesquisar infomando uma palavra referente a este produto, após
selecionar o produto desejado, para importá-lo para o orçamento, pode-se
pressionar o botão “Importar” ou teclar a tecla ENTER do seu teclado.

Exemplo de produto importado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image47.png){width="5.854166666666667in"
height="4.0806135170603675in"}

Ao importar um produto, ele já sai com o foco selecionado na célula
“Qtde” (quantidade) da tabela “Itens do Orçamento”, sendo necessário
somente informar a quantidade de itens deste produto você deseja
adicionar. Exemplo:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image48.png){width="5.177083333333333in"
height="3.608657042869641in"}

Você pode inserir quantos itens forem necessários, devendo claro,
informar uma quantidade a eles, assim que todos os itens necessários
forem adicionados (importados) para o orçamento, você deve pressionar o
botão “Calcula Totais” para calcular o valor total do orçamento.

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image49.png){width="5.25in" height="3.659482720909886in"}

Assim que o botão “Calcula Totais” for pressionado, será automaticamente
calculado o valor sub-total de cada item, e o valor total da compra.
Lembrando que após concluir o orçamento, o botão “Confirmar” deve ser
pressionado para que o valor total seja armazenado corretamente no banco
de dados.

Depois que um orçamento for concluído, ele pode ser impresso, para que o
cliente tenha uma cópia do mesmo, para fazer isso pressione o botão
“Imprimir”.

Exemplo da impressão do orçamento criado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image50.png){width="5.905555555555556in"
height="4.015777559055118in"}

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

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image51.png){width="2.9895833333333335in"
height="1.3333333333333333in"}

Se você for um funcionário que tem acesso total ao sistema, e deseja
conceder ou revogar uma permissão, entre no menu “Utilitários”, no
sub-menu “Sistema de Segurança”, e no sub-menu de “Sistemas de
Segurança”, “Definir Nível de Acesso”:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image52.png){width="5.90625in" height="1.03125in"}

Ao acessar o sub-menu “Definir Nível de Acesso” você será apresentado a
esta tela:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image53.png){width="5.905555555555556in"
height="4.063086176727909in"}

Na tabela “Funcionário”, consta todos os funcionários cadastrados no
sistema, na tabela “Nível de Acesso” constam as permissões destes
funcionários. (Veja na imagem do detalhe abaixo)

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image53.png){width="3.2362292213473314in" height="2.4375in"}

Isso significa que o funcionário de código 4 (Maria) tem acesso a todos
os módulos descritos (Clientes, Contas Bancárias, Fornecedores, etc.), e
também significa que ela não tem acesso a nenhum outro modulo do sistema
(como por exemplo, realizar orçamentos, inserir, editar ou excluir um
produto, ou funcionário, etc.).

Para conceder uma permissão, devemos primeiro selecionar um funcionário
ao qual daremos a permissão:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image54.png){width="4.601394356955381in"
height="1.8229166666666667in"}

No caso, será dada alguma nova permissão a funcionária Maria, os módulos
aos quais podemos autorizar um acesso estão no campo esquerdo da janela
separado em menus e sub-menus:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image55.png){width="2.15625in" height="3.3854166666666665in"}
![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image56.png){width="2.158333333333333in"
height="3.3854166666666665in"}
![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image57.png){width="2.1666666666666665in" height="3.34375in"}

Para conceder uma Permissão deve-se então selecionar o funcionário (no
caso Maria), e deve se selecionar o item de menu ou sub-menu desejado:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image58.png){width="5.625in" height="3.8700612423447067in"}

Após selecionarmos o funcionário, e módulo desejado, devemos confirmar
esta autorização pressionando o botão “Conceder” para conceder este
privilégio ao funcionário em questão.

Assim que o botão “Conceder” for pressionado, automaticamente aparecerá
no final da lista da tabela “Nível de Acesso”, o código do funcionário e
o módulo ao qual ele recebeu privilégio: (Não esqueça de pressionar o
botão “Salvar” para confirmar a
operação)![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image59.png){width="5.625in"
height="3.8700612423447067in"}

Sendo assim, agora a funcionaria cujo código é 4 (funcionária Maria),
possui acesso ao módulo de realizar orçamentos, ao qual ela recebeu a
mensagem de não possuir acesso anteriormente:

![](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image60.png){width="5.905555555555556in"
height="4.116433727034121in"}

*TELA DE VENDAS ECFTEF:*
------------------------

O Módulo de Vendas é o subsistema responsável pelo fluxo das vendas. É o
principal responsável pelo fluxo de mercadorias no estoque é ele que
realiza todas as vendas dos produtos previamente cadastrados. Tela de
Vendas:

![G:\\ECFTEF\\imagem.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image61.jpeg){width="5.0625in"
height="3.75in"}

O funcionamento da “Frente de Caixa com TEF” consiste no seguinte, ao
iniciar a tela, a impressora fiscal abre um novo cupom fiscal para venda
(no exemplo é utilizado um emulador de impressora fiscal, mas a
impressão é exatamente a mesma):

![G:\\ECFTEF\\imagem2.jpg](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image62.jpeg){width="3.4270833333333335in"
height="4.112498906386701in"}

Após o cupom fiscal já estiver aberto à tela já estará funcionando,
somente aguardando que alguém entre com o código de um produto e a
quantidade para realizar uma venda.

Para entrar com o código de um produto, poderá ser usado um leitor de
códigos de barra, que quando o código é informado, ele automaticamente
já o informa e espera a quantidade ser confirmada para então realizar a
venda: ![G:\\ECFTEF\\Sem
título3.jpg](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image63.jpeg){width="5.34375in"
height="3.9490693350831148in"}

Para Confirmar a quantidade deve-ser ser pressionada a tecla &lt;TAB&gt;
do teclado, assim que confirmada a quantidade, ele realiza a venda:

![G:\\ECFTEF\\imagem5.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image64.jpeg){width="5.343747812773404in"
height="3.9583333333333335in"}

Assim que ele realiza a venda, o produto já é impresso na Nota Fiscal, e
ele já volta para o inicio, aguardando que algum código seja informado,
e assim sucessivamente:

![G:\\ECFTEF\\imagem6.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image65.jpeg){width="3.750001093613298in"
height="4.5in"}

![G:\\ECFTEF\\imagem7.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image66.jpeg){width="5.552083333333333in"
height="4.1126552930883635in"}

![G:\\ECFTEF\\imagem9.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image67.jpeg){width="4.270833333333333in"
height="5.124998906386701in"}

![G:\\ECFTEF\\imagem10.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image68.jpeg){width="5.375in"
height="3.9814818460192476in"}

![G:\\ECFTEF\\imagem11.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image69.jpeg){width="5.791666666666667in"
height="4.290123578302712in"}

![G:\\ECFTEF\\imagem12.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image70.jpeg){width="4.270833333333333in"
height="5.124998906386701in"}

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

![G:\\ECFTEF\\imagem13.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image71.jpeg){width="3.1458333333333335in"
height="1.1216338582677166in"}

![G:\\ECFTEF\\imagem14.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image72.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

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

![G:\\ECFTEF\\imagem16.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image73.jpeg){width="5.385416666666667in"
height="3.9891983814523186in"}

![G:\\ECFTEF\\imagem17.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image74.jpeg){width="4.03125in"
height="4.8375in"}

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

![G:\\ECFTEF\\imagem20.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image75.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

Quando Você clicar para fazer a redução, o programa perguntará se você
realmente quer fazer a redução, caso sim, ela será realizada.

Segue na próxima pagina, a imagem de uma redução Z:

![G:\\ECFTEF\\imagem18.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image76.jpeg){width="4.5625in"
height="5.475in"}

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

![G:\\ECFTEF\\imagem20.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image75.jpeg){width="5.905555555555556in"
height="4.374486001749781in"}

Segue abaixo a imagem de uma Leitura X:

![G:\\ECFTEF\\imagem19.JPG](https://raw.githubusercontent.com/marcosscholl/Prime-SistemaComercial/master/media/image77.jpeg){width="4.104166666666667in"
height="4.925in"}
>>>>>>> 52415891224217e5904d97ebcb296ab45243f877
