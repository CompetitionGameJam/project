package com.example.xroms.main;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by xRoms on 31.03.2018.
 */

public class ToDoItem {


    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("isHost")
    private boolean mIsHost;

    @com.google.gson.annotations.SerializedName("gamestarted")
    private boolean mGameStarted;

    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    @com.google.gson.annotations.SerializedName("abase")
    private LatLng aBase;

    @com.google.gson.annotations.SerializedName("bbase")
    private LatLng bBase;

    @com.google.gson.annotations.SerializedName("lborder")
    private LatLng lBorder;

    @com.google.gson.annotations.SerializedName("rborder")
    private LatLng rBorder;

    @com.google.gson.annotations.SerializedName("position")
    private LatLng mPosition;


    public ToDoItem() {

    }

    @Override
    public String toString() {
        return getName();
    }

    public ToDoItem(String name, String id, boolean isHost, boolean gameStarted) {
        this.setName(name);
        this.setId(id);
        this.setIsHost(isHost);
        this.setGameStarted(gameStarted);
    }

    public void setPosition(LatLng pos) {
        mPosition = pos;
    }
    public LatLng getPosition() {return mPosition;}


    public void setaBase(LatLng base) {
        aBase = base;
    }
    public LatLng getaBase() {return aBase;}

    public void setbBase(LatLng base) {
        bBase = base;
    }
    public LatLng getbBase() {return bBase;}
    public void setlBorder(LatLng border) {
        lBorder = border;
    }
    public LatLng getlBorder() {return lBorder;}

    public void setrBorder(LatLng border) {
        rBorder = border;
    }
    public LatLng getrBorder() {return rBorder;}

    public void setGameStarted(boolean gameStarted) {
        mGameStarted = gameStarted;
    }

    public boolean getGameStarted() {
        return mGameStarted;
    }

    /**
     * Returns the item text
     */
    public String getName() {
        return mName;
    }

    /**
     * Sets the item text
     *
     * @param text text to set
     */
    public final void setName(String text) {
        mName = text;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean getIsHost() {
        return mIsHost;
    }

    public boolean isInMyRoom(String id) {
        return mId.equals(id);
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setIsHost(boolean complete) {
        mIsHost = complete;
    }

}