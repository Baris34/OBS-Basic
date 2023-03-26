
public class Student {
	String name,stuNo;
	int classes;
	Course mat;
	Course fizik;
	Course kimya;
	double average;
	boolean isPass;
	
	public Student(String name,String stuNo,int classes,Course mat,Course fizik,Course kimya) {
		this.name=name;
		this.stuNo=stuNo;
		this.classes=classes;
		this.mat=mat;
		this.fizik=fizik;
		this.kimya=kimya;
		calcAverage();
		this.isPass=false;
	}
	public void addBulkExamNote(int mat,int fizik,int kimya) {
		if (mat<=100&&mat>=0) {
			this.mat.note=mat;
		}
		if (fizik<=100&&fizik>=0) {
			this.fizik.note=fizik;
		}
		if (kimya<=100&&kimya>=0) {
			this.kimya.note=kimya;
		}
	}
	public void isPass() {
		if (this.mat.note==0||this.fizik.note==0||this.kimya.note==0) {
			System.out.println("Notlar tam olarak girilmemiş!");
		}
		else {
			this.isPass=isCheckPass();
			printNote();
			System.out.println("Ortalama : "+this.average);
			if (this.isPass) {
				System.out.println("Sınıfı geçtiniz!");
			}
			else {
				System.out.println("Sınıfta kaldınız!");
			}
		}
	}
	public void calcAverage() {
		this.average=(this.mat.note+this.fizik.note+this.kimya.note)/3;
	}
	public boolean isCheckPass() {
		calcAverage();
		return this.average>55;
	}
	public void printNote() {
		System.out.println("=====================");
		System.out.println("Öğrenci : "+this.name);
		System.out.println("Matematik notu : "+this.mat.note);
		System.out.println("Fizik notu : "+this.fizik.note);
		System.out.println("Kimya notu : "+this.kimya.note);
	}
}
