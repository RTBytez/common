package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacketRequest;

public class RTPFileRequestRetrieve extends RTPacketRequest {
    private final String filePath;

    public RTPFileRequestRetrieve(String header, String filePath) {
        super(header);
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
