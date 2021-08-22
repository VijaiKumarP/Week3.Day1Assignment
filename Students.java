package Week3.Day1;

public class Students {
	
	public void getStudentInfo (int id) {
		System.out.println("Student ID : " + id);
	}
	
	public void getStudentInfo (int id, String name) {
		System.out.println("Student Name : " + name +". ID : "+ id );
	}

	public void getStudentInfo (String email, long phoneNo) {
		System.out.println("Student Email ID : " + email +". PhoneNo : "+ phoneNo );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students objStudents=new Students();
		objStudents.getStudentInfo(55);
		objStudents.getStudentInfo(55,"Rajesh");
		objStudents.getStudentInfo("Rajesh@Gmail.com", 874563214);

	}

}
