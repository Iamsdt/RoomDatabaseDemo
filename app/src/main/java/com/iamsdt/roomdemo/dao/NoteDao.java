package com.iamsdt.roomdemo.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.iamsdt.roomdemo.domain.CategoryNote;
import com.iamsdt.roomdemo.domain.Note;

import java.util.List;

/**
 * @author acampbell
 */
@Dao
public interface NoteDao {

    @Insert
    void insertAll(Note Notes);

    @Update
    void updateAll(Note Notes);

    @Query("SELECT * FROM Note")
    List<Note> getAll();

    @Query("SELECT Note.id, Note.title, Note.description, category.name as categoryName " +
            "FROM Note " +
            "LEFT JOIN category ON Note.category_id = category.id")
    List<CategoryNote> getCategoryNotes();

    @Query("SELECT Note.id, Note.title, Note.description, Note.category_id " +
            "FROM Note " +
            "LEFT JOIN category ON Note.category_id = category.id " +
            "WHERE Note.id = :NoteId")
    CategoryNote getCategoryNote(long NoteId);

    @Delete
    void deleteAll(Note... Notes);
}
