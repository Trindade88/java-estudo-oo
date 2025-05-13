# Estudos Java - Classes, Atributos e Membros Estáticos

Este repositório contém anotações e exemplos práticos sobre os conceitos de **Classes**, **Atributos** e **Membros Estáticos** em Java, conforme estudo de materiais introdutórios e exercícios práticos.

## 📚 Conteúdo Estudado

- Definição de Classes
- Atributos de Instância
- Atributos Estáticos (de Classe)
- Métodos Estáticos
- Diferença entre membro de instância e membro estático
- Acesso a membros estáticos e não estáticos
- Boas práticas ao usar `static`

## 📁 Estrutura dos Arquivos

```bash
.
├── src/
│   ├── ExemploAtributos.java
│   ├── ExemploMetodosEstaticos.java
│   └── ...
├── README.md

```

📝 Anotações Importantes
Membros estáticos pertencem à classe, e não à instância.

Métodos estáticos não podem acessar membros de instância diretamente.

Atributos estáticos são úteis para constantes e valores compartilhados entre objetos.

Para acessar um atributo ou método estático, use: NomeDaClasse.metodoOuAtributo.

💡 Exemplos

    public class Contador {
    public static int total = 0;

        public Contador() {
            total++;
        }
    }

Método Estático

    public class Util {
        public static int somar(int a, int b) {
            return a + b;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Contador c1 = new Contador();
            Contador c2 = new Contador();
            System.out.println("Total: " + Contador.total); // Saída: 2

            int resultado = Util.somar(3, 4);
            System.out.println("Resultado: " + resultado); // Saída: 7
        }
    }

🚀 Próximos Tópicos
Encapsulamento

Construtores

Métodos de Instância

Relacionamento entre Objetos

📌 Repositório criado como parte do processo de aprendizado em Java. Todos os exemplos são simples e focados em reforçar os fundamentos da linguagem.