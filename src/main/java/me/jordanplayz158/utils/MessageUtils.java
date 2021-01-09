package me.jordanplayz158.utils;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.utils.MarkdownUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class MessageUtils {
    public static User extractMention(String user) {
        try {
            Integer.parseInt(user.substring(0, 1));
            return User.fromId(user);
        } catch (NumberFormatException e) {
            return User.fromId(user.substring(3, user.length() - 1));
        }
    }

    public static String nameAndTag(User user) {
        return user.getName() + "#" + user.getDiscriminator();
    }

    public static String boldNameAndTag(User user) {
        return MarkdownUtil.bold(nameAndTag(user));
    }

    public static String getTime(String format) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
        return simpleDateFormat.format(new Date());
    }

    public static String upperCaseFirstLetter(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
}
