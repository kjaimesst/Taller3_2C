package co.edu.udes.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kamila
 */
public class CajaRegistradora {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> storageEmpl = new ArrayList();
        ArrayList<String> storageClie = new ArrayList();
        ArrayList<String> storageSupp = new ArrayList();
        ArrayList<String> storageProd = new ArrayList();
        
        String x="";
        int y=0, submenu=0;
        boolean infinity = true;
        
        while(infinity==true){
            
            System.out.println("Caja registradora");
            System.out.println("1.Empleado");
            System.out.println("2.Cliente");
            System.out.println("3.Proveedor"); 
            System.out.println("4.Producto");
            System.out.println("5.Salir");           
            y=keyboard.nextInt();
            
            if (y==5){
                System.out.println("");
                System.exit(0);
            }
            
            for(int h=0; h<y; h++){
                  if(h==0 && h==(y-1)){ 
                   x="Empleado";
                  } else if(h==1 && h==(y-1)){
                   x="Cliente";
                  }else if(h==2 && h==(y-1)){ 
                   x="Proveedor";
                  }else if(h==3 && h==(y-1)){ 
                   x="Producto";
                  }
            }
        
            submenu=Submenu(keyboard, x);
        
            switch(submenu){
                case 1:
                    if(x.equals("Empleado")){
                        storageEmpl=Add(storageEmpl, keyboard, x);
                        
                    }else if(x.equals("Cliente")){
                        storageClie=Add(storageClie, keyboard, x);
                        
                    }else if(x.equals("Proveedor")){
                        storageSupp=Add(storageSupp, keyboard, x);
                        
                    }else if(x.equals("Producto"))
                        storageProd=Add(storageProd, keyboard, x);
                    
                    break;
                
                case 2:
                    if(x.equals("Empleado")){
                        storageEmpl=Delete(storageEmpl, keyboard, x);
                        
                    }else if(x.equals("Cliente")){
                        storageClie=Delete(storageClie, keyboard, x);
                        
                    }else if(x.equals("Proveedor")){
                        storageSupp=Delete(storageSupp, keyboard, x);
                             
                    }else if(x.equals("Producto"))
                        storageProd=Delete(storageProd, keyboard, x);
                       
                    
                    break;
                
                case 3:
                    if(x.equals("Empleado")){
                        Show(storageEmpl);
                        
                    }else if(x.equals("Cliente")){
                        Show(storageClie);
                        
                    }else if(x.equals("Proveedor")){
                        Show(storageSupp);
                        
                    }else if(x.equals("Producto"))
                        Show(storageProd);

                    
            
            }
      
        }        
          
    }
    public static int Submenu(Scanner keyboard, String x){
        System.out.println("Submenú: "+x);
        System.out.println("1.Agregar "+x);
        System.out.println("2.Eliminar "+x);
        System.out.println("3.Ver "+x);
        System.out.println("4.Salir");
        return keyboard.nextInt();  
    }
    public static ArrayList Add(ArrayList storage,Scanner keyboard, String x){ 
    int cycles=0;   
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){   
        int aux =0, age=0;
        boolean contract=false, member=false, active=false;
        String post="", initialDay="", finalDay="";
        double salary=0, price=0;
        
        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre: ");
        String name=keyboard.next();
        System.out.print("C.C: ");
        String ID = keyboard.next();
        
        if(x.equals("Producto")){
               System.out.print("Precio: ");
               price = keyboard.nextInt();
        }
    
    if(x.equals("Cliente") || x.equals("Empleado")){     
            System.out.print("Edad: ");
            age = keyboard.nextInt();
          
           if(x.equals("Empleado")){ 
             System.out.print("Cargo: ");
             post = keyboard.next();
             System.out.print("Salario: ");
             salary = keyboard.nextDouble();
             System.out.println("Jornada laboral inicial: ");
             initialDay=keyboard.next();
             System.out.println("Jornada laboral final: ");
             finalDay = keyboard.next(); 

             do{
             System.out.println("1.Activo");
             System.out.println("2.Suspendido");
             aux = keyboard.nextInt();
             if(aux==1){
              contract = true;
             }else if(aux==2){
              contract = false;    
             }else{
                 System.out.println("Vuelve a intentarlo");
             }
             }while(aux!=1 && aux!=2);
           }

           if(x.equals("Cliente")){
             do{
             System.out.println("Miembro: ");
             System.out.println("1.Activo");
             System.out.println("2.No es miembro");
             aux = keyboard.nextInt();
             if(aux==1){
              active = true;
             }else if(aux==2){
              active = false;    
             }else{
                 System.out.println("Vuelve a intentarlo");
             }
             }while(aux!=1 && aux!=2);
           }

           if(x.equals("Proveedor")){
             do{
             System.out.println("El proveedor se encuentra: ");
             System.out.println("1.Activo");
             System.out.println("2.Inactivo");
             aux = keyboard.nextInt();
             if(aux==1){
              member = true;
             }else if(aux==2){
              member = false;    
             }else{
                 System.out.println("Vuelve a intentarlo");
             }
             }while(aux!=1 && aux!=2);
           }           
          
           
           if(x.equals("Empleado")){
            Employee myEmployee = new Employee(post, salary, initialDay, finalDay, contract, name, ID, age); 
            storage.add(myEmployee);

           }else if(x.equals("Cliente")){
             Client myClient = new Client(member, name, ID, age);
             storage.add(myClient);

           }else if(x.equals("Proveedor")){
             Supplier mySupplier = new Supplier(name, ID, active);
             storage.add(mySupplier);
           }    
    }    
        if(x.equals("Producto")){
                Product myProduct = new Product(name, price, ID);
                storage.add(myProduct);
        }  
    }  
    
    
     return storage; 
   }
    
    public static void Show(ArrayList storage){
       System.out.println("");
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la poscicion "+i+" se encuentra: "+storage.get(i));
       }
   }
   
    public static ArrayList Delete(ArrayList storage, Scanner keyboard, String x){
       System.out.println("Que desear remover? "+x);
       int i=keyboard.nextInt();
       storage.remove(i);
       
       return storage;
   }
    
}
