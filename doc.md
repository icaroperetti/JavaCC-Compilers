### Linguagem criada em JavaCC

---

> Vinicius Gazolla Boneto, Icaro Peretti

### Entradas Valídas

O que faz ?| Entrada
---------------------------| --------
Ignora algumas entradas | " ", "\t", "\n", "\t"
Abre Comentários | // 
Encerra linha de argumento | ; 
Realizar incremento e decremento | ++, -- 
Função | function 
Comando de decisão | if 
Comando de decisão encadeado | else, elseif 
Repetição | while, do while 
Números | [0-9], [0-9] 
Letras | [a-z], [A-Z] 
Operador lógico | >.<, ==, != 
Operador aritimético | +, -, *, / 
Abertura e fechamento de comando | {, } 
Abertura e fechamento parenteses | (, ) 
Atribuição | = 

### Tipos

Identificador    | Valor 
------------------------------------ | --------
boolean | true, false 
int | Números Inteiros 
float, double | Números Decimais 
String | Texto 
byte | byte 
char | Caracter 

### Instruções

> #### Comentários

Os comentários devem ser iniciados por duas barras //.

###### Exemplo
```bash
// Este é um comentário
```

---
> #### Declarar variável e atribuição de valor

As variáveis são declaradas com identificador de seu tipo e/ou com seu respectivo valor.

##### Exemplo
```bash
int a = 10;
String texto = "Ola mundo";
int b, c, d, e = 0;
```

---
> #### Expressões aritimética

As expressões aritiméticas são realizas através dos operadores aritiméticos e/ou dos operadores de incremento e decremento.

##### Exemplo
```bash
int a = 20;
int b;
b = 30 + a;
b++;
```

---

> #### Comando de decisão

Os Comando de decisão são realizados através do `if`, este pode ser encadeado com o `elseif` e/ou `else`. Com exessão do `else`, os outros comandos devem ser seguidos com a condição (operação lógica) declarada entre parentêses e todos devem conter a abertura de chaves.

##### Exemplo
```bash
// Comando if
int a = 0;
int b = 1;
if (a == 1) {
	// Comandos
} elseif (a > b) {
	// Comandos
} else {
	//Comandos
}
```

---

> #### Comando de repetição

Os comandos de repetição podem ser realizados através do `while` e `do while`. Seguidos de uma operação logíca declarada entre parentêses e abertura de chaves.

##### Exemplo
```bash
// Comando while
int a = 0;
while (a < 10) {
	// Comandos
	a++;
}
```
```bash
// Comando do while
int a = 0;
do {
	// Comandos
	a++;
} while (a < 10);
```

---

> #### Funções

As funções devem ser iniciadas com a palavra `function`. Seguido com os parâmetros declarados entre parentêses e abertura de chaves.

###### Exemplo
```bash
// Este é uma função sem parâmetros
function () {
	// Comandos
}
```
```bash
// Esta é uma função com parâmetros
function (int value, double otherValue) {
	// Comandos
}
```

  	

