# 🦁 Projeto Zoo - Estudo de Programação Orientada a Objetos 🦜

Este projeto é um estudo prático de Programação Orientada a Objetos (POO) em Java, desenvolvido com o auxílio do ChatGPT para aprendizado dos conceitos fundamentais.

## 📁 Estrutura do Projeto

```
src/
├── Main.java           # Classe principal com demonstração
├── Animal.java         # Classe abstrata base
├── Leao.java          # Implementação do Leão
├── Passaro.java       # Implementação do Pássaro
├── Veterinario.java   # Classe do Veterinário
├── Identificavel.java # Interface base
└── Voavel.java        # Interface para objetos voadores
```

O projeto implementa um sistema simples de zoológico, demonstrando vários conceitos importantes de POO:

### 🔄 Interfaces
- `Identificavel`: Interface base para objetos que podem ser identificados
- `Voavel`: Interface que define o comportamento de objetos que podem voar

### 📐 Classes Abstratas
- `Animal`: Classe abstrata base que implementa `Identificavel`
  - Define comportamentos comuns como `dormir()`
  - Declara métodos abstratos como `emitirSom()` e `getNomeAnimal()`

### 🐾 Classes Concretas
- `Leao`: Herda de `Animal`
  - Implementa comportamentos específicos de um leão
  - Emite rugidos como som característico

- `Passaro`: Herda de `Animal` e implementa `Voavel`
  - Implementa comportamentos específicos de um pássaro
  - Pode voar e emitir cantos

### 👥 Classes de Suporte
- `Veterinario`: Classe que demonstra o uso de polimorfismo ao examinar diferentes tipos de animais
- `Cuidador`: Classe interna que demonstra o uso de classes locais

## 🎯 Conceitos de POO Demonstrados

1. **🔍 Abstração**
   - Uso de classes abstratas e interfaces
   - Definição de contratos através de interfaces

2. **🔒 Encapsulamento**
   - Uso de modificadores de acesso (protected, public)
   - Encapsulamento de dados através de atributos privados

3. **🔄 Herança**
   - Hierarquia de classes (Animal -> Leao/Passaro)
   - Reutilização de código através da herança

4. **🦋 Polimorfismo**
   - Implementação de interfaces
   - Sobrescrita de métodos
   - Classes anônimas
   - Classes locais

5. **👻 Classes Anônimas**
   - Demonstração de criação de animais anônimos com comportamentos personalizados

## 🚀 Como Executar

1. Compile todos os arquivos Java na pasta `src`
2. Execute a classe `Main` para ver a demonstração do sistema

## 📚 Aprendizados

Este projeto demonstra como aplicar conceitos fundamentais de POO em um contexto prático e divertido, usando um zoológico como exemplo. Através deste estudo, é possível compreender:

- Como criar hierarquias de classes
- Como implementar interfaces
- Como usar polimorfismo
- Como trabalhar com classes abstratas
- Como criar classes anônimas e locais
- Como organizar código de forma orientada a objetos 