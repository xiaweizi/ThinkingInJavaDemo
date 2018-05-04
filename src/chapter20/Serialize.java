package chapter20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter20.Serialize
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/21
 *     desc   :
 * </pre>
 */

@Target({ ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.CLASS)
public @interface Serialize {

}
