# Algoritmos de Escalonamento de Processos - Round Robin e SRT

Este projeto implementa dois algoritmos clássicos de escalonamento de processos utilizando a linguagem **Java**: **Round Robin** e **SRT (Shortest Remaining Time)**. Esses algoritmos são amplamente utilizados em sistemas operacionais para controlar a ordem de execução dos processos na CPU.

## 📌 Sobre o Projeto

O programa permite que o usuário insira uma lista de processos via terminal, especificando para cada um: nome, tempo de execução e tempo de chegada. Os dados coletados são processados pelos algoritmos de escalonamento conforme a lógica definida para cada um.

A entrada é realizada por meio do `Scanner`, e os processos são armazenados em uma lista para uso nas simulações dos algoritmos.

## 🔄 Algoritmos Implementados

### Round Robin (RR)

O Round Robin distribui o tempo de CPU entre os processos de forma igualitária. Cada processo recebe um **quantum** de tempo para execução. Caso não termine dentro desse tempo, retorna ao fim da fila para uma nova rodada. É um algoritmo **preemptivo**, simples e eficaz para ambientes com múltiplos usuários.

### SRT (Shortest Remaining Time)

O SRT é uma variação preemptiva do algoritmo SJF (Shortest Job First). A cada novo processo que chega, o escalonador verifica se ele possui menor tempo restante do que o processo atual. Se sim, ocorre uma **preempção** e o novo processo assume a CPU. Isso garante que os processos com menor tempo restante sejam executados mais rapidamente.

## ✅ Tecnologias Utilizadas

- Java

## 🧠 Conceitos Abordados

- Escalonamento de processos
- Algoritmos preemptivos
- Entrada e saída padrão com `Scanner`
- Manipulação de listas e controle de fluxo

---

Este projeto é uma base prática para o estudo de algoritmos de escalonamento e comportamento de processos em sistemas operacionais.
