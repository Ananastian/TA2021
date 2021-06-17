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
        <br><strong>Завдання:</strong> 
        <br>1. Розробити та реалізувати алгоритм для обчислення значень функції:
        <br>f(x)= 9/(3x+5)
        <br>2. Створити тести для перевірки працездатності розробленого алгоритму
        <br>3. Заповнити список з 64 елементів результатами обчислення функції для випадкових значень аргументу типу float.
        <br>4. Вивести отримані у п.3 результати через веб-інтерфейс
        <br>5. Забезпечити можливість виведення результатів сортування та пошуку даних в отриманому у п.3 списку (порядок сортування та об'єкт пошуку задається користувачем).

        <strong><p>Задана функція: f(x)= 9/(3x+5)</p></strong>
        <%! Formula form = new Formula(64);%>
        <strong><p>Випадково вибрані аргументи:</strong> <%= form.GetArgs()%> </p>
        <strong><p>Результат виконання функції:</strong><%= form.Calculate()%></p> 

        <form action="./formula" method="post" class="form-inline"> 
            <label for="x"><b>Тут можна перевірити виконання функції власноруч, введіть число х:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="- Провести розрахунки -"/>
            </div>
            <p class="mt-3 mb-0"><b>Результат виконаня за формулою 9/(3*x+5): </b><%=request.getAttribute("result")%></p>
        </form>
    </body>
</html>
