package com.rtbytez.common.comms.packets.auth.request;

import com.rtbytez.common.comms.packets.RTPacketRequest;

public class RTPAuthRequestLogin extends RTPacketRequest {

    private final String username;
    private final String passwordHash;

    public RTPAuthRequestLogin(String header, String username, String passwordHash) {
        super(header);
        this.username = username;
        this.passwordHash = passwordHash;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
