package com.rtbytez.common.comms.packets.room.error;

import com.rtbytez.common.comms.packets.RTPacketError;

public class RTPRoomErrorAlreadyInARoom extends RTPacketError {
    public RTPRoomErrorAlreadyInARoom(String header) {
        super(header, "You are already in a room");
        setShortCode("RoomErrorAlreadyInARoom");
    }
}
