package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestModifyLine extends RTPacket {
    private final String filePath;
    private final String lineId;
    private final String text;

    public RTPFileRequestModifyLine(String header, String filePath, String lineId, String text) {
        super(header);
        setShortCode("FileRequestModifyLine");
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
