# OpenWeaterApp 

## 1.0 O que é?
O OpenWeatherApp é um aplicativo desenvolvido para android e tem como principal função a busca de temperatura atual em cidades do Mundo, como Florianópolis ou Las Vegas. É possível verificar o histórico de busca e favoritar suas cidades para agilizar as pesquisas no aplicativo.

### 1.1 Logo
O Logo do OpenWeatherApp foi adquirido a partir do site flaticon.com, que será citado no item 2.6 deste projeto.
              ![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/LogoMenor.png)
 
### 1.2 Código fonte
O código fonte do OpenWeatherApp está disponibilizado no endereço https://github.com/willbigas/OpenWeatherApp.



## 2.0 Ferramentas utilizadas
Abaixo lista de ferramentas que utilizamos para a prototipagem, desenvolvimento do aplicativo, desenvolvimento do diagrama de classes, versionamento de código e qual a API utilizada.

### 2.1 Whimsical
Para a prototipagem de telas utilizamos a ferramenta Whimsical, disponibilizada no site whimsical.com.

### 2.2 Android Studio
Ferramenta utilizada para a codificação do aplicativo, o Android Studio é um ambiente de desenvolvimento disponibilizado gratuitamente sob a Licença Apache 2.0, integrado para desenvolver para a plataforma Android. Download da última versão disponível no site https://developer.android.com/studio.

### 2.3 Draw.io
Aplicativo utilizado para fazer o diagrama de classes. O Draw.io é um editor gráfico online no qual é possível desenvolver desenhos, gráficos, entre outros. Ele disponibiliza recursos para criação de qualquer tipo de desenho, porém, possui uma parte dedicada à arquitetura da informação. Ferramenta disponível no site https://app.diagrams.net/ ou draw.io.

### 2.4 Github
O GitHub é uma plataforma de hospedagem de código-fonte com controle de versão usando o Git. Ele permite que programadores, utilitários ou qualquer usuário cadastrado na plataforma contribuam em projetos privados e/ou Open Source de qualquer lugar do mundo. Ferramenta disponível no site github.com

### 2.5 FlatIcon
Flaticon é um serviço que agrega centenas de ícones que podem ser baixados e utilizados gratuitamente. Todos os ícones utilizados no aplicativo têm como fonte este site. Disponível no endereço www.flaticon.com

### 2.6 OpenWeathermap
A API que utilizamos, OpenWeatherMap é um serviço online que fornece dados meteorológicos. É de propriedade da OpenWeather Ltd.                                                               Link para a documentação da API: https://openweathermap.org/current

## 3.0 Protótipos de Telas

### 3.1 Tela de Busca/Listagem de favoritos
Nessa tela, o usuário pode tanto selecionar uma das cidades favoritadas por ele (que se encontram no ListView) ou escolher alguma das cidades do dropdown e clicar na lupa para conferir a temperatura.
No botão que se encontra no canto superior da tela, à direita (o relógio), o usuário tem acesso ao histórico de pesquisa dele. 

![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/p1.png)

 
### 3.2 Tela de Resultado
Nessa tela, o usuário pode conferir a temperatura, a umidade, e o clima da região selecionada por ele. O ícone e a descrição são alterados dependendo do clima atual.
No botão que se encontra no canto superior da tela, à direita, o usuário pode favoritar/ desfavoritar aquela cidade, e assim a cidade deve/não deve ser listada na tela de favoritos/busca.

![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/p2.png)


### 3.3 Tela de Histórico
Nessa tela, o usuário pode conferir o seu histórico de consulta. No ListView da listagem do histórico aparece para o usuário nome da cidade, a data e hora da busca e a temperatura que estava naquele momento. Não é possível fazer buscas a partir desta tela.

 ![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/p3.png)


## 4.0 Diagrama de Classes
![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/diagrama.png)

  
## 5.0 Print das telas
Abaixo, segue print das telas junto a descrição de suas funções.
### 5.1 Tela de Busca/Listagem de favoritos
Nessa tela, o usuário pode tanto selecionar uma das cidades favoritadas por ele (que se encontram no ListView) ou escolher alguma das cidades do dropdown e clicar na lupa para conferir a temperatura.
No botão que se encontra no canto superior da tela, à direita (o relógio), o usuário tem acesso ao histórico de pesquisa dele. 

![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/t1.png)
 




### 5.2 Tela de Resultado
Nessa tela, o usuário pode conferir a temperatura, a umidade, e o clima da região selecionada por ele. O ícone e a descrição são alterados dependendo do clima atual.
No botão que se encontra no canto superior da tela, à direita, o usuário pode favoritar/ desfavoritar aquela cidade, e assim a cidade deve/não deve ser listada na tela de favoritos/busca.

![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/t2.png)



### 5.3 Tela de Histórico
Nessa tela, o usuário pode conferir o seu histórico de consulta. No ListView da listagem do histórico aparece para o usuário nome da cidade, a data e hora da busca e a temperatura que estava naquele momento. Não é possível fazer buscas a partir desta tela.

![alt text](https://github.com/willbigas/OpenWeatherApp/blob/master/app/src/main/res/drawable/readmeFiles/t3.png)
 
