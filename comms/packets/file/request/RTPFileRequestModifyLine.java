package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacketRequest;

public class RTPFileRequestModifyLine extends RTPacketRequest {
    private final String filePath;
    private final String lineId;
    private final String text;

    public RTPFileRequestModifyLine(String header, String filePath, String lineId, String text) {
        super(header);
        this.filePath = filePath;
        this.lineId = lineId;
        this.text = text;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getLineId() {
        return lineId;
    }

    public String getText() {
        return text;
    }
}
