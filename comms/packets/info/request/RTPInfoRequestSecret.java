package com.rtbytez.common.comms.packets.info.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoRequestSecret extends RTPacket {
    public RTPInfoRequestSecret(String header) {
        super(header);
        setShortCode("InfoRequestSecret");
    }
}
