# Projeto-ME

Este projeto foi feito utilizando Spring boot, com o Spring Tool Suite 4.
Para rodá-lo, basta importar o projeto como um maven project.
O banco de dados utilizado é o SQLite, não é necessário fazer nenhuma instalação do mesmo.

Em http://localhost:{porta}/api/pedido temos os métodos get,post,put e delete.
Para o get, é necessário passar o id do pedido buscado, como por exemplo http://localhost:8080/api/pedido/id/4
No post, é necessário passar uma lista de itens, como por exemplo:

{
    "descricao": "Item A",
    "precoUnitario": 10,
    "qtd": 1
},
{
   "descricao": "Item B",
   "precoUnitario": 5,
   "qtd": 2
}
No put é necessário passar um item que deseja atualizar, como segue:
{
   "item": 26
   "descricao": "Item B",
   "precoUnitario": 5,
   "qtd": 2,
   "pedido": 23
}

Para o delete, é necessário passar o id da mesma forma como no get http://localhost:8080/api/pedido/id/4.

Para o Endpoint – Mudança de Status de Pedido temos o método POST, a url http://localhost:{porta}/api/status 
A requisição é:
{
  "status":"XXX",
  "itensAprovados":0,
  "valorAprovado":0,
  "pedido":"XXX"
}

E a response é retornada:
{
  "pedido":"123456",
  "status": ["STATUS_1", "STATUS_2", "STATUS_...n"]
}
