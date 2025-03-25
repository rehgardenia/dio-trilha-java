# Aul 03: Operadores em Java

## 1. Operadores de Atribuicao (`=`)
Os operadores de atribuicao sao usados para armazenar valores em variaveis.

### Exemplo:
```java
String nome = "RENATA";
int idade = 19;
double peso = 48.6;
```
Aqui, as variaveis `nome`, `idade` e `peso` recebem valores iniciais.

---

## 2. Operadores Aritmeticos (`+`, `-`, `*`, `/`, `%`)
Esses operadores realizam calculos matematicos.

### Exemplo:
```java
double soma = 10.5 + 15.7;
int subtracao = 110 - 24;
int multiplicacao = 7 * 9;
double divisao = 10 / 2;
int modulo = 10 % 6;
double expressao = (10 * 2) - (32 / 6);
```
- `+` soma dois valores.
- `-` subtrai um valor do outro.
- `*` multiplica os valores.
- `/` divide um valor pelo outro.
- `%` retorna o **resto** da divisao.

---

## 3. Operadores de Incremento (`++`) e Decremento (`--`)
Aumentam ou diminuem o valor de uma variavel em 1.

### Exemplo:
```java
int num = 5;
System.out.println(num++); // Usa o valor e depois incrementa
System.out.println(++num); // Incrementa antes de usar
```
- `num++` -> Primeiro imprime `5`, depois incrementa para `6`.
- `++num` -> Primeiro incrementa para `7`, depois imprime.

---

## 4. Operador Logico de Negacao (`!`)
Inverte um valor booleano.

### Exemplo:
```java
boolean feliz = true;
System.out.println(!feliz); // false
```
Aqui, `!feliz` inverte `true` para `false`.

---

## 5. Operador Ternario (`? :`)
Substitui um **if-else** simples.

### Exemplo:
```java
int a = 5, b = 6;
String resultado = a == b ? "Verdadeiro" : "Falso";
System.out.println(resultado); // Falso
```
- Se `a == b` for **true**, retorna `"Verdadeiro"`.
- Se **false**, retorna `"Falso"`.

---

## 6. Operadores Relacionais (`==`, `!=`, `>`, `<`, `>=`, `<=`)
Comparam valores e retornam `true` ou `false`.

### Exemplo:
```java
int numero1 = 1, numero2 = 2;
boolean simNao = numero1 == numero2; // false
```
- `==` verifica igualdade.
- `!=` verifica diferenca.
- `>` verifica se e maior.
- `<` verifica se e menor.
- `>=` verifica se e maior ou igual.
- `<=` verifica se e menor ou igual.

### Comparacao de Strings
```java
String texto1 = "RENATA";
String texto2 = "Renata";
boolean yesNo = texto1.equals(texto2);
System.out.println(yesNo); // false
```
- Em Java, Strings devem ser comparadas com `.equals()`, pois `==` compara **enderecos de memoria**.

---

## 7. Operadores Logicos (`&&`, `||`)
Usados para combinar condicoes.

### Exemplo:
```java
boolean condicao1 = true;
boolean condicao2 = false;

if (condicao1 && condicao2) {
    System.out.println("As duas sao verdadeiras");
}
if (condicao1 || condicao2) {
    System.out.println("Uma das condicoes e verdadeira!");
}
```
- `&&` (E) -> So retorna `true` se **ambas** forem verdadeiras.
- `||` (OU) -> Retorna `true` se **pelo menos uma** for verdadeira.

---

## 📌 Conclusao
O codigo demonstra como usar os principais operadores em Java. Eles sao essenciais para manipular variaveis, fazer calculos, comparar valores e tomar decisoes logicas dentro do programa.

Caso tenha duvidas ou queira um exemplo mais detalhado, me avise! 🚀

