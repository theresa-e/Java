public class Project{
    private String name;
    private String description;
    private double initialCost;

    public String elevatorPitch(){
        return (this.name + ", " + this.description);
    }
    // Create a new project with no info
    public Project(){
    }

    // Create a new project with a name
    public Project(String name){
        this.name = name;
    }

    // Create a new project with name and description
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public double getInitialCost(){
        return this.initialCost;
    }

    public double setInitialCost(){
        return this.initialCost;
    }
}