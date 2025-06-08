# 🔎 Binary Search - Name Finder
Este projeto implementa **busca binária** para resolver um problema clássico de ordenação e pesquisa de nomes. A proposta é solicitar **20 nomes**, organizá-los alfabeticamente e permitir que o usuário **busque um nome no conjunto**. Caso o nome exista, sua **posição (índice) no vetor** será informada.

📖 **Esse problema foi retirado do livro "Algoritmos", de Manzano**. O PDF do livro será disponibilizado no repositório para referência.

---

## 📌 Sobre o problema
> Solicitar 20 nomes quaisquer que serão armazenados em um vetor.  
> Ordene este vetor em ordem alfabética.  
> Exiba os 20 nomes organizados.  
> Em seguida, solicite um nome para pesquisa.  
> Caso o nome fornecido exista no vetor, informe sua localização (índice).

✅ **Metodologia**:  
- **Armazena 20 nomes** em um vetor.  
- **Ordena os nomes alfabeticamente**.  
- **Pesquisa um nome usando busca binária**.  
- **Retorna o índice do nome caso encontrado**.  

✅ **Por que busca binária?**  
A busca binária é muito mais rápida que uma busca linear (`O(n)`).  
Sua eficiência de **O(log n)** permite encontrar elementos rapidamente, mesmo em grandes conjuntos de dados.

---

## 🛠 Estrutura do Repositório
Este projeto possui **três branches**:

1️⃣ **`master`** – Contém a versão principal do projeto, utilizando **busca binária com recursão**.  
2️⃣ **`Search_Binary_with_the_code_binarySearch`** – Implementação baseada no método **`Arrays.binarySearch()`** da biblioteca `java.util.Arrays`.  
3️⃣ **`Search_Binary_with_the_loop_while`** – Implementação **iterativa** da busca binária usando um **loop `while`**.

Cada branch explora **diferentes abordagens** para a busca binária, permitindo comparar desempenho e entender suas aplicações.

---

## 💻 Como executar
1️⃣ **Clone o repositório**:
```sh
git clone https://github.com/Nuillexe/Binary_Search.git
