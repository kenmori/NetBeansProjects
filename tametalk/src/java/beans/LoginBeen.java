/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author moritakenji
 */
@Named
@RequestScoped
public class LoginBeen extends SuperBb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    
    public String login(){
        HttpServletRequest request = getRequest();
        try {
             request.login(username, password);
         } catch(ServletException ex){
            
             return null;
         }
        return "/index.xhtml?faces-redirect=true";
    }
    public String logout(){
        getServlet().invalidateSession();
        HttpServletRequest request = getRequest();
        try{
            request.logout();
        } catch(ServletException ex){}
        return "/index.xhtml?faces-redirect=true";
       
    }
}
