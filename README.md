# Documentação do Repositório de Exercícios Diários

## **Descrição do Repositório**
Este repositório contém exercícios diários desenvolvidos para aprimorar habilidades em programação, lógica e algoritmos. Os exercícios são projetados para serem resolvidos de forma incremental, variando de problemas básicos a problemas mais avançados, cobrindo diferentes tópicos e abordagens.

---

## **Estrutura do Repositório**
O repositório está organizado em pastas e arquivos representando diferentes exercícios, com soluções implementadas majoritariamente na linguagem **Java**. Cada exercício está documentado com explicações e exemplos de uso.

### **Nomeclatura**
Os exercícios são nomeados com base em seu número e/ou contexto. Por exemplo:
- **`exercicio42`**: Um exercício específico (com foco no uso de genéricos em Java, como ilustrado no exemplo).
- **`test`**: Subpasta usada para validar e testar as implementações dos exercícios.

---

## **Exercício Demonstração: Exemplo do Exercicio42**

### **Descrição**
Este exercício apresenta uma aplicação prática do conceito de **genéricos** na linguagem Java. Ele demonstra como encontrar o maior elemento de uma lista (utilizando o método `Collections.max`) para diferentes tipos de dados, como inteiros, decimais e strings.

### **Destaques Técnicos**
- Uso de **genéricos**: A implementação é genérica para lidar com diferentes tipos de listas (`List<Integer>`, `List<Double>`, `List<String>`).
- **Tratamento de exceções**: Prevenção de erros caso a lista seja nula ou esteja vazia.
- Recursos do Java como `Collections.max()` para simplificar a busca do maior elemento.

### **Código-Fonte**
Veja o código de exemplo utilizado no **Exercicio42**:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> inteiros = Arrays.asList(5, 3, 9, 1);
        List<Double> decimais = Arrays.asList(2.5, 3.8, 1.2);
        List<String> nomes = Arrays.asList("Ana", "Carlos", "Beatriz");

        // Encontra o maior elemento de diferentes listas
        System.out.println(encontrarMaior(inteiros));  // Saída: 9
        System.out.println(encontrarMaior(decimais)); // Saída: 3.8
        System.out.println(encontrarMaior(nomes));    // Saída: Carlos
    }

    static <T extends Comparable<T>> T encontrarMaior(List<? extends T> list){
        if (list.isEmpty() || list == null) {
            throw new IllegalArgumentException("Lista vazia ou nula");
        }
        return Collections.max(list);
    }
}
```

### **Saída Esperada**
```text
9
3.8
Carlos
```

### **Pontos de Aprendizado**
1. **Genéricos em Java**: Permite a criação de métodos reutilizáveis para trabalhar com diferentes tipos de dados.
2. **Tratamento de Exceções**: Uso do `IllegalArgumentException` para validar entradas.
3. **Método `Collections.max()`**: Utilização de um recurso padrão da biblioteca Java para simplificar operações comuns.

---

## **Como Utilizar o Repositório**

### **Pré-Requisitos**
- **JDK 17 ou superior** (recomendado: JDK 21).
- Qualquer **IDE** (IntelliJ IDEA ou Eclipse) ou editor de texto com suporte a Java.
- Repositório clonado localmente:
  ```bash
  git clone <URL_DO_REPOSITORIO>
  cd <NOME_DO_REPOSITORIO>
  ```

### **Executando o Código**
1. Abra o projeto na sua IDE.
2. Certifique-se de que o JDK está corretamente configurado.
3. Navegue até o arquivo de interesse dentro da estrutura do projeto.
4. Execute o código diretamente ou crie testes adicionais.

---

## **Sugestões para Contribuição**
Se você deseja contribuir com novos exercícios ou otimizações no código existente, siga estas diretrizes:
1. **Fork o repositório** para seu próprio perfil.
2. Crie uma nova branch para suas alterações:
   ```bash
   git checkout -b minha-branch-contribuicao
   ```
3. Após realizar sua modificação, submeta um **Pull Request** detalhando a mudança e seu propósito.

---

## **Objetivo Geral**
Este repositório tem como objetivos principais:
- Consolidar fundamentos de programação.
- Desenvolver raciocínio lógico.
- Explorar conceitos avançados e recursos de linguagens modernas.
- Incentivar o aprendizado contínuo com pequenos desafios diários.

---

Se tiver dúvidas ou sugestões, sinta-se à vontade para criar uma issue ou enviar feedback. 😊