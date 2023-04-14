package co.edu.udes.taller3.Cine;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Kamila
 */
public class CajaRegistradora {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        ArrayList<String> storageEmployee = new ArrayList();
        ArrayList<String> storageClient = new ArrayList();
        ArrayList<String> storageMovie = new ArrayList();
        ArrayList<String> storageFunction = new ArrayList();
        ArrayList<String> storageHall = new ArrayList();
        ArrayList<String> storageProduct = new ArrayList();

        String x="";
        int y=0, submenu;
        boolean infinity = true;
        
        while(infinity==true){
            System.out.println("Caja Registradora");
            System.out.println("1.Empleados");
            System.out.println("2.Funciones");
            System.out.println("3.Peliculas"); 
            System.out.println("4.Salas");
            System.out.println("5.Cliente");
            System.out.println("6.Producto");
            System.out.println("7.Salir");
            
            y=keyboard.nextInt();
            
            if (y==7){
                System.out.println("Cinelandia lo mejor");
              System.exit(0);
            }
            
            for(int h=0; h<y; h++){  //h 0,

                  if(h==0 && h==(y-1)){ 
                   x="Empleado";
                  } else if(h==1 && h==(y-1)){
                   x="Funcion";
                  }else if(h==2 && h==(y-1)){ 
                   x="Pelicula";
                  }else if(h==3 && h==(y-1)){ 
                   x="Sala";
                  }else if(h==4 && h==(y-1)){ 
                   x="Cliente";
                  }else if(h==5 && h==(y-1)){
                   x="Producto";
                  }
            }
        
            submenu=Submenu(keyboard, x);
        
            switch(submenu){
                case 1:
                    if(x.equals("Empleado")){
                        storageEmployee=Add(storageEmployee, keyboard, x);
                        
                    }else if(x.equals("Cliente")){
                        storageClient=Add(storageClient, keyboard, x);
                        
                    }else if(x.equals("Pelicula")){
                        storageMovie=AddFunction(storageMovie, keyboard, x);
                        
                    }else if(x.equals("Funcion")){
                        storageFunction=AddFunction(storageFunction, keyboard, x);
                        
                    }else if(x.equals("Sala")){
                        storageHall=AddFinal(storageHall, keyboard, x);
                        
                    }else if(x.equals("Producto"))
                        storageProduct=AddFinal(storageProduct, keyboard, x);
                    
                    break;
                
                case 2:
                    if(x.equals("Empleado")){
                        storageEmployee=Delete(storageEmployee, keyboard, x);
                        
                    }else if(x.equals("Cliente")){
                        storageClient=Delete(storageClient, keyboard, x);
                        
                    }else if(x.equals("Pelicula")){
                        storageMovie=Delete(storageMovie, keyboard, x);
                        
                    }else if(x.equals("Funcion")){
                        storageFunction=Delete(storageFunction, keyboard, x);
                        
                    }else if(x.equals("Sala")){
                        storageHall=Delete(storageHall, keyboard, x);
                        
                    }else if(x.equals("Producto"))
                        storageProduct=Delete(storageProduct, keyboard, x);
                    
                    break;
                
                case 3:
                    if(x.equals("Empleado")){
                        Show(storageEmployee);
                        
                    }else if(x.equals("Cliente")){
                        Show(storageClient);
                        
                    }else if(x.equals("Pelicula")){
                        Show(storageMovie);
                        
                    }else if(x.equals("Funcion")){
                        Show(storageFunction);
                        
                    }else if(x.equals("Sala")){
                        Show(storageHall);
                        
                    }else if(x.equals("Producto"))
                        Show(storageProduct);
            }
        
        }   
    }
            
   public static int Submenu(Scanner keyboard, String x){
        System.out.println("Submenu:  "+x);
        System.out.println("Que le gustaria hacer el dia de hoy?");
        System.out.println("1.Agregar "+x);
        System.out.println("2.Eliminar "+x);
        System.out.println("3.Ver "+x);
        System.out.println("4.Salir");
        return keyboard.nextInt();  
        
    }
    
    /**
     *
     * @param storage
     * @param keyboard
     * @param x
     * @return
     */
    public static ArrayList Add(ArrayList storage,Scanner keyboard, String x){ 
    int cycles=0;   
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){   
        int aux =0;
        boolean contract=false, member=false;
        String post="", initialTime="", finalTime="";
        double salary=0;

        System.out.println("Ingrese los siguientes datos: ");
        System.out.print("Nombre: ");
        String name=keyboard.next();
        System.out.print("C.C: ");
        String ID = keyboard.next();
        System.out.print("Edad: ");
        int age = keyboard.nextInt();

       if(x.equals("Empleado")){ 
         System.out.print("Cargo: ");
         post = keyboard.next();
         System.out.print("Salario: ");
         salary = keyboard.nextDouble();
         System.out.println("Inicio de Jornada: ");
         initialTime=keyboard.next();
         System.out.println("Fin de jornada: ");
         finalTime = keyboard.next(); 

        

       if(x.equals("Cliente")){
         do{
         System.out.println("Registro ");
         System.out.println("1.Registrado");
         System.out.println("2.No esta registrado");
         aux = keyboard.nextInt();
         if(aux==1){
          member = true;
         }else if(aux==2){
          member = false;    
         }else{
             System.out.println("Ingrese de nuevo");
         }
         }while(aux!=1 && aux!=2);
       }


       if(x.equals("Empleado")){
        Employee myEmployee = new Employee(post, salary, initialTime, finalTime, name, ID, age); 
        storage.add(myEmployee);

       }else if(x.equals("Cliente")){
         Client myClient = new Client(member, name, ID, age);
         storage.add(myClient);

       }
    }  
     return storage; 
   }
   
    public static ArrayList AddFunction( ArrayList storage, Scanner keyboard, String x){
    int cycles=0;
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){    
       
       System.out.println("Rellene acontinuacion:");
       System.out.print("Nombre de la pelicula: ");
       String name=keyboard.next();
       System.out.println("Fecha de Estreno: ");
       String releaseDate = keyboard.next();
       System.out.println("Genero: ");
       String gender = keyboard.next();
       
       
       Movie myMovie= new Movie(name, releaseDate, gender);
       
       if(x.equals("Funcion")){
        System.out.print("#Sala: ");
        String numberHall = keyboard.next();
        System.out.println("Horario: ");
        String schedule = keyboard.next();
        System.out.print("Precio: ");
        double priceTicket = keyboard.nextDouble();
        Function myFunction = new Function(myMovie, numberHall, schedule, priceTicket);
        storage.add(myFunction);
       }
       storage.add(myMovie);
    }   
    return storage;
   }
    
   public static ArrayList AddFinal(ArrayList storage, Scanner keyboard, String x){
    int cycles=0;
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){    
       System.out.println("Rellene: "+x);
       System.out.print("Nombre: ");
       String name=keyboard.next();
       
      if(x.equals("Sala")){
       System.out.print("Cantidad de sillas: ");
       int capacity = keyboard.nextInt();
       System.out.println("Tipo de sala: ");
       String typeHall = keyboard.next();
       Hall myHall= Hall(name, capacity, typeHall);
       storage.add(myHall);
      }else{
          System.out.print("Precio: ");
          double priceProd = keyboard.nextDouble();
          System.out.print("C.C: ");
          String idProd = keyboard.next();
          Product myProduct = new Product(name, priceProd, idProd);
          storage.add(myProduct);
      }
       
    }
    return storage;
   }
   
   public static void Show(ArrayList storage){
       System.out.println("");
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la poscicion "+i+" se encuentra: \n"+storage.get(i));
       }
   }
   
   public static ArrayList Delete(ArrayList storage, Scanner keyboard, String x){
       System.out.println("Que elemento deseas remover de los datos de "+x);
       System.out.println("Recuerda que los elementos van del 0 hasta N numero");
       int i=keyboard.nextInt();
       storage.remove(i);
       
       return storage;
   }

    private static Hall Hall(String name, int capacity, String TyHall) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}

