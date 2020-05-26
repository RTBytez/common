package com.rtbytez.common.comms.packets.room.request;

import com.rtbytez.common.comms.packets.RTPacketRequest;

public class RTPRoomRequestJoin extends RTPacketRequest {

    private final String roomId;
    private final String password;

    public RTPRoomRequestJoin(String header, String roomId, String password) {
        super(header);
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
