package com.jack.csci1660.exercise10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by brobst.30 on 3/27/18.
 *
 * Additionally, create a class to store a collection of contacts that implements the Iterable interface so that a
 * or-each loop can be used with the the collection class.
 */
public class ContactCollection implements Iterable<Contact> {

    private ArrayList<Contact> clist;

    public ContactCollection() {
        this.clist = new ArrayList<>();
    }

    public void add(Contact c) {
        this.clist.add(c);
    }

    @Override
    public Iterator<Contact> iterator() {
        return clist.iterator();
    }
}
