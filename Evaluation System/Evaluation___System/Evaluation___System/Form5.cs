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
    public partial class Form5 : Form
    {

        public static Form5 instance;

        SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
        //qlConnection con2 = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");



       /*tring comboItem = comboBox1.SelectedItem.ToString();
            if (dt.Rows.Count > 0)
            {
                for (int i = 0; i<dt.Rows.Count; i++)
                {
                    if (dt.Rows[i]["Course Name"].ToString() == ComboItem)
                    {
                       
                        if(comboBox1.SelectedItem==0)
                        {
                            Form1 f1 = new Form1();
        f1.ShowDialog();
                            this.Hide();
    }
                        else
                        {

                            MessageBox.Show("Please select a course", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        }

                    }

                
                
                }
            }
            else
{

    MessageBox.Show("Error");
}*/
public Form5()
        {
            InitializeComponent();
            instance = this;
        }
       
        private void GetCourseRecord()
        {
           /*qlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");

            SqlCommand cmd = new SqlCommand("Select * from CrsTB", con);
            DataTable dt = new DataTable();
            con.Open();

            SqlDataReader sdr = cmd.ExecuteReader();
            dt.Load(sdr);
            con.Close();
           //ataGridView2.DataSource = dt;*/
           
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void Form5_Load(object sender, System.EventArgs e)
        {
            // TODO: This line of code loads data into the 'dataSet1.UserTB' table. You can move, or remove it, as needed.
         //   this.userTBTableAdapter.Fill(this.dataSet1.UserTB);
            // TODO: This line of code loads data into the 'dataSet1.ClassTBL' table. You can move, or remove it, as needed.
          //  this.classTBLTableAdapter.Fill(this.dataSet1.ClassTBL);

        }

        private void Form5_Load_1(object sender, System.EventArgs e)
        {
            // TODO: This line of code loads data into the 'course_ListDataSet2.CrsTB' table. You can move, or remove it, as needed.
            this.crsTBTableAdapter2.Fill(this.course_ListDataSet2.CrsTB);
            // TODO: This line of code loads data into the 'course_ListDataSet1.CrSTD' table. You can move, or remove it, as needed.
            this.crSTDTableAdapter.Fill(this.course_ListDataSet1.CrSTD);
            // TODO: This line of code loads data into the 'course_ListDataSet1.CrsTB' table. You can move, or remove it, as needed.
            this.crsTBTableAdapter1.Fill(this.course_ListDataSet1.CrsTB);
            // TODO: This line of code loads data into the 'course_ListDataSet.CrsTB' table. You can move, or remove it, as needed.
            this.crsTBTableAdapter.Fill(this.course_ListDataSet.CrsTB);

        }

        private void comboBox1_SelectedIndexChanged(object sender, System.EventArgs e)
        {

        }

        private void getStudentRecord()
        {
          //String c1 = comboBox1.SelectedIndex.ToString();


            SqlCommand cmd1 = new SqlCommand("Select * from CrSTD", con);
            DataTable dt1 = new DataTable();
            con.Open();
            SqlDataReader sdr1 = cmd1.ExecuteReader();
            dt1.Load(sdr1);
            con.Close();
            dataGridView1.DataSource = dt1;



            SqlCommand cmd2 = new SqlCommand("Select * from CrsTB", con);
            DataTable dt2 = new DataTable();
            con.Open();
            SqlDataReader sdr2 = cmd2.ExecuteReader();
            dt2.Load(sdr2);
            con.Close();
            dataGridView1.DataSource = dt2;




        }

        private void dataGridView1_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {


            if (isValid())
            {

          SqlCommand cmd = new SqlCommand("INSERT INTO Evaluation VALUES ( @CourseID, @StudentID,@MidAttendance,@MidPerformance," +
              "@MidQuizes,@MidAssesment," +
            "@MidAssignmentViva,@FinalAttendance,@FinalPerformance,@FinalQuizes," +
            "@FinalAssesment,@FinalAssignmentViva)", con);

              //  SqlCommand cmd1 = new SqlCommand("Select 'Course Name','Course_ID' from CrsTB" );
               // SqlCommand cmd2 = new SqlCommand("Select 'Student Name','Student_ID' from CrSTD");



                cmd.CommandType = CommandType.Text;

               // cmd.Parameters.AddWithValue("@CourseName", textBox1.Text);
               // cmd.Parameters.AddWithValue("@CourseID", textBox2.Text);
                cmd.Parameters.AddWithValue("@MidAttendance", textBox1.Text);
                cmd.Parameters.AddWithValue("@MidPerformance", textBox2.Text);
                cmd.Parameters.AddWithValue("@MidQuizes", textBox3.Text);
                cmd.Parameters.AddWithValue("@MidAssesment", textBox4.Text);
                cmd.Parameters.AddWithValue("@MidAssignmentViva", textBox5.Text);
                cmd.Parameters.AddWithValue("@FinalAttendance", textBox6.Text);
                cmd.Parameters.AddWithValue("@FinalPerformance", textBox7.Text);
                cmd.Parameters.AddWithValue("@FinalQuizes", textBox8.Text);
                cmd.Parameters.AddWithValue("@FinalAssesment", textBox9.Text);
                cmd.Parameters.AddWithValue("@FinalAssignmentViva", textBox10.Text);
                cmd.Parameters.AddWithValue("@CourseID", textBox11.Text);
                cmd.Parameters.AddWithValue("@StudentID", textBox12.Text);


                //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);

                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
               MessageBox.Show("Marks are updated succesfully!", "Updated", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                getStudentRecord();
                //ResetFormControls();
            }
            else
            {


                

                    MessageBox.Show("Please select a course to update.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

               

            }



                 bool isValid()

            {

                

                if (textBox1.Text==String.Empty  )
                {



                    MessageBox.Show("Course name is required", "Failed", MessageBoxButtons.OK, MessageBoxIcon.Error);
                    return false;


                }
                return true;
            }
        }
    }
}
