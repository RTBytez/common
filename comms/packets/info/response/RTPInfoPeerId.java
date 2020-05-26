package com.rtbytez.common.comms.packets.info.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoPeerId extends RTPacket {
    private final String id;

    public RTPInfoPeerId(String header, String id) {
        super(header);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
