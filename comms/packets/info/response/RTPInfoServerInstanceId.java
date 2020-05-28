package com.rtbytez.common.comms.packets.info.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoServerInstanceId extends RTPacket {
    private final String serverInstanceId;

    public RTPInfoServerInstanceId(String header, String serverInstanceId) {
        super(header);
        this.serverInstanceId = serverInstanceId;
    }

    public String getServerInstanceId() {
        return serverInstanceId;
    }
}
