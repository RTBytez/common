package com.rtbytez.common.comms.packets.room.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomRequestState extends RTPacket {
    public RTPRoomRequestState(String header) {
        super(header);
        setShortCode("RoomRequestState");
    }
}
