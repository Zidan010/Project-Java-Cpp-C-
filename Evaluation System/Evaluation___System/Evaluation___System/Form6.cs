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
    public partial class Form6 : Form
    {
       
        public int SerialNumber,a,b,c,d,e,f,g,h,i,j;
       
        public string s,SN;

        SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
        private void getResult()


        {
            SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("Select * from CrsTB", con);
            DataTable dt = new DataTable();
            con.Open();
            SqlDataReader sdr = cmd.ExecuteReader();
            dt.Load(sdr);
            con.Close();
            dataGridView1.DataSource = dt;
           // SqlConnection con2= new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
           



        }

        private void gs()
        {

            SqlCommand cmd1 = new SqlCommand("Select Student_ID,Course_ID,Course Name  from CrSTD CrsTB", con);
            DataTable dt1 = new DataTable();
            con.Open();
            SqlDataReader sdr1 = cmd1.ExecuteReader();
            dt1.Load(sdr1);
            con.Close();
            dataGridView1.DataSource = dt1;




        }
        private void getResult2()
        {
            SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("Select * from Evaluation  ", con);
           // cmd.Parameters.AddWithValue("@CourseID", this.s);
            //textBox1.Text = s;
            DataTable dt = new DataTable();
            con.Open();
            SqlDataReader sdr = cmd.ExecuteReader();
            dt.Load(sdr);
            con.Close();
            dataGridView2.DataSource = dt;




        }




        public Form6()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            f2.ShowDialog();
        }

        private void Form6_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'course_ListDataSet2.CrSTD' table. You can move, or remove it, as needed.
            this.crSTDTableAdapter.Fill(this.course_ListDataSet2.CrSTD);
            // TODO: This line of code loads data into the 'course_ListDataSet2.CrsTB' table. You can move, or remove it, as needed.
            this.crsTBTableAdapter.Fill(this.course_ListDataSet2.CrsTB);

        }

       private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
           





           /* SqlCommand cmd = new SqlCommand(" SELECT  @CourseID, @StudentID,@MidAttendance,@MidPerformance," +
              "@MidQuizes,@MidAssesment," +
            "@MidAssignmentViva,@FinalAttendance,@FinalPerformance,@FinalQuizes," +
            "@FinalAssesment,@FinalAssignmentViva FROM Evaluation  " , con);
            DataTable dt = new DataTable();
            con.Open();
            SqlDataReader sdr = cmd.ExecuteReader();
            dt.Load(sdr);
            con.Close();
            dataGridView2.DataSource = dt;*/

        }
     //   private bool isValid();
        


        private void button1_Click_1(object sender, EventArgs e)
        {

            SerialNumber = Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value);
         //   textBox1.Text = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
           // textBox2.Text = dataGridView1.SelectedRows[0].Cells[2].Value.ToString();

           /*SqlCommand cmd = new SqlCommand("INSERT INTO EV2 VALUES (@StudentID)", con);
            cmd.CommandType = CommandType.Text;
           // cmd.Parameters.AddWithValue("@CourseName", textBox1.Text);
            cmd.Parameters.AddWithValue("@StudentID", textBox2.Text);
            textBox2.Text = SN;
            //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);
            //SN = Convert.ToString();
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();*/
            //MessageBox.Show("New Course Is Inserted", "Saved", MessageBoxButtons.OK, MessageBoxIcon.Information);
          getResult();
           getResult2();

            ResetFormControls();


            /*if (isValid())


            {

                //qlCommand cmd1 = new SqlCommand("DELETE FROM CrSTD  WHERE SLNo =@SLNo", con);

                SqlCommand cmd1 = new SqlCommand("SELECT SLNo FROM Evaluation", con);
                cmd1.CommandType = CommandType.Text;
                SerialNumber = Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value);
                textBox1.Text = dataGridView1.SelectedRows[0].Cells[3].Value.ToString();
                cmd1.Parameters.AddWithValue("@SLNo", this.SerialNumber);
                //SqlCommand cmd2 = new SqlCommand("");

                con.Open();
                cmd1.ExecuteNonQuery();
                con.Close();
                getResult2();
                getResult();
                MessageBox.Show("Course details are removed successfully!", "Removed", MessageBoxButtons.OK, MessageBoxIcon.Information);
               // GetCourseRecord();
               ResetFormControls();
            }

            else
            {

                MessageBox.Show("Please select a course to show the result.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }*/


        }

        private void ResetFormControls()
        {
          //  textBox1.Clear();
           // textBox2.Clear();
            //textBox3.Clear();
            //textBox1.Focus();
        }


       

        private void button2_Click(object sender, EventArgs e)
        {

            getResult2();

           /* if 

            {
              /*  SqlCommand cmd = new SqlCommand("INSERT INTO EV2 VALUES (@StudentID)", con);
                cmd.CommandType = CommandType.Text;
                // cmd.Parameters.AddWithValue("@CourseName", textBox1.Text);
                cmd.Parameters.AddWithValue("@StudentID", textBox2.Text);
            //    textBox2.Text = SN;
                //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);
                //SN = Convert.ToString();
                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                //MessageBox.Show("New Course Is Inserted", "Saved", MessageBoxButtons.OK, MessageBoxIcon.Information);
                getResult();
                 getResult2();

                ResetFormControls();*/



















               // textBox2.Text = SN;
               // textBox1.Text = s;
                //qlCommand cmd1 = new SqlCommand("DELETE FROM CrSTD  WHERE SLNo =@SLNo", con);
                
                





                  /*  SqlCommand cmd1 = new SqlCommand("SELECT  * FROM Evaluation  WHERE Course_ID=@CourseID ", con);

                    cmd1.CommandType = CommandType.Text;
                    //SerialNumber = Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value);
                    //textBox1.Text = dataGridView1.SelectedRows[0].Cells[3].Value.ToString();
                    cmd1.Parameters.AddWithValue("@CourseID", this.s);

                    cmd1.Parameters.AddWithValue("@StudentID", this.SN);

                    cmd1.Parameters.AddWithValue("@MidAttendance", this.a);
                    cmd1.Parameters.AddWithValue("@MidPerformance", this.b);
                    cmd1.Parameters.AddWithValue("@MidQuizes", this.c);
                    cmd1.Parameters.AddWithValue("@MidAssesment", this.d);
                    cmd1.Parameters.AddWithValue("@MidAssignmentViva", this.e);
                    cmd1.Parameters.AddWithValue("@FinalAttendance", this.f);
                    cmd1.Parameters.AddWithValue("@FinalPerformance", this.g);
                    cmd1.Parameters.AddWithValue("@FinalQuizes", this.h);
                    cmd1.Parameters.AddWithValue("@FinalAssesment", this.i);
                    cmd1.Parameters.AddWithValue("@FinalAssignmentViva", this.j);
                    //SqlCommand cmd2 = new SqlCommand("");

                    con.Open();
                    cmd1.ExecuteNonQuery();
                    con.Close();
                    getResult2();
                    getResult();
                    MessageBox.Show("Course details are removed successfully!", "Removed", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    // GetCourseRecord();
                    ResetFormControls();*/
                
           // }

           /* else
            {

                MessageBox.Show("Please select a course to show the result.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }*/



        }
    }
}
