<%--
  Created by IntelliJ IDEA.
  User: DvDxD
  Date: 2020/6/4
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link href="https://cdn.bootcdn.net/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery.form/4.2.2/jquery.form.js"></script>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery.serializeJSON/2.9.0/jquery.serializejson.js"></script>

    <script>
        function login() {
            var formdata = $("#from1").serializeArray();
            var data = {};
            $(formdata ).each(function(index, obj){
                data[obj.name] = obj.value;
            });
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/user/reg",
                data: JSON.stringify(data),
                dataType: "json",
                contentType: "application/json;charset=UTF-8",
                success: function (result) {
                    alert(result);
                }
            });
            alert("提交成功，请在Tomcat控制台查看服务端接收到的数据");

        };
    </script>
</head>
<body>
<form id="from1" action="">
    UserName<input id="p1" type="text" name="Name" required/>
    Password<input id="p2" type="password" name="Password" required/>
    Phone<input id="p3" type="tel" name="Phone"/>
    Password<input id="p4" type="text" name="NickName"/>
    <input id="btn" type="button" value="提交" onclick="login()"/>
</form>
</form>
</body>
</html>
