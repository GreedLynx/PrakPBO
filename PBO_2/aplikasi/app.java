package aplikasi;

import com.polinema.library.kelas;

class app {
    public static void main(String[] args) {
        kelas f = new kelas();
        System.out.println(f.publicVar);        //Bisa karena bertipepublic
        //System.out.println(f.privateVar);     //Error
        //System.out.println(f.protectedVar);   //Error
        //System.out.println(f.defaultVar);     //Error
    }
}
