package com.company;

public class Main {

	static class Student {
        int numberTicket;
        String name, surname;
        int course;
        double averageGradeEconomics, averageGradeEnglish, averageGradeMath;
    }
    class StudentTest {
        public static void main(String[] args) {
            Student stud1 = new Student();
            stud1.numberTicket = 12131564;
            stud1.name = "Ivan";
            stud1.surname = "Ivanov";
            stud1.course = 1;
            stud1.averageGradeEconomics = 4.5;
            stud1.averageGradeEnglish = 3.1;
            stud1.averageGradeMath = 5;
            double averageGradeStud1 = (stud1.averageGradeEconomics + stud1.averageGradeEnglish + stud1.averageGradeMath) / 3;

            Student stud2 = new Student();
            stud2.numberTicket = 12315103;
            stud2.name = "Efim";
            stud2.surname = "Kobanov";
            stud2.course = 2;
            stud2.averageGradeEconomics = 3.5;
            stud2.averageGradeEnglish = 4.1;
            stud2.averageGradeMath = 4.5;
            double averageGradeStud2 = (stud2.averageGradeEconomics + stud2.averageGradeEnglish + stud2.averageGradeMath) / 3;

            Student stud3 = new Student();
            stud3.numberTicket = 150205949;
            stud3.name = "Egor";
            stud3.surname = "Petrov";
            stud3.course = 4;
            stud3.averageGradeEconomics = 4;
            stud3.averageGradeEnglish = 4.1;
            stud3.averageGradeMath = 4.9;
            double averageGradeStud3 = (stud3.averageGradeEconomics + stud3.averageGradeEnglish + stud3.averageGradeMath) / 3;

            System.out.println("Студент: " + stud1.name + " " + stud1.surname + ", средняя оценка: " + averageGradeStud1);
            System.out.println("Студент: " + stud2.name + " " + stud2.surname + ", средняя оценка: " + averageGradeStud2);
            System.out.println("Студент: " + stud3.name + " " + stud3.surname + ", средняя оценка: " + averageGradeStud3);
        }
    }
}
