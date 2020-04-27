package com.rtbytez.common.comms.packets.info.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoRequestPeerId extends RTPacket {
    public RTPInfoRequestPeerId(String header) {
        super(header);
        setShortCode("InfoRequestPeerId");
    }
}
