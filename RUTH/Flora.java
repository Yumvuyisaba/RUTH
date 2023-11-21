class Flora{
void smell(){System.out.println("breathing...");}
}
class rose extends Flora{
void call(){System.out.println("calling...");}
}
class TestInheritance{
public static void main(String[] args){
rose d=new rose();
d.call();
d.smell();
}}