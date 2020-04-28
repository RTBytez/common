package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestList extends RTPacket {
    public RTPFileRequestList(String header) {
        super(header);
        setShortCode("FileRequestList");
    }
}
