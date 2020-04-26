package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestDelete extends RTPacket {

    private final String path;

    public RTPFileRequestDelete(String header, String path) {
        super(header);
        setShortCode("FileRequestDelete");
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
