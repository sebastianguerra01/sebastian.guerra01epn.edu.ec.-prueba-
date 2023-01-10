import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import pkUsuario.*;

public class App extends Usuario  {

    static final String sgusuario1 = "sebastian.guerra01@epn.edu.ec";
        static final String sgusuario2 = "profe";
        static final int sgcontrasena1 = 1234;
        static final int sgcontrasena2 = 1756168058;
        public String sgusuario_ingresado;
        public int sgcontrasena_ingresada;
    public static void main(String[] args) throws Exception {

        sgLogin();
        sgDatosUser();
        sgMenu();
        
    }
            
       public static void sgLogin(){

        String sgusuario1 = "sebastian.guerra01@epn.edu.ec";
        String sgusuario2 = "profe";
        int sgcontrasena1 = 1234;
        int sgcontrasena2 = 1756168058;
        String sgusuario_ingresado;
        int sgcontrasena_ingresada;
        int sgcontador = 0;
     
       Scanner sc = new Scanner(System.in);

           System.out.println("----------------------------------------------");
           System.out.println("            NETWORKING DE TAVOGRAM           ");
           System.out.println("----------------------------------------------\n");

                System.out.println("---------------");
                System.out.print("+ usuario: ");
                   sgusuario_ingresado = sc.nextLine();
                System.out.print("+ clave: ");
                   sgcontrasena_ingresada = sc.nextInt();
                System.out.println("---------------");
                System.out.println("* Nro de intentos: " + sgcontador);
                    sgcontador --;

                    if(sgusuario1.equals("usuario_ingresado") && sgcontrasena_ingresada == sgcontrasena1 ){
                       sgDatosUser();
                    }  
                   else{
                    System.out.println("\nSI VE ESTE MENSAJE, IGNORELO");
                    System.out.println("Usuario o contrasena invalido");
                   }
                       
                       
                    if (sgusuario2.equals("usuario_ingresado") && sgcontrasena_ingresada == sgcontrasena2){
                        sgDatosUser();
                       
                    } 
                    else{
                        System.out.println("SI VE ESTE MENSAJE, IGNORELO");
                        System.out.println("Usuario o contrasena invalido");
                    }           
                    
                }
                

       public static void sgDatosUser  (){

        String sgcodigo;
        String sgnick;
        int sgedad;
        String sgsexo;
        Scanner sc = new Scanner(System.in);


        System.out.println("\n\n\n <+> Por favor registra");
        
        System.out.print(" + Codigo (ID): ");
            sgcodigo = sc.nextLine();
        System.out.print(" + Nombre o nick: ");
            sgnick = sc.nextLine();
        System.out.print(" + Edad: ");
            sgedad = sc.nextInt();
        System.out.print(" + Sexo: ");
            sgsexo = sc.nextLine();

       }

       public static void sgMenu  (){

        ArrayList<Usuario> lsUsuarios = new ArrayList<Usuario>();

        int sgeleccion;    
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n----------------------------------------------");
        System.out.println("            NETWORKING DE TAVOGRAM           ");
        System.out.println("----------------------------------------------\n");
            System.out.println("Usuario: " + sgusuario1 );
          
            System.out.println("1 AGREGAR AMIGO"); 
            System.out.println("2 AGREGAR AMIGO DE AMIGO"); 
            System.out.println("3 MOSTRAR NETWORK"); 
            System.out.println("0 SALIR"); 

            System.out.print(" <+> Ingresa Opc: ");
                sgeleccion = sc.nextInt();
            

            
            switch (sgeleccion){

                case 1:
                sgAgregar_Amigo(lsUsuarios);
                break;
                case 2:
                sgagregarAmigodeAmigo(lsUsuarios);
                break;
                case 3:
                System.out.println("Ya no me salio esta funcion :c");
                break;
                case 0:
                System.out.print("Usted ha salido del sistema, gracias por preferirnos");
                break;
            }
       }

       public static String sgAgregar_Amigo(ArrayList<Usuario> lsUsuario){

        ArrayList<Usuario> lsUsuarios = new ArrayList<Usuario>();

        String sgcodigo_amigo;
        String sgnick_amigo;
        int sgedad_amigo;
        String sgsexo_amigo;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n AGREGAR AMIGO");
        System.out.println(" <+> Por favor registra");
        
        System.out.print(" + Codigo (ID): ");
            sgcodigo_amigo = sc.nextLine();
        System.out.print(" + Nombre o nick: ");
            sgnick_amigo = sc.nextLine();
        System.out.print(" + Edad: ");
            sgedad_amigo = sc.nextInt();
        System.out.print(" + Sexo: ");
            sgsexo_amigo = sc.nextLine();

        Usuario user = new Usuario(sgcodigo_amigo, sgnick_amigo, sgedad_amigo, sgsexo_amigo);
        lsUsuarios.add(user);
        System.out.println("\n\n\n" + user.sgnick_amigo + " ha sido agredado exitosamente");

        return sgcodigo_amigo;
       }

       public static void sgagregarAmigodeAmigo(ArrayList<Usuario> lsUsuario){

        ArrayList<Usuario> lsUsuarios = new ArrayList<Usuario>();
        
        Scanner sc = new Scanner(System.in);

        String sgID_AMIGO;
        String sgcodigo_amigo_de_amigo;
        String sgnick_amigo_de_amigo;
        int sgedad_amigo_de_amigo;
        String sgsexo_amigo_de_amigo;

        
        System.out.println("\n\n----------------------------------------------");
        System.out.println("            NETWORKING DE TAVOGRAM           ");
        System.out.println("----------------------------------------------\n");
            System.out.println("Usuario: " + sgusuario1 );

        System.out.println(" AGREGAR AMIGO");
        System.out.println("<+> Agrega un amigo a tu amigo: ");
        System.out.println("+ Cual es el ID de tu amigo: ");
            sgID_AMIGO = sc.nextLine();

           // if(ID_AMIGO == codigo_amigo)
           // {
                System.out.println(" <+> Por favor registra");
        
        System.out.print(" + Codigo (ID): ");
            sgcodigo_amigo_de_amigo = sc.nextLine();
        System.out.print(" + Nombre o nick: ");
            sgnick_amigo_de_amigo = sc.nextLine();
        System.out.print(" + Edad: ");
            sgedad_amigo_de_amigo = sc.nextInt();
        System.out.print(" + Sexo: ");
            sgsexo_amigo_de_amigo = sc.nextLine();

        System.out.println("Se agrego el amigo de tu amigo");
            }
        //else{
        //    System.out.print("No se logro agregar el amigo de tu amigo");
       // }

       //}
}