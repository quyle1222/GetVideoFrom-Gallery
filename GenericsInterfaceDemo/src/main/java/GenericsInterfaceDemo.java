
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC Của Tú
 */
public class GenericsInterfaceDemo<T extends Number> {

    private T number;

    public GenericsInterfaceDemo(T number) {
        this.number = number;
    }
    double nghichDao(){
        return 1 / number.doubleValue();
    }
    double phanThapPhan(){
        return number.doubleValue()-number.intValue();
    }
    
    public static void main(String[] args) {
        GenericsInterfaceDemo<Integer> soNguyen = new GenericsInterfaceDemo<Integer>(178);
        System.out.println("Nghich dao ="+soNguyen.nghichDao());
        System.out.println("Phan thap phan ="+soNguyen.phanThapPhan());
        GenericsInterfaceDemo<Double> soThuc = new GenericsInterfaceDemo<Double>(95.122);
        System.out.println("Nghich dao ="+soThuc.nghichDao());
        System.out.println("Phan thap phan ="+soThuc.phanThapPhan());
}
}
