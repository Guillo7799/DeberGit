/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pryecuacioncuadratica.CapaNegocio;

/**
 *
 * @author Programacion Objetos
 */
public class Clsecuacion2 {
    private float _a;
    private float _b;
    private float _c;

    public Clsecuacion2(float a, float b, float c) {
        _a = a;
        _b = b;
        _c = c;
    }
    public Clsecuacion2(Clsecuacion2 m){
    _a=m._a;
    _b=m._b;
    _c=m._c;
    }

    public float getA() {
        return _a;
    }

    public void setA(int a) {
        _a = a;
    }

    public float getB() {
        return _b;
    }

    public void setB(int b) {
        _b = b;
    }

    public float getC() {
        return _c;
    }

    public void setC(int c) {
        _c = c;
    }
    public String raices(){
      String raiz="Ecuacion";
      double x1,x2;
      if(_a==0){
          raiz+="Linela raiz"+_c/_b;
      }
      else{double disc= (_b*_b -4*_a*_c);
      if(disc<0){
          double real=-_b/(2*_a);
          double imag=Math.sqrt(-disc)/(2*_a);
          raiz+= "cuadratica real = " + real + "imaginaria = " +imag; 
      }
      else{
          x1=(-_b + Math.sqrt(disc))/(2*_a);
          x2=(-_b - Math.sqrt(disc))/(2*_a);
          raiz+= "Valor x1= "+ x1 +"Valor x2= "+ x2;
      }
    }
      return raiz; 
    }
    public float evaluar(float valx){
        float evaluar;
        evaluar=_a*valx+_b*valx+_c;
        return evaluar;
    }
    public Clsecuacion2 mas(Clsecuacion2 r){
        Clsecuacion2 resp = new Clsecuacion2(_a+r._a,_b+r._b,_c+r._c);
        return resp;
    }
    public Clsecuacion2 menos(Clsecuacion2 r){
        Clsecuacion2 resp = new Clsecuacion2(_a-r._a,_b-r._b,_c-r._c);
        return resp;
    }
    public String toString(){
        return _a+"x^2 + "+_b+"x^1+ "+_c;
    }
}

