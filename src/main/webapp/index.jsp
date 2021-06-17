<%-- 
    Document   : index
    Created on : 16.06.2021, 19:12:58
    Author     : Admin
--%>

<%@page import="tsyganova.exam.ta.FormulaResults"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <!--у нас є форма, тут вказаний шлях  який вказаний в сервелеті . є форма, є сервет який відповідає оцьому шляху /formula -->
        <form action="./formula" method="post" class="form-inline"> 
            <label for="x"><b>Enter x:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/> <!-- ідентифікує х як стрінг, і відправляє данні на сервелет-->
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p> <!--Виводимо результат який виконався в методі калькулятора-->
        </form>
        <!-- конструктор приймає опциоаальное або кількість аргументів, або просто пустим  -->
            <%! FormulaResults fr = new FormulaResults(10); %> <!=<!-- Створюємо клас який агрегує роботу з багатьма параметрами, створюємо через динамічну пам'ять -->
        <p>Args: <%= fr.GetArgs()%> </p> <!--Щоб показать аргумент, ми визивамо гетер цього поля, показуємо просто через toString-->
        <p>Results:<%= fr.Calculate() %></p> <!--Потім викликаєм функцію, вона розраховує не тільки результат а й вертає їх тому ми її записал в -->
        
    </body>
</html>
