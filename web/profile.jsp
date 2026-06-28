<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="bean.Profile"%>

<%
    Profile profile = (Profile) request.getAttribute("profile");
%>
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
            <%= profile.getName() %>
        </p>

        <p>
            <b>Student ID:</b>
            <%= profile.getStudentId() %>
        </p>

        <p>
            <b>Program:</b>
            <%= profile.getProgram() %>
        </p>

        <p>
            <b>Email:</b>
            <%= profile.getEmail() %>
        </p>

        <p>
            <b>Hobbies:</b>
            <%= profile.getHobbies() %>
        </p>

        <p>
            <b>Introduction:</b>
            <%= profile.getIntro() %>
        </p>

        <hr>

        <a href="ProfileController" class="btn btn-success">
        View All Profiles
        </a>
    </div>

</div>

</body>
</html>

