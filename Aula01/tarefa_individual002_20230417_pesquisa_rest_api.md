# API 

 **Application Programming Interface (Interface de Programação de Aplicações)**

Em resumo é um conjunto de rotinas e padrões estabelecidos por uma aplicação, para que outros sistemas possam utilizar as funcionalidades desta aplicação. Deste modo, a API fica como intermediador de comunicação para troca de informações entre diferentes serviços. 

# Rest 

**REpresentational State Transfer (Transferência de Estado Representativo)**

O Rest é um conjunto de restrições de arquitetura para transferência de dados entre aplicações. Além disso, geralmente, é utilizado o protocolo HTTP para essa ação. 

# Restful

Restful é a utilização do padrão Rest. 

# API Rest(ful)

Uma API Rest é uma API que está em conformidade com as restrições arquiteturiais Rest, permitindo a comunicação entre serviços web. 

## Características (constraints) de uma API Rest(ful)

1. *Client-server:* É uma arquitetura que separa o cliente e o servidor (Armazenamento de dados), gerenciando solicitações por HTTP;

2. *Stateless:* Cada solicitação que o *Client* fizer para o servidor, deverá possuir todas as informações necessárias para o server entender e responder (RESPONSE) a requisição (REQUEST). Além disso, nenhuma informação do cliente é armazenada entre solicitações GET e toda as solicitações são separadas e desconectadas;

3. *Cacheable:* Armazenamento de dados em cache para otimização da comunicação entre cliente e servidor;

4. *Layered System:* O cliente acessa a um endpoint, sem ter conhecimento da complexidade ou camadas que o servidor está lidando para responder a requisição;

5. *Uniform Interface*: Existir uma uniformidade, um padrão, na construção da interface, pois a API precisa ser coerente com quem for utilizá-la. Como por exemplo usar os verbos corretos HTTP, endpoints intuitivos, usar somente plural ou somente singular, utilizar somente uma linguagem de comunicação (como json), sempre enviar uma resposta do sistema para o cliente, dentre outros. 

# Boas práticas

- Utilizar os verbos HTTP, especifícados abaixo:
    - GET: Receber dados de um Resource;
    - POST: Enviar dados ou informações para serem processados por um Resource;
    - PUT: Atualizar dados de um Resource;
    - DELETE: Deletar um Resource.
- Não deixar barra (/) no final do endpoint;
- Nunca deixar o cliente sem resposta;
- Usar ou singular ou plural na criação dos endpoints.

# Referências Bibliográficas

https://www.youtube.com/watch?v=ghTrp1x_1As&ab_channel=Rocketseat 
https://github.com/rocketseat-content/youtube-api-rest-restful  
https://www.youtube.com/watch?v=AiZ-DZXe830&ab_channel=PedroImpulcetto
https://www.redhat.com/pt-br/topics/api/what-is-a-rest-api




