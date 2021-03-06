package Part_two_AOP.service;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class MyPointcuts {
    // поменяли данные выражения на несуществующие, чтобы не захламлять вывод
    @Pointcut("execution(* abc*(..))")
    public void beforeGetMethods() {
    }

    @Pointcut("execution(* dfg*(..))")
    public void beforeAddMethods() {
    }
}
