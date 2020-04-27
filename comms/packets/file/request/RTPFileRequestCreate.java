package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestCreate extends RTPacket {
    private final String filePath;

    public RTPFileRequestCreate(String header, String filePath) {
        super(header);
        setShortCode("FileRequestCreate");
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
