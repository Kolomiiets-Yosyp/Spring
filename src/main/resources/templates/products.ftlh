<!doctype html>
<html lang="en">
<head>

    <title>Products</title>
</head>
<body>
<h1>BySell</h1><hr>
<h4>ALL Products:</h4>
<#list products as products>
<div>
    <p><a>${product.title}</a><b> ${product.prise}</b> | <a href="/products/${product.id}">More...</a></p>
</div>
</#list><hr>

</body>
</html>