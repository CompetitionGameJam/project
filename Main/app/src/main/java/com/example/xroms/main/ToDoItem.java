package com.example.xroms.main;

/**
 * Created by xRoms on 31.03.2018.
 */

public class ToDoItem {


    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("ishost")
    private boolean mIsHost;

    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    public ToDoItem() {

    }

    @Override
    public String toString() {
        return getName();
    }

    public ToDoItem(String name, String id, boolean isHost) {
        this.setName(name);
        this.setId(id);
        this.setIsHost(isHost);
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