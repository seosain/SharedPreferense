package com.example.sharedpraferance1;

import com.example.allvina.notes_app.models.Note;
import com.example.allvina.notes_app.models.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    private static List<User> users;
    private static List<Note> notes;

    static {
        users = new ArrayList<>();
        users.add(new User("alvina", "rahasia"));
        users.add(new User("zolema", "rahasia"));
        users.add(new User("salafi", "rahasia"));

        notes = new ArrayList<>();
        notes.add(new Note("Bismilah", new Date(), "sdcbsdc jdcsjdc cjdncjdcnjdc sjcnjcjsnsjnsjcnjcnjsncjsnc sjcnjcnsjcnsjcn almkaljsdm"));
        notes.add(new Note("Kuliah", new Date(), "acacshdcbdh djscncjs cjsbdchbd jdascnac sadcnjanclan skacnjdncjdcnjdna jadscnlc"));
        notes.add(new Note("Ibadah", new Date(), "scbakhbchac acnlajncaj akcnjalsncjanc asklcnjlasncjsc kascnanclan askcnascnsjcnncan"));
        notes.add(new Note("Sukses", new Date(), "acbbc askcjancj cashjcbahjscbhj asjlcnlancan alcjljacjasc jacbajsbchabc sajcajcbajbcbacab"));
    }

    public static List<User> getUsers() {
        return users;
    }

    public static List<Note> getNotes() {
        return notes;
    }
}
