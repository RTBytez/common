package com.rtbytez.common.comms.packets.file.response;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileHash extends RTPacket {

    private final String filePath;
    private final String hash;

    public RTPFileHash(String header, String filePath, String hash) {
        super(header);
        this.filePath = filePath;
        this.hash = hash;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getHash() {
        return hash;
    }
}
