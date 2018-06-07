public class ProjectTest{
    public static void main(String[] args){

        Project newProject1 = new Project();
        System.out.println("newProject1: " + newProject1.getClass());
        Project newProject2 = new Project("Second Project");
        System.out.println("newProject2 name: " + newProject2.getName());
        Project newProject3 = new Project("Third Project", "Description for Third project");
        System.out.println("newProject3 name: " + newProject3.getName());
        System.out.println("newProject3 description: " + newProject3.getDescription());
    }
}