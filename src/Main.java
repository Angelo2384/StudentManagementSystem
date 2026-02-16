/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {

    public static void main(String[] args) {

        UndergraduateStudent undergrad =
                new UndergraduateStudent.Builder("U101", "John Doe")
                        .email("john@email.com")
                        .department("Computer Science")
                        .creditHours(15)
                        .scholarshipAmount(1000)
                        .build();

        GraduateStudent grad =
                new GraduateStudent.Builder("G201", "Jane Smith")
                        .email("jane@email.com")
                        .department("Engineering")
                        .researchAssistant(true)
                        .stipend(2000)
                        .build();

        undergrad.displayStudentDetails();
        grad.displayStudentDetails();
    }
}

