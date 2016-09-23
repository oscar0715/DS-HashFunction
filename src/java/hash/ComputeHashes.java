/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jiaming
 */
@WebServlet(name = "ComputeHashes", urlPatterns = {"/computeHash"})
public class ComputeHashes extends HttpServlet {

    ComputeHashesModel model;
    
    @Override
    public void init(){
        model = new ComputeHashesModel();
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        // get the String 
        String string = request.getParameter("string");
        
        // null case handle
        if (string == null || string.length() == 0) {
            RequestDispatcher view = request.getRequestDispatcher("index.jsp");
            view.forward(request, response);
            return;
        }
        // determine which hash function should be used
        String hashFunction = request.getParameter("hashFunction");
        
        // call model functions
        byte[] hashBytes = model.getHashValue(string, hashFunction);
        String hex = model.hexParse(hashBytes);
        String base = model.base64Parse(hashBytes);
        
        // set attribute of request
        request.setAttribute("hex", hex);
        request.setAttribute("base", base);
        String nextView = "result.jsp";
        
        // redict
        RequestDispatcher view = request.getRequestDispatcher(nextView);
        view.forward(request, response);
    }
}
