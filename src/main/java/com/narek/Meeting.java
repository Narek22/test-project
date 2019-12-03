package com.narek;

import com.narek.annotation.InjectRandomDouble;
import lombok.ToString;

@ToString
public class Meeting {

    private Room room;

    // in hours
    @InjectRandomDouble(min=0, max=8)
    private int duration;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
