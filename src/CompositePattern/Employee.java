package CompositePattern;


public class Employee extends Component{


    public void Manager(String fullName,int employeeID){
        Component(fullName,employeeID);
    }

    @Override
    public void operation(){
        System.out.println("Employee(leaf) name: " + fullName +", Employee ID: " + employeeID);
    }
}
