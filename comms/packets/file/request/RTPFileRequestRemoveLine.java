package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestRemoveLine extends RTPacket {
    private final String path;
    private final String lineId;

    public RTPFileRequestRemoveLine(String header, String path, String lineId) {
        super(header);
        setShortCode("FileRequestRemoveLine");
        this.path = path;
        this.lineId = lineId;
    }

    public String getPath() {
        return path;
    }

    public String getLineId() {
        return lineId;
    }
}
