//create a class student that contains following data members
// ● static variable to create unique number
// ● a variable to store roll no
// ● a variable to store name
// ● an array to store marks of 5 subjects this class should have following member functions:
// a constructor with no-parameters that increments static variable and assign it to roll number.
// remaining data members should be initialized to zero or empty values.
// input() function to input name and marks of 5 subjects from user show() function to display roll number, name and marks of 5 subjects
// to the user totalstudents() function
// that should display the number of objects that has been created so far.
// this function should be static.
// totalmarks() function that should calculate and return to total marks of a student gethighest() function
// that returns highest marks of the student getlowest() function that returns lowest marks of the student getaverage() function
// that returns average marks of student getpasscount() function that counts and returns total number of subjects in which the student is passed.
// (a student is passed if he gets 50% or above marks) in main function, create three objects, input their values and display them. for each student,
// display his total marks, highest, lowest, average marks and the number of subjects in which he is passed.
// also display how many students have been registered so far

class Students2{
    static int unumber = 0;
     int rollno=0;

    int marks[]=new int[3];
public Students2(int rollno,int m1,int m2,int m3){
    this.rollno=rollno;
    this.marks[0]=m1;
    this.marks[1]=m2;
    this.marks[2]=m3;
}
public  void display(){
    System.out.println(rollno+" "+marks[0]+" "+marks[1]+" "+marks[2]);
}
    public void input() {
       unumber++;
       rollno=unumber;
        System.out.println(rollno);
   }
   public int gethigh(){
    int max=0;
       for (int i = 0; i < marks.length; i++) {
    if(max<marks[i]){
        max=marks[i];
    }}
   return max;}
    public  int getlow(){
    int low=marks[0];
        for (int i = 0; i < marks.length; i++) {
            if(low>marks[i]){
                low=marks[i];
            }
        }return low;
    }
    public int getavg(){
    int sum=0;
        for (int i = 0; i < marks.length; i++) {
            sum+=marks[i];
        }return sum/marks.length;
    }
   public int totalmarks(){
//    int sum=0;
//       for (int i = 0; i < marks.length; i++) {
//           sum+=marks[i];
//       }
       int sum=marks[0]+marks[1]+marks[2];
    return sum;
   }
   public int passcount(){
    int count=0;
       for (int i = 0; i < marks.length; i++) {
           if(marks[i]>50){
               count++;
           }
       }return count;
   }
}
public class c21 {
    public static void main(String[] args) {
    Students2 s= new Students2(1,70,40,60);
    s.display();
    s.input();
    System.out.println(s.gethigh());
    System.out.println(s.totalmarks());
    System.out.println(s.getlow());
    System.out.println(s.getavg());
        System.out.println(s.passcount());
    Students2 s1= new Students2(1,70,90,60);
    s1.display();
    s1.input();
    System.out.println(s1.gethigh());
        System.out.println(s1.totalmarks());
        System.out.println(s1.getlow());
        System.out.println(s1.getavg());
        System.out.println(s1.passcount());}
}
