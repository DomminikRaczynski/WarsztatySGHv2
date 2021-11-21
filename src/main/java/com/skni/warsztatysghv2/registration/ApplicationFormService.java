package com.skni.warsztatysghv2.registration;

public class ApplicationFormService {
    public ApplicationForm createMock() {
        return new ApplicationForm("Mikolaj", "Zimkowski", "email@gmail.com"); // new allowed here
    }
}
