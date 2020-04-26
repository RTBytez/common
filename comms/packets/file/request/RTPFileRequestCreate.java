package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestCreate extends RTPacket {
    private final String path;

    public RTPFileRequestCreate(String header, String path) {
        super(header);
        setShortCode("FileRequestCreate");
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
