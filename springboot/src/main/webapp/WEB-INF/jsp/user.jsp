<%@ page pageEncoding="UTF-8" %>
<html>
    <head>
        <script src="${pageContext.request.contextPath}/webjars/jquery/3.3.1/jquery.js"></script>
    </head>
    <body>
        <div>HelloWorld</div>
        用户名是: ${username}
    </body>
    <script>
        var $div = $('div');
        $div.css('color','blue');
    </script>
</html>