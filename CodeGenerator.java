import java.util.*;
public class CodeGenerator {
    public static String generate(ArrayList<String> list) {
        int count = 0;
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            count++;
            if (count > 8) {
                count = 1;
            }
            if (count == 8) {
                result += "<font color=\"#07A053\">" + list.get(i) + "</font>";
            } else if (count == 7) {
                result += "<font color=\"#FCE92D\">" + list.get(i) + "</font>";
            } else if (count == 6) {
                result += "<font color=\"#F3842D\">" + list.get(i) + "</font>";
            } else if (count == 5) {
                result += "<font color=\"#EB312E\">" + list.get(i) + "</font>";
            } else if (count == 4) {
                result += "<font color=\"#DB2358\">" + list.get(i) + "</font>";
            } else if (count == 3) {
                result += "<font color=\"#CA1687\">" + list.get(i) + "</font>";
            } else if (count == 2) {
                result += "<font color=\"#6F2891\">" + list.get(i) + "</font>";
            } else {
                result += "<font color=\"#137BC3\">" + list.get(i) + "</font>";
            }
        }
        return result;
    }
}
