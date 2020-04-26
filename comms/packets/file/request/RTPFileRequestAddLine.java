package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestAddLine extends RTPacket {
    private final String path;
    private final int lineNumber;

    public RTPFileRequestAddLine(String header, String path, int lineNumber) {
        super(header);
        setShortCode("FileRequestAddLine");
        this.path = path;
        this.lineNumber = lineNumber;
    }

    public String getPath() {
        return path;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
