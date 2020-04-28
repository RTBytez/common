package com.rtbytez.common.comms.packets.room.error;

import com.rtbytez.common.comms.packets.RTPacketError;

public class RTPRoomErrorDoesntExist extends RTPacketError {
    public RTPRoomErrorDoesntExist(String header) {
        super(header, "That room doesn't exist");
        setShortCode("RoomErrorDoesntExist");
    }
}
