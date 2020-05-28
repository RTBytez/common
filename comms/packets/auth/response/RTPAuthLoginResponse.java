package com.rtbytez.common.comms.packets.auth.response;

import com.rtbytez.common.comms.enums.LoginResponseCode;
import com.rtbytez.common.comms.packets.RTPacket;

public class RTPAuthLoginResponse extends RTPacket {

    private final LoginResponseCode code;

    public RTPAuthLoginResponse(String header, LoginResponseCode code) {
        super(header);
        this.code = code;
    }

    public LoginResponseCode getCode() {
        return code;
    }
}
