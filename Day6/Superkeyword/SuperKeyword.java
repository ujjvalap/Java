
// // Acess the parenet Attribute using the Super keyword

// class Car{
//     String name="Alto";
// }


// class Brand extends Car{
//     String name="Toyota";
//      public void Display()
//     {   System.out.println(name);
//         System.out.print("The car Brand is : " + super.name);
//     }
// }
// /**
//  * SuperKeyword
//  */
// public class SuperKeyword {
//   public static void main(String[] args) {
//     Brand obj=new Brand();
//     obj.Display();
//   }
    
// }




// Acess the Method using the super keyword

// class Animal{
//     void animalSound()
//     {
//         System.out.println("Animal Sound");
//     }
// }

// class Dog extends  Animal{
//     void animalSound(){
//         System.out.println("The dog say : bow bow");
//         super.animalSound();
        
    
//     }
// }

// /**
//  * SuperKeyword
//  */
// public class SuperKeyword {

//     public static void main(String[] args) {
//         Dog d=new Dog();
//         d.animalSound();
//     }
// }



class  BankAccount{
    String AccountHolder;
    BankAccount( String AccountHolder)
    {
        this.AccountHolder=AccountHolder;
    }
    void DisplayDetails()
    {
        System.out.print("This Account Holder Detilas: " + AccountHolder);
    }

}

class SavingAccount extends BankAccount{

}