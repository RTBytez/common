package com.rtbytez.common.comms.packets.room.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomRequestCreate extends RTPacket {
    public RTPRoomRequestCreate(String header) {
        super(header);
        setShortCode("RoomRequestCreate");
    }
}
