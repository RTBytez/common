package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestAddLine extends RTPacket {
    private final String filePath;
    private final int lineNumber;

    public RTPFileRequestAddLine(String header, String filePath, int lineNumber) {
        super(header);
        setShortCode("FileRequestAddLine");
        this.filePath = filePath;
        this.lineNumber = lineNumber;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}
