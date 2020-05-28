package com.rtbytez.common.comms.packets.info.response;

import com.rtbytez.common.comms.enums.ServerRole;
import com.rtbytez.common.comms.packets.RTPacket;

public class RTPInfoPeerInfo extends RTPacket {

    private final String id;
    private final int userId;
    private final ServerRole serverRole;

    public RTPInfoPeerInfo(String header, String id, int userId, ServerRole serverRole) {
        super(header);
        this.id = id;
        this.userId = userId;
        this.serverRole = serverRole;
    }

    public String getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public ServerRole getServerRole() {
        return serverRole;
    }
}
