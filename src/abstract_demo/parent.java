package abstract_demo;

public abstract class parent {
// you not  able to create final abs class
    // reason final mean no change and in abs class there is abs method then how it is possible to create final
    //and extend and implement or override the abs method. no, no, no, no common sense
    int age;


    // can not create abstract constructor because can not create object of abs class
    public parent(int age) {
        this.age = age;
    }

 //abs static method is not possible
   static void name(){
        System.out.println("Parent static non abs method");


   }

    void normalMethod(){
        System.out.println("im from normal");
    }
    abstract void city();
    abstract void carrier();





}
/* why not allowed abstract static in abs class
  once create abs static method in abs class then you cant featch the data using class you loosing static
  functionality

  not allowed abs contructor in abs class
  abs mean no body
  and you try to create abs constructor and use. basically abs mean no body. this combination giving you error
 */