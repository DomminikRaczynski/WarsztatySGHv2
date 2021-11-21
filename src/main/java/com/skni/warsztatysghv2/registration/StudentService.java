package com.skni.warsztatysghv2.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private  UUIDStudentIdGenerator studentIdGenerator;
    private  StatusService statusService;
    private  ApplicationFormService applicationFormService;

    public void printStudent() {
        Student student = create(applicationFormService.createMock());
        System.out.println(student);
    }

    public Student create(ApplicationForm applicationForm) {
        String id = studentIdGenerator.getNext();
        String firstName = applicationForm.getFirstName();
        String lastName = applicationForm.getLastName();
        String email = applicationForm.getEmail();
        Status status = statusService.randomStatus();
        return new Student(id, firstName, lastName, email, status); // new allowed here
    }
    @Autowired
    public void setStudentIdGenerator(UUIDStudentIdGenerator studentIdGenerator) {
        this.studentIdGenerator = studentIdGenerator;
    }

    @Autowired
    public void setStatusService(StatusService statusService) {
        this.statusService = statusService;
    }

    @Autowired
    public void setApplicationService(ApplicationFormService applicationFormService) {
        this.applicationFormService= applicationFormService;
    }

}
