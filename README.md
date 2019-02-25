# Teste prático mobile

## Implementação
Baseado em https://medium.com/@prakash_pun/retrofit-a-simple-android-tutorial-48437e4e5a23

Utilizando http://www.jsonschema2pojo.org/ para gerar modelos

## Criar um app (Android ou iOS)
O app terá somente 2 funcionalidades, listar e mostrar séries de tv usando a API TVMaze

Documentação da API: http://www.tvmaze.com/api

### Busca
O termo de busca pode ser fixo e escolhido por você

exemplo de URL: http://api.tvmaze.com/search/shows?q=rick
```
q = query (termo utilizado na busca)
```

### Lista
A lista consiste nos resultados da busca e deve conter as seguintes informações para cada célula*:
- Título do programa
- Gênero
- Pôster

*layout fica a seu critério

### Tela de detalhes
Ao clicar em algum programa na lista, o app deverá mostrar uma tela de detalhes com as seguintes informações*:
- Pôster
- Título
- Gênero
- Sinopse
- Data de lançamento

Lembrando que o usuário deve ter a opção de voltar para a lista.
*layout também fica a seu critério

### Opcionais
- Colocar um campo de texto para mudar o termo de pesquisa e atualizar a lista
- Cache de imagem
- Possibilidade de favoritar um programa (não é necessário ter uma tela para programas favoritos, só é preciso que o app se lembre que um programa é favorito quando ele aparecer na lista e nos detalhes. Será necessário adicionar um item no layout para mostrar que o programa é favorito)

#### Opcional específico iOS
- Utilizar um arquivo .xib separado para a célula de resultado

#### Opcional específico Android
- Definir um tema com cores customizadas para as suas activities

### Git
- Subir o projeto no github ou gitlab e enviar o link para avaliação
