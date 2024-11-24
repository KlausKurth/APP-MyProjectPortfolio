# APP-MyProjectPortfolio

### **GIF de Demonstração**

Veja o **GIF** abaixo para entender o fluxo de interação com o aplicativo:

![Demonstração do aplicativo](app/images/app_example.gif)


## Visão Geral

Este projeto é um **Aplicativo de Portifólio** para Android. O aplicativo permite criar um portifólio profissional pessoal com detalhes de experiências de projetos e meio de contato através do **WhatsApp**.


## Estrutura do Projeto

## **build.gradle.kts**
Arquivo que foi habilitado e sincronizado o **viewBinding** para utilizar no contexto do projeto.

## **Diretório** Drawable
O diretório **/drawable** é responsável para armazenar as imagens utilizadas no projeto assim como os **Ícones** criados.

## **Diretório** Values
O diretório **/values** contem os scripts .xml responsáveis para pré configurar cores, textos e temas do aplicativo.
- O arquivo **colors.xml** contem as cores pré configuradas para utilizar nos **.xml** de **layout** do aplicativo.
- O arquivo **strings.xml** contem os textos que são utilizados nos **.xml** de **layout** do aplicativo.
- O arquivo **themes.xml** é utilizado **Theme.MaterialComponents.NoActionBar** para configurar **statusBar** de cada tela do aplicativo.

## **AndroidManifest.xml**
O arquivo responsável para configurar o estilo do tema padrão de cada tela do aplicativo.


### 1.0 **activity_main.xml**
O arquivo XML de layout define a tela **Principal** do portifólio:
- Um campo **ImageView** para a inserção da imagem do portifólio.
- Um campo **TextView** com **ScrollView** para inserção do texto sobre o profissioal.
- Dois **Button** Projetc e Contatac para navegação de tela.

### 1.1 **MainActivity.kt**
A atividade principal do aplicativo contém a lógica para inicializar a interface do usuário mostrando o portifólio principal.
- **ViewBinding**  utilizado para acessar os componentes da interface de forma segura através do ID.
- **RoundedBitmapDrawableFactory** Utilizado para manipular a imagem tornando ela circular.
- **Intent** e **setOnClickListener** utilizado para criar uma intenção para nevegação de tela através do click do botão.


### 2.0 **activity_contact.xml**
O arquivo XML de layout define a tela **Contato** do portifólio:
- Três campos **ImageView** para a inserção dos ícones **phone**, **email** e **logo WhatsApp**.
- Dois campo **TextView** para inserção do número do celular e email.

### 2.1 **Contact.kt**
A atividade principal do aplicativo contém a lógica para inicializar a interface do usuário mostrando o portifólio principal.
- **ViewBinding**  utilizado para acessar os componentes da interface de forma segura através do ID.
- **toolbarContact.setNavigationOnClickListener** e **finish()** Lógica para voltar a pagina inicial do projeto ao clicar no **Ícone Seta** na tela.
- **Intent** e **Uri.parse** para criar uma intenção de passar o número celular para Api do WhatsApp **"https://api.whatsapp.com/send?phone="** fazendo com que abra o aplicativo do WhatsApp do seu celular e começe uma conversa com o número em questão.
- **Intent** e **Uri.parse** para criar uma intenção de abrir a **Playstore** caso não tiver o **WhatsApp** instalado através da API **"https://play.google.com/store/apps/details?id=com.whatsapp"**


### 3.0 **activity_project.xml**
O arquivo XML de layout define a tela **Projetos** do portifólio:
- Três campos **ImageView** para a inserção das imagens logo dos projetos.
- Três campos **TextView** para inserção do título dos projetos.
- Três campos **Button** disponíveis para futuramente clicar e acessar mais detalhes do projetos.

### 3.1 **Project.kt**
A atividade principal do aplicativo contém a lógica para inicializar a interface do usuário mostrando o portifólio principal.
- **ViewBinding**  utilizado para acessar os componentes da interface de forma segura através do ID.
- **toolbarContact.setNavigationOnClickListener** e **finish()** Lógica para voltar a pagina inicial do projeto ao clicar no **Ícone Seta** na tela.


