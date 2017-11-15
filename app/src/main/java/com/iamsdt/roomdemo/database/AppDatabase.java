package com.iamsdt.roomdemo.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.iamsdt.roomdemo.dao.CategoryDao;
import com.iamsdt.roomdemo.dao.NoteDao;
import com.iamsdt.roomdemo.domain.Category;
import com.iamsdt.roomdemo.domain.Note;

/**
 * @author acampbell
 */
@Database(exportSchema = false, entities = {Note.class, Category.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DB_NAME = "app_db";

    public abstract NoteDao getNoteDao();

    public abstract CategoryDao getCategoryDao();

}
