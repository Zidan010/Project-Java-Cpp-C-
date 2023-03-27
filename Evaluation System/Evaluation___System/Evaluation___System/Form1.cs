using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Evaluation___System
{
    public partial class Form1 : Form
    {
    public static Form1 instance;
        public Label lab;
        public Form1()
        {
            InitializeComponent();
            //  label2.Text = UserName;
          instance = this;
           //ab = label4;
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           /* Login newLogin = new Login();
            newLogin.ShowDialog();


            if (newLogin.LoginFlag == false)
            {

                Close();

            }*/
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            f2.ShowDialog();
        }

        private void label1_Click(object sender, EventArgs e)
        {
           
        }

        private void Form1_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult dialog = MessageBox.Show("Do you really want to close the program?", "Exit", MessageBoxButtons.YesNo);
            if (dialog == DialogResult.Yes)
            {

                Application.Exit();


            }
            else if (dialog == DialogResult.No)
            {

                e.Cancel = true;

            }
        }

        private void label2_Click(object sender, EventArgs e)
        {
            //textBox1.Text;

        }
    }
}
