package com.rtbytez.common.comms.packets.file.error;

import com.rtbytez.common.comms.packets.RTPacketError;

public class RTPFileErrorDoesntExist extends RTPacketError {

    public RTPFileErrorDoesntExist(String header) {
        super(header, "The file doesnt exist");
    }
}