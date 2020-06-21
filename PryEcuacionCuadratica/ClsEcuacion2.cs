using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace PryEcuacionCuadratica
{
    class ClsEcuacion2
    {
        //Atributos
        private float _a;
        private float _b;
        private float _c;
        //Constructores
        public ClsEcuacion2(float a, float b, float c) {
        _a = a;
        _b = b;
        _c = c;
        }
        public ClsEcuacion2(ClsEcuacion2 m){
        _a=m._a;
        _b=m._b;
        _c=m._c;
        }
        //getters and setters
        public int a 
        {
            get 
            {
                return a;
            }
            set 
            {
                a = value;
            }
        }
        public int b
        {
            get
            {
                return b;
            }
            set
            {
                b = value;
            }
        }
        public int c
        {
            get
            {
                return c;
            }
            set
            {
                c = value;
            }
        }
        //Metodos
        public String raices()
        {
            String raiz = "Ecuacion";
            double x1, x2;
            if (_a == 0)
            {
                raiz += "Linela raiz" + _c / _b;
            }
            else
            {
                double disc = (_b * _b - 4 * _a * _c);
                if (disc < 0)
                {
                    double real = -_b / (2 * _a);
                    double imag = Math.Sqrt(-disc) / (2 * _a);
                    raiz += "cuadratica real = " + real + "imaginaria = " + imag;
                }
                else
                {
                    x1 = (-_b + Math.Sqrt(disc)) / (2 * _a);
                    x2 = (-_b - Math.Sqrt(disc)) / (2 * _a);
                    raiz += "Valor x1= " + x1 + "Valor x2= " + x2;
                }
            }
            return raiz;
        }
        public float evaluar(float valx)
        {
            float evaluar;
            evaluar = _a * valx + _b * valx + _c;
            return evaluar;
        }
        public ClsEcuacion2 mas(ClsEcuacion2 r)
        {
            ClsEcuacion2 resp = new ClsEcuacion2(_a + r._a, _b + r._b, _c + r._c);
            return resp;
        }
        public ClsEcuacion2 menos(ClsEcuacion2 r)
        {
            ClsEcuacion2 resp = new ClsEcuacion2(_a - r._a, _b - r._b, _c - r._c);
            return resp;
        }
        public String toString()
        {
            return _a + "x^2 + " + _b + "x^1+ " + _c;
        }
    }
}
