## Este projeto é Com base No projeto da Santander da DIO 

## Diagrama de Classes.
```
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
    
    User --|> FichaDePersonagem
    Adm --|> User
    FichaDePersonagem --> Arma
    FichaDePersonagem --> Raca
    FichaDePersonagem --> Classe
    Arma --|> ArmaLongoAlcance
    Arma --|> ArmaMedioAlcance
    Arma --|> ArmaCurtoAlcance
    Raca --|> Orc
    Raca --|> Elfo
    Raca --|> Humano
    Raca --|> Anao
    Classe --|> Guerreiro
    Classe --|> Ladino
    Classe --|> Mago
```
