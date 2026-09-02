class employee{
    String name;
    int salary;
    employee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }
}
class developer extends employee{
    String language;
    developer(String name,int salary,String language){
        super(name,salary);
        this.language=language;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("Language:"+language);
    }
}
class tester extends developer{
    String testingtool;
    tester(String name,int salary,String language,String testingtool){
        super(name,salary,language);
        this.testingtool=testingtool;
    }
    void display(){
        System.out.println("--------------------------");
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
        System.out.println("Language:"+language);
        System.out.println("Testingtool:"+testingtool);
        System.out.println("--------------------------");
    }
}
class Main{
    public static void main(String[]args){
        developer D=new developer("yuva",12000,"tamil");
        tester T=new tester("Arun",5000,"english","postman");
        D.display();
        T.display();
    }
}