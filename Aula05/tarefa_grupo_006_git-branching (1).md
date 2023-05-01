### Tarefa 006: Git Branching - 28/04/2023

1. Qual o nome do branch padrão do Git?
Master

2. O que o comando **<code>git branch nome</code>** realiza?
Cria uma nova branch com o nome especificado no comando

3. Como criar um branch a partir de um commit específico?
**<code>git branch branchname commit-id</code>**

4. Em um repositório, qual o efeito do comando **<code>git checkout -b bugfix/234</code>**?
Cria uma nova branch "bugfix" e muda para ela, atualizando o diretório de trabalho

5. Qual o comando para se alternar para um branch de nome **experimento2**?
**<code>git checkout experimento2</code>**

6. Em um repositório com dois branches, **b1** e **b2**, onde b1 é o corrente, qual o efeito do comando **<code>git branch</code>**?
Lista ambas as branches b1 e b2

7. O que o comando **<code>git checkout -b</code>** nome faz?
O comando "git checkout -b" possui o propósito de criar uma nova branch e mudar para ela ao mesmo tempo, porém é necessário adicionar o nome da nova branch ao final da linha, seguindo o modelo **<code>git checkout -b nova-branch</code>**

8. Qual a função do <code>**comando git branch -d teste</code>**?
Exclui a branch local "teste"

9. Durante o desenvolvimento de um software é comum, por exemplo, utilizar um novo recurso por meio de experimentação. Talvez uma nova tecnologia, uma nova biblioteca que pode ser útil ao que está em desenvolvimento, ou até mesmo uma nova versão de um produto já empregado. Para que o uso deste novo recurso não interfira com o que é considerado pronto, um branch pode ser criado para a experimentação. Código que for criado para a experimentação existirá apenas no branch criado. Se eventualmente o experimento demonstrar um resultado satisfatório, as alterações realizadas no branch poderão ser incorporadas no que é considerado pronto, ou seja, no branch principal (master). Esta última ação é conhecida por merge. Neste item, crie uma sequência de comandos que simula um caso simples de criação e uso seguido de merge empregando um branch para ilustrar uma experimentação conforme acima. A sequência deve incluir, obrigatoriamente: (a) criação de um ou mais branches; (b) chaveamento para pelo menos dois branches e (c) merge.

considerando um cenário em que o repositório atual possui apenas a branch master com 1 commit no histórico:
**<code>git checkout -b nova-branch</code>**
**<code>git commit -a -m 'nova mudança'</code>**
**<code>git checkout master</code>**
**<code>git merge nova-branch</code>**

</DIV/>
