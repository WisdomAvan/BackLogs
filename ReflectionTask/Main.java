package ReflectionTask;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Wisdom");

        Problem problem1 = new Problem(
                "School Fees",
                "Need money to pay tuition",
                ProblemType.EDUCATION
        );

        Problem problem2 = new Problem(
                "Farm Expansion",
                "Need capital for poultry expansion",
                ProblemType.BUSINESS
        );

        person.addProblem(problem1);
        person.addProblem(problem2);

        System.out.println("Before solving:");
        person.recountUnsolvedProblems();

        person.solveProblem("School Fees");

        System.out.println("\nAfter solving:");
        person.recountUnsolvedProblems();
    }
}