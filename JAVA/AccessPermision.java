import java.util.Scanner;

interface AccessControl{
    abstract String getRole();
    abstract int getAccessLevel();
    abstract boolean canAccess(int requiredLevel);
}
class Developer implements AccessControl{
    public String getRole(){
        return "Developer";
    }
    public int getAccessLevel(){
        return 1;
    }
    public boolean canAccess(int requiredLevel){
        return requiredLevel<=1;
    }
}
class Manager implements AccessControl{
    public String getRole(){
        return "Manager";
    }
    public int getAccessLevel(){
        return 2;
    }
    public boolean canAccess(int requiredLevel){
        return requiredLevel<=2;
    }
}
class Administrator implements AccessControl{
    public String getRole(){
        return "Administrator";
    }
    public int getAccessLevel(){
        return 3;
    }
    public boolean canAccess(int requiredLevel){
        return requiredLevel<=3;
    }
}
class AccessPermision{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==1){
            Developer d = new Developer();
            System.out.println("Role: "+d.getRole());
            System.out.println("Access Level: "+d.getAccessLevel());
            System.out.println("Can Access: "+d.canAccess(b));
        }
        else if(a==2){
            Manager d = new Manager();
            System.out.println("Role: "+d.getRole());
            System.out.println("Access Level: "+d.getAccessLevel());
            System.out.println("Can Access: "+d.canAccess(b));
        }
        else{
            Administrator d = new Administrator();
            System.out.println("Role: "+d.getRole());
            System.out.println("Access Level: "+d.getAccessLevel());
            System.out.println("Can Access: "+d.canAccess(b));
        }
    }
}
