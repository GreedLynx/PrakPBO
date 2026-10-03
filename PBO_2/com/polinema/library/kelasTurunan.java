package com.polinema.library;

class kelasTurunan extends kelas{
    public static void main(String[] args) {
        kelasTurunan f = new kelasTurunan();
        System.out.println(f.publicVar);    //bisa diakses karena public 
        //System.out.println(f.privateVar); gak bisa diakes karena private dan turunan dari class kelas
        System.out.println(f.protectedVar); //bisa diakses karena masih dalam 1 package
        System.out.println(f.defaultVar);   //bisa diakses karena masih dalam 1 package
    }
}