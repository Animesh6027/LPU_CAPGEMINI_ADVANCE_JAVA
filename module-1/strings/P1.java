/*input: "Meet me at the clock tower"

1. first word vowels convert into %
2. second word consonants convert into #
3. Third word should be in a CAPITAL

Repeat this sequence from forth word onward

output: "M%%t #e AT th% ##o## TOWER"
*/

public class P1{
	static boolean isVowel(char c){
		c = Character.toLowerCase(c);
		return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
	}

	public static void main(String[] args) {
		String s = "Meet me at the clock tower";
		String[] words = s.split(" ");

		for(int i=0;i<words.length;i++){
			char[] ch=words[i].toCharArray();

			if(i%3==0){
				for(int j=0;j<ch.length;j++){
					if(isVowel(ch[j])) ch[j] = '%';
				}
				words[i]=new String(ch);
			}
			else if(i%3==1){
				for(int j=0;j<ch.length;j++){
					if(Character.isLetter(ch[j]) && !isVowel(ch[j])) ch[j] = '#';
				}
				words[i] = new String(ch);
			}else{
				words[i]=words[i].toUpperCase();
			}
		}

		for(int i=0;i<words.length;i++){
			System.out.print(words[i] + " ");
		}
	}
}