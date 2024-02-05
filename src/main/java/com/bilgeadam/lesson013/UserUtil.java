package com.bilgeadam.lesson013;

public class UserUtil {

    private static final String emailFormat = "@xbanka.com";

    public static String generateEmail(String name, String surname) {
        String[] names = name.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String as : names) {
            stringBuilder.append(as.toLowerCase());
            stringBuilder.append(".");
        }
        stringBuilder.append(surname.toLowerCase());
        stringBuilder.append("@xbanka.com");
        return stringBuilder.toString();
    }

    public static void generetaAutoEmail(User user) {
        user.setEmail(
                user.getName().toLowerCase().trim().replace(" ", ".") + '.' + user.getSurname().toLowerCase() + emailFormat);
        //mehmet.yardimci.yardimci@xbanka.com
    }

}
