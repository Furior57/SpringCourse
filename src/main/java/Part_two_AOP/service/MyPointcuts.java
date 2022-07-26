package Part_two_AOP.service;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointcuts {
    @Pointcut("execution(* abc*(..))")
    public void beforeGetMethods() {
    }

    @Pointcut("execution(* dfg*(..))")
    public void beforeAddMethods() {
    }
}
