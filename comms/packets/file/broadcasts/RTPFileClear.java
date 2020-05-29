package com.rtbytez.common.comms.packets.file.broadcasts;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileClear extends RTPacket {
    private final String filePath;

    public RTPFileClear(String header, String filePath) {
        super(header);
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
