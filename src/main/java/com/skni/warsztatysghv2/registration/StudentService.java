package com.skni.warsztatysghv2.registration;

public class StudentService {

    private final UUIDStudentIdGenerator studentIdGenerator = new UUIDStudentIdGenerator();
    private final StatusService statusService = new StatusService();
    private final ApplicationFormService applicationFormService = new ApplicationFormService();

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

}
