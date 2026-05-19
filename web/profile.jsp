<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <title>Profile Details</title>

    <link rel="stylesheet"
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">

    <style>

        body{
            background-color:#eef2f7;
        }

        .card{
            margin-top:50px;
            padding:30px;
            border-radius:15px;
            box-shadow:0px 0px 10px gray;
        }

    </style>

</head>

<body>

<div class="container col-md-6">

    <div class="card">

        <h2 class="text-center mb-4">
            Personal Profile
        </h2>

        <p>
            <b>Name:</b>
            <%= request.getAttribute("name") %>
        </p>

        <p>
            <b>Student ID:</b>
            <%= request.getAttribute("studentId") %>
        </p>

        <p>
            <b>Program:</b>
            <%= request.getAttribute("program") %>
        </p>

        <p>
            <b>Email:</b>
            <%= request.getAttribute("email") %>
        </p>

        <p>
            <b>Hobbies:</b>
            <%= request.getAttribute("hobbies") %>
        </p>

        <p>
            <b>Introduction:</b>
            <%= request.getAttribute("intro") %>
        </p>

    </div>

</div>

</body>
</html>