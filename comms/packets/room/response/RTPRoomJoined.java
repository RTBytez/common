package com.rtbytez.common.comms.packets.room.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomJoined extends RTPacket {
    private final String roomId;

    public RTPRoomJoined(String header, String roomId) {
        super(header);
        setShortCode("RoomJoined");
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }
}
