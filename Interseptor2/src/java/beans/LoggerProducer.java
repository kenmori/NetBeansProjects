/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import com.sun.istack.logging.Logger;
import java.util.logging.Level;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

/**
 *
 * @author moritakenji
 */
@Dependent
public class LoggerProducer {
    
    @Inject
    InjectionPoint point;
    
    @Produces
    public Logger getLogger() {
        String className = point.getMember().getDeclaringClass().getName();
        
        
        final Logger logger = Logger.getLogger(className);
        
        logger.setLevel(Level.FINE);
        return logger;
    }
}
