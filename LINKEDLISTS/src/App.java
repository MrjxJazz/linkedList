import java.util.Scanner;

public class App {
    private List lst;
    private String menu;
    private int info = 11;
    private int initialInfo = 0;
    private Scanner sc;





public App(){
    this.lst = new List();
    this.sc = new Scanner(System.in);
    this.menu =
      "Listas enlazadas simple \n" +
      "1. Crear lista \n"+
      "2. Imprimir lista \n"+
      "3. Agregar nodos al inicio \n"+
      "4. Agregar nodos al final \n"+
      "5. Buscar nodo \n"+
      "6. Borrar nodo inicial \n"+
      "7. Borrar nodo final \n"+
      "8. Salir \n";



}

//Swith del menu

int number = 0;

public void displayMenu(){
    do{
        System.out.println(menu);
        number = sc.nextInt();
        switch (number){
            case 1: createList();break;
            case 2: System.out.println(this.lst.print());break;
            case 3: unshiftnode();break;
            case 4: pushNode();break;
            case 5: searchNode();break;
            case 6: shiftNode();break;
            case 7: popNode();break;
            case 8: System.out.println("ADIos");break;
            default: System.out.println("Opcion Incorrecta");break;
        }
    }while (number != 8);
}



//Crear lista

public void createList(){
    this.lst = new List();
    for (int info=1; info <=10; info ++)
    this.lst.push(info);
    System.out.println(this.lst.print()); 
}

//Implemenntacion de datos 
//unshiftnode = agrega al inicio un nuevo nodo 

public void unshiftnode(){
    this.lst.unshift(initialInfo);
    --initialInfo;
    System.out.println(this.lst.print());
}

public void pushNode(){
    info ++;
    this.lst.push(info);
    System.out.println(this.lst.print());
}





//Buscar nodo

public void searchNode(){
    int n = 0;
    System.out.println("Digita un numero a buscar");
    n = sc.nextInt();
    if(this.lst.search(n)){
        System.out.println("Valor encontrado");
    }else {
         System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());


    

}


//shiftNode
//
public void shiftNode(){
    if (this.lst.shift()){
        System.out.println("Nodo eliminado");
    }else{
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
    
}

//popNode
public void popNode(){
    if (this.lst.pop()){
        System.out.println("Nodo eliminado");
    }else{
        System.out.println("Valor no encontrado");
    }
    System.out.println(this.lst.print());
    
}

public static void main(String[] args)throws Exception {
    App list = new App();
    list.displayMenu();
    
}

    
}



































