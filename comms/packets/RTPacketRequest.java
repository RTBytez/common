package com.rtbytez.common.comms.packets;

public abstract class RTPacketRequest extends RTPacket {
    public RTPacketRequest(String header) {
        super(header);
    }
}