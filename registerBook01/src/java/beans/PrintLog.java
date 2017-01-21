/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import org.jboss.logging.Logger;

/**
 *
 * @author moritakenji
 */

@Dependent

public class PrintLog {
    @Inject
    InjectionPoint point;
    
    @Produces
    public Logger getLogger(){
        String className = point.getMember().getDeclaringClass().getName();
        Logger logger = Logger.getLogger(className);
        return logger;
    }
}
