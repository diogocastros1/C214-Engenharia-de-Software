# C214 - Engenharia de Software

## Iniciar projeto com Maven no terminal

Para iniciar um projeto do zero, devemos gerar o arquivo `pom.xml`, para isto utilizamos o comando abaixo e respondemos algumas perguntas. 
~~~~bash
mvn archetype:generate
~~~~
Feito isto será exibido a versão do 2104 por exemplo, basta digitar esta mesma versão respondendo esta pergunta, após isto irá selecionar uma versão deste `arquétipo`.

No exemplo abaixo, selecionei a versão 2104 e após isso o numero 8 para selecionar a versão 1.4 deste arquétipo:
~~~~terminal
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 2104: 2104                    
Choose org.apache.maven.archetypes:maven-archetype-quickstart version: 
1: 1.0-alpha-1
2: 1.0-alpha-2
3: 1.0-alpha-3
4: 1.0-alpha-4
5: 1.0
6: 1.1
7: 1.3
8: 1.4
Choose a number: 8: 8
~~~~

Após isto, iremos responder as perguntas abaixo:
- groupId - com.example
- artifactId - meu-projeto
- version - 1.0
- package - com.example
