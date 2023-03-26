
public class Main {

	public static void main(String[] args) {
		Course mat = new Course("Matematik", "MAT101", "Mat");
		Course fizik = new Course("Fizik", "FZK101", "Fzk");
		Course kimya = new Course("Kimya", "KMY101", "Kmy");

		Teacher t1=new Teacher("Mahmut Hoca", "23001001", "Mat");
		Teacher t2 =new Teacher("Fatma Ayşe", "23001002", "Fzk");
		Teacher t3 =new Teacher("Aber Hoca", "23001003", "Kmy");
		
		mat.addTeacher(t1);
		fizik.addTeacher(t2);
		kimya.addTeacher(t3);
		
		Student s1=new Student("İnek Şaban", "14156412", 4, mat, fizik, kimya);
		s1.addBulkExamNote(50, 20, 40);
		s1.isPass();
		Student s2=new Student("Güdük Necmi", "2145615", 4, mat, fizik, kimya);
		s2.addBulkExamNote(100, 70, 60);
		s2.isPass();
		Student s3=new Student("Barış Kaya", "225541056", 4, mat, fizik, kimya);
		s3.addBulkExamNote(60, 70, 80);
		s3.isPass();
	}

}
