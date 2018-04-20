package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter20.Member
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/19
 *     desc   : 2
 * </pre>
 */

public class Member {
    @SQLInteger(name = "age", constraints = @Constraints(primary = true))
    Integer age;
    public static void main(String[] args) {

    }
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Constraints {
    boolean primary() default false;
    boolean allowNull() default true;
    boolean unique() default false;
}

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface SQLInteger {
    String name() default "";
    Constraints constraints() default @Constraints;
}

