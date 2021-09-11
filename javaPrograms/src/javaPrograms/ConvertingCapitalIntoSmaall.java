package javaPrograms;

public class ConvertingCapitalIntoSmaall {

	public static void main(String[] args) {
		String word = "jAvA";
		String newWord = "";
		char[] ch = word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				newWord = newWord + Character.toLowerCase(ch[i]);
			}else {
				newWord += Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(newWord);
	}

}
