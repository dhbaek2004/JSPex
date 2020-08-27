package getterSetter;

public class Student {
	
	private String name;
	private int score;
	
	public Student(String n, int s) {
		this.name = n;
		this.score = s;
	}
	
	public void getInfo() {
		System.out.println(" -- getInfo() -- ");
		System.out.println("name : " + name);
		System.out.println("score : " + score);
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
//	학생이름은 변경될 수 없기때문에 name의 setter 메소드를 주석처리

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score < 50) {
			
		} else {
			this.score = score;
		}
	}

}
