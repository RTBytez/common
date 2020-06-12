package com.rtbytez.common.comms.packets.room.broadcasts;

import com.rtbytez.common.comms.enums.RoomRole;
import com.rtbytez.common.comms.packets.RTPacket;

public class RTPRoomRoleChange extends RTPacket {

    private final String roomId;
    private final String peerId;
    private final String peerUsername;
    private final RoomRole role;

    public RTPRoomRoleChange(String header, String roomId, String peerId, String peerUsername, RoomRole role) {
        super(header);
        this.roomId = roomId;
        this.peerId = peerId;
        this.peerUsername = peerUsername;
        this.role = role;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getPeerId() {
        return peerId;
    }

    public String getPeerUsername() {
        return peerUsername;
    }

    public RoomRole getRole() {
        return role;
    }
}
