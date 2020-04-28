package com.rtbytez.common.comms.packets.room.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomRequestLeave extends RTPacket {
    public RTPRoomRequestLeave(String header) {
        super(header);
        setShortCode("RoomRequestLeave");
    }
}
