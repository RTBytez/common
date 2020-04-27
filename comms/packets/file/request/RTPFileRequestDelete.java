package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestDelete extends RTPacket {

    private final String filePath;

    public RTPFileRequestDelete(String header, String filePath) {
        super(header);
        setShortCode("FileRequestDelete");
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
