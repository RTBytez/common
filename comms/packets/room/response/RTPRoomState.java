package com.rtbytez.common.comms.packets.room.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomState extends RTPacket {
    //TODO
    public RTPRoomState(String header) {
        super(header);
        setShortCode("RoomState");
    }
}
