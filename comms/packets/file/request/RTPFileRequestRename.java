package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacket;

public class RTPFileRequestRename extends RTPacket {
    private final String oldPath;
    private final String newPath;

    public RTPFileRequestRename(String header, String oldPath, String newPath) {
        super(header);
        setShortCode("FileRequestRename");
        this.oldPath = oldPath;
        this.newPath = newPath;
    }

    public String getOldPath() {
        return oldPath;
    }

    public String getNewPath() {
        return newPath;
    }
}
