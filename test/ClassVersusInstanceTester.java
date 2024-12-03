
public class ClassVersusInstanceTester {
 public static void main(String[] args) {
   System.out.println("Variables accessed by the object:");
   ClassVersusInstance myObj = new ClassVersusInstance();
   System.out.println("Private instance variable: " + myObj.privInstVar);
   System.out.println("Public instance variable: " + myObj.pubInstVar);
   System.out.println("Private class variable: " + myObj.privClassVar);
   System.out.println("Public class variable: " + myObj.pubClassVar);
   
   System.out.println("\nVariables accessed by the class:");
   System.out.println("Private instance variable: " + ClassVersusInstance.privInstVar);
   System.out.println("Public instance variable: " + ClassVersusInstance.pubInstVar);
   System.out.println("Private class variable: " + ClassVersusInstance.privClassVar);
   System.out.println("Public class variable: " + ClassVersusInstance.pubClassVar);
   
   System.out.println("\nMethods accessed by the object:");
   myObj.setAll();
   System.out.println("toString: " + myObj);   
   myObj.classSetAll();
   System.out.println("classToString: " + myObj.classToString());
   
   System.out.println("\nMethods accessed by the class:");
   ClassVersusInstance.setAll();
   System.out.println("toString: " + myObj);
   ClassVersusInstance.classSetAll();
   System.out.println("classToString: " + myObj.classToString());
   
 }
} 
