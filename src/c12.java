//4. Create a class Student with attributes rollNo, Name, marks1, marks2,
//marks3, marks4, marks5.
//create a method getTop3Student() which accepts a list of Students and returns an
//array of 3 top students with the highest percentage.
class Students1{
    int rollnum;
    String studName;
    int mark1, mark2,mark3, mark4,mark5,total,per;
    public Students1(int rollnum,String studName,int mark1,int mark2,int mark3,int mark4,int mark5,int avg){
        this.rollnum=rollnum;
        this.studName=studName;
        this.mark2=mark2;
        this.mark3=mark3;
        this.mark4=mark4;
        this.mark5=mark5;
        int total=mark1+mark2+mark3+mark4+mark5;
        this.total=total;
        int per=total/5;
        this.per=per;




    }
    public void display(){
        System.out.println(rollnum+" "+studName+" "+mark1+" "+mark2+" "+mark3+" "+mark4+" "+mark5+" "+total+" "+per);
    }

}
public class c12 {
    public static void main(String[] args) {
        Students data= new Students(1,"ram",48,45,40);
        Students data1= new Students(2,"nita",40,41,48);
        Students data2= new Students(3,"sita",50,42,49);


        data.display();
        data1.display();
        data2.display();




    }
}
