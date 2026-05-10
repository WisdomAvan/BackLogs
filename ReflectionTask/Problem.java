package ReflectionTask;

public class Problem {

    private String name;
    private String description;
    private ProblemType type;
    private boolean isSolved;

    public Problem(String name, String description, ProblemType type) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.isSolved = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ProblemType getType() {
        return type;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void solveProblem() {
        isSolved = true;
    }

    @Override
    public String toString() {
        return "Problem Name: " + name +
                "\nDescription: " + description +
                "\nType: " + type +
                "\nSolved: " + isSolved;
    }
}