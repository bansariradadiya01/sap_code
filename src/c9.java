
//. Write a program which creates a class Student with the following Data Members
//rollNum, studName, mark1, mark2, mark3, totalMarks Methods
//setStudDetails() – which sets the values to all the data members except
//totalMarks.
//calculateTotal() - which calculate the totalMarks
//displayStudDetails() – which displays rollNum, studName and totalMarks
//Create a class StudentDemo to test the functionality of Student class
    class Students{
        int rollnum;
        String studName;
        int mark1, mark2,mark3, total;
        public Students(int rollnum,String studName,int mark1,int mark2,int mark3){
            this.rollnum=rollnum;
            this.studName=studName;
            this.mark1=mark1;
            this.mark2=mark2;
            this.mark3=mark3;
            int total=mark1+mark2+mark3;
            this.total=total;


        }
        public void display(){
            System.out.println(rollnum+" "+studName+" "+mark1+" "+mark2+" "+mark3+" "+total);
        }

    }
    public class c9 {
        public static void main(String[] args) {
            Students data= new Students(1,"ram",48,45,40);
            Students data1= new Students(2,"nita",40,41,48);
            Students data2= new Students(3,"sita",50,42,49);


            data.display();
            data1.display();
            data2.display();




        }
    }