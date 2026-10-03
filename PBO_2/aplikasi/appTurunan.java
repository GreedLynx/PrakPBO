package aplikasi;

import com.polinema.library.kelas;

class appTurunan extends kelas {
    public static void main(String[] args) {
        appTurunan f = new appTurunan();
        System.out.println(f.publicVar);    //public, bisa diakses dimana saja
        //System.out.println(f.privateVar); //hanya bisa diakses di class nya sendiri 
        System.out.println(f.protectedVar); //protected, bisa diakses karena turunan dan masih dalam 1 pckage dengan app
        //System.out.println(f.defaultVar); //
    }
}
