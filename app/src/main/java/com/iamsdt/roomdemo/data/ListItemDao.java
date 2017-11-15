package com.iamsdt.roomdemo.data;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ListItemDao {

    @Query("Select * From ListItem")
    LiveData<List<ListItem>> getListItem();


    @Query("Select * From ListItem where itemId =:itemId")
    LiveData<ListItem> getListItemByID(String itemId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertListItem(ListItem listItem);

    @Delete()
    void deleteListItem(ListItem listItem);
}
