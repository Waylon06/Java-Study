<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>
<h2>Hello World!</h2>
<form  method="get">
    <input type="text" name="username"> <br>
    <input type="password" name="password"><br>
    <input type="checkbox" name="hobby" value="1">
    <input type="checkbox" name="hobby" value="2"><br>
    <button type="button" class="btn">提交</button>
</form>
<script src="axios.js"></script>
<script>
    var btn = document.querySelector(".btn");

    btn.addEventListener('click', function () {
        console.log(111)
        axios.get('/hello').then((res)=>{
            console.log(res)
        })
        // axios({
        //     method: 'get',
        //     url: 'http://localhost:8080/hello',
        // }).then(function (resp) {
        //     console.log(resp.data);
        // })
    })

</script>
</body>
</html>
