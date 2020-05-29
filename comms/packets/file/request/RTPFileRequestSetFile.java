package com.rtbytez.common.comms.packets.file.request;

import com.rtbytez.common.comms.packets.RTPacketRequest;

import java.util.List;

public class RTPFileRequestSetFile extends RTPacketRequest {
    private final String filePath;
    private final List<String> lines;

    public RTPFileRequestSetFile(String header, String filePath, List<String> lines) {
        super(header);
        this.filePath = filePath;
        this.lines = lines;
    }

    public String getFilePath() {
        return filePath;
    }

    public List<String> getLines() {
        return lines;
    }
}
