package com.iamsdt.roomdemo.data;

import android.arch.lifecycle.LiveData;

import java.util.List;

import javax.inject.Inject;

/**
 * Created by Shudipto Trafder on 11/15/2017.
 */

public class ListItemRepository {

    private final ListItemDao listItemDao;

    @Inject
    public ListItemRepository (ListItemDao listItemDao){
        this.listItemDao = listItemDao;
    }

    public LiveData<List<ListItem>> getListOfData(){
        return listItemDao.getListItem();
    }

    public LiveData<ListItem> getListItem(String itemId){
        return listItemDao.getListItemByID(itemId);
    }

    public void deleteListItem(ListItem listItem){
        listItemDao.deleteListItem(listItem);
    }

    public long insertListItem(ListItem listItem){
        return listItemDao.insertListItem(listItem);
    }


}
