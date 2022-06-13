package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    List<String> msgs = Arrays.asList("Greetings from Helen!", "My favorite color is blue.", "I am a cat person!"); 

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //convert List to JSON
        String json = new Gson().toJson(msgs);

        response.setContentType("application/json;");
        response.getWriter().println(json);
    }
}
