package com.example.miaplicacion;

public class SimboloAutos {
    

    static class Carro {
        private String marca;
        private String modelo;
        private String tipo = "Suv";


        public Carro (String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }


        public Carro(String marca, String modelo, String tipo) {
            this.marca = marca;
            this.modelo = modelo;
            this.tipo = tipo;
        }

        public void Primero() {
            System.out.println("La marca y el modelo del vehiculo es: " + marca + " " + modelo);
        }
    }
    public void mostrarTipo() {
        System.out.println("Tipo de Vehico: " + obtenerTipo());
    }

    protected String obtenerTipo() {
        return tipo;
    }
}

static class Moto extends Carro {
    private String tipo;

    public Moto(String marca, String modelo, String tipo) {
        super(marca, modelo);
        this.tipo = tipo;
    }

    public void mostrarTipo() {
        System.out.println("Tipo de Moto: " + tipo);
    }

    protected String obtenerTipo() {
        return tipo;
    }
}

    public static void main(String[] args) {
        Carro Car1 = new Carro("Renault", "Duster");
        Carro Car2 = new Carro("Volswagen", "Gol", "Sedan");
        Moto Moto1 = new Moto("Suzuki", "Gixxer 250", "Naked");

        car1.Primero();
        Car1.mostrarTipo();
        Car2.Primero();
        Car2.mostrarTipo();
        Moto1.Primero();
        Moto1.mostrarTipo();
    }


}
