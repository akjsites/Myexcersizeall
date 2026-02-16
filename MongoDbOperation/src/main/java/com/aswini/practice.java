package com.aswini;

abstract class demo {
	public int num;

	public demo(int num) {
		this.num = num;
	}

	public int getNumber() {
		return num;
	}

	@Override
	public String toString() {
		return "demo [num=" + num + "]";
	}

	

}

class exe extends demo {
	public exe(int num) {
		super(num);
	}

	public void dispaly()
	{
		System.out.println(super.toString());
	}
	
}

public class practice {
	public static void main(String[] args) {
       exe exe = new exe(10);
       exe.dispaly();
	}
}
