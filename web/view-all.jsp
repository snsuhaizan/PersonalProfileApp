<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <title>View All Profiles</title>

    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>
        body{
            background:#eef2f7;
        }

        .container{
            margin-top:40px;
        }
    </style>

</head>

<body>

<div class="container">

    <h2 class="mb-4">All Student Profiles</h2>
    
    <input type="text"
       id="searchInput"
       class="form-control mb-3"
       placeholder="Search by Name or Student ID">
    
    <table class="table table-bordered table-striped">

        <thead class="table-dark">

            <tr>
                <th>Student ID</th>
                <th>Name</th>
                <th>Program</th>
                <th>Email</th>
                <th>Hobbies</th>
                <th>Introduction</th>
            </tr>

        </thead>

        <tbody>

        <c:forEach var="profile" items="${profileList}">

            <tr class="profileRow">

                <td>${profile.studentId}</td>

                <td>${profile.name}</td>

                <td>${profile.program}</td>

                <td>${profile.email}</td>

                <td>${profile.hobbies}</td>

                <td>${profile.intro}</td>

            </tr>

        </c:forEach>

        </tbody>

    </table>

</div>

    <script>

document.getElementById("searchInput").addEventListener("keyup", function () {

    var keyword = this.value.toLowerCase();

    var rows = document.getElementsByClassName("profileRow");

    for (var i = 0; i < rows.length; i++) {

        var text = rows[i].innerText.toLowerCase();

        if (text.indexOf(keyword) > -1) {
            rows[i].style.display = "";
        } else {
            rows[i].style.display = "none";
        }

    }

});

</script>
</body>
</html>