package com.skni.warsztatysghv2.registration;

import java.util.UUID;

public class UUIDStudentIdGenerator {
    public String getNext() {
        return UUID.randomUUID().toString();
    }
}
