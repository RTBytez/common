package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestRetrieve extends RTPacket {
    private final String filePath;

    public RTPFileRequestRetrieve(String header, String filePath) {
        super(header);
        setShortCode("FileRequestRetrieve");
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
