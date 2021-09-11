package javaPrograms;

public class ConvertingCapitalIntoSmall2 {

	public static void main(String[] args) {
		String word = "jaVA";
		StringBuffer newWord = new StringBuffer(word);

		for(int i=0; i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				newWord.setCharAt(i, Character.toLowerCase(word.charAt(i)));
			}else if(Character.isLowerCase(word.charAt(i))) {
				newWord.setCharAt(i, Character.toUpperCase(word.charAt(i)));
			}
		}
		System.out.println(newWord);
	}

}
