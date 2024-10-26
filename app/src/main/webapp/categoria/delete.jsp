<%@ page language="java" contentType="text/html; charset=UTF-8" pageencoding="UTF-8" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
    <meta charset="UTF-8" />
    <title>Remover Categoria</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap(s.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
    <body>
        <div class="container">
            <hi>Remover Categoria</h1>
            <p>Tem certeza que deseja remover a categoria "$(categoria.nome)" ?</p>
            <form action="/categoria/delete" method="post">
            <input type="hidden" name="id" value="$(categoria.id)" />
                <br />
                <a href="/categoria/list" class="btn btn-primary" >voltar</a>
                <button type="submit" class="btn btn-danger">Excluir</button>
            </form>
        </div>
    </body>
</html>