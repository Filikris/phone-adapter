package ua.pp.kris.phoneadapter;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String str = "Hey, I tried to call you yesterday on 0503456781, but nobody answered." +
                "Also called your work number +380674567843." +
                "I need to talk to you can you call me back on either 80635647832 or 0503456123." +
                "Thanks. Kristina +380635647832";

        Pattern pattern = Pattern.compile("(?:(\\+))?(?:(\\d+))?(\\d{10})");
        Matcher matcher = pattern.matcher(str);

        Set <String> phoneNumbers = new HashSet <>();

        while(matcher.find()){
            phoneNumbers.add("+38" + matcher.group(3));
        }

        System.out.println(phoneNumbers);

    }
}
