import service.ProjectManagement;
import service.impl.IProjectManagement;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ProjectManagement projectManagement = new IProjectManagement();
        projectManagement.management();

        }
    }
