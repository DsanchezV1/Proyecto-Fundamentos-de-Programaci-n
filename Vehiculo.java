public class Vehiculo {
    
    //Atributos
    private static int tamano = 10, posAnadir = 0; //Inicializamos variables
    private static Vehiculo[] vehiculos = new Vehiculo[tamano];

    private int modelo;
    private String marca, color;
    private double valorComercial;
    //Método constructor
    public Vehiculo() {
    }
    
    //Sobrecarga de constructores
    public Vehiculo(int modelo, String marca, double valorComercial) {
        this(modelo,marca,valorComercial,"verde");
    }
    public Vehiculo(int modelo, String marca, double valorComercial, String color) { //Creamos la opción de añadir vehículos
        this.modelo = modelo;
        this.marca = marca;
        this.valorComercial = valorComercial;
        this.color = color;
        
        vehiculos[posAnadir]=this;
        posAnadir++;
    }
    
    //Métodos Getters
    
    public static int getTamano() {
        return tamano;
    }
    
    public static int getPosAnadir() {
        return posAnadir;
    }
    
    public int getModelo() {
        return modelo;
    }
    
     public String getMarca() {
        return marca;
    }
     
     public String getColor() {
        return color;
    }
     
     public double getValorComercial() {
        return valorComercial;
    }
     
    //Métodos Setters
    
    public static void setTamano(int tam) {
        Vehiculo.tamano = tam;
    }
    
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }
    
    //Métodos
    @Override
    public String toString() {//sobreescribimos el método toString
        return "Vehiculo -> modelo: " + modelo + ", marca: " + marca + ", color: " + color + ", valor comercial :"
                + valorComercial;
    }
    

    public static String toStringVehiculos(){ //toString para imprimir todos los vehiculos
        String info = "";
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                info += vehiculos[i].toString() + "\n";
            }
        }
        return info;
    }

    public static String toStringVehiculosVerde(){//imprime solo los vehículos verdes
        String info = "";
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null && (vehiculos[i].getColor().toUpperCase()).equals("VERDE")){
                info += vehiculos[i].toString() + "\n";
            }
        }
        return info;
    }

    public static int cantidadVehiculos(){
        return getPosAnadir();
    }
    public static String toStringVehiculosModelos() {// imprime los vehículos entres los modelos 2000 y 2021
        String info = "";
        for (int i = 0; i < vehiculos.length; i++) {
            if(vehiculos[i] != null){
                if(vehiculos[i].getModelo() >= 2000 && vehiculos[i].getModelo() <= 2021){
                    info += vehiculos[i].toString() + "\n";
                }
            }
        }
        return info;
    }
}
