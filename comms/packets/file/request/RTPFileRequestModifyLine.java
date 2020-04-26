package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestModifyLine extends RTPacket {
    private final String path;
    private final String lineId;
    private final String text;

    public RTPFileRequestModifyLine(String header, String path, String lineId, String text) {
        super(header);
        setShortCode("FileRequestModifyLine");
        this.path = path;
        this.lineId = lineId;
        this.text = text;
    }

    public String getPath() {
        return path;
    }

    public String getLineId() {
        return lineId;
    }

    public String getText() {
        return text;
    }
}
