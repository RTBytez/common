package com.rtbytez.common.comms.packets.file.response;

import com.rtbytez.common.comms.packets.RTPacket;

import java.util.List;

public class RTPFileList extends RTPacket {

    final List<String> fileList;

    public RTPFileList(String header, List<String> fileList) {
        super(header);
        this.fileList = fileList;
    }

    public List<String> getFileList() {
        return fileList;
    }
}
