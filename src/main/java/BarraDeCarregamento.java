public class BarraDeCarregamento {
    public static void main(String[] args){
       BarraDeCarregamento1 barraDeCarregamento1 =new BarraDeCarregamento1();
       barraDeCarregamento1.start();
        BarraDeCarregamento2 barraDeCarregamento2 =new BarraDeCarregamento2();
        barraDeCarregamento2.start();
    }
}


class BarraDeCarregamento1 extends Thread{

public void run(){System.out.println("Rodando codigo 1");}




        }
class BarraDeCarregamento2 extends Thread{

    public void run(){System.out.println("Rodando codigo 2");}




}
