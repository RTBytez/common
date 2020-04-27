package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestRemoveLine extends RTPacket {
    private final String filePath;
    private final String lineId;

    public RTPFileRequestRemoveLine(String header, String filePath, String lineId) {
        super(header);
        setShortCode("FileRequestRemoveLine");
        this.filePath = filePath;
        this.lineId = lineId;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLineId() {
        return lineId;
    }
}
