package com.rtbytez.common.comms.packets.generic.error;

import com.rtbytez.common.comms.packets.RTPacketError;

public class RTPErrorInvalidPacket extends RTPacketError {
    public RTPErrorInvalidPacket(String header) {
        super(header, "The supplied packet data was invalid");
    }
}
