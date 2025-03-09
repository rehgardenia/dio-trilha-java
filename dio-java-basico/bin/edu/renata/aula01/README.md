# Aula 01:   Anatomia Java


## Nomenclatura


| Tipo               | Convenção  | Exemplo                         | 
| ------------------ | ---------- | --------------------------------|
| Constantes         | UpperCase  | double PI  = 3.14;              |     
| Variaveis/Metodos  | camelCase  | int numero = 10;                |
| Classes            | PascalCase | class CalculadoraCientifica {}  | 


### Variáveis

Conveção: camelCase (exceto constantes que são UPPERCASE)

- Não pode começar com numeros, simbolos ou operadores
- Não pode ser palavras reservadas da linguagem
- Sem abreviações e no singular (exceto arrays) 


Podemos declarar uma variável do seguinte modo: 

#### Tipo nomeBemDefinido = valor (opcional);

Exemplos:

- double salarioMedio = 1500;
- String email = "aluno@email.com";
- String emails = {"jose@email.com", "luiz@email.com"}
- String meuNome = "Joseph";

### Métodos
Convenção: camelCase

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)   

Exemplos:
- somar(int n1, int n2){}
- findById(int id){}
- concluirProcessamento(){}

### Classes
Convenção:  Pascal Case  e singular dos objetos

class  NomeClasse {}


Exemplos:

 class CalculadoraCientifica {}
 class Pessoa{}
 class Carro{}
### Pacotes

No linguagem Java, há uma convenção em organizar os arquivos em PACOTES. Especificando a pasta e subpasta de cada arquivo Java.

area
 -> autor
     -> pacote
        -> subpacote

Exemplos:s
- edu.lucas.primeirasemana
- com.hypertech.vendas 


