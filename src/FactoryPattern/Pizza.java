package FactoryPattern;

public abstract class Pizza {
        String name;

        public void prepare(){
            System.out.println("Preparing is done");
        }

        public void bake(){
            System.out.println("Baking is done");
        }

        public void box(){
            System.out.println("Boxing is done");
        }

}
