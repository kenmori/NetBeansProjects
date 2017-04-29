/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.logging.Logger;
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
    public Logger createLogger(){
        String className = point.getMember().getDeclaringClass().getName();
        Logger logger = Logger.getLogger(className);
        return logger;
    }
}
