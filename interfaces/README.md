# Projeto: Interfaces em Java

Este diretório contém a implementação de um sistema modular que utiliza interfaces para definir contratos e classes concretas para implementar funcionalidades específicas. O objetivo é demonstrar o uso de interfaces em Java para promover a reutilização de código, modularidade e flexibilidade.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **`src/`**: Contém os arquivos-fonte Java.
  - **`iPhone/`**: Implementações relacionadas ao dispositivo iPhone, incluindo interfaces e classes concretas.
    - **Interfaces**:
      - `ReprodutorMusicalInterface`: Define os métodos para reprodução de músicas.
      - `AparelhoTelefonicoInterface`: Define os métodos para funcionalidades telefônicas.
      - `NavegadorInternetInterface`: Define os métodos para navegação na internet.
    - **Classes**:
      - `ReprodutorMusical`: Implementa a funcionalidade de reprodução de músicas.
      - `AparelhoTelefonico`: Implementa a funcionalidade de chamadas telefônicas.
      - `NavegadorInternet`: Implementa a funcionalidade de navegação na internet.
      - `iPhone`: Classe principal que integra as funcionalidades de reprodutor musical, aparelho telefônico e navegador de internet.

- **`bin/`**: Contém os arquivos compilados gerados a partir do código-fonte.

- **`classDiagram.txt`**: Diagrama de classes no formato texto, descrevendo as relações entre as interfaces e classes do projeto.

- **`mermaid-diagram.png`**: Representação visual do diagrama de classes gerado a partir do arquivo `classDiagram.txt`.

- **`lib/`**: Diretório reservado para bibliotecas externas, caso necessário.

- **`.vscode/`**: Configurações específicas do Visual Studio Code para o projeto.

## Funcionalidades

O projeto implementa as seguintes funcionalidades:

1. **Reprodutor Musical**:
   - Tocar, pausar e selecionar músicas.

2. **Aparelho Telefônico**:
   - Realizar chamadas, atender, desligar e iniciar o correio de voz.

3. **Navegador de Internet**:
   - Exibir páginas, abrir novas abas e atualizar páginas.

4. **Integração no iPhone**:
   - A classe `iPhone` combina as funcionalidades acima, demonstrando o uso de composição e implementação de múltiplas interfaces.

## Objetivos do Projeto

- Demonstrar o uso de interfaces para definir contratos de comportamento.
- Promover a separação de responsabilidades e modularidade no código.
- Facilitar a manutenção e a extensão do sistema.
- Mostrar como diferentes funcionalidades podem ser integradas em uma única classe.

## Configuração do Ambiente

1. Certifique-se de que o Java Development Kit (JDK) está instalado.
2. Utilize um ambiente de desenvolvimento integrado (IDE) como o Visual Studio Code.
3. As configurações do projeto estão definidas no arquivo `.vscode/settings.json`.

## Compilação e Execução

1. Compile os arquivos-fonte localizados no diretório `src/`.
2. Execute a classe principal `iPhone` para testar as funcionalidades integradas.

## Licença

Este projeto está licenciado sob a [MIT License](../../LICENSE).