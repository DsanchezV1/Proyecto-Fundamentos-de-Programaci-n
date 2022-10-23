public class Sensor {
    //Atributos
    private static int tamano = 8, posAnadir = 0; //Inicializamos las variables
    private static Sensor[] sensores = new Sensor[tamano];

    private String tipo;
    private double valor;
    
    //Método constructor
    public Sensor() {
    }
    
    //Sobrecarga de constructores y agregamos la opción de crear un sensor
    public Sensor(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
        
        sensores[posAnadir]=this;
        posAnadir++;
    }
    
    //Métodos Getters
    
    public static int getTamano() {
        return tamano;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public double getValor() {
        return valor;
    }
    
    public static int getPosAnadir() {
        return posAnadir;
    }
    
    //Métodos Setters
    
    public static void setTamano(int tamano) {
        Sensor.tamano = tamano;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    //Métodos toString
    @Override //Sobreescribimos el método heredado "toString"
    public String toString(){
        return "Sensor -> Tipo: "+tipo+", valor: "+valor;
    }
    public static String toStringSensores(){ // imprime todos los sensores
        String info = "";
        for (int i = 0; i < sensores.length; i++) {
            if(sensores[i] != null){
                info += sensores[i].toString() + "\n";
            }
        }
        return info;
    }
    
    public static String toStringSensoresTemperatura(){// Imprime todos los sensores de tipo temperatura
        String info = "";
        
        for (int i = 0; i < sensores.length; i++) {
            if(sensores[i] != null && ((sensores[i].getTipo()).toUpperCase()).equals("TEMPERATURA")){
                info += sensores[i].toString() + "\n";
            }
        }
        return info;
    }
    
    //Métodos

    
    public static String ordenarSensores(){//Ordena e imprime los sensores, creando un nuevo array de Sensores
        Sensor[] nuevoSensores = sensores;
        String info = "";
        Sensor temporal;
        for (int i = (posAnadir-1); i > 0; i--) {
            for(int j=0; j< i;j++){
                if(nuevoSensores[j].getValor() > nuevoSensores[j+1].getValor()){
                    temporal= nuevoSensores[j];
                    nuevoSensores[j]=nuevoSensores[j+1];
                    nuevoSensores[j+1]=temporal;
                    
                }
            }
        }
        
        for(int i=0;i< posAnadir;i++){ //
            if(sensores[i] != null && ((sensores[i].getTipo()).toUpperCase()).equals("TEMPERATURA")){
               info += sensores[i].toString() + "\n";
            }
        }
        return info;   
    }
    
            
}
