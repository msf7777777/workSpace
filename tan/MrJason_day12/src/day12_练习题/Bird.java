package day12_¡∑œ∞Ã‚;

public class Bird {
	private String name;
	private int age;
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0 || age > 130) {
			System.out.println("fuck U");
			return;
		}
		this.age = age;
	}
	
	
	
}
