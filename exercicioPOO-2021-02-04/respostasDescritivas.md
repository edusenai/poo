# Respostas descritivas - Questão 1 - 3

```
1) Explique a diferença entre objeto e classe, comente quais suas funções em um programa. Dê exemplos de Classes e Objetos.

Classe é onde definimos padrões de objetos, abstraindo definições e comportamentos parecidos.
Objeto segue os padrões definidos nas classes, logo obtemos um objeto concreto, com suas definições criadas conforme requisitos expostos nas classes.
```

```
2) Qual a definição de generalização e especialização? Exemplifique as definições.

Generalização são traços comuns que encontramos nos objetos. Especialização é o tratamento de particularidade para cada tipo de objeto. O uso de ambas técnicas facilita na reutilização de código pelo fato de existir pontos em comum que foram tratados em classes superiores.

Por exemplo, quando falamos de escola, existem várias regras e diretrizes que todos precisam seguir, é comum que todas as turmas possuam um horário de entrada e saída semelhantes, porém, o horário de recreio de cada uma é diferente, professores também se diferem, assim como matérias e afins. Logo podemos dizer que cada turma teria suas especializações, e a escola seria o ramo generalista.

```

```
3) O que é polimorfismo e sobrecarga de métodos? Como implementar?

Polimorfismo consiste em facilitar e unir caracterísicas semelhantes de um objeto. Um objeto com comportamento semelhante herda métodos de classes "pai", mas também pode conter seus próprios comportamentos se são diferentes das classes herdadas, o que podemos chamar de sobrecarga de métodos.

Podemos citar como exemplo os animais. Podemos criar uma classe com o comportamento de animais mamíferos, pois o que eles tem em comum são que todos mamam, porém um homem possuí comportamentos diferentes do que um cavalo, logo podemos especificar em sua própria classe, esse tipo de particularidade de cada "objeto".

Para implementar podemos utilizar classes herdando com parâmetros de "super" e também sobrecarregando com parâmetros de @Override.

Exemplo de código:
	
	public class classe-filha extends classe-pai {
		[...]
	}

	@Override
	public String toString() {
		[...]
	}

```
