<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
</head>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign Up!
    </div>
    <form method="post" action="/students">
        <label for="name">First Name
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="surname">Last Name
            <input class="input-field" type="text" id="surname" name="surname">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>

<div class="form-style-2">
    <div class="form-style-2-heading">
        Already in System!
    </div>
    <table>
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
        </tr>
        <#list studentsFromServer as student>
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.surname}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>