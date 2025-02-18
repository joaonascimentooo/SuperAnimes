# SuperAnimes

SuperAnimes é uma plataforma para os fãs de animes acompanharem suas séries favoritas, avaliarem episódios e compartilharem opiniões.

## Tecnologias Utilizadas

### Backend - Spring Boot
- **Spring Boot** (Framework principal)
- **Spring Data JPA** (ORM para interação com o banco de dados)
- **Spring Security** (Autenticação e autorização)
- **JWT** (Autenticação baseada em token)
- **Banco de Dados**: PostgreSQL ou MySQL
- **Swagger** (Documentação da API)

### Frontend - Next.js
- **React.js** (Framework para criação da interface)
- **Next.js** (Renderização do lado do servidor e otimizações)
- **TailwindCSS** (Estilização)
- **Axios** (Requisições HTTP para a API)
- **Zustand ou Redux** (Gerenciamento de estado)

## Como Rodar o Projeto

### Backend (Spring Boot)

1. Clone o repositório e navegue até a pasta do backend:
   ```sh
   git clone https://github.com/joaonascimentooo/SuperAnimes.git
   cd SuperAnimes/backend
   ```
2. Configure o banco de dados no arquivo `application.properties` ou `application.yml`.
3. Execute o projeto com:
   ```sh
   mvn spring-boot:run
   ```
4. A API estará disponível em `http://localhost:8080`.

### Frontend (Next.js)

1. Navegue até a pasta do frontend:
   ```sh
   cd ../frontend
   ```
2. Instale as dependências:
   ```sh
   npm install
   ```
3. Execute o projeto:
   ```sh
   npm run dev
   ```
4. O frontend estará disponível em `http://localhost:3000`.

## Funcionalidades
- Cadastro e login de usuários (com JWT)
- Catálogo de animes
- Avaliação e comentários em episódios
- Lista de favoritos
- Recomendados para você

## Contribuição
1. Fork o repositório.
2. Crie uma branch:
   ```sh
   git checkout -b feature/nova-funcionalidade
   ```
3. Faça suas alterações e commit:
   ```sh
   git commit -m "Adiciona nova funcionalidade X"
   ```
4. Envie para o repositório remoto:
   ```sh
   git push origin feature/nova-funcionalidade
   ```
5. Abra um Pull Request.

## Licença
Este projeto está licenciado sob a MIT License.
