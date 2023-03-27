
namespace Evaluation___System
{
    partial class Form6
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
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form6));
            this.course_ListDataSet2 = new Evaluation___System.Course_ListDataSet2();
            this.crsTBBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.crsTBTableAdapter = new Evaluation___System.Course_ListDataSet2TableAdapters.CrsTBTableAdapter();
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.sLNoDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.courseIDDataGridViewTextBoxColumn = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.crsTBBindingSource3 = new System.Windows.Forms.BindingSource(this.components);
            this.crsTBBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.dataGridView2 = new System.Windows.Forms.DataGridView();
            this.label1 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.courseListDataSet2BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.crSTDBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.crSTDTableAdapter = new Evaluation___System.Course_ListDataSet2TableAdapters.CrSTDTableAdapter();
            this.crsTBBindingSource2 = new System.Windows.Forms.BindingSource(this.components);
            ((System.ComponentModel.ISupportInitialize)(this.course_ListDataSet2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource3)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.courseListDataSet2BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.crSTDBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource2)).BeginInit();
            this.SuspendLayout();
            // 
            // course_ListDataSet2
            // 
            this.course_ListDataSet2.DataSetName = "Course_ListDataSet2";
            this.course_ListDataSet2.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // crsTBBindingSource
            // 
            this.crsTBBindingSource.DataMember = "CrsTB";
            this.crsTBBindingSource.DataSource = this.course_ListDataSet2;
            // 
            // crsTBTableAdapter
            // 
            this.crsTBTableAdapter.ClearBeforeFill = true;
            // 
            // dataGridView1
            // 
            this.dataGridView1.AutoGenerateColumns = false;
            this.dataGridView1.BackgroundColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.sLNoDataGridViewTextBoxColumn,
            this.courseIDDataGridViewTextBoxColumn,
            this.dataGridViewTextBoxColumn1});
            this.dataGridView1.DataSource = this.crsTBBindingSource3;
            this.dataGridView1.Location = new System.Drawing.Point(23, 138);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowHeadersWidth = 51;
            this.dataGridView1.RowTemplate.Height = 24;
            this.dataGridView1.Size = new System.Drawing.Size(432, 548);
            this.dataGridView1.TabIndex = 0;
            this.dataGridView1.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridView1_CellContentClick);
            // 
            // sLNoDataGridViewTextBoxColumn
            // 
            this.sLNoDataGridViewTextBoxColumn.DataPropertyName = "SLNo";
            this.sLNoDataGridViewTextBoxColumn.HeaderText = "SLNo";
            this.sLNoDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.sLNoDataGridViewTextBoxColumn.Name = "sLNoDataGridViewTextBoxColumn";
            this.sLNoDataGridViewTextBoxColumn.ReadOnly = true;
            this.sLNoDataGridViewTextBoxColumn.Width = 125;
            // 
            // courseIDDataGridViewTextBoxColumn
            // 
            this.courseIDDataGridViewTextBoxColumn.DataPropertyName = "Course_ID";
            this.courseIDDataGridViewTextBoxColumn.HeaderText = "Course_ID";
            this.courseIDDataGridViewTextBoxColumn.MinimumWidth = 6;
            this.courseIDDataGridViewTextBoxColumn.Name = "courseIDDataGridViewTextBoxColumn";
            this.courseIDDataGridViewTextBoxColumn.Width = 125;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "Course Name";
            this.dataGridViewTextBoxColumn1.HeaderText = "Course Name";
            this.dataGridViewTextBoxColumn1.MinimumWidth = 6;
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.Width = 125;
            // 
            // crsTBBindingSource3
            // 
            this.crsTBBindingSource3.DataMember = "CrsTB";
            this.crsTBBindingSource3.DataSource = this.course_ListDataSet2;
            // 
            // crsTBBindingSource1
            // 
            this.crsTBBindingSource1.DataMember = "CrsTB";
            this.crsTBBindingSource1.DataSource = this.course_ListDataSet2;
            // 
            // dataGridView2
            // 
            this.dataGridView2.BackgroundColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.dataGridView2.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView2.Location = new System.Drawing.Point(477, 138);
            this.dataGridView2.Name = "dataGridView2";
            this.dataGridView2.RowHeadersWidth = 51;
            this.dataGridView2.RowTemplate.Height = 24;
            this.dataGridView2.Size = new System.Drawing.Size(648, 548);
            this.dataGridView2.TabIndex = 1;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Montserrat", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(19, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(155, 24);
            this.label1.TabIndex = 2;
            this.label1.Text = "Hello, Student";
            // 
            // button1
            // 
            this.button1.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(128)))), ((int)(((byte)(128)))), ((int)(((byte)(255)))));
            this.button1.Font = new System.Drawing.Font("Montserrat", 10F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button1.Location = new System.Drawing.Point(477, 80);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(140, 42);
            this.button1.TabIndex = 3;
            this.button1.Text = "Show Results";
            this.button1.UseVisualStyleBackColor = false;
            this.button1.Click += new System.EventHandler(this.button1_Click_1);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(980, 98);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(145, 34);
            this.button2.TabIndex = 5;
            this.button2.Text = "Show Result";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Visible = false;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // courseListDataSet2BindingSource
            // 
            this.courseListDataSet2BindingSource.DataSource = this.course_ListDataSet2;
            this.courseListDataSet2BindingSource.Position = 0;
            // 
            // crSTDBindingSource
            // 
            this.crSTDBindingSource.DataMember = "CrSTD";
            this.crSTDBindingSource.DataSource = this.courseListDataSet2BindingSource;
            // 
            // crSTDTableAdapter
            // 
            this.crSTDTableAdapter.ClearBeforeFill = true;
            // 
            // crsTBBindingSource2
            // 
            this.crsTBBindingSource2.DataMember = "CrsTB";
            this.crsTBBindingSource2.DataSource = this.course_ListDataSet2;
            // 
            // Form6
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(1150, 708);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dataGridView2);
            this.Controls.Add(this.dataGridView1);
            this.Font = new System.Drawing.Font("Montserrat", 8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "Form6";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Student";
            this.Load += new System.EventHandler(this.Form6_Load);
            ((System.ComponentModel.ISupportInitialize)(this.course_ListDataSet2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource3)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.courseListDataSet2BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.crSTDBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.crsTBBindingSource2)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private Course_ListDataSet2 course_ListDataSet2;
        private System.Windows.Forms.BindingSource crsTBBindingSource;
        private Course_ListDataSet2TableAdapters.CrsTBTableAdapter crsTBTableAdapter;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.BindingSource crsTBBindingSource1;
        private System.Windows.Forms.DataGridView dataGridView2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.BindingSource courseListDataSet2BindingSource;
        private System.Windows.Forms.BindingSource crSTDBindingSource;
        private Course_ListDataSet2TableAdapters.CrSTDTableAdapter crSTDTableAdapter;
        private System.Windows.Forms.DataGridViewTextBoxColumn sLNoDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn courseIDDataGridViewTextBoxColumn;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.BindingSource crsTBBindingSource3;
        private System.Windows.Forms.BindingSource crsTBBindingSource2;
    }
}