# jsf22-archetype-model
Para gerar archetype a partir do exemplo faça (dentro do diretorio que possue o pom.xml):

```sh
$ mvn archetype:create-from-project
$ cd target/archetype
$ mvn clean install
 
 ``` 

O archetype será instalado localmente.

No eclipse neon, baixe um pacote maven externo, com o maven EMBEDDED do eclipse não funciona o m2e falha
configure em Windows->Preferences->Maven-> Installations

1. clique no botão ADD e selecione o diretório externo do maven
2. confirme OK

Procede com Run As-> Maven build ..-> Run Configurations

1. no campo  Goals: digite-> archetype:create-from-project
2. clique em Run

No diretório target/generated-sources você encontrará o projeto archetype, para instalar a partir do eclipse
import esse projeto com Import -> Maven -> Existing Maven Projects

Selecione o projeto importado, Run As-> Maven build ..-> Run Configurations

1. no campo  Goals: digite-> clean install
2. clique em Run

Agora você poderá criar seus projetos JSF a partir do arquetipo instalado localmente.

