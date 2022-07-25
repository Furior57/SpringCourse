package Part_two_AOP.service.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SecurityAspect {
    // Вот такой простой записью мы объявляем pointcut-метод, теперь его можно использовать для всех
    // методов в этом классе. Мы даже можем создать отдельный класс с объявленными
    // pointcut методами и использовать его во всех аспектах, по его полному имени, но
    // если мы объявили этот метод в каком то аспект-классе, то только в этом классе мы и можем
    // его использовать. Вспоминаем, что аспекты, это служебные классы и обращаться напрямую
    // к их методам мы не можем.
    @Pointcut("execution(* get*(..))")
    public void beforeGetMethods() {
    }

    @Before("beforeGetMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("Checking access rights with SecurityAspect");
    }

    // Так как pointcut-выражения, это выражения :), мы можем использовать их с операторами сравнения
    // В классе Library мы определили два новых метода readBook() и returnBook()
    // теперь определим несколько выражений.

    // Pointcuts выражения
    // все read методы
    @Pointcut("execution(* read*())")
    private void allReadMethods() {
    }
    // все return методы
    @Pointcut("execution(* return*())")
    private void allReturnMethods() {
    }
    // все методы
    @Pointcut("execution(* *())")
    private void allMethods() {
    }

    // Before методы
    // перед всеми read методами
    @Before("allReadMethods()")
    public void beforeReadMethodsAdvice() {
        System.out.println("Log #1");
    }
    // перед всеми return методами
    @Before("allReturnMethods()")
    public void beforeReturnMethodsAdvice() {
        System.out.println("Log #2");
    }
    // перед всеми read или return методами
    @Before("allReadMethods() || allReturnMethods()")
    public void beforeReadOrReturnMethodsAdvice() {
        System.out.println("Log #3");
    }
    // перед всеми методами кроме return
    @Before("allMethods() && !allReturnMethods()")
    public void beforeAllMethodsWithoutReturnAdvice() {
        System.out.println("Log #4");
    }

    // Такие комбинации можно выносить в отдельные pointcut-ы. В целом ничего сложного.
    // Единственное, что еще надо отметить - порядок выполнения этих pointcut разный
    // для разных методов, с чем это связано пока не объясняется.
}
