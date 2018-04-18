package chapter18;

import java.util.prefs.Preferences;

/**
 * <pre>
 *     author : xiaweizi
 *     class  : chapter18.PreferencesDemo
 *     e-mail : 1012126908@qq.com
 *     time   : 2018/04/18
 *     desc   :
 * </pre>
 */

public class PreferencesDemo {
    public static void main(String... args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(PreferencesDemo.class);
        prefs.put("Location", "Oz");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witches?", true);
        int usageCount = prefs.getInt("UsageCount", 0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key : prefs.keys())
            System.out.println(key + " : " + prefs.get(key, null));
        System.out.println("How many companions does Dorothy have? " + prefs.getInt("Companions", 0));
    }
}