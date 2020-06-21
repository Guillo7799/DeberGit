using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace PryEcuacionCuadratica
{
    public partial class Form1 : Form
    {
        float a, b, c, k;
        ClsEcuacion2 p,q;
        int opcion, paso = 0, contador = 0;
        float posinicio, posfinal, rango;
        
        public Form1()
        {
            InitializeComponent();
            labelTabla.Enabled = false;
        }

        private void btnEvaluar_Click(object sender, EventArgs e)
        {
            k = float.Parse(txtPantalla.Text);
            txtPantalla.Text="F( " + k + ") =   " + q.evaluar(k);
        }

        private void btnCoeficiente_Click(object sender, EventArgs e)
        {
            switch (paso)
            {
                case 0:
                    a = float.Parse(txtPantalla.Text);
                    paso = 1;
                    btnCoeficiente.Text="Coef x";
                    txtPantalla.Text=" ";
                    txtPantalla.Focus();
                    break;
                case 1:
                    b = float.Parse(txtPantalla.Text);
                    paso = 2;
                    btnCoeficiente.Text="Term ind";
                    txtPantalla.Text = " ";
                    txtPantalla.Focus();
                    break;
                case 2:
                    c = float.Parse(txtPantalla.Text);
                    paso = 0;
                    btnCoeficiente.Text="Coef x^2";
                    txtPantalla.Text = " ";
                    q = new ClsEcuacion2(a, b, c);
                    txtPantalla.Text=q.toString();
                    break;
            }
            txtPantalla.Focus();

        }

        private void btnRaices_Click(object sender, EventArgs e)
        {
            txtPantalla.Text= q.raices();
            txtPantalla.Focus();

        }

        private void btnRango_Click(object sender, EventArgs e)
        {
            switch (contador)
            {
                case 0:
                    contador += 1;
                    btnRango.Text="INICIO";
                    txtPantalla.Text=" ";
                    txtPantalla.Focus();
                    break;
                case 1:
                    posinicio = float.Parse(txtPantalla.Text);
                    contador += 1;
                    btnRango.Text="FINAL";
                    txtPantalla.Text=" ";
                    txtPantalla.Focus();
                    break;
                case 2:
                    posfinal = float.Parse(txtPantalla.Text);
                    contador += 1;
                    btnRango.Text="incremento";
                    txtPantalla.Text=" ";
                    txtPantalla.Focus();
                    break;
                case 3:
                    rango = float.Parse(txtPantalla.Text);
                    contador = 0;
                    btnRango.Text="RANGO";
                    txtPantalla.Text=" ";
                    txtPantalla.Focus();
                    String tabla = "Tabla de valores \n";
                    tabla = tabla + "Factor                Valor \n";
                    for (int i = (int)posinicio; i <= posfinal; i += (int)rango)
                    {
                        tabla = tabla + i + "                   " + q.evaluar(i) + "\n";
                    }
                    labelTabla.Text=tabla;
                    txtPantalla.Text=q.toString();
                    break;
            }

        }

        private void btnMas_Click(object sender, EventArgs e)
        {
            p = new ClsEcuacion2(q);
            txtPantalla.Text=" ";
            txtPantalla.Focus();
            opcion = 1;
        }

        private void btnMenos_Click(object sender, EventArgs e)
        {
            p = new ClsEcuacion2(q);
            txtPantalla.Text = " ";
            txtPantalla.Focus();
            opcion = 2;
        }

        private void btnIgual_Click(object sender, EventArgs e)
        {
            switch (opcion)
            {
                case 1:
                    q = p.mas(q);
                    txtPantalla.Text=q.toString();
                    break;
                case 2:
                    q = p.menos(q);
                    txtPantalla.Text = q.toString();
                    break;
            }

        }

        private void btnSalir_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void btnLimpiar_Click(object sender, EventArgs e)
        {
            txtPantalla.Text = " ";
            txtPantalla.Focus();
        }

    }
}
