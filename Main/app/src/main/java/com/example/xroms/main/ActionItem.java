package com.example.xroms.main;

/**
 * Created by xRoms on 31.03.2018.
 */

public class ActionItem {



    @com.google.gson.annotations.SerializedName("roomid")
    private String mRoomId;

    @com.google.gson.annotations.SerializedName("ishost")
    private boolean mIsHost;

    @com.google.gson.annotations.SerializedName("name")
    private String mName;

    public ActionItem() {

    }

    @Override
    public String toString() {
        return getName();
    }

    public ActionItem(String name, String roomId, boolean isHost) {
        this.setName(name);
        this.setRoomId(roomId);
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
    public String getRoomId() {
        return mRoomId;
    }

    /**
     * Sets the item id
     *
     * @param id id to set
     */
    public final void setRoomId(String id) {
        mRoomId = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean getIsHost() {
        return mIsHost;
    }

    public boolean isInMyRoom(String roomId) {
        return mRoomId.equals(roomId);
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setIsHost(boolean complete) {
        mIsHost = complete;
    }

}