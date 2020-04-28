package com.rtbytez.common.comms.packets.room.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomRequestJoin extends RTPacket {

    private final String roomId;
    private final String password;

    public RTPRoomRequestJoin(String header, String roomId, String password) {
        super(header);
        setShortCode("RoomRequestJoin");
        this.roomId = roomId;
        this.password = password;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getPassword() {
        return password;
    }
}
