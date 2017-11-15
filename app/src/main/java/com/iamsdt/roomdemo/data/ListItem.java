package com.iamsdt.roomdemo.data;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ListItem {


    //complete 56 min

    @PrimaryKey
    private String itemId;
    private String message;
    private int colorResource;

    ListItem(String itemId , String message, int colorResource) {
        this.itemId = itemId;
        this.message = message;
        this.colorResource = colorResource;
    }

    public int getColorResource() {
        return colorResource;
    }

    public void setColorResource(int colorResource) {
        this.colorResource = colorResource;
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
