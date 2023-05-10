### Tarefa Grupo 005: Git Exercícios - 28/04/2023.

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git?
  - R.: git -v ou git --version

2. Qual o efeito da execução de cada um dos comandos abaixo?
  - a. git help
    - R.: Abre o manual do git, mostrando alguns comandos comuns usados em várias situações.
  
  - b. git help checkout
    - R.: Mostra o manual do comando _checkout_, que é usado para mudar de branch, ou para restaurar arquivos, além da descrição do comando _checkout_.
  
  - c. git help merge
    - R.: Mostra o manual do comando _merge_, que é usado para juntar duas branches, ou seja, mesclar duas branches, além de uma descrição sobre o comando _merge_.
  
  - d. git init
    - R.: Inicializa um repositório git no diretório atual.
  
  - e. git add --all
    - R.: Adiciona todos os arquivos do diretório atual ao stage. A flag -all adiciona todos os arquivos, incluindo os que foram criados ou excluídos.
  
  - f. git add -u
    - R.: Adiciona todos os arquivos modificados ou excluídos do diretório atual ao stage. A flag -u irá atualizar o stage com os arquivos modificados ou excluídos.
  
  - g. git config -l
    - R.: Lista todas as configurações do git. A flag -l é usada para listar as configurações, tais como user.name e user.email.
  
  - h. git mv a.txt b.txt
    - R.: Renomeia o arquivo a.txt para b.txt.
  
  - i. git reset --hard
    - R.: Remove todas as alterações feitas no repositório, incluindo arquivos criados, modificados ou excluídos.
  
  - j. git log -27
    - R.: Mostra o histórico dos últimos 27 commits feitos no repositório.

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
  - R.: git add <arquivo> e git commit -m "mensagem". Obs.: caso queira adicionar todos os arquivos modificados, basta usar o comando git add -u.

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
  - R.: git diff

5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
  - R.: git status

6. Qual o comando para efetuar um _commit_?
  - R.: git commit -m "mensagem"

7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
  - R.: git restore teste.txt

8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
  - R.: Criar um arquivo .gitignore no diretório que deseja ignorar, e adicionar o nome do diretório no arquivo .gitignore. Ex.: se quiser ignorar o diretório "teste", basta adicionar "teste/" no arquivo .gitignore.

9. O que acontece se o seu repositório local for acidentalmente removido?
  - R.: Basta clonar o repositório remoto novamente.

10. Como clonar um repositório remoto?
  - R.: git clone <url do repositório>. Usando http seria https://github.com/<nome do perfil>/<nome do repositório>.git ou ssh, que seria git@github:<nome do perfil>/<nome do repositório>.

11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
  - R.: git log --oneline

12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
  - R.: ~/.gitconfig

13. Qual o comando para criar um repositório local?
  - R.: git init

14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
  - R.: .git

15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
  - R.: git add -u

16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
  - R.: SHA1 é um algoritmo de hash criptográfico que gera um valor de 160 bits, ou seja, 20 bytes. O propósito é gerar um valor único para cada arquivo, de forma que seja possível identificar se o arquivo foi modificado ou não. O SHA1 é um algoritmo de hash criptográfico que gera um valor de 160 bits, ou seja, 20 bytes. O propósito é gerar um valor único para cada arquivo, de forma que seja possível identificar se o arquivo foi modificado ou não.

17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
  - R.: HEAD

18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
  - R.: Não, pois o comando git add -u adiciona apenas os arquivos modificados ou excluídos. Para adicionar todos os arquivos criados, é necessário usar o comando git add . .

19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1**
**git reset --hard**
  - R.: O primeiro comando irá voltar ao estado anterior o ultimo arquivo feito commit. Variações do camndo que possuem mesmo efeito: `git reset --soft HEAD^` ou `git reset --soft HEAD~` . 
O segundo comando irá remover todas as alterações feitas no repositório, incluindo arquivos criados, modificados ou excluídos, em resumo esse comando irá apagar todos os arquivos em um dado repositório.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?

21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
  R.: .gitignore

22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
  - R.: Adicionar a extensão .class no arquivo .gitignore. Ex.: *.class

23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
resume a saída do comando **git log**, ou seja, exibe o log (registro) de commits e disponibiliza a descrição do commit (-s), classifica de acordo com a quantidade de commits feito por um autor ao invés de ordem alfabética (-n) e exibe o endereço de email e cada autor (-e).

25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
lista as conexões remotas com outros repositórios e exibe as URLs de cada conexão

26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
o comando **git tag** listará todas as tags de um repositório em ordem alfabética

27. Caso um dado repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
**git tag -l "2.0"**

28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
cria uma tag de mp,e "3.4-gold" com a mensagem "minha versão ouro" armazenada junto à tag

29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
Após executado o comando acima, qual o efeito de git show 3.4-gold? Exibe todos os objetos que contém "3.4-gold".

30. O que o comando **git push origin 3.4-gold** teria como efeito?
O que o comando git push origin 3.4-gold teria como efeito? faz o push para o repositório de nome origin para a branch 3.4-gold.

31. Após executar um commit, qual o efeito de **git commit --amend**?
Após executar um commit, qual o efeito de git commit --amend? Reseta a árvore de commits e cria um novo commit como mensagem inicial.

32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
 Após executar *git add x.txt, qual o efeito de **git reset HEAD x.txt*?
O comando *git add* faz o arquivo x.txt começar a ser monitorado pelo controle de versionamento, quando execultado *git reset HEAD* o arquivo volta ao estado que estava anteriormente, ou seja, fora do monitoramento.

33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando 
**git checkout -- a.txt**?
Esse comando irá desfazer o conteúdo alterado.

34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
A diferença é que o comando git checkout pode desfazer apenas uma alteração que não foi adicionada ao stage.

35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.
Esse comando tem o intuído de representar de forma detalhada as diferenças entre dois arquivos ou conjuntos de arquivos indicados pelo usuário.


</DIV/>
