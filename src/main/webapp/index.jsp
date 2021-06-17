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
        <title>Exam Tsyganova</title>
    </head>
    <body>

        <%! FormulaResults fr = new FormulaResults(10);%> <!=
        <p>Випадково вибрані аргументи: <%= fr.GetArgs()%> </p> 
        <p>Результат виконання функції:<%= fr.Calculate()%></p> 

        <form action="./formula" method="post" class="form-inline"> 
            <label for="x"><b>Формула _________, введіть число х:</b></label>
                <div class="input-group">
                    <input  class="form-control" id="x" type="text" name="x"/>
                    <input class="btn btn-success" type="submit" value="Submit"/>
                </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
        <!-- конструктор приймає опциоаальное або кількість аргументів, або просто пустим  -->
    </body>
</html>
