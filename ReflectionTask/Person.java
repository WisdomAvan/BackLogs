package ReflectionTask;

import java.util.ArrayList;

public class Person {

    private String name;
    private ArrayList<Problem> problems;

    public Person(String name) {
        this.name = name;
        this.problems = new ArrayList<>();
    }

    public void addProblem(Problem problem) {
        problems.add(problem);
    }

    public void solveProblem(String problemName) {

        for (Problem problem : problems) {

            if (problem.getName().equalsIgnoreCase(problemName)) {
                problem.solveProblem();
                System.out.println(problemName + " solved successfully.");
                return;
            }
        }

        System.out.println("Problem not found.");
    }

    public void recountUnsolvedProblems() {

        System.out.println("\nUnsolved Problems of " + name);
        boolean found = false;

        for (Problem problem : problems) {

            if (!problem.isSolved()) {

                System.out.println(problem);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No unsolved problems.");
        }
    }
}