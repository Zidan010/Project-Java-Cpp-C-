using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;
using System.Windows.Forms;



namespace Evaluation___System
{
    public partial class LOGIN : Form
    {


        public static LOGIN instance;
        public TextBox tb1;
        public LOGIN()
        {
            InitializeComponent();
            instance = this;
            tb1 = textBox1;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //this.Controls.Clear

            SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
            SqlCommand cmd2 = new SqlCommand("Select*from LoginTB where username='" + textBox1.Text + "'and password = '" + textBox2.Text + "'", con);
            SqlDataAdapter sdr= new SqlDataAdapter(cmd2);
            DataTable dt = new DataTable();
            sdr.Fill(dt);

            string cmbItemvalue = comboBox1.SelectedItem.ToString();
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i < dt.Rows.Count; i++)
                {
                    if (dt.Rows[i]["usertype"].ToString() == cmbItemvalue)
                    {
                        MessageBox.Show("You are logged in as " + dt.Rows[i][2]);
                        if(comboBox1.SelectedIndex==0)
                        {
                            Form1 f1 = new Form1();
                            f1.ShowDialog();
                            this.Hide();
                            this.Close(); 

                        }
                        else
                        {

                            Form6 ff=new Form6();
                            ff.ShowDialog();
                            this.Hide();
                            this.Close();

                        }

                    }

                
                
                }
            }
            else
            {

                MessageBox.Show("Error");
            }
            //orm1 f2 = new Form1();
            // f2.ShowDialog()
            //orm1.instance.lab.Text = textBox1.Text;
            this.Close();
        }
        
        private void LOGIN_Load(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
