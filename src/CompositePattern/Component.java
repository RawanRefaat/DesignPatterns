package CompositePattern;

public abstract class Component{

   String fullName;
   int employeeID;

   public void Component(String fullName,int employeeID){
      this.fullName = fullName;
      this.employeeID = employeeID;
   }

   public void addEmployee(Component employee){
      throw new UnsupportedOperationException();
   }

   public void removeEmployee(Component employee){
      throw new UnsupportedOperationException();
   }

   public Component getChild(int i){
      throw new UnsupportedOperationException();
   }

   abstract void operation();
}
