package com.rtbytez.common.comms.packets.info.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoSecret extends RTPacket {

    private final String secret;

    public RTPInfoSecret(String header, String secret) {
        super(header);
        this.secret = secret;
        setShortCode("InfoSecret");
    }

    public String getSecret() {
        return secret;
    }
}
