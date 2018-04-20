package chapter20;

import java.util.List;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter20.PasswordUtils
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/19
 *     desc   :
 * </pre>
 */

class PasswordUtils {
    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 48) // description 默认为 no description
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }


    @UseCase(id = 49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
