public class Main {
    //tek yönlü doğrusal liste  singly linked list
    public static void main(String[] args){
 LinkedLists liste= new LinkedLists();
 liste.addbegin(20);
 liste.addbegin(50);
 liste.addbegin(15);
 liste.addbegin(10);
 liste.addbegin(5);
 liste.addlast(25);
 liste.addlast(30);
liste.arayaekle(2,51);
liste.arayaekle(0,1);
liste.arayaekle(8,89);
liste.bastansil();
liste.sondansil();
liste.aradansil(1);
liste.aradansil(5);
liste.aradansil(6);
liste.print();

    }
}