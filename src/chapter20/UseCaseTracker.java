package chapter20;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter20.UseCaseTracker
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/19
 *     desc   : 1
 * </pre>
 */

public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> cl) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        for (Method method : cl.getDeclaredMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("Found Use Case:" + useCase.id() + " " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }
        for (Integer i : useCases) {
            System.out.println("warning Missing use case:" + i);
        }
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47,78,49,52);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
