/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author moritakenji
 */
class SuperBb implements Serializable {
    public void facesMessage(String s){
        FacesMessage msg = new FacesMessage(s);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public void facesErrorMsg(String s){
        FacesMessage msg = new FacesMessage(s);
        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
//        FacesMessage.SEVERITY_FATAL //致命的なエラー(4)
//        FacesMessage.SEVERITY_ERROR //エラー(3)
//        FacesMessage.SEVERITY_WARN //警告(2)
//        FacesMessage.SEVERITY_WARN //情報(1)
    public void facesMessage(FacesMessage.Severity severity, String s){
        FacesMessage msg = new FacesMessage(s);
        msg.setSeverity(severity);
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    public ExternalContext getServlet(){
        return FacesContext.getCurrentInstance().getExternalContext();
    }
    public HttpServletRequest getRequest(){
        return (HttpServletRequest) getServlet().getRequest();
    }
    public String getUserId(){
        return getRequest().getRemoteUser();
    }
}
