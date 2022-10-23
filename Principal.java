import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
      Principal.mostrarMenu();
    }

    public static void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        int menuOpcion=2;
        int modelo=0;
        String marca="", color="";
        double valorComercial=0;
        int colorOpcion=0;
        String tipo="";
        double valor=0;
        while(1==1){
            System.out.println("--------------------------------------------------------------");
            System.out.println("|                             MENÚ                           |");
            System.out.println("|------------------------------------------------------------|");
            System.out.println("| Digite si desea:                                           |");
            System.out.println("| 0. Detener la ejecución del programa                       |");
            System.out.println("| 1. Crear un nuevo vehículo                                 |");
            System.out.println("| 2. Ver la información de todos los vehículos almacenados   |");
            System.out.println("| 3. Ver las cantidad de vehículos creados hasta el momento  |");
            System.out.println("| 4. Ver todos los vehículos de color verde                  |");
            System.out.println("| 5. Ver todos los vehículos entre los modelos 2000 y 2021   |");
            System.out.println("| 6. Crear un nuevo sensor                                   |");
            System.out.println("| 7. Ver la cantidad de sensores creados hasta el momento    |");
            System.out.println("| 8. Ver la información de todos los sensores almacenados    |");
            System.out.println("| 9. Ver todos los sensores de tipo temperatura              |");
            System.out.println("| 666. Ver los sensores de tipo temperatura ordenados de     |");
            System.out.println("| menor a mayor                                              |");
            System.out.println("--------------------------------------------------------------");
            menuOpcion=sc.nextInt();
            if(menuOpcion==0){
                System.out.println("Ejecución terminada");
                break;
            }
            switch(menuOpcion){
                case 1:
                    if(Vehiculo.getPosAnadir() < Vehiculo.getTamano()){
                    System.out.println("Para añadir un nuevo vehículo digite: ");
                    System.out.println("El modelo: ");
                    modelo = sc.nextInt();
                    System.out.println("La marca: ");
                    marca = sc.next();
                    System.out.println("El valor comercial: ");
                    valorComercial = sc.nextDouble();
                    System.out.println("¿Desea añadirle color al carro? Si su respuesta es No, el carro será de color verde");
                    System.out.println("1. Sí");
                    System.out.println("2. No");
                    while(colorOpcion!=1 || colorOpcion!=2){
                        colorOpcion=sc.nextInt();
                        if(colorOpcion == 1){
                            System.out.println("Digite el color del vehículo: ");
                            color=sc.next();
                            Vehiculo nuevoCarro = new Vehiculo(modelo,marca,valorComercial,color);
                            System.out.println("Proceso de crear vehículo, exitoso");
                            break;
                        } else if (colorOpcion==2){
                            Vehiculo nuevoCarro = new Vehiculo(modelo,marca,valorComercial);
                            System.out.println("Proceso de crear vehículo, exitoso");
                            break;
                       } else {
                            System.out.println("El número ingresado no está dentro de las opciones, intente de nuevo.");

                        }
                    }
            }



                break;
                case 2:
                    System.out.println("Los vehículos almacenados son los siguientes: ");
                    System.out.println(Vehiculo.toStringVehiculos());
                break;
                case 3:
                    System.out.println("Los vehículos creados hasta el momento son: "+Vehiculo.getPosAnadir());
                break;
                case 4:
                    System.out.println("Los vehículos de color verde son: ");
                    System.out.println(Vehiculo.toStringVehiculosVerde());
                break;
                case 5:
                    System.out.println("Los vehículos entre los modelos 2000 y 2021 son: ");
                    System.out.println(Vehiculo.toStringVehiculosModelos());
                break;
                case 6:
                    if(Sensor.getPosAnadir()<Sensor.getTamano()){
                    System.out.println("Para añadir un nuevo sensor digite: ");
                        System.out.println("Tipo de sensor: ");
                        tipo = sc.next();
                        System.out.println("Valor del sensor: ");
                        valor = sc.nextDouble();
                        Sensor nuevoSensor = new Sensor(tipo,valor);
                        System.out.println("Sensor creado exitosamente");
                    }
                break;
                case 7:
                    System.out.println("La cantidad de Sensores creados hasta el momento son: "+Sensor.getPosAnadir());

                break;
                case 8:
                    System.out.println("Los sensores almacenados son: ");
                    System.out.println(Sensor.toStringSensores());
                break;
                case 9:
                    System.out.println("Los sensores tipo temperatura son: ");
                    System.out.println(Sensor.toStringSensoresTemperatura());
                break;
                case 666:
                    System.out.println("Los sensores tipo temperatura ordenados de menor a mayor son: ");
                    System.out.println(Sensor.ordenarSensores());

                break;
                default:
                    System.out.println("El número ingresado no está en las opciones, por favor intentelo de nuevo.");
                break;
            }
        }
    }
}
