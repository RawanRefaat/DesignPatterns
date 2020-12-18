package CompositePattern;

import java.util.ArrayList;

public class Manager extends Component{

    ArrayList<Component> employeesList = new ArrayList<>();

    public void Manager(String fullName,int employeeID, ArrayList<Component> employeesList){
        Component(fullName,employeeID);
        this.employeesList = employeesList;
    }

    @Override
    public void addEmployee(Component employee){
        employeesList.add(employee);
    }

    @Override
    public void removeEmployee(Component employee){
        employeesList.remove(employee);
    }

    @Override
    public Component getChild(int i){
        return employeesList.get(i);

    }

    @Override
    public void operation(){

    }
}
