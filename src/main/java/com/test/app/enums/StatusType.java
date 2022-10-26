package com.test.app.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Brume
 **/
@RequiredArgsConstructor
public enum StatusType {
    I("Incomplete"), C("Complete"), S("Submitted"), AP("Approve"), RJ(" Rejected");
    @Getter
    private final String status;
}
