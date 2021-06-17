<%-- 
    Document   : index
    Created on : 16.06.2021, 19:12:58
    Author     : Admin
--%>

<%@page import="tsyganova.exam.ta.Formula"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exam Tsyganova IP-11</title>
    </head>
    <body>
        <h1>-Exam work-</h1>
        <h2>-Tsyganova Anastasia IP-11</h2>
        <p>Завдання:</p>
        <p>Задана функція:</p>
        <%! Formula form = new Formula(3);%> <!=
        <p>Випадково вибрані аргументи: <%= form.GetArgs()%> </p> 
        <p>Результат виконання функції:<%= form.Calculate()%></p> 
        
        <form action="./formula" method="post" class="form-inline"> 
            <label for="x"><b>Тут можна перевірити виконання функції власноруч, введіть число х:</b></label>
                <div class="input-group">
                    <input  class="form-control" id="x" type="text" name="x"/>
                    <input class="btn btn-success" type="submit" value="- Провести розрахунки -"/>
                </div>
            <p class="mt-3 mb-0"><b>Результат виконаня за формулою: </b><%=request.getAttribute("result")%></p>
        </form>
    </body>
</html>
