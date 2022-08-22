class Parent {
    String parent_name;
    int pid;

    public Parent(String parent_name, int pid){
        this.parent_name=parent_name;
        this.pid=pid;
    }

    public void ParentMethod(){
        System.out.println("This is parent method call!!!");
    }
}

class Child extends Parent {
    String child_name;
    int cid;

    public Child(String child_name, int cid, String parent_name, int pid){
        super(parent_name,pid); // constructor chaining 

        this.child_name=child_name;
        this.cid=cid;
    }

    public String makeName(){
        String full_name = this.child_name + " " + super.parent_name;

        return full_name;
    }

    public void ChildMethod(){
        System.out.println("This is child method");

        super.ParentMethod();
    }
}


public class Example2 {
    public static void main(String[] args) {
        Child c=new Child("John", 1, "Cena", 2);

        System.out.println(c.parent_name);
        System.out.println(c.makeName());
    }
}
