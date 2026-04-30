package lesson08.challenge03.Nurserry.logic;

public class NurserySchoolchild {

	private String name;

	public NurserySchoolchild(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	void Play() {
		System.out.println("遊ぶよ～。");
	}
}
