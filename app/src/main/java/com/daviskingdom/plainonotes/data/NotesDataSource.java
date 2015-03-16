package com.daviskingdom.plainonotes.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael on 3/17/2015.
 */
public class NotesDataSource {

    public List<NoteItem> findAll() {

        List<NoteItem> noteList = new ArrayList<>();
        NoteItem note = NoteItem.getNew();
        noteList.add(note);
        return noteList;
    }

    public boolean update(NoteItem note) {
        return true;
    }

    public boolean remove(NoteItem note) {
        return true;
    }
}
