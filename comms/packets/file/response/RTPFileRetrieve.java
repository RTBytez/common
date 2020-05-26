package com.rtbytez.common.comms.packets.file.response;

import com.rtbytez.common.comms.bundles.LineBundle;
import com.rtbytez.common.comms.packets.RTPacket;

import java.util.List;

public class RTPFileRetrieve extends RTPacket {

    private final String roomId;
    private final String filePath;
    private final String hash;
    private final List<LineBundle> lines;

    public RTPFileRetrieve(String header, String roomId, String filePath, String hash, List<LineBundle> lines) {
        super(header);
        this.hash = hash;
        this.lines = lines;
        this.roomId = roomId;
        this.filePath = filePath;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getHash() {
        return hash;
    }

    public List<LineBundle> getLines() {
        return lines;
    }
}