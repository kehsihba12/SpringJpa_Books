<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="books">
         BookID : <input type="text" name="id" >
        <input type="submit" name="search">
    </form>

        <hr>
    BookID : ${book.bookId}   <br>
    BOOkName: ${book.bookName}  <br>
    BookPrice: ${book.bookPrice} <br>
</body>
</html>