namespace PryEcuacionCuadratica
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.txtPantalla = new System.Windows.Forms.TextBox();
            this.btnCoeficiente = new System.Windows.Forms.Button();
            this.btnRaices = new System.Windows.Forms.Button();
            this.btnEvaluar = new System.Windows.Forms.Button();
            this.btnRango = new System.Windows.Forms.Button();
            this.btnLimpiar = new System.Windows.Forms.Button();
            this.btnSalir = new System.Windows.Forms.Button();
            this.btnMas = new System.Windows.Forms.Button();
            this.btnMenos = new System.Windows.Forms.Button();
            this.btnIgual = new System.Windows.Forms.Button();
            this.shapeContainer1 = new Microsoft.VisualBasic.PowerPacks.ShapeContainer();
            this.rcsTabla = new Microsoft.VisualBasic.PowerPacks.RectangleShape();
            this.labelTabla = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // txtPantalla
            // 
            this.txtPantalla.Location = new System.Drawing.Point(10, 12);
            this.txtPantalla.Name = "txtPantalla";
            this.txtPantalla.Size = new System.Drawing.Size(511, 20);
            this.txtPantalla.TabIndex = 0;
            this.txtPantalla.TextAlign = System.Windows.Forms.HorizontalAlignment.Right;
            // 
            // btnCoeficiente
            // 
            this.btnCoeficiente.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnCoeficiente.Location = new System.Drawing.Point(18, 47);
            this.btnCoeficiente.Name = "btnCoeficiente";
            this.btnCoeficiente.Size = new System.Drawing.Size(76, 39);
            this.btnCoeficiente.TabIndex = 1;
            this.btnCoeficiente.Text = "Coef X^2";
            this.btnCoeficiente.UseVisualStyleBackColor = false;
            this.btnCoeficiente.Click += new System.EventHandler(this.btnCoeficiente_Click);
            // 
            // btnRaices
            // 
            this.btnRaices.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnRaices.Location = new System.Drawing.Point(18, 92);
            this.btnRaices.Name = "btnRaices";
            this.btnRaices.Size = new System.Drawing.Size(76, 39);
            this.btnRaices.TabIndex = 2;
            this.btnRaices.Text = "Raices";
            this.btnRaices.UseVisualStyleBackColor = false;
            this.btnRaices.Click += new System.EventHandler(this.btnRaices_Click);
            // 
            // btnEvaluar
            // 
            this.btnEvaluar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnEvaluar.Location = new System.Drawing.Point(18, 137);
            this.btnEvaluar.Name = "btnEvaluar";
            this.btnEvaluar.Size = new System.Drawing.Size(76, 39);
            this.btnEvaluar.TabIndex = 3;
            this.btnEvaluar.Text = "Evaluar k";
            this.btnEvaluar.UseVisualStyleBackColor = false;
            this.btnEvaluar.Click += new System.EventHandler(this.btnEvaluar_Click);
            // 
            // btnRango
            // 
            this.btnRango.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnRango.Location = new System.Drawing.Point(18, 182);
            this.btnRango.Name = "btnRango";
            this.btnRango.Size = new System.Drawing.Size(76, 39);
            this.btnRango.TabIndex = 4;
            this.btnRango.Text = "Rango";
            this.btnRango.UseVisualStyleBackColor = false;
            this.btnRango.Click += new System.EventHandler(this.btnRango_Click);
            // 
            // btnLimpiar
            // 
            this.btnLimpiar.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnLimpiar.Location = new System.Drawing.Point(419, 47);
            this.btnLimpiar.Name = "btnLimpiar";
            this.btnLimpiar.Size = new System.Drawing.Size(103, 39);
            this.btnLimpiar.TabIndex = 5;
            this.btnLimpiar.Text = "Limpiar";
            this.btnLimpiar.UseVisualStyleBackColor = false;
            this.btnLimpiar.Click += new System.EventHandler(this.btnLimpiar_Click);
            // 
            // btnSalir
            // 
            this.btnSalir.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnSalir.Location = new System.Drawing.Point(418, 92);
            this.btnSalir.Name = "btnSalir";
            this.btnSalir.Size = new System.Drawing.Size(103, 39);
            this.btnSalir.TabIndex = 6;
            this.btnSalir.Text = "Salir";
            this.btnSalir.UseVisualStyleBackColor = false;
            this.btnSalir.Click += new System.EventHandler(this.btnSalir_Click);
            // 
            // btnMas
            // 
            this.btnMas.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnMas.Location = new System.Drawing.Point(123, 92);
            this.btnMas.Name = "btnMas";
            this.btnMas.Size = new System.Drawing.Size(76, 39);
            this.btnMas.TabIndex = 7;
            this.btnMas.Text = "+";
            this.btnMas.UseVisualStyleBackColor = false;
            this.btnMas.Click += new System.EventHandler(this.btnMas_Click);
            // 
            // btnMenos
            // 
            this.btnMenos.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnMenos.Location = new System.Drawing.Point(123, 137);
            this.btnMenos.Name = "btnMenos";
            this.btnMenos.Size = new System.Drawing.Size(76, 39);
            this.btnMenos.TabIndex = 8;
            this.btnMenos.Text = "-";
            this.btnMenos.UseVisualStyleBackColor = false;
            this.btnMenos.Click += new System.EventHandler(this.btnMenos_Click);
            // 
            // btnIgual
            // 
            this.btnIgual.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(224)))), ((int)(((byte)(192)))));
            this.btnIgual.Location = new System.Drawing.Point(123, 182);
            this.btnIgual.Name = "btnIgual";
            this.btnIgual.Size = new System.Drawing.Size(76, 39);
            this.btnIgual.TabIndex = 9;
            this.btnIgual.Text = "=";
            this.btnIgual.UseVisualStyleBackColor = false;
            this.btnIgual.Click += new System.EventHandler(this.btnIgual_Click);
            // 
            // shapeContainer1
            // 
            this.shapeContainer1.Location = new System.Drawing.Point(0, 0);
            this.shapeContainer1.Margin = new System.Windows.Forms.Padding(0);
            this.shapeContainer1.Name = "shapeContainer1";
            this.shapeContainer1.Shapes.AddRange(new Microsoft.VisualBasic.PowerPacks.Shape[] {
            this.rcsTabla});
            this.shapeContainer1.Size = new System.Drawing.Size(534, 286);
            this.shapeContainer1.TabIndex = 12;
            this.shapeContainer1.TabStop = false;
            // 
            // rcsTabla
            // 
            this.rcsTabla.Location = new System.Drawing.Point(222, 93);
            this.rcsTabla.Name = "rcsTabla";
            this.rcsTabla.Size = new System.Drawing.Size(1, 1);
            // 
            // labelTabla
            // 
            this.labelTabla.AutoSize = true;
            this.labelTabla.BackColor = System.Drawing.Color.White;
            this.labelTabla.Location = new System.Drawing.Point(224, 93);
            this.labelTabla.Name = "labelTabla";
            this.labelTabla.Size = new System.Drawing.Size(0, 13);
            this.labelTabla.TabIndex = 13;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(255)))), ((int)(((byte)(192)))), ((int)(((byte)(128)))));
            this.ClientSize = new System.Drawing.Size(534, 286);
            this.Controls.Add(this.labelTabla);
            this.Controls.Add(this.btnIgual);
            this.Controls.Add(this.btnMenos);
            this.Controls.Add(this.btnMas);
            this.Controls.Add(this.btnSalir);
            this.Controls.Add(this.btnLimpiar);
            this.Controls.Add(this.btnRango);
            this.Controls.Add(this.btnEvaluar);
            this.Controls.Add(this.btnRaices);
            this.Controls.Add(this.btnCoeficiente);
            this.Controls.Add(this.txtPantalla);
            this.Controls.Add(this.shapeContainer1);
            this.Name = "Form1";
            this.Text = "Aplicacion de calculadora para ecuaciones cuadraticas";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox txtPantalla;
        private System.Windows.Forms.Button btnCoeficiente;
        private System.Windows.Forms.Button btnRaices;
        private System.Windows.Forms.Button btnEvaluar;
        private System.Windows.Forms.Button btnRango;
        private System.Windows.Forms.Button btnLimpiar;
        private System.Windows.Forms.Button btnSalir;
        private System.Windows.Forms.Button btnMas;
        private System.Windows.Forms.Button btnMenos;
        private System.Windows.Forms.Button btnIgual;
        private Microsoft.VisualBasic.PowerPacks.ShapeContainer shapeContainer1;
        private Microsoft.VisualBasic.PowerPacks.RectangleShape rcsTabla;
        private System.Windows.Forms.Label labelTabla;
    }
}

