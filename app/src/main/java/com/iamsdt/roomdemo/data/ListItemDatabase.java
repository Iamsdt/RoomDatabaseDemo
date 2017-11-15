package com.iamsdt.roomdemo.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Shudipto Trafder Trafder on 11/15/2017.
 */

@Database(entities = {ListItem.class}, version = 1)
public abstract class ListItemDatabase extends RoomDatabase{

    public abstract ListItemDao listItemDao();

}
