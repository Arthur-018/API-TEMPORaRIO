# 🎮 API Valorant

Aplicação Java que consome a [Valorant API](https://valorant-api.com) para exibir informações detalhadas sobre agentes, mapas, armas, skins, modos de jogo, títulos e temporadas do universo **Valorant** — tudo diretamente via console.

---

## 🧩 Funcionalidades

- 📜 Listagem de **agentes** com papéis e habilidades  
- 🗺️ Exibição dos **mapas** disponíveis no jogo  
- 🔫 Consulta de **armas** e **skins**  
- 🕹️ Visualização dos **modos de jogo**  
- 🏆 Acesso a informações sobre **títulos** e **temporadas**  

---

## 🧱 Estrutura do Projeto
API Valorant/
│
├── 📄 pom.xml # Configuração e dependências do Maven
│
├── 📂 src/
│ ├── main/
│ │ ├── java/com/valorant/
│ │ │ ├── Main.java # Ponto de entrada principal
│ │ │ ├── ValorantConsoleApp.java # Interface via console
│ │ │ │
│ │ │ ├── 📁 model/ # Modelos de dados (entidades)
│ │ │ │ ├── Agent.java
│ │ │ │ ├── MapModel.java
│ │ │ │ ├── Weapon.java
│ │ │ │ ├── Skin.java
│ │ │ │ ├── GameMode.java
│ │ │ │ ├── PlayerTitle.java
│ │ │ │ └── Season.java
│ │ │ │
│ │ │ ├── 📁 service/ # Camada de serviços e lógica de negócio
│ │ │ │ ├── ApiClient.java
│ │ │ │ ├── AgentService.java
│ │ │ │ ├── MapService.java
│ │ │ │ ├── WeaponService.java
│ │ │ │ ├── SkinService.java
│ │ │ │ ├── GameModeService.java
│ │ │ │ ├── PlayerTitleService.java
│ │ │ │ └── SeasonService.java
│ │ │ │
│ │ │ └── 📁 controller/ # (planejada) Camada de controle para futuras rotas web
│ │ │
│ │ └── resources/
│ │ ├── application.properties # Configurações da aplicação
│ │ └── templates/ # (planejada) Páginas HTML com Thymeleaf
│ │
│ └── test/ # (planejada) Testes unitários e de integração
│
└── 📂 target/ # Arquivos compilados gerados pelo Maven



---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🧰 **Maven** (gerenciamento de dependências)
- 🌐 **HTTP Client / Gson** (requisições HTTP e parsing de JSON)
- 🧩 **Thymeleaf** (planejado para integração futura do front-end)
- 🖥️ **Console Application**

---

## 🌐 Fonte de Dados

Os dados são obtidos da **[Valorant API](https://valorant-api.com)** — uma API pública e gratuita que fornece informações atualizadas sobre todos os conteúdos oficiais do jogo Valorant.

---

## 🚧 Status do Projeto

Este é um **projeto pessoal em desenvolvimento**, criado com o objetivo de estudar e praticar:

- Integração de APIs REST em Java  
- Manipulação de dados JSON  
- Organização de projeto com Maven e arquitetura em camadas  

💡 **Futuras melhorias planejadas:**
- Adição de um **frontend em Java** utilizando **Thymeleaf** (com integração web)  
- Implementação de **cache local e tratamento de erros aprimorado**  
- Criação de uma **interface mais interativa e visual**  
- Integração com **Spring Boot** para servir páginas dinâmicas  

---

## 👨‍💻 Projeto pessoal em constante evolução — criado para aprendizado e aperfeiçoamento em desenvolvimento Java e integração com APIs públicas.
---
