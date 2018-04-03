package com.jack.csci1660.exercise10;

/**
 * Created by brobst.30 on 3/27/18.
 *
 * Create a class to store contact information consisting of a name and email address.
 */
public class Contact {

    public String name;
    public String email;

    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    public String toString() {
        int ll = (this.name.length() + 6) > (this.email.length() + 7) ? (this.name.length() + 6) + 4 : (this.email.length() + 7) + 4;
        String bar = new String(new char[(ll + 4)]).replace("\0", "#");
        return String.format("%s\n# %s #\n# %s #\n%s", bar, padRight("Name: "+this.name, ll),
                padRight("Email: "+this.email, ll), bar);
    }

}
