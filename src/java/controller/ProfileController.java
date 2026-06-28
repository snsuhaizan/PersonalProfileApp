package controller;

import bean.Profile;
import dao.ProfileDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet(name = "ProfileController", urlPatterns = {"/ProfileController"})
public class ProfileController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Receive data from HTML form
        String studentId = request.getParameter("studentId");
        String name = request.getParameter("name");
        String program = request.getParameter("program");
        String email = request.getParameter("email");
        String hobbies = request.getParameter("hobbies");
        String intro = request.getParameter("intro");

        // Create Profile object
        Profile profile = new Profile();
        profile.setStudentId(studentId);
        profile.setName(name);
        profile.setProgram(program);
        profile.setEmail(email);
        profile.setHobbies(hobbies);
        profile.setIntro(intro);

        // Save into database
        ProfileDAO dao = new ProfileDAO();
        boolean success = dao.insertProfile(profile);

        if (success) {
            request.setAttribute("profile", profile);
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        } else {
            response.getWriter().println("Failed to save profile.");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ProfileDAO dao = new ProfileDAO();

        request.setAttribute("profileList", dao.getAllProfiles());

        request.getRequestDispatcher("view-all.jsp").forward(request, response);
    }
}