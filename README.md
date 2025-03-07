## Este projeto é Com base No projeto da Santander da DIO 


- Este projeto foca em entregar a porposta do primeiro projeto spring,introduzindo a métodos API Rest com uso de algum banco de dados.
- utilizei com isto o mysqlworckbench local mesmo para poupar tempo e fazendo alguns testes no Postman.

  Espero que tenha ficado do agrado dos avaliadores, me esforcei para entender bastante os princípios, Java não é o meu forte ainda mas tenho aprendido bastante.
## Diagrama de Classes.
```mermaid
classDiagram
    class User {
        +String nome
        +String senha
        +String email
    }

    class Adm {
        +String nome
        +String senha
        +String email
    }

    class FichaDePersonagem {
        +String nomePersonagem
        +Arma tipoArma
        +Raca raca
        +Classe classe
    }

    class Arma {
        +String nome
        +String tipo
    }

    class ArmaLongoAlcance {
        +ArcoGrande
        +ArcoCurto
        +Balestra
        +Besta
        +Balestrim
        +Funda
        +Kunai
        +Tomo
    }

    class ArmaMedioAlcance {
        +Lanca
        +Alabarda
        +Kusarigama
        +Mangual
    }

    class ArmaCurtoAlcance {
        +Katana
        +EspadaLonga
        +EspadaCurta
        +Punhal
        +Soqueira
        +Cajado
    }

    class Raca {
        +String nome
        +String habilidadeEspecial
    }

    class Orc {
        +Imunidade a atordoamentos e encantamentos
    }

    class Elfo {
        +Recupera magia 2x mais rápido
    }

    class Humano {
        ++2 de dano com qualquer equipamento por nível
    }

    class Anao {
        ++2 de força natural por nível
    }

    class Classe {
        +String nome
        +String habilidades
    }

    class Guerreiro {
        +Tank
        +Bom com armas curtas e médias
    }

    class Ladino {
        +Bom com armas curtas
        +Furtivo e dano crítico
    }

    class Mago {
        +Bom com armas mágicas
        +Mais cargas de feitiço
        +Descobre tesouros em expedições
    }

    %% Relacionamentos com cardinalidade
    User "1" --|> "N" FichaDePersonagem
    Adm "1" --|> "N" User
    FichaDePersonagem "1" --> "1" Arma
    FichaDePersonagem "1" --> "1" Raca
    FichaDePersonagem "1" --> "1" Classe

    Arma "1" --|> "8" ArmaLongoAlcance
    Arma "1" --|> "4" ArmaMedioAlcance
    Arma "1" --|> "6" ArmaCurtoAlcance

    Raca "1" --|> "1" Orc
    Raca "1" --|> "1" Elfo
    Raca "1" --|> "1" Humano
    Raca "1" --|> "1" Anao

    Classe "1" --|> "1" Guerreiro
    Classe "1" --|> "1" Ladino
    Classe "1" --|> "1" Mago

```

Meu Objetivo é transformar esse lindo projeto num jogo de simulador de cartas, então a modelagem foi feita pensando nisso.

## vou deixar aqui a imagem da ideia que inspirou tudo isso e que virou um projeto Angular e que futuramente irá se tornar um projeto gigantesco com um bom escopo.

<img src"">


# Considerações finais.

 É geralmente uma loucura quando começamos coisas do zero e vemos aquilo começar a funcionar, nunca tinha tido tanta experiência quanto a que ganhei dentro desse curso, foi genuinamente maravilhoso e posso dizer que eu gostei bastante do que vi, fiz e aprendi.
 Levarei esse conhecimento comigo, só gostaria de ter tido mais tempo, ainda mais dentro das minhas condições de ter um Computador bem perebento e ainda colidir com muitas das minhas atividades da faculdade, mas DEus sabe de tudo!

 Se você chegou até aqui, um forte abraço pra você, Deus te abençoe.
