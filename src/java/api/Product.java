/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import api.models.Category;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author premuditha
 */
@WebServlet(name = "Product", urlPatterns = {"/products"})
public class Product extends HttpServlet {
    
    private final Gson gson;
    
    List<api.models.Product> products;

    public Product() {
        this.gson = new Gson();
        this.products = new ArrayList<>();
        
        // This is the data you are returning from your API endpoint. The data soruce can be a DB, JSON or another web service.
        // The sameple data is hard-corded here just to keep things simple. 
        products.add(new api.models.Product("Product A Tesing", 100.50, 10, "Description A", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product B", 130.50, 20, "Description B", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product C", 140.50, 30, "Description C", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product D", 150.50, 40, "Description D", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product E", 160.50, 50, "Description E", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product F", 170.50, 60, "Description F", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product G", 180.50, 70, "Description G", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product H", 190.50, 80, "Description H", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product I", 220.50, 90, "Description I", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product J", 320.50, 100, "Description J", 0, "https://picsum.photos/200"));
        products.add(new api.models.Product("Product K", 420.50, 1100, "Description K", 0, "https://picsum.photos/200"));
        
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String employeeJsonString = gson.toJson(products);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(employeeJsonString);
        out.flush();
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    }
}
