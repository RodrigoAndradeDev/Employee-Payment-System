Sistema de Pagamento de Funcionários

Sistema em Java desenvolvido para gerenciar a folha de pagamento de colaboradores, aplicando conceitos de Herança e Polimorfismo para tratar diferentes tipos de contratos.
📌 Sobre o Projeto

O sistema automatiza o cálculo de pagamentos com base em duas categorias:

    Funcionários Próprios: Pagamento baseado em horas trabalhadas e valor por hora.

    Funcionários Terceirizados: Recebem o valor das horas acrescido de um bônus de 110% sobre suas despesas adicionais.

A solução utiliza uma lista única de funcionários, onde o cálculo de cada pagamento é resolvido em tempo de execução através de polimorfismo.
🏗 Arquitetura e Design

O projeto segue rigorosamente o diagrama de classes UML proposto:
Snippet de código

classDiagram
    class Employee {
        - String name
        - int hours
        - double valuePerHour
        + payment() double
    }
    class OutsourcedEmployee {
        - double additionalCharge
        + payment() double
    }
    Employee <|-- OutsourcedEmployee

🛠 Decisões Técnicas (Destaques)

    Encapsulamento: Atributos definidos como private com acesso via getters e setters, garantindo a integridade dos dados.

    Reuso de Código: Uso do método super.payment() na classe derivada para evitar a repetição da lógica base (Princípio DRY).

    Polimorfismo: Implementação de uma List<Employee> que armazena instâncias de ambos os tipos, permitindo chamadas genéricas ao método de pagamento.

    Internacionalização: Configuração de Locale.US para garantir que o sistema processe decimais com ponto, independente da região do SO.

🚀 Como Executar

    Pré-requisitos: Java JDK 17 ou superior instalado.

    Clonar o repositório:
    Bash

    git clone https://github.com/RodrigoAndradeDev/Employee-Payment-System.git

    Compilar e Rodar:
    Bash

    javac application/Program.java entities/*.java
    java application.Program




    Enter the number of employees: 3

Exemplo de execução!

    Employee #1 data:   
    Outsourced (y/n): n
    Name: Alex
    Hours: 50
    Value per hour: 20.00

    Employee #2 data:
    Outsourced (y/n)? y
    Name: Bob
    Hours: 100
    Value per hour: 15.00
    Additional charge: 200.00

    Employee #3 data:
    Outsourced (y/n)? n
    Name: Maria
    Hours: 60
    Value per hour: 20.00

    PAYMENTS:
    Alex - $ 1000.00
    Bob - $ 1720.00
    Maria - $ 1200.00
