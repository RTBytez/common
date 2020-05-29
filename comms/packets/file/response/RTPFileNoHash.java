package com.rtbytez.common.comms.packets.file.response;

import com.rtbytez.common.comms.enums.NoHashReason;
import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileNoHash extends RTPacket {
    private final String filePath;
    private final NoHashReason reason;

    public RTPFileNoHash(String header, String filePath, NoHashReason reason) {
        super(header);
        this.filePath = filePath;
        this.reason = reason;
    }

    public String getFilePath() {
        return filePath;
    }

    public NoHashReason getReason() {
        return reason;
    }
}
