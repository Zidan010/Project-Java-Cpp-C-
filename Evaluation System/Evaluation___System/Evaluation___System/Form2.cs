using System;
using System.Windows.Forms;
using System.Data.SqlClient;
using System.Data;


namespace Evaluation___System
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }
        public int SerialNumber;
        public string n;
        SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
        //SqlConnection con2 = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
        private void Form2_Load(object sender, EventArgs e)
        {
            GetCourseRecord();
           

            // TODO: This line of code loads data into the 'dataSet1.UserTB' table. You can move, or remove it, as needed.
            //this.userTBTableAdapter.Fill(this.dataSet1.UserTB);

        }

        private void GetCourseRecord()
        {
            SqlConnection con = new SqlConnection(@"Data Source=ALIFS-VIVOBOOK;Initial Catalog=Course_List;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("Select * from CrsTB", con);
            DataTable dt = new DataTable();
            con.Open();
            SqlDataReader sdr = cmd.ExecuteReader();
            dt.Load(sdr);
            con.Close();
            CoursedataGridView1.DataSource = dt;





            SqlCommand cmd1 = new SqlCommand("Select * from CrSTD", con);
            DataTable dt1 = new DataTable();
            con.Open();
            SqlDataReader sdr1 = cmd1.ExecuteReader();
            dt1.Load(sdr1);
            con.Close();
            dataGridView1.DataSource = dt1;


        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (isValid())
            {

                SqlCommand cmd = new SqlCommand("INSERT INTO CrsTB VALUES (@CourseName, @CourseID)", con);
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@CourseName", textBox1.Text);
                cmd.Parameters.AddWithValue("@CourseID", textBox2.Text);
                //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);

                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();
                MessageBox.Show("New Course Is Inserted", "Saved", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();
            }
        }
        private bool isValid()

        {

            if (textBox1.Text == String.Empty)
            {



                MessageBox.Show("Course name is required", "Failed", MessageBoxButtons.OK, MessageBoxIcon.Error);
                return false;


            }
            return true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            SerialNumber = 0;
            ResetFormControls();

        }

        private void ResetFormControls()
        {
            textBox1.Clear();
            textBox2.Clear();
            //textBox3.Clear();
            textBox1.Focus();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (SerialNumber > 0)
            {


                SqlCommand cmd = new SqlCommand("UPDATE CrsTB SET Course Name = @CourseName, Course ID = @CourseID WHERE SerialNumber= @SN", con);
                cmd.CommandType = CommandType.Text;
                cmd.Parameters.AddWithValue("@CourseName", textBox1.Text);
                cmd.Parameters.AddWithValue("@CourseID", textBox2.Text);
                //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);
                cmd.Parameters.AddWithValue("@SLNo", this.SerialNumber);


                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();

                MessageBox.Show("Course details are updated successfully!", "Updated", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();



            }
            else
            {

                MessageBox.Show("Please select a course to update.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }

        }

        private void CoursedataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            SerialNumber = Convert.ToInt32(CoursedataGridView1.SelectedRows[0].Cells[0].Value);
            //SerialNumber = Convert.ToInt32(CoursedataGridView1.SelectedRows[0].Cells[0].Value);

            textBox1.Text = CoursedataGridView1.SelectedRows[0].Cells[1].Value.ToString();
            textBox2.Text = CoursedataGridView1.SelectedRows[0].Cells[2].Value.ToString();
          //  textBox3.Text = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
           // textBox4.Text = dataGridView1.SelectedRows[0].Cells[2].Value.ToString();
        }

       /* private void dataGridView1_CellClick(object sender, DataGridViewCellEventArgs e)
        {
            SerialNumber = Convert.ToInt32(dataGridView1.SelectedRows[0].Cells[0].Value);
            //SerialNumber = Convert.ToInt32(CoursedataGridView1.SelectedRows[0].Cells[0].Value);

            //textBox1.Text = CoursedataGridView1.SelectedRows[0].Cells[1].Value.ToString();
            //textBox2.Text = CoursedataGridView1.SelectedRows[0].Cells[2].Value.ToString();
              textBox3.Text = dataGridView1.SelectedRows[0].Cells[1].Value.ToString();
             textBox4.Text = dataGridView1.SelectedRows[0].Cells[2].Value.ToString();
        }*/

        private void button2_Click(object sender, EventArgs e)
        {
            if (SerialNumber > 0)


            {

                SqlCommand cmd = new SqlCommand("DELETE FROM CrsTB  WHERE SLNo =@SLNo", con);
                cmd.CommandType = CommandType.Text;

                cmd.Parameters.AddWithValue("@SLNo", this.SerialNumber);


                con.Open();
                cmd.ExecuteNonQuery();
                con.Close();

                MessageBox.Show("Course details are removed successfully!", "Removed", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();
            }

            else
            {

                MessageBox.Show("Please select a course to remove.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            Form1 f1 = new Form1();
            f1.ShowDialog();
        }

        private void Form2_FormClosing(object sender, FormClosingEventArgs e)
        {
            DialogResult dialog = MessageBox.Show("Do you really want to close the program?", "Exit", MessageBoxButtons.YesNo);
            if(dialog == DialogResult.Yes)
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

        }

        private void CoursedataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button7_Click(object sender, EventArgs e)
        {
          Form f5 = new Form5();
           f5.ShowDialog ();
            this.Hide();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            if (isValid())
            {


                SqlCommand cmd1 = new SqlCommand("INSERT INTO CrSTD VALUES (@StudentName, @Student_ID,@Course_ID)", con);
                cmd1.CommandType = CommandType.Text;
                cmd1.Parameters.AddWithValue("@StudentName", textBox3.Text);

                cmd1.Parameters.AddWithValue("@Student_ID", textBox4.Text);
                cmd1.Parameters.AddWithValue("@Course_ID", textBox2.Text);
                //cmd.Parameters.AddWithValue("@Semester", textBox3.Text);
                //cmd.Parameters.AddWithValue("@SLNo", this.SerialNumber);


                con.Open();
                cmd1.ExecuteNonQuery();
                con.Close();

        MessageBox.Show("Student added successfully!", "Added", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();



            }
            else
            {

                MessageBox.Show("Please select a course to update.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }

      /*private void button6_Click_1(object sender, EventArgs e)
        {
            if (SerialNumber > 0)


            {

                SqlCommand cmd1 = new SqlCommand("DELETE FROM CrSTD  WHERE SN= @SN", con);
                cmd1.CommandType = CommandType.Text;

               cmd1.Parameters.AddWithValue("@SN", this.SerialNumber);


                con.Open();
                cmd1.ExecuteNonQuery();
                con.Close();

                MessageBox.Show("Student details are removed successfully!", "Removed", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();
            }

            else
            {

                MessageBox.Show("Please select a student to remove.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }*/

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void button6_Click_1(object sender, EventArgs e)
        {
            if (SerialNumber > 0)


            {

               //qlCommand cmd1 = new SqlCommand("DELETE FROM CrSTD  WHERE SLNo =@SLNo", con);

                SqlCommand cmd1 = new SqlCommand("DELETE FROM CrSTD  WHERE SLNo =@SLNo", con);
                cmd1.CommandType = CommandType.Text;

                cmd1.Parameters.AddWithValue("@SLNo", this.SerialNumber);


                con.Open();
                cmd1.ExecuteNonQuery();
                con.Close();

                MessageBox.Show("Course details are removed successfully!", "Removed", MessageBoxButtons.OK, MessageBoxIcon.Information);
                GetCourseRecord();
                ResetFormControls();
            }

            else
            {

                MessageBox.Show("Please select a course to remove.", "Select?", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }
    }
    }


